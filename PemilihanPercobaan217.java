import java.util.Scanner;

public class PemilihanPercobaan217 {
 public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input17.nextFloat();

        System.out.print("Nilai uts     : ");
        float uts = input17.nextFloat();

        System.out.print("Nilai kuis    : ");
        float kuis = input17.nextFloat();

        System.out.print("Nilai tugas   : ");
        float tugas = input17.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total < 65 ? "Remidi" : "tidak remidi";

        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
    }
}
     