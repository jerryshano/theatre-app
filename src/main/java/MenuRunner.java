import java.util.Scanner;

public class MenuRunner {

    static void replaceWithX(int numRes, String[][] stringArray) {

        int rowNum = (numRes-1)/5;
        int colNum = (numRes-1)%5;
        stringArray[rowNum][colNum] = "X";
    }
    static void runner(Scanner input, String[][] stringArray) {
        while (true) {

            System.out.print("Enter seat number to reserve: ");

            int numRes = Integer.valueOf(input.nextLine());

            if (numRes > 25 || numRes < 1) {
                System.out.println("ERROR: INVALID SEAT NUMBER");
            } else {
                int rowNum = (numRes - 1) / 5;
                int colNum = (numRes - 1) % 5;
                if (stringArray[rowNum][colNum].equals("X")) {
                    System.out.println("Seat is taken");
                }
                else {
                    replaceWithX(numRes, stringArray);
                    System.out.println("Seat successfully reserved");
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(stringArray[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
