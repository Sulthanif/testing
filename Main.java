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

        System.out.println("Pilih Menu Berikut Ini : ");
        System.out.println();
        System.out.println("1. Pengecekan Ganjil Genap");
        System.out.println("2. Pengecekan Negatif Positif Nol");
        System.out.println("3. Mengubah Nilai Dari Huruf Ke Angka");
        System.out.println("4. Ubah Tanggal Jadi Hari");
        System.out.println("5. Kalkulator");
        System.out.println("6. Cek Jenis Segitiga");
        System.out.println();
        System.out.println("Pilih 1-6");
        int Pilih = segitiga.nextInt();

        switch (Pilih) {
            case 1:
                if (Sisi1 % 2 == 0) {
                    System.err.println("Sisi 1 = Genap");
                } else {
                    System.out.println("Sisi 1 = Ganjil");
                }

                if (Sisi2 % 2 == 0) {
                    System.err.println("Sisi 2 = Genap");
                } else {
                    System.out.println("Sisi 2 = Ganjil");
                }

                if (Sisi3 % 2 == 0) {
                    System.err.println("Sisi 3 = Genap");
                } else {
                    System.out.println("Sisi 3 = Ganjil");
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

            default:
                break;
        }

    }
}
