import java.util.Scanner;

public class App {
    static String[][] seatArray = new String[5][5];
    static int seatNumber = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seatArray[i][j] = Integer.toString(seatNumber);
                seatNumber++;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seatArray[i][j] + "\t");
            }
            System.out.println();
        }
        MenuRunner.runner(input, seatArray);
    }
}
