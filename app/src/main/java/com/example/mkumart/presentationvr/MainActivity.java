package com.example.mkumart.presentationvr;


import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardView;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.google.vrtoolkit.cardboard.Viewport;


import com.threed.jpct.Camera;
import com.threed.jpct.FrameBuffer;
import com.threed.jpct.Light;
import com.threed.jpct.Loader;
import com.threed.jpct.Logger;
import com.threed.jpct.Object3D;
import com.threed.jpct.RGBColor;
import com.threed.jpct.SimpleVector;
import com.threed.jpct.Texture;
import com.threed.jpct.TextureManager;
import com.threed.jpct.World;
import com.threed.jpct.util.BitmapHelper;
import com.threed.jpct.util.MemoryHelper;




import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;


public class MainActivity extends CardboardActivity implements CardboardView.StereoRenderer {

    private static final String TAG = "MainActivity";

    private static final int WELCOME = 0;
    private static final int GALLERY = 1;
    private static final int START_SHOWCASE = 3;
    private static final int SHOWCASE_TITLE = 4;
    private static final int SHOWCASE_INSPIRATION = 5;
    private static final int SHOWCASE_PRODUCT = 2;
    private static int STATE = WELCOME;

    private static boolean SELECTABLE = true;
    private static boolean UNSELECTABLE = false;

    private static final float Z_NEAR = 0.1f;
    private static final float Z_FAR = 500.0f;

    private static final float CAMERA_Z = 0.01f;

    private static final float YAW_LIMIT = 0.12f;
    private static final float PITCH_LIMIT = 0.12f;

    private static final int COORDS_PER_VERTEX = 3;

    // We keep the light always position just above the user.
    private static final float[] LIGHT_POS_IN_WORLD_SPACE = new float[]{0.0f, 2.0f, 0.0f, 1.0f};

    private final float[] lightPosInEyeSpace = new float[4];

    private FloatBuffer floorVertices;
    private FloatBuffer floorVerticesShowcase;

    private FloatBuffer floorColors;
    private FloatBuffer floorNormals;

    /*Exit Button */
    private FloatBuffer cubeVerticesExitButton;

    /* Gallery */
    private FloatBuffer cubeVertices;
    private FloatBuffer cubeVertices_1;
    private FloatBuffer cubeVertices_2;
    private FloatBuffer cubeVertices_3;
    private FloatBuffer cubeVertices_4;
    private FloatBuffer cubeVertices_5;
    private FloatBuffer cubeVertices_6;
    private FloatBuffer cubeVertices_7;
    private FloatBuffer cubeVertices_8;
    private FloatBuffer cubeVertices_9;

    /*Welcome Screen */

    private  FloatBuffer cubeVerticesWelcomeLogo;
    private  FloatBuffer cubeVerticesEnterButton;

    /*  Start Showcase */
    private FloatBuffer cubeVerticesStartShowText;
    private FloatBuffer cubeVerticesStartShowButton;

    /*Showcase title */
    private FloatBuffer cubeVerticesShowcaseTitleText;
    private FloatBuffer cubeVerticesShowcaseTitleDescription;

    /*Showcase Inspiration */
    private FloatBuffer cubeVerticesShowcaseInspirationText;
    private FloatBuffer cubeVerticesShowcaseInspirationImage;

    /* 3D Object Loader */
    private static MainActivity master = null;
    private FrameBuffer fb = null;
    private World[] world ={null,null,null};
    private RGBColor back = new RGBColor(0, 0, 00);
    private float touchTurn = 0;
    private float touchTurnUp = 0;
    private Object3D[][] cube = {null,null,null};
    private Light[] sun = {null,null,null};
    private boolean rotateObject = true;

    private FloatBuffer cubeNormals;

    private int cubeProgram;
    private int floorProgram;

    private int cubePositionParam;
    private int cubeTexCoordParam;
    private int cubeTextureParam;
    private int cubeModelViewProjectionParam;

    private int floorPositionParam;
    private int floorNormalParam;
    private int floorColorParam;

    private int floorModelParam;
    private int floorModelViewParam;
    private int floorModelViewProjectionParam;
    private int floorLightPosParam;

    private float[] modelCube;
    private float[] camera;
    private float[] view;
    private float[] headView;
    private float[] modelViewProjection;
    private float[] modelView;
    private float[] modelFloor;

    private float[] modelCubeSelected;
    private float[] modelViewProjectionSelected;
    private float[] modelViewSelected;

    private float[] uvs;
    private FloatBuffer uvBuffer;

    private float objectDistance[] = {12f, 15f , 12f };
    private float floorDepth = 20f;
    private static boolean isTriggerEnabled[] = {false, false, false, false, false,false, false,false,false,false,false,false};

    private Vibrator vibrator;
    private CardboardOverlayView overlayView;

    public int selectedObj=1;

    boolean rotationFlag = false;

    // private Bitmap[] bitmaps = null;
    private int[] textures ;
    private int[] textureIds = {
            R.drawable.welcome,
            R.drawable.entergallery,
            R.drawable.gun,
            R.drawable.uc,
            R.drawable.ladder,
            R.drawable.uc,
            R.drawable.dpv,
            R.drawable.uc,
            R.drawable.category2,
            R.drawable.category3,
            R.drawable.category1,//
            R.drawable.gun,
            R.drawable.gun,
            R.drawable.gun,
    };
    Bitmap[] bitmaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.common_ui);
        CardboardView cardboardView = (CardboardView) findViewById(R.id.cardboard_view);
        cardboardView.setRenderer(this);
        setCardboardView(cardboardView);

        overlayView = (CardboardOverlayView) findViewById(R.id.overlay);
        overlayView.show3DToast("Pull the magnet when you find an object.");
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        /* For 3D Object loader */
        if (master != null) {
            master = this;
        }

        /* Slide 1 Cube Variables */
        modelCube = new float[16];
        camera = new float[16];
        view = new float[16];
        modelViewProjection = new float[16];
        modelView = new float[16];
        modelCubeSelected = new float[16];
        modelViewProjectionSelected = new float[16];
        modelViewSelected = new float[16];
        modelFloor = new float[16];
        headView = new float[16];

        // load texture ids

        textures = new int[14];
        bitmaps = new Bitmap[14];

    }

    /**
     * Creates the buffers we use to store information about the 3D world.
     * <p/>
     * <p>OpenGL doesn't use Java arrays, but rather needs data in a format it can understand.
     * Hence we use ByteBuffers.
     *
     * @param config The EGL configuration used when creating the surface.
     */
    @Override
    public void onSurfaceCreated(EGLConfig config) {

        Log.i(TAG, "onSurfaceCreated");
        GLES20.glClearColor(0f, 0f, 0f, 0.5f); // Dark background so text shows up well.
        int vertexShader = loadGLShader(GLES20.GL_VERTEX_SHADER, R.raw.light_vertex);
        int grid_vertexShader = loadGLShader(GLES20.GL_VERTEX_SHADER, R.raw.grid_vertex);
        int gridShader = loadGLShader(GLES20.GL_FRAGMENT_SHADER, R.raw.grid_fragment);
        int passthroughShader = loadGLShader(GLES20.GL_FRAGMENT_SHADER, R.raw.passthrough_fragment);


        /* Initialize Exit Button params */
        ByteBuffer bbVerticesExitButton = ByteBuffer.allocateDirect(WorldLayoutData.EXIT_BUTTON.length * 4);
        bbVerticesExitButton.order(ByteOrder.nativeOrder());
        cubeVerticesExitButton = bbVerticesExitButton.asFloatBuffer();
        cubeVerticesExitButton.put(WorldLayoutData.EXIT_BUTTON);
        cubeVerticesExitButton.position(0);

        /* Initialize Welcome Screen params */
        ByteBuffer bbVerticesWelcomeLogo = ByteBuffer.allocateDirect(WorldLayoutData.WELCOME_LOGO.length * 4);
        bbVerticesWelcomeLogo.order(ByteOrder.nativeOrder());
        cubeVerticesWelcomeLogo = bbVerticesWelcomeLogo.asFloatBuffer();
        cubeVerticesWelcomeLogo.put(WorldLayoutData.WELCOME_LOGO);
        cubeVerticesWelcomeLogo.position(0);

        ByteBuffer bbVerticesEnterButton = ByteBuffer.allocateDirect(WorldLayoutData.ENTER_BUTTON.length * 4);
        bbVerticesEnterButton.order(ByteOrder.nativeOrder());
        cubeVerticesEnterButton = bbVerticesEnterButton.asFloatBuffer();
        cubeVerticesEnterButton.put(WorldLayoutData.ENTER_BUTTON);
        cubeVerticesEnterButton.position(0);

        /* Initialize Slide 1 params */
        ByteBuffer bbVertices = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS.length * 4);
        bbVertices.order(ByteOrder.nativeOrder());
        cubeVertices = bbVertices.asFloatBuffer();
        cubeVertices.put(WorldLayoutData.CUBE_COORDS);
        cubeVertices.position(0);

        ByteBuffer bbVertices_1 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_1.length * 4);
        bbVertices_1.order(ByteOrder.nativeOrder());
        cubeVertices_1 = bbVertices_1.asFloatBuffer();
        cubeVertices_1.put(WorldLayoutData.CUBE_COORDS_1);
        cubeVertices_1.position(0);

        ByteBuffer bbVertices_2 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_2.length * 4);
        bbVertices_2.order(ByteOrder.nativeOrder());
        cubeVertices_2 = bbVertices_2.asFloatBuffer();
        cubeVertices_2.put(WorldLayoutData.CUBE_COORDS_2);
        cubeVertices_2.position(0);

        ByteBuffer bbVertices_3 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_3.length * 4);
        bbVertices_3.order(ByteOrder.nativeOrder());
        cubeVertices_3 = bbVertices_3.asFloatBuffer();
        cubeVertices_3.put(WorldLayoutData.CUBE_COORDS_3);
        cubeVertices_3.position(0);

        ByteBuffer bbVertices_4 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_4.length * 4);
        bbVertices_4.order(ByteOrder.nativeOrder());
        cubeVertices_4 = bbVertices_4.asFloatBuffer();
        cubeVertices_4.put(WorldLayoutData.CUBE_COORDS_4);
        cubeVertices_4.position(0);

        ByteBuffer bbVertices_5 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_5.length * 4);
        bbVertices_5.order(ByteOrder.nativeOrder());
        cubeVertices_5 = bbVertices_5.asFloatBuffer();
        cubeVertices_5.put(WorldLayoutData.CUBE_COORDS_5);
        cubeVertices_5.position(0);

        ByteBuffer bbVertices_6 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_6.length * 4);
        bbVertices_6.order(ByteOrder.nativeOrder());
        cubeVertices_6 = bbVertices_6.asFloatBuffer();
        cubeVertices_6.put(WorldLayoutData.CUBE_COORDS_6);
        cubeVertices_6.position(0);

        ByteBuffer bbVertices_7 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_7.length * 4);
        bbVertices_7.order(ByteOrder.nativeOrder());
        cubeVertices_7 = bbVertices_7.asFloatBuffer();
        cubeVertices_7.put(WorldLayoutData.CUBE_COORDS_7);
        cubeVertices_7.position(0);

        ByteBuffer bbVertices_8 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_8.length * 4);
        bbVertices_8.order(ByteOrder.nativeOrder());
        cubeVertices_8 = bbVertices_8.asFloatBuffer();
        cubeVertices_8.put(WorldLayoutData.CUBE_COORDS_8);
        cubeVertices_8.position(0);
/*
        ByteBuffer bbVertices_9 = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_COORDS_9.length * 4);
        bbVertices_9.order(ByteOrder.nativeOrder());
        cubeVertices_9 = bbVertices_9.asFloatBuffer();
        cubeVertices_9.put(WorldLayoutData.CUBE_COORDS_9);
        cubeVertices_9.position(0);
*/

        ByteBuffer bbVerticesStartShowCaseText = ByteBuffer.allocateDirect(WorldLayoutData.START_SHOWCASE_TEXT.length * 4);
        bbVerticesStartShowCaseText.order(ByteOrder.nativeOrder());
        cubeVerticesStartShowText = bbVerticesStartShowCaseText.asFloatBuffer();
        cubeVerticesStartShowText.put(WorldLayoutData.START_SHOWCASE_TEXT);
        cubeVerticesStartShowText.position(0);

        ByteBuffer bbVerticesStartShowCaseButton = ByteBuffer.allocateDirect(WorldLayoutData.START_SHOWCASE_BUTTON.length * 4);
        bbVerticesStartShowCaseButton.order(ByteOrder.nativeOrder());
        cubeVerticesStartShowButton = bbVerticesStartShowCaseButton.asFloatBuffer();
        cubeVerticesStartShowButton.put(WorldLayoutData.START_SHOWCASE_BUTTON);
        cubeVerticesStartShowButton.position(0);

        ByteBuffer bbVerticesShowcaseTitleText = ByteBuffer.allocateDirect(WorldLayoutData.SHOWCASE_TITLE.length * 4);
        bbVerticesShowcaseTitleText.order(ByteOrder.nativeOrder());
        cubeVerticesShowcaseTitleText = bbVerticesShowcaseTitleText.asFloatBuffer();
        cubeVerticesShowcaseTitleText.put(WorldLayoutData.SHOWCASE_TITLE);
        cubeVerticesShowcaseTitleText.position(0);

        ByteBuffer bbVerticesShowcaseTitleDescription = ByteBuffer.allocateDirect(WorldLayoutData.SHOWCASE_TITLE_DESCRIPTION.length * 4);
        bbVerticesShowcaseTitleDescription.order(ByteOrder.nativeOrder());
        cubeVerticesShowcaseTitleDescription = bbVerticesShowcaseTitleDescription.asFloatBuffer();
        cubeVerticesShowcaseTitleDescription.put(WorldLayoutData.SHOWCASE_TITLE_DESCRIPTION);
        cubeVerticesShowcaseTitleDescription.position(0);

        ByteBuffer bbVerticesShowcaseInspirationText = ByteBuffer.allocateDirect(WorldLayoutData.SHOWCASE_INSPIRATION_TEXT.length * 4);
        bbVerticesShowcaseInspirationText.order(ByteOrder.nativeOrder());
        cubeVerticesShowcaseInspirationText = bbVerticesShowcaseInspirationText.asFloatBuffer();
        cubeVerticesShowcaseInspirationText.put(WorldLayoutData.SHOWCASE_INSPIRATION_TEXT);
        cubeVerticesShowcaseInspirationText.position(0);

        ByteBuffer bbVerticesShowcaseInspirationImage = ByteBuffer.allocateDirect(WorldLayoutData.SHOWCASE_INSPIRATION_IMAGE.length * 4);
        bbVerticesShowcaseInspirationImage.order(ByteOrder.nativeOrder());
        cubeVerticesShowcaseInspirationImage = bbVerticesShowcaseInspirationImage.asFloatBuffer();
        cubeVerticesShowcaseInspirationImage.put(WorldLayoutData.SHOWCASE_INSPIRATION_IMAGE);
        cubeVerticesShowcaseInspirationImage.position(0);

        ByteBuffer bbNormals = ByteBuffer.allocateDirect(WorldLayoutData.CUBE_NORMALS.length * 4);
        bbNormals.order(ByteOrder.nativeOrder());
        cubeNormals = bbNormals.asFloatBuffer();
        cubeNormals.put(WorldLayoutData.CUBE_NORMALS);
        cubeNormals.position(0);

        // make a floor
        ByteBuffer bbFloorVertices = ByteBuffer.allocateDirect(WorldLayoutData.FLOOR_COORDS.length * 4);
        bbFloorVertices.order(ByteOrder.nativeOrder());
        floorVertices = bbFloorVertices.asFloatBuffer();
        floorVertices.put(WorldLayoutData.FLOOR_COORDS);
        floorVertices.position(0);

        // make a floor
        ByteBuffer bbFloorVerticesShowCase = ByteBuffer.allocateDirect(WorldLayoutData.FLOOR_COORDS_SHOWCASE.length * 4);
        bbFloorVerticesShowCase.order(ByteOrder.nativeOrder());
        floorVerticesShowcase = bbFloorVerticesShowCase.asFloatBuffer();
        floorVerticesShowcase.put(WorldLayoutData.FLOOR_COORDS_SHOWCASE);
        floorVerticesShowcase.position(0);

        ByteBuffer bbFloorNormals = ByteBuffer.allocateDirect(WorldLayoutData.FLOOR_NORMALS.length * 4);
        bbFloorNormals.order(ByteOrder.nativeOrder());
        floorNormals = bbFloorNormals.asFloatBuffer();
        floorNormals.put(WorldLayoutData.FLOOR_NORMALS);
        floorNormals.position(0);

        ByteBuffer bbFloorColors = ByteBuffer.allocateDirect(WorldLayoutData.FLOOR_COLORS.length * 4);
        bbFloorColors.order(ByteOrder.nativeOrder());
        floorColors = bbFloorColors.asFloatBuffer();
        floorColors.put(WorldLayoutData.FLOOR_COLORS);
        floorColors.position(0);


        uvs = new float[]{
                0.0f, 0.0f,
                0.0f, 1.0f,
                1.0f, 0.0f,
                0.0f, 1.0f,
                1.0f, 1.0f,
                1.0f, 0.0f
        };

        // The texture buffer
        ByteBuffer bb = ByteBuffer.allocateDirect(uvs.length * 4);
        bb.order(ByteOrder.nativeOrder());
        uvBuffer = bb.asFloatBuffer();
        uvBuffer.put(uvs);
        uvBuffer.position(0);

        cubeProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(cubeProgram, vertexShader);
        GLES20.glAttachShader(cubeProgram, passthroughShader);
        GLES20.glLinkProgram(cubeProgram);
        GLES20.glUseProgram(cubeProgram);

        checkGLError("Cube program");

        cubePositionParam = GLES20.glGetAttribLocation(cubeProgram, "a_Position");
        cubeTexCoordParam = GLES20.glGetAttribLocation(cubeProgram, "a_texCoord");

        cubeTextureParam = GLES20.glGetUniformLocation(cubeProgram, "s_texture");
        cubeModelViewProjectionParam = GLES20.glGetUniformLocation(cubeProgram, "u_MVP");

        GLES20.glEnableVertexAttribArray(cubePositionParam);
        GLES20.glEnableVertexAttribArray(cubeTexCoordParam);

        checkGLError("Cube program params");

        floorProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(floorProgram, grid_vertexShader);
        GLES20.glAttachShader(floorProgram, gridShader);
        GLES20.glLinkProgram(floorProgram);
        GLES20.glUseProgram(floorProgram);

        checkGLError("Floor program");

        floorModelParam = GLES20.glGetUniformLocation(floorProgram, "u_Model");
        floorModelViewParam = GLES20.glGetUniformLocation(floorProgram, "u_MVMatrix");
        floorModelViewProjectionParam = GLES20.glGetUniformLocation(floorProgram, "u_MVP");
        floorLightPosParam = GLES20.glGetUniformLocation(floorProgram, "u_LightPos");

        floorPositionParam = GLES20.glGetAttribLocation(floorProgram, "a_Position");
        floorNormalParam = GLES20.glGetAttribLocation(floorProgram, "a_Normal");
        floorColorParam = GLES20.glGetAttribLocation(floorProgram, "a_Color");

        GLES20.glEnableVertexAttribArray(floorPositionParam);
        GLES20.glEnableVertexAttribArray(floorNormalParam);
        GLES20.glEnableVertexAttribArray(floorColorParam);

        checkGLError("Floor program params");

        GLES20.glEnable(GLES20.GL_DEPTH_TEST);

        // Object first appears directly in front of user.
        Matrix.setIdentityM(modelCube, 0);
        Matrix.translateM(modelCube, 0, 0f, 0, -objectDistance[STATE]);
        // Object first appears directly in front of user.
        Matrix.setIdentityM(modelCubeSelected, 0);
        Matrix.translateM(modelCubeSelected, 0, 0f, 0, -objectDistance[STATE] + 3f);

        Matrix.setIdentityM(modelFloor, 0);
        Matrix.translateM(modelFloor, 0, 0, -floorDepth, 0); // Floor appears below user.

        checkGLError("onSurfaceCreated");
    }


    @Override
    public void onSurfaceChanged(int width, int height) {
        Log.i(TAG, "onSurfaceChanged");

        /* Initializing 3D object loader Params */


        if (fb != null) {
            fb.dispose();
        }

        fb = new FrameBuffer(width, height); // OpenGL ES 2.0 constructor

        if (master == null) {

            for(int ij=0;ij<3;ij++) {
                world[ij] = new World();
                world[ij].setAmbientLight(20, 20, 20);
                sun[ij] = new Light(world[ij]);
                sun[ij].setIntensity(250, 250, 250);
            }


/*
            // Create a texture out of the icon...:-)
            Texture texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(getResources().getDrawable(R.drawable.icon)), 64, 64));
            TextureManager.getInstance().addTexture("texture", texture);
*/
            try {

                String[] objFiles={"M4A1","dpv","workladder"};
                float scale[] = {1.0f, 0.04f, 4.5f};
                boolean isMtlAvl[]={true,true,false};
                for(int oo=0;oo<3;oo++) {
                    InputStream isObj = new FileInputStream("/sdcard/"+objFiles[oo]+".obj");
                    if(isMtlAvl[oo]) {
                        InputStream isMtl = new FileInputStream("/sdcard/dpv.mtl");
                        cube[oo] = Loader.loadOBJ(isObj, isMtl, scale[oo]);
                    }
                    else {
                        cube[oo] = Loader.loadOBJ(isObj, null, scale[oo]);
                    }
                    for (int ii = 0; ii < cube[oo].length; ii++)
                        world[oo].addObject(cube[oo][ii]);
                    Camera cam = world[oo].getCamera();
                    cam.moveCamera(Camera.CAMERA_MOVEOUT, 50);
                    //cam.lookAt(cube[0].getTransformedCenter());

                    SimpleVector sv = new SimpleVector();
                    sv.set(cube[oo][0].getTransformedCenter());
/*
            sv.y -= 100;
            sv.z -= 100;
*/
                    sun[oo].setPosition(sv);
                    MemoryHelper.compact();
                }

            } catch (Exception e) {

            }
            if (master == null) {
                Logger.log("Saving master Activity!");
                master = MainActivity.this;
            }
        }
    }


    void initialize()
    {
        GLES20.glGenTextures(14, textures, 0);
        for (int i = 0; i < 14; i ++) {
            bitmaps[i] = BitmapFactory.decodeResource(getResources(), textureIds[i]);

            GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textures[i]);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE);

            GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bitmaps[i], 0);
            //	bitmap.recycle();
        }
    }

    /**
     * Draws a frame for an eye.
     *
     * @param eye The eye to render. Includes all required transformations.
     */
    @Override
    public void onDrawEye(Eye eye) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

        if(textures[0]==0)
        {
            initialize();
        }
        checkGLError("colorParam");

        // Apply the eye transformation to the camera.
        Matrix.multiplyMM(view, 0, eye.getEyeView(), 0, camera, 0);

        // Set the position of the light
        Matrix.multiplyMV(lightPosInEyeSpace, 0, view, 0, LIGHT_POS_IN_WORLD_SPACE, 0);

        // Build the ModelView and ModelViewProjection matrices
        // for calculating cube position and light.
        float[] perspective = eye.getPerspective(Z_NEAR, Z_FAR);

        Matrix.multiplyMM(modelView, 0, view, 0, modelCube, 0);
        Matrix.multiplyMM(modelViewProjection, 0, perspective, 0, modelView, 0);
        Matrix.multiplyMM(modelViewSelected, 0, view, 0, modelCubeSelected, 0);
        Matrix.multiplyMM(modelViewProjectionSelected, 0, perspective, 0, modelViewSelected, 0);

        switch (STATE){
            case WELCOME :
                drawCube(0, cubeVerticesWelcomeLogo, UNSELECTABLE);
                drawCube(1, cubeVerticesEnterButton, SELECTABLE);

                break;

            case GALLERY :

                drawCube(2, cubeVertices, SELECTABLE);
                drawCube(3, cubeVertices_1, SELECTABLE);
                drawCube(4, cubeVertices_2, SELECTABLE);
                drawCube(5, cubeVertices_3, SELECTABLE);

                drawCube(6, cubeVertices_4, SELECTABLE);
                drawCube(7, cubeVertices_5, SELECTABLE);
                drawCube(8, cubeVertices_6, UNSELECTABLE);
                drawCube(9, cubeVertices_7, UNSELECTABLE);
                drawCube(10, cubeVertices_8, UNSELECTABLE);


                break;

            case START_SHOWCASE :

                drawCube(1, cubeVerticesStartShowText, UNSELECTABLE);
                drawCube(5, cubeVerticesStartShowButton, SELECTABLE);
                // drawCubeText(6, cubeVerticesExitButton, "Exit", 100, 256, 256, SELECTABLE);
                break;

            case SHOWCASE_TITLE :

                drawCube(4, cubeVerticesShowcaseTitleText, UNSELECTABLE);
                drawCube(1, cubeVerticesShowcaseTitleDescription, UNSELECTABLE);
                drawCube(6, cubeVerticesExitButton, SELECTABLE);
                break;

            case SHOWCASE_INSPIRATION :

                drawCube(1, cubeVerticesShowcaseInspirationText, UNSELECTABLE);
                drawCube(1, cubeVerticesShowcaseInspirationImage, UNSELECTABLE);
                drawCube(6, cubeVerticesExitButton, SELECTABLE);
                break;

            case SHOWCASE_PRODUCT :

                if( world[selectedObj]!=null) {
                    if(rotationFlag){ world[selectedObj].getCamera().rotateZ(3.14f);rotationFlag=false;}
                    if(rotateObject) {
                        world[selectedObj].getCamera().rotateY(0.01f);
                        world[selectedObj].getCamera().setPositionToCenter(cube[selectedObj][0]);
                        world[selectedObj].getCamera().moveCamera(Camera.CAMERA_MOVEOUT, 50);
                    }

                    //fb.clear(back);
                    world[selectedObj].renderScene(fb);
                    world[selectedObj].draw(fb);
                    fb.display();
                }
//                drawCube(1, cubeVerticesEnterButton, SELECTABLE);
                break;
        }
        GLES20.glUseProgram(floorProgram);
        ByteBuffer bbFloorColors = ByteBuffer.allocateDirect(WorldLayoutData.FLOOR_COLORS.length * 4);
        bbFloorColors.order(ByteOrder.nativeOrder());
        floorColors = bbFloorColors.asFloatBuffer();
        floorColors.put(WorldLayoutData.FLOOR_COLORS);
        floorColors.position(0);

        Matrix.multiplyMM(modelView, 0, view, 0, modelFloor, 0);
        Matrix.multiplyMM(modelViewProjection, 0, perspective, 0,
                modelView, 0);
        if(STATE != SHOWCASE_PRODUCT)
        drawFloor();


    }


/*
    public void drawCubeText(int cubeId, FloatBuffer cubeVerticesLocal , String text, int fontSize, int bitmapWidth, int bitmapHeight, boolean isSelectable){
        Bitmap bitmap= Bitmap.createBitmap(bitmapWidth,bitmapHeight ,Bitmap.Config.ARGB_8888);

        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setARGB(255, 0, 0, 0);
        paint.setTextSize(fontSize);
        Typeface tf = Typeface.create("Segoe UI", Typeface.BOLD);
        paint.setTypeface(tf);
        Drawable background = getResources().getDrawable(R.drawable.white);
        background.setBounds(0, 0, 256, 256);
        background.draw(canvas);
        canvas.drawText(text, 16, 112, paint);
        drawCube(cubeId,cubeVerticesLocal,bitmap,isSelectable);
    }*/

    /**
     * Draw the cube.
     * <p/>
     * <p>We've set all of our transformation matrices. Now we simply pass them into the shader.
     */
    public void drawCube(int cubeId, FloatBuffer cubeVerticesLocal , boolean isSelectable) {

        GLES20.glUseProgram(cubeProgram);


        GLES20.glUniform1i(cubeTextureParam, 0);


        // Set the position of the cube
        GLES20.glVertexAttribPointer(cubePositionParam, COORDS_PER_VERTEX, GLES20.GL_FLOAT,
                false, 0, cubeVerticesLocal);

        // Set the ModelViewProjection matrix in the shader.
        if(isSelectable) {
            GLES20.glUniformMatrix4fv(cubeModelViewProjectionParam, 1, false, isLookingAtObject(cubeId) ? modelViewProjectionSelected :
                    modelViewProjection, 0);
        }
        else {
            GLES20.glUniformMatrix4fv(cubeModelViewProjectionParam, 1, false, modelViewProjection, 0);
        }
        GLES20.glVertexAttribPointer(cubeTexCoordParam, 2, GLES20.GL_FLOAT,
                false,
                0, uvBuffer);

        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textures[cubeId]);
/*
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), textureResourceId);
*/


        GLES20.glEnable(GLES20.GL_DEPTH_TEST);

        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);

        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textures[cubeId]);


        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 36);

        //bitmap.recycle();
        checkGLError("Drawing cube");
    }

    /**
     * Draw the floor.
     * <p/>
     * <p>This feeds in data for the floor into the shader. Note that this doesn't feed in data about
     * position of the light, so if we rewrite our code to draw the floor first, the lighting might
     * look strange.
     */
    public void drawFloor() {

        // Set ModelView, MVP, position, normals, and color.
        GLES20.glUniform3fv(floorLightPosParam, 1, lightPosInEyeSpace, 0);
        GLES20.glUniformMatrix4fv(floorModelParam, 1, false, modelFloor, 0);
        GLES20.glUniformMatrix4fv(floorModelViewParam, 1, false, modelView, 0);
        GLES20.glUniformMatrix4fv(floorModelViewProjectionParam, 1, false,
                modelViewProjection, 0);
        if(STATE== SHOWCASE_PRODUCT)
        GLES20.glVertexAttribPointer(floorPositionParam, COORDS_PER_VERTEX, GLES20.GL_FLOAT,
                false, 0, floorVerticesShowcase);
        else
            GLES20.glVertexAttribPointer(floorPositionParam, COORDS_PER_VERTEX, GLES20.GL_FLOAT,
                    false, 0, floorVertices);
        GLES20.glVertexAttribPointer(floorNormalParam, 3, GLES20.GL_FLOAT, false, 0,
                floorNormals);
        GLES20.glVertexAttribPointer(floorColorParam, 4, GLES20.GL_FLOAT, false, 0, floorColors);


        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 6);

        checkGLError("drawing floor");
    }

    /**
     * Called when the Cardboard trigger is pulled.
     */
    @Override
    public void onCardboardTrigger() {
        Log.i(TAG, "onCardboardTrigger");

        switch (STATE) {

            case WELCOME:
                if(isLookingAtObject(1)){
                    overlayView.show3DToast("Use the Magnet Trigger to select ‘Enter’");
                    STATE = GALLERY;
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCube, 0);
                    Matrix.translateM(modelCube, 0, 0f, 0, -objectDistance[STATE]);
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCubeSelected, 0);
                    Matrix.translateM(modelCubeSelected, 0, 0f, 0, -objectDistance[STATE] + 1f);

                }
                break;

            case GALLERY:

                if (isLookingAtObject(2)) {
                    overlayView.show3DToast("Use the Magnet Trigger to select ‘Product’");
                    STATE = SHOWCASE_PRODUCT;
                    Matrix.setIdentityM(modelCube, 0);
                    Matrix.translateM(modelCube, 0, 0f, 0, -objectDistance[STATE]);
                    Matrix.setIdentityM(modelCubeSelected, 0);
                    Matrix.translateM(modelCubeSelected, 0, 0f, 0, -objectDistance[STATE] + 1f);
                    selectedObj = 0;
                    rotationFlag = true;
                    overlayView.show3DToast("Starting Product Showcase...");
                } else if (isLookingAtObject(3)) {
                    overlayView.show3DToast("Coming Soon..");
                } else if (isLookingAtObject(4)) {
                    STATE = SHOWCASE_PRODUCT;
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCube, 0);
                    Matrix.translateM(modelCube, 0, 0f, 0, -objectDistance[STATE]);
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCubeSelected, 0);
                    Matrix.translateM(modelCubeSelected, 0, 0f, 0, -objectDistance[STATE] + 1f);

                    selectedObj = 2;
                    rotationFlag = true;
                    overlayView.show3DToast("Starting Product Showcase...");
                } else if (isLookingAtObject(5)) {
                    overlayView.show3DToast("Coming Soon..");
                } else if (isLookingAtObject(6)) {
                    STATE = SHOWCASE_PRODUCT;
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCube, 0);
                    Matrix.translateM(modelCube, 0, 0f, 0, -objectDistance[STATE]);
                    // Object first appears directly in front of user.
                    Matrix.setIdentityM(modelCubeSelected, 0);
                    Matrix.translateM(modelCubeSelected, 0, 0f, 0, -objectDistance[STATE] + 1f);

                    selectedObj = 1;
                    rotationFlag = true;
                    overlayView.show3DToast("Starting Product Showcase...");
                } else if (isLookingAtObject(7)) {
                    overlayView.show3DToast("Coming Soon..");
                } else {
                    overlayView.show3DToast("Select a Card");
                }

                break;

            case START_SHOWCASE:

                if (isLookingAtObject(5)) {
                    STATE = SHOWCASE_TITLE;
                } else if (isLookingAtObject(6)) {
                    STATE = GALLERY;
                } else {
                    overlayView.show3DToast("Select button to Start SlideShow..");
                }
                break;

            case SHOWCASE_TITLE:

                if (isLookingAtObject(6)) {
                    STATE = GALLERY;
                } else {
                    STATE = SHOWCASE_INSPIRATION;
                }
                break;

            case SHOWCASE_INSPIRATION:

                if (isLookingAtObject(6)) {
                    STATE = GALLERY;
                } else {
                    STATE = SHOWCASE_PRODUCT;
                }
                break;

            case SHOWCASE_PRODUCT:
                overlayView.show3DToast("Use the Magnet to Play/Pause the rotation..");
                rotateObject = !rotateObject;
                break;
        }
        vibrator.vibrate(50);
    }

    /**
     * Check if user is looking at object by calculating where the object is in eye-space.
     *
     * @return true if the user is looking at the object.
     */
    private boolean isLookingAtObject(int i) {
        float[] initVec = null;
        switch (i) {
            case 1: initVec = new float[]{0f, -1.5f, 0.5f,  1.0f };
                break;
            case 2:
                initVec = new float[]{-8f, -8f, 0.75f, 1.0f};
                break;
            case 3:
                initVec = new float[]{-2f, -8f, 0.75f, 1.0f};
                break;
            case 4:
                initVec = new float[]{4f, -8f, 0.75f, 1.0f};
                break;
            case 5:
                initVec = new float[]{-8f, -2f, 0.75f, 1.0f};
                break;
            case 6:
                initVec = new float[]{-2f, -2f , 0.75f, 1.0f };
                break;
            case 7:
                initVec = new float[]{4f,-2f,0.75f,1.0f};
                break;
            case 8:
                initVec = new float[]{0f,-9.5f,0.75f,1.0f};
                break;
            case 9:
                initVec = new float[]{0f,-9.5f,0.75f,1.0f};
                break;
            case 10:
                initVec = new float[]{0f,-9.5f,0.75f,1.0f};
                break;
        }
        float[] objPositionVec = new float[4];

        // Convert object space to camera space. Use the headView from onNewFrame.
        Matrix.multiplyMM(modelView, 0, headView, 0, modelCube, 0);
        Matrix.multiplyMV(objPositionVec, 0, modelView, 0, initVec, 0);

        float pitch = (float) Math.atan2(objPositionVec[1], -objPositionVec[2]);
        float yaw = (float) Math.atan2(objPositionVec[0], -objPositionVec[2]);

        if (Math.abs(pitch) < PITCH_LIMIT && Math.abs(yaw) < YAW_LIMIT) {
            if (!isTriggerEnabled[i]) {
                vibrator.vibrate(50);
                isTriggerEnabled[i] = true;
            }
            return true;
        } else {
            isTriggerEnabled[i] = false;
            return false;
        }
    }

    /**
     * Prepares OpenGL ES before we draw a frame.
     *
     * @param headTransform The head transformation in the new frame.
     */
    @Override
    public void onNewFrame(HeadTransform headTransform) {
        // Build the Model part of the ModelView matrix.
//    Matrix.rotateM(modelCube, 0, TIME_DELTA, 0.5f, 0.5f, 1.0f);

        // Build the camera matrix and apply it to the ModelView.
        Matrix.setLookAtM(camera, 0, 0.0f, 0.0f, CAMERA_Z, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);

        headTransform.getHeadView(headView, 0);

        checkGLError("onReadyToDraw");
    }

    @Override
    public void onFinishFrame(Viewport viewport) {
    }

    @Override
    public void onRendererShutdown() {
        Log.i(TAG, "onRendererShutdown");
    }

    /**
     * Converts a raw text file, saved as a resource, into an OpenGL ES shader.
     *
     * @param type  The type of shader we will be creating.
     * @param resId The resource ID of the raw text file about to be turned into a shader.
     * @return The shader object handler.
     */
    private int loadGLShader(int type, int resId) {
        String code = readRawTextFile(resId);
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, code);
        GLES20.glCompileShader(shader);

        // Get the compilation status.
        final int[] compileStatus = new int[1];
        GLES20.glGetShaderiv(shader, GLES20.GL_COMPILE_STATUS, compileStatus, 0);

        // If the compilation failed, delete the shader.
        if (compileStatus[0] == 0) {
            Log.e(TAG, "Error compiling shader: " + GLES20.glGetShaderInfoLog(shader));
            GLES20.glDeleteShader(shader);
            shader = 0;
        }

        if (shader == 0) {
            throw new RuntimeException("Error creating shader.");
        }

        return shader;
    }

    /**
     * Checks if we've had an error inside of OpenGL ES, and if so what that error is.
     *
     * @param label Label to report in case of error.
     */
    private static void checkGLError(String label) {
        int error;
        while ((error = GLES20.glGetError()) != GLES20.GL_NO_ERROR) {
            Log.e(TAG, label + ": glError " + error);
            throw new RuntimeException(label + ": glError " + error);
        }
    }

    /**
     * Converts a raw text file into a string.
     *
     * @param resId The resource ID of the raw text file about to be turned into a shader.
     * @return The context of the text file, or null in case of error.
     */
    private String readRawTextFile(int resId) {
        InputStream inputStream = getResources().openRawResource(resId);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            reader.close();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
