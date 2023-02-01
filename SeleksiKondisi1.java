package ukl;

import java.util.Scanner;


/**
 *
 * @author MOKLET-2
 */
public class SelKon {
    public static void main(String[] args) {
        String Kendaraan=" ";
        int id_masuk;
        int id_keluar;
        int harga=0;
        int golongan=0;
        
        System.out.println("Daftar Kota : ");
        System.out.println("1. Waru");
        System.out.println("2. Sidoarjo");
        System.out.println("3. Porong");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input golongan : ");
        golongan=input.nextInt();
        System.out.println("Input masuk : ");
        id_masuk=input.nextInt();
        System.out.println("Input keluar : ");
        id_keluar=input.nextInt();
        
        if(golongan == 1){
            Kendaraan = "Sedan, Jip, Pick up";
        }
        
        if(id_masuk == 1){
            if (id_keluar == 1){
                switch (golongan){
                    case 1:
                        harga=5000;
                        System.out.println("Masuk Sini - Keluar Sana");
                        break;
                }
            } 
        }
        System.out.println("Daftar Kota : ");
        System.out.println("1. Waru \n");
        System.out.println("Harga = "+harga);
        System.out.println("Golongan = "+golongan+"Kendaraan = "+Kendaraan);
    }
}