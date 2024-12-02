import java.util.Scanner;
public class Cafe21 {
    static String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];

    static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + namaMenu[i] + ":");
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilPenjualan() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void penjualanTertinggi() {
        int tertinggi = 0;
        String menuTertinggi = "";
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > tertinggi) {
                tertinggi = totalPenjualan;
                menuTertinggi = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi + " (Total: " + tertinggi + ")");
    }

    static void rataPenjualan() {
        System.out.println("\nRata-rata Penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double average = totalPenjualan / (double) penjualan[0].length;
            System.out.println(namaMenu[i] + ": " + average);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data penjualan kafe:");
        inputPenjualan();
        tampilPenjualan();
        penjualanTertinggi();
        rataPenjualan();
    }
}
