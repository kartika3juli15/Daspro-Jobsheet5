import java.util.Scanner;

public class PemilihanPercobaan317_1 {
        public static void main(String[] args) {

            double angka1, angka2, hasil;
            char operator;

            Scanner input17 = new Scanner (System.in);
            System.out.print("masukkan angka pertama: ");
            
            angka1 = input17.nextDouble();
            System.out.print("masukkan angka kedua: ");

            angka2 = input17.nextDouble();
            System.out.print("masukkan operator (+ - * /): ");

            operator= input17.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                    
                 case '-':
                    hasil = angka1 - angka2;
                    System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                    break;
                 case '*':
                    hasil = angka1 * angka2;
                    System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                    break;   
                case '/':
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                    break;
            }

        }
}
