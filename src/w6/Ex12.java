import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int[][][] parkingSpots = new int[2][2][15];
        int[] garageSum = new int[2];
        Random rand = new Random();
        int randomNumber;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 15; k++) {
                    randomNumber = rand.nextInt(0,9+1);
                    parkingSpots[i][j][k] = randomNumber;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 15; k++) {
                    garageSum[i] += parkingSpots[i][j][k];
                }
            }
        }
        System.out.print("Garage 1 used " + garageSum[0] + " times\nGarage 2 used " + garageSum[1] + " times");
    }
}
