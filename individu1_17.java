import java.util.Scanner;

public class individu1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jarak;

        System.out.println("masukkan jarak anda: ");
        jarak = sc.nextInt();

        if(jarak <= 5){
            System.out.println("gunakan melee weapon");
        } else if (jarak > 5){
            System.out.println("gunakan ranged weapon");
        }
    }
}
 