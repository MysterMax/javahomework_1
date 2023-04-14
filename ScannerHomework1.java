import java.util.Scanner;

public class ScannerHomework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls price: ");
        int p = sc.nextInt();

        System.out.print("Enter please discount: ");
        int d = sc.nextInt();

        int discount = p-(p*d/100);
        System.out.println("The size of discount is " +discount );
        System.out.println("short way 10 ->2 = " + Integer.toBinaryString(discount));

        sc.close();


    }
}
