import java.util.Scanner;

public class PemilihanPercobaan117_1 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        
        System.out.print("masukkan angka: ");
        int skor = input17.nextInt();

        if (skor > 80)
            System.out.println("lanjut ke babak selanjutnya");
        else
            System.out.println("mencoba lagi");
    }
}