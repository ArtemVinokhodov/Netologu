package com.company.ArraysMultidimensional;

import java.util.Random;

public class ArraysMulti {

    public static int SIZE = 8;
    public static int [][] colors = new int[SIZE][SIZE];

    public static void  arraysPrint(int[][] colorsPrint){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colorsPrint[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        arraysPrint(colors);

        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - j - 1][i];
            }
        }
        arraysPrint(rotatedColors);
    }
}

//        for (int i = rotatedColors.length - 1; i >= 0 ; i--) {
//            for (int j = rotatedColors.length - 1; j >= 0; j--) {
//                System.out.format("%4d", rotatedColors [i][j]);
//            }
//            System.out.println();
//        }

//    }
//}
