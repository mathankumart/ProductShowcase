/*
 * Copyright 2014 Google Inc. All Rights Reserved.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.mkumart.presentationvr;

/**
 * Contains vertex, normal and color data.
 */
public final class WorldLayoutData {

    public static final float[] EXIT_BUTTON = new float[] {
            // Front face
            -2.0f, 5.0f, 1.0f,
            -2.0f, 6.0f, 1.0f,
            2.0f, 5.0f, 1.0f,
            -2.0f, 6.0f, 1.0f,
            2.0f, 6.0f, 1.0f,
            2.0f, 5.0f, 1.0f,

            // Right face
            2.0f, 5.0f, 1.0f,
            2.0f, 6.0f, 1.0f,
            2.0f, 5.0f, 0.0f,
            2.0f, 6.0f, 1.0f,
            2.0f, 6.0f, 0.0f,
            2.0f, 5.0f, 0.0f,

            // Back face
            2.0f, 5.0f, 0.0f,
            2.0f, 6.0f, 0.0f,
            -2.0f, 5.0f, 0.0f,
            2.0f, 6.0f, 0.0f,
            -2.0f, 6.0f, 0.0f,
            -2.0f, 5.0f, 0.0f,

            // Left face
            -2.0f, 5.0f, 0.0f,
            -2.0f, 6.0f, 0.0f,
            -2.0f, 5.0f, 1.0f,
            -2.0f, 6.0f, 0.0f,
            -2.0f, 6.0f, 1.0f,
            -2.0f, 5.0f, 1.0f,

            // Top face
            -2.0f, 5.0f, 0.0f,
            -2.0f, 5.0f, 1.0f,
            2.0f, 5.0f, 0.0f,
            -2.0f, 5.0f, 1.0f,
            2.0f, 5.0f, 1.0f,
            2.0f, 5.0f, 0.0f,

            // Bottom face
            2.0f, 6.0f, 0.0f,
            2.0f, 6.0f, 1.0f,
            -2.0f, 6.0f, 0.0f,
            2.0f, 6.0f, 1.0f,
            -2.0f, 6.0f, 1.0f,
            -2.0f, 6.0f, 0.0f,
    };

    public static final float[] WELCOME_LOGO = new float[] {
            // Front face
            -2.0f, 3.0f, 1.0f,
            -2.0f, 0.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            -2.0f, 0.0f, 1.0f,
            2.0f, 0.0f, 1.0f,
            2.0f, 3.0f, 1.0f,

            // Right face
            2.0f, 3.0f, 1.0f,
            2.0f, 0.0f, 1.0f,
            2.0f, 3.0f, 0.0f,
            2.0f, 0.0f, 1.0f,
            2.0f, 0.0f, 0.0f,
            2.0f, 3.0f, 0.0f,

            // Back face
            2.0f, 3.0f, 0.0f,
            2.0f, 0.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,
            2.0f, 0.0f, 0.0f,
            -2.0f, 0.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,

            // Left face
            -2.0f, 3.0f, 0.0f,
            -2.0f, 0.0f, 0.0f,
            -2.0f, 3.0f, 1.0f,
            -2.0f, 0.0f, 0.0f,
            -2.0f, 0.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,

            // Top face
            -2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 0.0f,

            // Bottom face
            2.0f, 0.0f, 0.0f,
            2.0f, 0.0f, 1.0f,
            -2.0f, 0.0f, 0.0f,
            2.0f, 0.0f, 1.0f,
            -2.0f, 0.0f, 1.0f,
            -2.0f, 0.0f, 0.0f,
    };

    public static final float[] ENTER_BUTTON = new float[] {
            // Front face
            -2.0f, -1.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            2.0f, -1.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, -1.0f, 1.0f,

            // Right face
            2.0f, -1.0f, 1.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, -1.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, -2.0f, 0.0f,
            2.0f, -1.0f, 0.0f,

            // Back face
            2.0f, -1.0f, 0.0f,
            2.0f, -2.0f, 0.0f,
            -2.0f, -1.0f, 0.0f,
            2.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, -1.0f, 0.0f,

            // Left face
            -2.0f, -1.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, -1.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, -1.0f, 1.0f,

            // Top face
            -2.0f, -1.0f, 0.0f,
            -2.0f, -1.0f, 1.0f,
            2.0f, -1.0f, 0.0f,
            -2.0f, -1.0f, 1.0f,
            2.0f, -1.0f, 1.0f,
            2.0f, -1.0f, 0.0f,

            // Bottom face
            2.0f, -2.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
    };
    public static float cube_length = 4.0f;
    public static float big_cube_length = 2* cube_length;
    public static float depth = -0.5f;
    public static float distance = 2.0f;
    public static float origin_x = -10.0f;
    public static float origin_y = -10.0f;
    public static float origin_z = 1.0f;
    public static float origin_x1 = origin_x + cube_length + distance;
    public static float origin_y1 = origin_y + cube_length + distance;
    public static float origin_y2 = origin_y + 2 * (cube_length + distance);
    public static float origin_x_right = origin_x + 3*(cube_length + distance);
    public static float origin_z1 = origin_z + 2.0f;
    public static float cube_length_angular_x = cube_length / 2;
    public static float cube_length_angular_z =(float) Math.sqrt(3.0) *cube_length/2;
    public static float origin_x1_right =  origin_x_right + (cube_length+ distance) / 2;
    public static float origin_z1_right =  origin_z1 + (float) Math.sqrt(3.0) * (cube_length + distance) / 2;
    public static float origin_x_left = origin_x - cube_length - distance;
    public static float origin_x1_left = origin_x_left - (cube_length + distance)/2;
    public static float origin_x2 = origin_x + 2 * (cube_length + distance);
    public static float origin_x3 = origin_x + 3*(cube_length + distance);
    public static float origin_x4 = origin_x + 4*(cube_length + distance);
    public static float origin_x5 = origin_x+ 5*(cube_length + distance);
    public static float origin_x6 = origin_x + 6*(cube_length + distance);

    public static final float[] CUBE_COORDS = new float[] {
            // Front face
            origin_x, origin_y + cube_length, origin_z,
            origin_x, origin_y, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z,
            origin_x, origin_y, origin_z,
            origin_x + cube_length, origin_y, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z,

            // Right face
            origin_x + cube_length, origin_y + cube_length, origin_z,
            origin_x + cube_length, origin_y, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z +depth,
            origin_x+ cube_length, origin_y, origin_z,
            origin_x + cube_length, origin_y , origin_z + depth,
            origin_x + cube_length, origin_y + cube_length, origin_z + depth,

            // Back face
            origin_x + cube_length, origin_y + cube_length, origin_z+depth,
            origin_x + cube_length, origin_y, origin_z + depth,
            origin_x, origin_y + cube_length, origin_z + depth,
            origin_x + cube_length, origin_y, origin_z + depth,
            origin_x,  origin_y, origin_z + depth,
            origin_x, origin_y + cube_length, origin_z + depth,

            // Left face
            origin_x, origin_y + cube_length, origin_z + depth,
            origin_x, origin_y, origin_z + depth,
            origin_x, origin_y + cube_length, origin_z,
            origin_x, origin_y, origin_z + depth,
            origin_x, origin_y, origin_z,
            origin_x, origin_y + cube_length, origin_z,

            // Top face
            origin_x, origin_y + cube_length, origin_z + depth,
            origin_x, origin_y + cube_length, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z + depth,
            origin_x, origin_y + cube_length, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z,
            origin_x + cube_length, origin_y + cube_length, origin_z + depth,

            // Bottom face
            origin_x + cube_length, origin_y, origin_z + depth,
            origin_x + cube_length, origin_y, origin_z,
            origin_x, origin_y, origin_z + depth,
            origin_x + cube_length, origin_y, origin_z,
            origin_x, origin_y, origin_z,
            origin_x, origin_y, origin_z + depth,
    };

    public static final float[] CUBE_COORDS_1 = new float[] {
            // Front face
            origin_x1, origin_y + cube_length, origin_z,
            origin_x1, origin_y, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z,
            origin_x1, origin_y, origin_z,
            origin_x1 + cube_length, origin_y, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z,

            // Right face
            origin_x1 + cube_length, origin_y + cube_length, origin_z,
            origin_x1 + cube_length, origin_y, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z +depth,
            origin_x1+ cube_length, origin_y, origin_z,
            origin_x1 + cube_length, origin_y , origin_z + depth,
            origin_x1 + cube_length, origin_y + cube_length, origin_z + depth,

            // Back face
            origin_x1 + cube_length, origin_y + cube_length, origin_z+depth,
            origin_x1+ cube_length, origin_y, origin_z + depth,
            origin_x1, origin_y + cube_length, origin_z + depth,
            origin_x1 + cube_length, origin_y, origin_z + depth,
            origin_x1,  origin_y, origin_z + depth,
            origin_x1, origin_y + cube_length, origin_z + depth,

            // Left face
            origin_x1, origin_y + cube_length, origin_z + depth,
            origin_x1, origin_y, origin_z + depth,
            origin_x1, origin_y + cube_length, origin_z,
            origin_x1, origin_y, origin_z + depth,
            origin_x1, origin_y, origin_z,
            origin_x1, origin_y + cube_length, origin_z,

            // Top face
            origin_x1, origin_y + cube_length, origin_z + depth,
            origin_x1, origin_y + cube_length, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z + depth,
            origin_x1, origin_y + cube_length, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z,
            origin_x1 + cube_length, origin_y + cube_length, origin_z + depth,

            // Bottom face
            origin_x1 + cube_length, origin_y, origin_z + depth,
            origin_x1 + cube_length, origin_y, origin_z,
            origin_x1, origin_y, origin_z + depth,
            origin_x1 + cube_length, origin_y, origin_z,
            origin_x1, origin_y, origin_z,
            origin_x1, origin_y, origin_z + depth,

            // Front face
           /* 3.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,

            // Right face
            7.0f, 2.0f, 1.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, -2.0f, 0.0f,
            7.0f, 2.0f, 0.0f,

            // Back face
            7.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 0.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 0.0f,

            // Left face
            3.0f, 2.0f, 0.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, -2.0f, 1.0f,
            3.0f, 2.0f, 1.0f,

            // Top face
            3.0f, 2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,

            // Bottom face
            7.0f, -2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,*/
    };

    public static final float[] CUBE_COORDS_2 = new float[] {
            // Front face
            origin_x2, origin_y + cube_length, origin_z,
            origin_x2, origin_y, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z,
            origin_x2, origin_y, origin_z,
            origin_x2 + cube_length, origin_y, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z,

            // Right face
            origin_x2 + cube_length, origin_y + cube_length, origin_z,
            origin_x2 + cube_length, origin_y, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z +depth,
            origin_x2+ cube_length, origin_y, origin_z,
            origin_x2 + cube_length, origin_y , origin_z + depth,
            origin_x2 + cube_length, origin_y + cube_length, origin_z + depth,

            // Back face
            origin_x2 + cube_length, origin_y + cube_length, origin_z+depth,
            origin_x2+ cube_length, origin_y, origin_z + depth,
            origin_x2, origin_y + cube_length, origin_z + depth,
            origin_x2 + cube_length, origin_y, origin_z + depth,
            origin_x2,  origin_y, origin_z + depth,
            origin_x2, origin_y + cube_length, origin_z + depth,

            // Left face
            origin_x2, origin_y + cube_length, origin_z + depth,
            origin_x2, origin_y, origin_z + depth,
            origin_x2, origin_y + cube_length, origin_z,
            origin_x2, origin_y, origin_z + depth,
            origin_x2, origin_y, origin_z,
            origin_x2, origin_y + cube_length, origin_z,

            // Top face
            origin_x2, origin_y + cube_length, origin_z + depth,
            origin_x2, origin_y + cube_length, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z + depth,
            origin_x2, origin_y + cube_length, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z,
            origin_x2 + cube_length, origin_y + cube_length, origin_z + depth,

            // Bottom face
            origin_x2 + cube_length, origin_y, origin_z + depth,
            origin_x2 + cube_length, origin_y, origin_z,
            origin_x2, origin_y, origin_z + depth,
            origin_x2 + cube_length, origin_y, origin_z,
            origin_x2, origin_y, origin_z,
            origin_x2, origin_y, origin_z + depth,

//            // Front face
//            origin_x_right, origin_y + cube_length , origin_z1,
//            origin_x_right, origin_y, origin_z1,
//            origin_x_right + cube_length_angular_x, origin_y +cube_length , origin_z1 + cube_length_angular_z,
//            origin_x_right, origin_y, origin_z1,
//            origin_x_right+ cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_right+ cube_length_angular_x, origin_y + cube_length , origin_z1 + cube_length_angular_z,
//
//            // Right face
//
//            origin_x_right + cube_length_angular_x, origin_y +cube_length , origin_z1 + cube_length_angular_z,
//            origin_x_right + cube_length_angular_x, origin_y , origin_z1 + cube_length_angular_z,
//            origin_x_right+ cube_length_angular_x + depth, origin_y+ cube_length , origin_z1 +cube_length_angular_z,
//            origin_x_right+ cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_right + cube_length_angular_x + depth, origin_y , origin_z1 + cube_length_angular_z ,
//            origin_x_right + cube_length_angular_x + depth, origin_y +cube_length, origin_z1 +cube_length_angular_z,
//
//            // Back face
//            origin_x_right + cube_length_angular_x + depth, origin_y + cube_length, origin_z1+cube_length_angular_z,
//            origin_x_right + cube_length_angular_x + depth , origin_y , origin_z1 + cube_length_angular_z ,
//            origin_x_right + depth, origin_y + cube_length, origin_z1,
//            origin_x_right + cube_length_angular_x + depth, origin_y , origin_z1 + cube_length_angular_z ,
//            origin_x_right + depth,  origin_y , origin_z1 ,
//            origin_x_right + depth, origin_y+cube_length , origin_z1 ,
//
//            // Left face
//            origin_x_right + depth, origin_y + cube_length, origin_z1,
//            origin_x_right +depth, origin_y , origin_z1,
//            origin_x_right , origin_y  + cube_length, origin_z1 ,
//            origin_x_right + depth, origin_y , origin_z1,
//            origin_x_right, origin_y , origin_z1,
//            origin_x_right , origin_y+ cube_length, origin_z1,
//
//
//            // Top face
//            origin_x_right + depth, origin_y  + cube_length, origin_z1 ,
//            origin_x_right, origin_y + cube_length , origin_z1,
//            origin_x_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1 + cube_length_angular_z,
//            origin_x_right, origin_y + cube_length, origin_z1 ,
//            origin_x_right + cube_length_angular_x, origin_y + cube_length , origin_z1 + cube_length_angular_z,
//            origin_x_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1 +cube_length_angular_z,
//
//            // Bottom face
//            origin_x_right + cube_length_angular_x + depth, origin_y , origin_z1+cube_length_angular_z ,
//            origin_x_right + cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_right + depth, origin_y , origin_z1,
//            origin_x_right + cube_length_angular_x, origin_y , origin_z1+ cube_length_angular_z ,
//            origin_x_right, origin_y, origin_z1,
//            origin_x_right + depth, origin_y , origin_z1,

            // Front face
            /*3.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 1.0f,

            // Right face
            7.0f, 7.0f, 1.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 3.0f, 0.0f,
            7.0f, 7.0f, 0.0f,

            // Back face
            7.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 0.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 0.0f,

            // Left face
            3.0f, 7.0f, 0.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 3.0f, 1.0f,
            3.0f, 7.0f, 1.0f,

            // Top face
            3.0f, 7.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 0.0f,

            // Bottom face
            7.0f, 3.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 0.0f,*/
    };

    public static final float[] CUBE_COORDS_3 = new float[] {
            // Front face
            origin_x, origin_y1 + cube_length, origin_z,
            origin_x, origin_y1, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z,
            origin_x, origin_y1, origin_z,
            origin_x + cube_length, origin_y1, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z,

            // Right face
            origin_x + cube_length, origin_y1 + cube_length, origin_z,
            origin_x + cube_length, origin_y1, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z +depth,
            origin_x+ cube_length, origin_y1, origin_z,
            origin_x + cube_length, origin_y1 , origin_z + depth,
            origin_x + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Back face
            origin_x + cube_length, origin_y1 + cube_length, origin_z+depth,
            origin_x + cube_length, origin_y1, origin_z + depth,
            origin_x, origin_y1 + cube_length, origin_z + depth,
            origin_x + cube_length, origin_y1, origin_z + depth,
            origin_x,  origin_y1, origin_z + depth,
            origin_x, origin_y1 + cube_length, origin_z + depth,

            // Left face
            origin_x, origin_y1 + cube_length, origin_z + depth,
            origin_x, origin_y1, origin_z + depth,
            origin_x, origin_y1 + cube_length, origin_z,
            origin_x, origin_y1, origin_z + depth,
            origin_x, origin_y1, origin_z,
            origin_x, origin_y1 + cube_length, origin_z,

            // Top face
            origin_x, origin_y1 + cube_length, origin_z + depth,
            origin_x, origin_y1 + cube_length, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z + depth,
            origin_x, origin_y1 + cube_length, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z,
            origin_x + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Bottom face
            origin_x + cube_length, origin_y1, origin_z + depth,
            origin_x + cube_length, origin_y1, origin_z,
            origin_x, origin_y1, origin_z + depth,
            origin_x + cube_length, origin_y1, origin_z,
            origin_x, origin_y1, origin_z,
            origin_x, origin_y1, origin_z + depth,
            // Front face
//            origin_x1_right, origin_y + cube_length , origin_z1_right,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right + cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right+ cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//
//            // Right face
//
//            origin_x1_right + cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x, origin_y , origin_z1_right + cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x + depth, origin_y+ cube_length , origin_z1_right +cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + cube_length_angular_x + depth, origin_y +cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Back face
//            origin_x1_right + cube_length_angular_x + depth, origin_y + cube_length, origin_z1_right+cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth , origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + depth,  origin_y , origin_z1_right ,
//            origin_x1_right + depth, origin_y+cube_length , origin_z1_right ,
//
//            // Left face
//            origin_x1_right + depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_right +depth, origin_y , origin_z1_right,
//            origin_x1_right , origin_y  + cube_length, origin_z1_right ,
//            origin_x1_right + depth, origin_y , origin_z1_right,
//            origin_x1_right, origin_y , origin_z1_right,
//            origin_x1_right , origin_y+ cube_length, origin_z1_right,
//
//
//            // Top face
//            origin_x1_right + depth, origin_y  + cube_length, origin_z1_right ,
//            origin_x1_right, origin_y + cube_length , origin_z1_right,
//            origin_x1_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1_right + cube_length_angular_z,
//            origin_x1_right, origin_y + cube_length, origin_z1_right ,
//            origin_x1_right + cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Bottom face
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right+cube_length_angular_z ,
//            origin_x1_right + cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right + depth, origin_y , origin_z1_right,
//            origin_x1_right + cube_length_angular_x, origin_y , origin_z1_right+ cube_length_angular_z ,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right + depth, origin_y , origin_z1_right,

//            // Front face
            /*-2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 1.0f,

            // Right face
            2.0f, 7.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 0.0f,
            2.0f, 7.0f, 0.0f,

            // Back face
            2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 0.0f,

            // Left face
            -2.0f, 7.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 1.0f,
            -2.0f, 7.0f, 1.0f,

            // Top face
            -2.0f, 7.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 0.0f,

            // Bottom face
            2.0f, 3.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,*/
    };
    public static final float[] CUBE_COORDS_4 = new float[] {
            // Front face
            origin_x1, origin_y1 + cube_length, origin_z,
            origin_x1, origin_y1, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x1, origin_y1, origin_z,
            origin_x1 + cube_length, origin_y1, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z,

            // Right face
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y1, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z +depth,
            origin_x1+ cube_length, origin_y1, origin_z,
            origin_x1 + cube_length, origin_y1 , origin_z + depth,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Back face
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z+depth,
            origin_x1+ cube_length, origin_y1, origin_z + depth,
            origin_x1, origin_y1 + cube_length, origin_z + depth,
            origin_x1 + cube_length, origin_y1, origin_z + depth,
            origin_x1,  origin_y1, origin_z + depth,
            origin_x1, origin_y1 + cube_length, origin_z + depth,

            // Left face
            origin_x1, origin_y1 + cube_length, origin_z + depth,
            origin_x1, origin_y1, origin_z + depth,
            origin_x1, origin_y1 + cube_length, origin_z,
            origin_x1, origin_y1, origin_z + depth,
            origin_x1, origin_y1, origin_z,
            origin_x1, origin_y1 + cube_length, origin_z,

            // Top face
            origin_x1, origin_y1 + cube_length, origin_z + depth,
            origin_x1, origin_y1 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z + depth,
            origin_x1, origin_y1 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Bottom face
            origin_x1 + cube_length, origin_y1, origin_z + depth,
            origin_x1 + cube_length, origin_y1, origin_z,
            origin_x1, origin_y1, origin_z + depth,
            origin_x1 + cube_length, origin_y1, origin_z,
            origin_x1, origin_y1, origin_z,
            origin_x1, origin_y1, origin_z + depth,

//            origin_x1_right, origin_y + cube_length , origin_z1_right,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right + cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right+ cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//
//            // Right face
//
//            origin_x1_right + cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x, origin_y , origin_z1_right + cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x + depth, origin_y+ cube_length , origin_z1_right +cube_length_angular_z,
//            origin_x1_right+ cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + cube_length_angular_x + depth, origin_y +cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Back face
//            origin_x1_right + cube_length_angular_x + depth, origin_y + cube_length, origin_z1_right+cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth , origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_right + depth,  origin_y , origin_z1_right ,
//            origin_x1_right + depth, origin_y+cube_length , origin_z1_right ,
//
//            // Left face
//            origin_x1_right + depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_right +depth, origin_y , origin_z1_right,
//            origin_x1_right , origin_y  + cube_length, origin_z1_right ,
//            origin_x1_right + depth, origin_y , origin_z1_right,
//            origin_x1_right, origin_y , origin_z1_right,
//            origin_x1_right , origin_y+ cube_length, origin_z1_right,
//
//
//            // Top face
//            origin_x1_right + depth, origin_y  + cube_length, origin_z1_right ,
//            origin_x1_right, origin_y + cube_length , origin_z1_right,
//            origin_x1_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1_right + cube_length_angular_z,
//            origin_x1_right, origin_y + cube_length, origin_z1_right ,
//            origin_x1_right + cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_right + cube_length_angular_x + depth, origin_y  + cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Bottom face
//            origin_x1_right + cube_length_angular_x + depth, origin_y , origin_z1_right+cube_length_angular_z ,
//            origin_x1_right + cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_right + depth, origin_y , origin_z1_right,
//            origin_x1_right + cube_length_angular_x, origin_y , origin_z1_right+ cube_length_angular_z ,
//            origin_x1_right, origin_y, origin_z1_right,
//            origin_x1_right + depth, origin_y , origin_z1_right,

//            // Front face
//            origin_x3, origin_y1 + cube_length, origin_z,
//            origin_x3, origin_y1, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x3, origin_y1, origin_z,
//            origin_x3 + cube_length, origin_y1, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z,
//
//            // Right face
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x3 + cube_length, origin_y1, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z +depth,
//            origin_x3+ cube_length, origin_y1, origin_z,
//            origin_x3 + cube_length, origin_y1 , origin_z + depth,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Back face
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z+depth,
//            origin_x3 + cube_length, origin_y1, origin_z + depth,
//            origin_x3, origin_y1 + cube_length, origin_z + depth,
//            origin_x3 + cube_length, origin_y1, origin_z + depth,
//            origin_x3,  origin_y1, origin_z + depth,
//            origin_x3, origin_y1 + cube_length, origin_z + depth,
//
//            // Left face
//            origin_x3, origin_y1 + cube_length, origin_z + depth,
//            origin_x3, origin_y1, origin_z + depth,
//            origin_x3, origin_y1 + cube_length, origin_z,
//            origin_x3, origin_y1, origin_z + depth,
//            origin_x3, origin_y1, origin_z,
//            origin_x3, origin_y1 + cube_length, origin_z,
//
//            // Top face
//            origin_x3, origin_y1 + cube_length, origin_z + depth,
//            origin_x3, origin_y1 + cube_length, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z + depth,
//            origin_x3, origin_y1 + cube_length, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x3 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Bottom face
//            origin_x3 + cube_length, origin_y1, origin_z + depth,
//            origin_x3 + cube_length, origin_y1, origin_z,
//            origin_x3, origin_y1, origin_z + depth,
//            origin_x3 + cube_length, origin_y1, origin_z,
//            origin_x3, origin_y1, origin_z,
//            origin_x3, origin_y1, origin_z + depth,
    };
    public static final float[] CUBE_COORDS_5 = new float[] {
            // Front face
            origin_x2, origin_y1 + cube_length, origin_z,
            origin_x2, origin_y1, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x2, origin_y1, origin_z,
            origin_x2 + cube_length, origin_y1, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z,

            // Right face
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y1, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z +depth,
            origin_x2+ cube_length, origin_y1, origin_z,
            origin_x2 + cube_length, origin_y1 , origin_z + depth,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Back face
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z+depth,
            origin_x2+ cube_length, origin_y1, origin_z + depth,
            origin_x2, origin_y1 + cube_length, origin_z + depth,
            origin_x2 + cube_length, origin_y1, origin_z + depth,
            origin_x2,  origin_y1, origin_z + depth,
            origin_x2, origin_y1 + cube_length, origin_z + depth,

            // Left face
            origin_x2, origin_y1 + cube_length, origin_z + depth,
            origin_x2, origin_y1, origin_z + depth,
            origin_x2, origin_y1 + cube_length, origin_z,
            origin_x2, origin_y1, origin_z + depth,
            origin_x2, origin_y1, origin_z,
            origin_x2, origin_y1 + cube_length, origin_z,

            // Top face
            origin_x2, origin_y1 + cube_length, origin_z + depth,
            origin_x2, origin_y1 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z + depth,
            origin_x2, origin_y1 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y1 + cube_length, origin_z + depth,

            // Bottom face
            origin_x2 + cube_length, origin_y1, origin_z + depth,
            origin_x2 + cube_length, origin_y1, origin_z,
            origin_x2, origin_y1, origin_z + depth,
            origin_x2 + cube_length, origin_y1, origin_z,
            origin_x2, origin_y1, origin_z,
            origin_x2, origin_y1, origin_z + depth,


            // Front face
//            origin_x_left - cube_length_angular_x, origin_y + cube_length , origin_z1 + cube_length_angular_z,
//            origin_x_left - cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_left , origin_y +cube_length , origin_z1 ,
//            origin_x_left - cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_left , origin_y, origin_z1 ,
//            origin_x_left , origin_y + cube_length , origin_z1,
//
//            // Right face
//
//            origin_x_left , origin_y +cube_length , origin_z1 ,
//            origin_x_left , origin_y , origin_z1 ,
//            origin_x_left - depth, origin_y+ cube_length , origin_z1 ,
//            origin_x_left , origin_y, origin_z1 ,
//            origin_x_left - depth, origin_y , origin_z1  ,
//            origin_x_left - depth, origin_y +cube_length, origin_z1,
//
//            // Back face
//            origin_x_left  - depth, origin_y + cube_length, origin_z1,
//            origin_x_left  - depth , origin_y , origin_z1  ,
//            origin_x_left - cube_length_angular_x - depth, origin_y + cube_length, origin_z1 + cube_length_angular_z,
//            origin_x_left - depth, origin_y , origin_z1 ,
//            origin_x_left - depth - cube_length_angular_x,  origin_y , origin_z1 + cube_length_angular_z ,
//            origin_x_left - depth - cube_length_angular_x, origin_y+cube_length , origin_z1 + cube_length_angular_z ,
//
//            // Left face
//            origin_x_left - depth - cube_length_angular_x , origin_y + cube_length, origin_z1 + cube_length_angular_z,
//            origin_x_left - depth - cube_length_angular_x, origin_y , origin_z1 + cube_length_angular_z,
//            origin_x_left - cube_length_angular_x, origin_y  + cube_length, origin_z1 + cube_length_angular_z ,
//            origin_x_left - depth - cube_length_angular_x, origin_y , origin_z1 + cube_length_angular_z,
//            origin_x_left - cube_length_angular_x, origin_y , origin_z1 + cube_length_angular_z,
//            origin_x_left - cube_length_angular_x, origin_y+ cube_length, origin_z1 + cube_length_angular_z,
//
//
//            // Top face
//            origin_x_left - cube_length_angular_x- depth, origin_y  + cube_length, origin_z1 + cube_length_angular_z ,
//            origin_x_left - cube_length_angular_x, origin_y + cube_length , origin_z1 + cube_length_angular_z,
//            origin_x_left  - depth, origin_y  + cube_length, origin_z1 ,
//            origin_x_left - cube_length_angular_x, origin_y + cube_length, origin_z1 + cube_length_angular_z ,
//            origin_x_left , origin_y + cube_length , origin_z1 ,
//            origin_x_left  - depth, origin_y  + cube_length, origin_z1 ,
//
//            // Bottom face
//            origin_x_left  - depth, origin_y , origin_z1 ,
//            origin_x_left, origin_y, origin_z1 ,
//            origin_x_left -cube_length_angular_x- depth, origin_y , origin_z1 + cube_length_angular_z,
//            origin_x_left , origin_y , origin_z1 ,
//            origin_x_left - cube_length_angular_x, origin_y, origin_z1 + cube_length_angular_z,
//            origin_x_left - cube_length_angular_x- depth, origin_y , origin_z1 + cube_length_angular_z,*/
//            // Front face
//            origin_x4, origin_y1 + cube_length, origin_z,
//            origin_x4, origin_y1, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x4, origin_y1, origin_z,
//            origin_x4 + cube_length, origin_y1, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z,
//
//            // Right face
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x4 + cube_length, origin_y1, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z +depth,
//            origin_x4+ cube_length, origin_y1, origin_z,
//            origin_x4 + cube_length, origin_y1 , origin_z + depth,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Back face
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z+depth,
//            origin_x4 + cube_length, origin_y1, origin_z + depth,
//            origin_x4, origin_y1 + cube_length, origin_z + depth,
//            origin_x4 + cube_length, origin_y1, origin_z + depth,
//            origin_x4,  origin_y1, origin_z + depth,
//            origin_x4, origin_y1 + cube_length, origin_z + depth,
//
//            // Left face
//            origin_x4, origin_y1 + cube_length, origin_z + depth,
//            origin_x4, origin_y1, origin_z + depth,
//            origin_x4, origin_y1 + cube_length, origin_z,
//            origin_x4, origin_y1, origin_z + depth,
//            origin_x4, origin_y1, origin_z,
//            origin_x4, origin_y1 + cube_length, origin_z,
//
//            // Top face
//            origin_x4, origin_y1 + cube_length, origin_z + depth,
//            origin_x4, origin_y1 + cube_length, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z + depth,
//            origin_x4, origin_y1 + cube_length, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x4 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Bottom face
//            origin_x4 + cube_length, origin_y1, origin_z + depth,
//            origin_x4 + cube_length, origin_y1, origin_z,
//            origin_x4, origin_y1, origin_z + depth,
//            origin_x4 + cube_length, origin_y1, origin_z,
//            origin_x4, origin_y1, origin_z,
//            origin_x4, origin_y1, origin_z + depth,
    };
    public static final float[] CUBE_COORDS_6 = new float[] {
            // Front face
            origin_x, origin_y2 + cube_length, origin_z,
            origin_x, origin_y2, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z,
            origin_x, origin_y2, origin_z,
            origin_x + cube_length, origin_y2, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z,

            // Right face
            origin_x + cube_length, origin_y2 + cube_length, origin_z,
            origin_x + cube_length, origin_y2, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z +depth,
            origin_x+ cube_length, origin_y2, origin_z,
            origin_x + cube_length, origin_y2 , origin_z + depth,
            origin_x + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Back face
            origin_x + cube_length, origin_y2 + cube_length, origin_z+depth,
            origin_x + cube_length, origin_y2, origin_z + depth,
            origin_x, origin_y2 + cube_length, origin_z + depth,
            origin_x + cube_length, origin_y2, origin_z + depth,
            origin_x,  origin_y2, origin_z + depth,
            origin_x, origin_y2 + cube_length, origin_z + depth,

            // Left face
            origin_x, origin_y2 + cube_length, origin_z + depth,
            origin_x, origin_y2, origin_z + depth,
            origin_x, origin_y2 + cube_length, origin_z,
            origin_x, origin_y2, origin_z + depth,
            origin_x, origin_y2, origin_z,
            origin_x, origin_y2 + cube_length, origin_z,

            // Top face
            origin_x, origin_y2 + cube_length, origin_z + depth,
            origin_x, origin_y2 + cube_length, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z + depth,
            origin_x, origin_y2 + cube_length, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z,
            origin_x + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Bottom face
            origin_x + cube_length, origin_y2, origin_z + depth,
            origin_x + cube_length, origin_y2, origin_z,
            origin_x, origin_y2, origin_z + depth,
            origin_x + cube_length, origin_y2, origin_z,
            origin_x, origin_y2, origin_z,
            origin_x, origin_y2, origin_z + depth,

//            // Front face
//            origin_x1_left, origin_y + cube_length , origin_z1_right,
//            origin_x1_left, origin_y, origin_z1_right,
//            origin_x1_left - cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_left, origin_y, origin_z1_right,
//            origin_x1_left - cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//
//            // Right face
//
//            origin_x1_left - cube_length_angular_x, origin_y +cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x, origin_y , origin_z1_right + cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x - depth, origin_y+ cube_length , origin_z1_right +cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x - depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_left - cube_length_angular_x - depth, origin_y +cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Back face
//            origin_x1_left - cube_length_angular_x - depth, origin_y + cube_length, origin_z1_right+cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x - depth , origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_left - depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_left - cube_length_angular_x + depth, origin_y , origin_z1_right + cube_length_angular_z ,
//            origin_x1_left - depth,  origin_y , origin_z1_right ,
//            origin_x1_left - depth, origin_y+cube_length , origin_z1_right ,
//
//            // Left face
//            origin_x1_left - depth, origin_y + cube_length, origin_z1_right,
//            origin_x1_left - depth, origin_y , origin_z1_right,
//            origin_x1_left , origin_y  + cube_length, origin_z1_right ,
//            origin_x1_left - depth, origin_y , origin_z1_right,
//            origin_x1_left, origin_y , origin_z1_right,
//            origin_x1_left , origin_y+ cube_length, origin_z1_right,
//
//
//            // Top face
//            origin_x1_left - depth, origin_y  + cube_length, origin_z1_right ,
//            origin_x1_left, origin_y + cube_length , origin_z1_right,
//            origin_x1_left - cube_length_angular_x - depth, origin_y  + cube_length, origin_z1_right + cube_length_angular_z,
//            origin_x1_left, origin_y + cube_length, origin_z1_right ,
//            origin_x1_left - cube_length_angular_x, origin_y + cube_length , origin_z1_right + cube_length_angular_z,
//            origin_x1_left - cube_length_angular_x - depth, origin_y  + cube_length, origin_z1_right +cube_length_angular_z,
//
//            // Bottom face
//            origin_x1_left - cube_length_angular_x - depth, origin_y , origin_z1_right+cube_length_angular_z ,
//            origin_x1_left - cube_length_angular_x, origin_y, origin_z1_right + cube_length_angular_z,
//            origin_x1_left - depth, origin_y , origin_z1_right,
//            origin_x1_left - cube_length_angular_x, origin_y , origin_z1_right+ cube_length_angular_z ,
//            origin_x1_left, origin_y, origin_z1_right,
//            origin_x1_left - depth, origin_y , origin_z1_right,
//            // Front face
//            origin_x5, origin_y1 + cube_length, origin_z,
//            origin_x5, origin_y1, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x5, origin_y1, origin_z,
//            origin_x5 + cube_length, origin_y1, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z,
//
//            // Right face
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x5 + cube_length, origin_y1, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z +depth,
//            origin_x5+ cube_length, origin_y1, origin_z,
//            origin_x5 + cube_length, origin_y1 , origin_z + depth,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Back face
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z+depth,
//            origin_x5 + cube_length, origin_y1, origin_z + depth,
//            origin_x5, origin_y1 + cube_length, origin_z + depth,
//            origin_x5 + cube_length, origin_y1, origin_z + depth,
//            origin_x5,  origin_y1, origin_z + depth,
//            origin_x5, origin_y1 + cube_length, origin_z + depth,
//
//            // Left face
//            origin_x5, origin_y1 + cube_length, origin_z + depth,
//            origin_x5, origin_y1, origin_z + depth,
//            origin_x5, origin_y1 + cube_length, origin_z,
//            origin_x5, origin_y1, origin_z + depth,
//            origin_x5, origin_y1, origin_z,
//            origin_x5, origin_y1 + cube_length, origin_z,
//
//            // Top face
//            origin_x5, origin_y1 + cube_length, origin_z + depth,
//            origin_x5, origin_y1 + cube_length, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z + depth,
//            origin_x5, origin_y1 + cube_length, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z,
//            origin_x5 + cube_length, origin_y1 + cube_length, origin_z + depth,
//
//            // Bottom face
//            origin_x5 + cube_length, origin_y1, origin_z + depth,
//            origin_x5 + cube_length, origin_y1, origin_z,
//            origin_x5, origin_y1, origin_z + depth,
//            origin_x5 + cube_length, origin_y1, origin_z,
//            origin_x5, origin_y1, origin_z,
//            origin_x5, origin_y1, origin_z + depth,
    };
    public static final float[] CUBE_COORDS_7 = new float[] {
            // Front face
            origin_x1, origin_y2 + cube_length, origin_z,
            origin_x1, origin_y2, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x1, origin_y2, origin_z,
            origin_x1 + cube_length, origin_y2, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z,

            // Right face
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y2, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z +depth,
            origin_x1+ cube_length, origin_y2, origin_z,
            origin_x1 + cube_length, origin_y2 , origin_z + depth,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Back face
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z+depth,
            origin_x1 + cube_length, origin_y2, origin_z + depth,
            origin_x1, origin_y2 + cube_length, origin_z + depth,
            origin_x1 + cube_length, origin_y2, origin_z + depth,
            origin_x1,  origin_y2, origin_z + depth,
            origin_x1, origin_y2 + cube_length, origin_z + depth,

            // Left face
            origin_x1, origin_y2 + cube_length, origin_z + depth,
            origin_x1, origin_y2, origin_z + depth,
            origin_x1, origin_y2 + cube_length, origin_z,
            origin_x1, origin_y2, origin_z + depth,
            origin_x1, origin_y2, origin_z,
            origin_x1, origin_y2 + cube_length, origin_z,

            // Top face
            origin_x1, origin_y2 + cube_length, origin_z + depth,
            origin_x1, origin_y2 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z + depth,
            origin_x1, origin_y2 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x1 + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Bottom face
            origin_x1 + cube_length, origin_y2, origin_z + depth,
            origin_x1 + cube_length, origin_y2, origin_z,
            origin_x1, origin_y2, origin_z + depth,
            origin_x1 + cube_length, origin_y2, origin_z,
            origin_x1, origin_y2, origin_z,
            origin_x1, origin_y2, origin_z + depth,

    };
    public static final float[] CUBE_COORDS_8 = new float[] {
            // Front face
            origin_x2, origin_y2 + cube_length, origin_z,
            origin_x2, origin_y2, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x2, origin_y2, origin_z,
            origin_x2 + cube_length, origin_y2, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z,

            // Right face
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y2, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z +depth,
            origin_x2+ cube_length, origin_y2, origin_z,
            origin_x2+ cube_length, origin_y2 , origin_z + depth,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Back face
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z+depth,
            origin_x2 + cube_length, origin_y2, origin_z + depth,
            origin_x2, origin_y2 + cube_length, origin_z + depth,
            origin_x2 + cube_length, origin_y2, origin_z + depth,
            origin_x2,  origin_y2, origin_z + depth,
            origin_x2, origin_y2 + cube_length, origin_z + depth,

            // Left face
            origin_x2, origin_y2 + cube_length, origin_z + depth,
            origin_x2, origin_y2, origin_z + depth,
            origin_x2, origin_y2 + cube_length, origin_z,
            origin_x2, origin_y2, origin_z + depth,
            origin_x2, origin_y2, origin_z,
            origin_x2, origin_y2 + cube_length, origin_z,

            // Top face
            origin_x2, origin_y2 + cube_length, origin_z + depth,
            origin_x2, origin_y2 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z + depth,
            origin_x2, origin_y2 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z,
            origin_x2 + cube_length, origin_y2 + cube_length, origin_z + depth,

            // Bottom face
            origin_x2 + cube_length, origin_y2, origin_z + depth,
            origin_x2 + cube_length, origin_y2, origin_z,
            origin_x2, origin_y2, origin_z + depth,
            origin_x2 + cube_length, origin_y2, origin_z,
            origin_x2, origin_y2, origin_z,
            origin_x2, origin_y2, origin_z + depth,

    };


/*
    public static final float[] CUBE_COORDS = new float[] {
            // Front face
            -2.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            2.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, 2.0f, 1.0f,

            // Right face
            2.0f, 2.0f, 1.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, 2.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            2.0f, -2.0f, 0.0f,
            2.0f, 2.0f, 0.0f,

            // Back face
            2.0f, 2.0f, 0.0f,
            2.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 0.0f,
            2.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 0.0f,

            // Left face
            -2.0f, 2.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, 2.0f, 1.0f,

            // Top face
            -2.0f, 2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            2.0f, 2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            2.0f, 2.0f, 1.0f,
            2.0f, 2.0f, 0.0f,

            // Bottom face
            2.0f, -2.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
    };
    public static final float[] CUBE_COORDS_1 = new float[] {
            // Front face
            3.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,

            // Right face
            7.0f, 2.0f, 1.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            7.0f, -2.0f, 0.0f,
            7.0f, 2.0f, 0.0f,

            // Back face
            7.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 0.0f,
            7.0f, -2.0f, 0.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 0.0f,

            // Left face
            3.0f, 2.0f, 0.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,
            3.0f, -2.0f, 1.0f,
            3.0f, 2.0f, 1.0f,

            // Top face
            3.0f, 2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,
            3.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 1.0f,
            7.0f, 2.0f, 0.0f,

            // Bottom face
            7.0f, -2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,
            7.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 1.0f,
            3.0f, -2.0f, 0.0f,
    };

    public static final float[] CUBE_COORDS_2 = new float[] {
            // Front face
            3.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 1.0f,

            // Right face
            7.0f, 7.0f, 1.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            7.0f, 3.0f, 0.0f,
            7.0f, 7.0f, 0.0f,

            // Back face
            7.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 0.0f,
            7.0f, 3.0f, 0.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 0.0f,

            // Left face
            3.0f, 7.0f, 0.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            3.0f, 3.0f, 0.0f,
            3.0f, 3.0f, 1.0f,
            3.0f, 7.0f, 1.0f,

            // Top face
            3.0f, 7.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 0.0f,
            3.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 1.0f,
            7.0f, 7.0f, 0.0f,

            // Bottom face
            7.0f, 3.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 0.0f,
            7.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 1.0f,
            3.0f, 3.0f, 0.0f,
    };


    public static final float[] CUBE_COORDS_3 = new float[] {
            // Front face
            -2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 1.0f,

            // Right face
            2.0f, 7.0f, 1.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            2.0f, 3.0f, 0.0f,
            2.0f, 7.0f, 0.0f,

            // Back face
            2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 0.0f,
            2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 0.0f,

            // Left face
            -2.0f, 7.0f, 0.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,
            -2.0f, 3.0f, 1.0f,
            -2.0f, 7.0f, 1.0f,

            // Top face
            -2.0f, 7.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 0.0f,
            -2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 1.0f,
            2.0f, 7.0f, 0.0f,

            // Bottom face
            2.0f, 3.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,
            2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 1.0f,
            -2.0f, 3.0f, 0.0f,
    };
*/
    public static final float[] START_SHOWCASE_TEXT = new float[] {
            // Front face
            -4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 1.0f,

            // Right face
            4.0f, 5.0f, 1.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 3.0f, 0.0f,
            4.0f, 5.0f, 0.0f,

            // Back face
            4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 0.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 0.0f,

            // Left face
            -4.0f, 5.0f, 0.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 3.0f, 1.0f,
            -4.0f, 5.0f, 1.0f,

            // Top face
            -4.0f, 5.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 0.0f,

            // Bottom face
            4.0f, 3.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
    };

    public static final float[] START_SHOWCASE_BUTTON = new float[] {
            // Front face
            -3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 1.0f,

            // Right face
            3.0f, 2.0f, 1.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 0.0f, 0.0f,
            3.0f, 2.0f, 0.0f,

            // Back face
            3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 0.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 0.0f,

            // Left face
            -3.0f, 2.0f, 0.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 0.0f, 1.0f,
            -3.0f, 2.0f, 1.0f,

            // Top face
            -3.0f, 2.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 0.0f,

            // Bottom face
            3.0f, 0.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
    };
    public static final float[] SHOWCASE_TITLE = new float[] {
            // Front face
            -4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 1.0f,

            // Right face
            4.0f, 5.0f, 1.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            4.0f, 3.0f, 0.0f,
            4.0f, 5.0f, 0.0f,

            // Back face
            4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 0.0f,
            4.0f, 3.0f, 0.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 0.0f,

            // Left face
            -4.0f, 5.0f, 0.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
            -4.0f, 3.0f, 1.0f,
            -4.0f, 5.0f, 1.0f,

            // Top face
            -4.0f, 5.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 0.0f,
            -4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 1.0f,
            4.0f, 5.0f, 0.0f,

            // Bottom face
            4.0f, 3.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
            4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 1.0f,
            -4.0f, 3.0f, 0.0f,
    };

    public static final float[] SHOWCASE_TITLE_DESCRIPTION = new float[] {
            // Front face
            -3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 1.0f,

            // Right face
            3.0f, 2.0f, 1.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            3.0f, 0.0f, 0.0f,
            3.0f, 2.0f, 0.0f,

            // Back face
            3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 0.0f,
            3.0f, 0.0f, 0.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 0.0f,

            // Left face
            -3.0f, 2.0f, 0.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
            -3.0f, 0.0f, 1.0f,
            -3.0f, 2.0f, 1.0f,

            // Top face
            -3.0f, 2.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 0.0f,
            -3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 1.0f,
            3.0f, 2.0f, 0.0f,

            // Bottom face
            3.0f, 0.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
            3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 1.0f,
            -3.0f, 0.0f, 0.0f,
    };

    public static final float[] SHOWCASE_INSPIRATION_TEXT = new float[] {
            // Front face
            -2.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            6.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            6.0f, -2.0f, 1.0f,
            6.0f, 2.0f, 1.0f,

            // Right face
            6.0f, 2.0f, 1.0f,
            6.0f, -2.0f, 1.0f,
            6.0f, 2.0f, 0.0f,
            6.0f, -2.0f, 1.0f,
            6.0f, -2.0f, 0.0f,
            6.0f, 2.0f, 0.0f,

            // Back face
            6.0f, 2.0f, 0.0f,
            6.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 0.0f,
            6.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 0.0f,

            // Left face
            -2.0f, 2.0f, 0.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, 2.0f, 1.0f,

            // Top face
            -2.0f, 2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            6.0f, 2.0f, 0.0f,
            -2.0f, 2.0f, 1.0f,
            6.0f, 2.0f, 1.0f,
            6.0f, 2.0f, 0.0f,

            // Bottom face
            6.0f, -2.0f, 0.0f,
            6.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
            6.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 1.0f,
            -2.0f, -2.0f, 0.0f,
    };

    public static final float[] SHOWCASE_INSPIRATION_IMAGE = new float[] {
            // Front face
            -7.0f, 2.0f, 1.0f,
            -7.0f, -2.0f, 1.0f,
            -3.0f, 2.0f, 1.0f,
            -7.0f, -2.0f, 1.0f,
            -3.0f, -2.0f, 1.0f,
            -3.0f, 2.0f, 1.0f,

            // Right face
            -3.0f, 2.0f, 1.0f,
            -3.0f, -2.0f, 1.0f,
            -3.0f, 2.0f, 0.0f,
            -3.0f, -2.0f, 1.0f,
            -3.0f, -2.0f, 0.0f,
            -3.0f, 2.0f, 0.0f,

            // Back face
            -3.0f, 2.0f, 0.0f,
            -3.0f, -2.0f, 0.0f,
            -7.0f, 2.0f, 0.0f,
            -3.0f, -2.0f, 0.0f,
            -7.0f, -2.0f, 0.0f,
            -7.0f, 2.0f, 0.0f,

            // Left face
            -7.0f, 2.0f, 0.0f,
            -7.0f, -2.0f, 0.0f,
            -7.0f, 2.0f, 1.0f,
            -7.0f, -2.0f, 0.0f,
            -7.0f, -2.0f, 1.0f,
            -7.0f, 2.0f, 1.0f,

            // Top face
            -7.0f, 2.0f, 0.0f,
            -7.0f, 2.0f, 1.0f,
            -3.0f, 2.0f, 0.0f,
            -7.0f, 2.0f, 1.0f,
            -3.0f, 2.0f, 1.0f,
            -3.0f, 2.0f, 0.0f,

            // Bottom face
            -3.0f, -2.0f, 0.0f,
            -3.0f, -2.0f, 1.0f,
            -7.0f, -2.0f, 0.0f,
            -3.0f, -2.0f, 1.0f,
            -7.0f, -2.0f, 1.0f,
            -7.0f, -2.0f, 0.0f,
    };

  public static final float[] CUBE_NORMALS = new float[] {
      // Front face
      0.0f, 0.0f, 1.0f,
      0.0f, 0.0f, 1.0f,
      0.0f, 0.0f, 1.0f,
      0.0f, 0.0f, 1.0f,
      0.0f, 0.0f, 1.0f,
      0.0f, 0.0f, 1.0f,

      // Right face
      1.0f, 0.0f, 0.0f,
      1.0f, 0.0f, 0.0f,
      1.0f, 0.0f, 0.0f,
      1.0f, 0.0f, 0.0f,
      1.0f, 0.0f, 0.0f,
      1.0f, 0.0f, 0.0f,

      // Back face
      0.0f, 0.0f, -1.0f,
      0.0f, 0.0f, -1.0f,
      0.0f, 0.0f, -1.0f,
      0.0f, 0.0f, -1.0f,
      0.0f, 0.0f, -1.0f,
      0.0f, 0.0f, -1.0f,

      // Left face
      -1.0f, 0.0f, 0.0f,
      -1.0f, 0.0f, 0.0f,
      -1.0f, 0.0f, 0.0f,
      -1.0f, 0.0f, 0.0f,
      -1.0f, 0.0f, 0.0f,
      -1.0f, 0.0f, 0.0f,

      // Top face
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,

      // Bottom face
      0.0f, -1.0f, 0.0f,
      0.0f, -1.0f, 0.0f,
      0.0f, -1.0f, 0.0f,
      0.0f, -1.0f, 0.0f,
      0.0f, -1.0f, 0.0f,
      0.0f, -1.0f, 0.0f
  };

  public static final float[] FLOOR_COORDS_SHOWCASE = new float[] {
          5f, 0, -5f,
          -5f, 0, -5f,
          -5f, 0, 5f,
          5f, 0, -5f,
          -5f, 0, 5f,
          5f, 0, 5f,
  };
    public static final float[] FLOOR_COORDS = new float[] {
            200f, 0, -200f,
            -200f, 0, -200f,
            -200f, 0, 200f,
            200f, 0, -200f,
            -200f, 0, 200f,
            200f, 0, 200f,
    };
  public static final float[] FLOOR_NORMALS = new float[] {
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
      0.0f, 1.0f, 0.0f,
  };

  public static final float[] FLOOR_COLORS = new float[] {
      0.0f, 0.3398f, 0.9023f, 1.0f,
      0.0f, 0.3398f, 0.9023f, 1.0f,
      0.0f, 0.3398f, 0.9023f, 1.0f,
      0.0f, 0.3398f, 0.9023f, 1.0f,
      0.0f, 0.3398f, 0.9023f, 1.0f,
      0.0f, 0.3398f, 0.9023f, 1.0f,
  };
}