/**
 * Created by svetlana on 6/8/16.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] mass2 = new int[8];
        fillMassivRandomNumbers(mass2);
        System.out.println("\n");
        reversOrderMassive(mass2);

    }

    public static void fillMassivRandomNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 100) + 3;
            System.out.print(input[i] + " ; ");
        }
    }

    public static void reversOrderMassive(int[] input) {


        for (int i = input.length - 1; i >= 0; i--) {

            System.out.print(input[i] + " ; ");
        }
    }
}
