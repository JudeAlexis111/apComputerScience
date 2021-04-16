package com.jude.apcs.arrayList;

public class TwoDimensionalLargest {
    public static void main(String args[]){
        int[][] mat = {{3,4,5},{1,2,7},{0,1,-3}};

        System.out.println(Largest(mat));
        System.out.println(largestInColumn(mat, 1));
    }

    public static int Largest(int[][] mat){
        int largest = mat[0][0];

        for(int[] row: mat){
            for (int element: row){
                if(element > largest){
                    largest = element;
                }
            }
        }

        return largest;
    }

    public static int largestInColumn(int[][] mat, int column){
        int largest;
        int[] element = new int[mat[0].length];

        for (int i = 0; i < element.length; i++){
            element[i] = mat[i][column];
        }

        largest = element[0];

        for(int num: element){
            if(num > largest){
                largest = num;
            }
        }

        return largest;
    }
}
