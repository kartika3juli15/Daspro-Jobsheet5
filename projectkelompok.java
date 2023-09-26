import java.util.Scanner;

public class projectkelompok {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        String pilihan_film;
        int Harga_Awal, umur_penonton;
        double Prosentase_Diskon =0.20, Harga_Akhir, Pembayaran,jam_tayang;
        float tanggal_bulan_tahun_tayang, jumlah_yang_dipesan;
        
        System.out.println("masukkan umur");
        int umur = sc.nextInt();
         if (umur < 13){
            System.out.println("umur"+umur+" belum cukup umur");
        }
        else{System.out.println("umur"+umur+" sudah cukup umur");
        System.out.println("masukkan film yang akan ditonton");
        pilihan_film = sc.next();
        System.out.println("masukkan tanggal tayang");
        tanggal_bulan_tahun_tayang = sc.nextFloat();
        System.out.println("Masukkan jam tayang");
        jam_tayang = sc.nextDouble();
         System.out.println("masukkan jumlah tiket yang dipesan");
        jumlah_yang_dipesan = sc.nextFloat();
        System.out.println("masukkan seat");
        int seat = sc.nextInt();
        if (seat>50){
            System.out.println("seat penuh");
            }else {
                System.out.println("seat tersedia");
            }
        System.out.println("masukkan Harga Awal Anda");
        Harga_Awal = sc.nextInt();
        System.out.println("masukkan Prosentase_Diskon");
        Prosentase_Diskon = sc.nextDouble();
        Harga_Akhir= Harga_Awal-(Harga_Awal*Prosentase_Diskon);
        System.out.println("Harga_akhir adalah " +Harga_Akhir);
        Pembayaran=jumlah_yang_dipesan*Harga_Akhir;
        System.out.println("jumlah yang harus dibayar adalah " +Pembayaran);
        
        }
    } 
}