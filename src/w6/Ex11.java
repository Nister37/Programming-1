import ex09.card.Card;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final int ROW_NUM = 4;
        final int COL_NUM = 6;
        int[][] matrix = new int[ROW_NUM][COL_NUM];
        for (int i = 0; i < ROW_NUM; i++) {
            for (int j = 0; j < COL_NUM; j++) {
                matrix[i][j] = (i+1)*(j+1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
