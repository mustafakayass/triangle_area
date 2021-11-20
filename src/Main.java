import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Alanını bulmak istediğiniz üçgenin 1. kenarını yazınız:");
        a = input.nextInt();
        System.out.print("Alanını bulmak istediğiniz üçgenin 2.  kenarını yazınız:");
        b = input.nextInt();
        System.out.print("Alanını bulmak istediğiniz üçgenin 3.  kenarını yazınız:");
        c = input.nextInt();

        double cevre = a+b+c;
        double u = cevre/2;
        double alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Alan : " +alan);

    }
}
