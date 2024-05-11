import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = bilangan1 + bilangan2;
                break;
            case 2:
                hasil = bilangan1 - bilangan2;
                break;
            case 3:
                hasil = bilangan1 * bilangan2;
                break;
            case 4:
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Tidak bisa melakukan pembagian dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}
