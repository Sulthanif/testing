import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner segitiga = new Scanner(System.in);
        System.out.println("Masukin Nilai Sisi 1-3");
        int Sisi1 = segitiga.nextInt();
        System.out.println("Nilai Sisi 1 = " + Sisi1);
        int Sisi2 = segitiga.nextInt();
        System.out.println("Nilai Sisi 2 = " + Sisi2);
        int Sisi3 = segitiga.nextInt();
        System.out.println("Nilai Sisi 3 = " + Sisi3);
    }
}
