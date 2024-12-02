import java.util.Scanner;
public class Kubus21 {
    static int volumeKubus(int s){
        int Volume = s * s * s;
        return Volume;
    }
    static int luasPermukaanKubus(int s){
        int Luas = 6 * s * s;
        return Luas;
    }

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int sisi, Vol, LP;
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = input21.nextInt();
        
        Vol = volumeKubus(sisi);
        System.out.println("Volume kubus adalah " + Vol);

        LP = luasPermukaanKubus(sisi);
        System.out.println("Luas permukaan kubus adalah " + LP);
    }
}
