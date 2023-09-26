import java.util.Scanner;

public class IfKondisi17 {
    public static void main(String[] args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.print("Masukkan Suhu");
        int Suhu = sc00.nextInt();

        if (Suhu<16){
            System.out.println("silahkan menggunakan jaket");
        }
        if (Suhu<20){
            System.out.println("silahkan pakai baju tebal");
        }
        else{
            System.out.println("silahkan pakai topi");
        }
    }
}
    