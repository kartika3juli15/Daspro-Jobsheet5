import java.util.Scanner;

public class individu2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int username = 251098;
        int password = 999;
        System.out.println("masukkan username dan password");
        System.out.print("username      : ");
        
        int user= input.nextInt();
        System.out.print("password      : ");

        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("selamat anda telah login!");
        } else{
            System.out.println("username atau password anda salah");
        }

    }
}
    
        