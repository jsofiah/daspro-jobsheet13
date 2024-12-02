import java.util.Scanner;
public class Kafe21 {
    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        switch (kodePromo) {
            case "DISKON50":
            System.out.println("Kode promo diterima: Diskon 50% diberikan!");
            hargaTotal *= 0.5;
            break;
            case "DISKON30":
            System.out.println("Kode promo diterima: Diskon 30% diberikan!");
            hargaTotal *= 0.7;
            break;
            default:
            System.out.println("Kode promo tidak valid.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);
        Menu("Andi", true);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc21.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc21.nextInt();
        sc21.nextLine();
        System.out.print("Masukkan kode promo (jika ada, jika tidak ada cukup kosongkan): ");
        String kodePromo = sc21.nextLine();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
