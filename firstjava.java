import java.util.Scanner;

public class firstjava {
    public static void main(String[] args) {

        int n, i, c, a;
        int arr[];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for entering nos and '0' for searching a number");
        i = sc.nextInt();

        if (i == 1) {
            System.out.println("Enter number of elements\n");
            n = sc.nextInt();

            arr = new int[n];
            System.out.println("Enter " + n + " integers");

            for (c = 0; c < n; c++)
                arr[c] = sc.nextInt();
        }
        if (i == 0) {
            System.out.println("Enter number to search\n");
            a = sc.nextInt();
        }
        else
            {
            System.out.println("Invalid Option ");
        }

    }
}








