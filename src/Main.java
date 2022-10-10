import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static int adder = 0;

    static int summation(int[] arr, int size) {
        System.out.println("Please enter the numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            adder += arr[i];
        }
        return adder;
    }

    public static void main(String[] args) {
        System.out.println("Please enter size of summation");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println(summation(arr, size));


    }
}
