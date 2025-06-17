import java.util.Scanner;

class SingleDArrayCreation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many car names do you want to enter? ");
        int size = in.nextInt();
        in.nextLine();

        String[] cars = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name of car " + (i + 1) + ": ");
            cars[i] = in.nextLine();
        }

        System.out.println("\nYou entered these car names:");
        for (String car : cars) {
            System.out.println(car);
        }

        in.close();
    }
}
