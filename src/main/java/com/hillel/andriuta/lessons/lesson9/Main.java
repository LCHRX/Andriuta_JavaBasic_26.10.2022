package com.hillel.andriuta.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

  /*      int[][][][] array =
                {
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        },
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        }
                };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println(array[0][0][0][3]);*/
    }

      //          int[][][] array = new int[3][2][4];
    /*    int[][][] array = {
                {
                        {18, 28, 18, 28},
                        {45, 90, 45, 0}
                },
                {
                        {7, 125, 500, 5},
                        {0, 11, 25, 30}
                },
                {
                    {81, 17, 19, 55},
                        {1, 7, 38, 11}
                }
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        int [][] array2 = array[0];*/



    static void demo() {
      /*  int [][] array = new int[4][5];
        System.out.println(Arrays.toString(array[0]));

        int value = 1;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }*/

      /*  int array2[][] = {
                {1, 2, 3 ,4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1][2]);*/

        /*int array3[][] = {
                {1, 4},
                {5, 6, 7, 8},
                {9},
                {},
                {3, 4, 6},
                {2}
        };
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }*/

        /* int[][] array = new int[5][5];*/

        /*for (int i = 0; i < array.length ; i++) {
            array[i][i] = 1;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }*/
       /* int str = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][str] = 1;
            str--;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }*/
      /*  String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = (i + j) % 2 == 0 ? "B" : "W";
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();*/

    }
}

