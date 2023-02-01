/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class SelkonR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kendaraan=" ";
        int id_masuk;
        int id_keluar;
        int golongan=0;
        int harga=0;
        
        System.out.println("Daftar Kota :");
        System.out.println("1. Waru");
        System.out.println("2. Sidoarjo");
        System.out.println("3. Porong");
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Golongan :");
        golongan=input.nextInt();
        System.out.println("ID masuk :");
        id_masuk=input.nextInt();
        System.out.println("ID keluar :");
        id_keluar=input.nextInt();
        
        if (golongan == 1){
            Kendaraan = "Sedan, Jip, Pick up";
        }else if (golongan == 2){
            Kendaraan = "Truk sumbu 2 roda";
        }else if (golongan == 3){
            Kendaraan = "Truk sumbu 3 roda";
        }
        
        if (id_masuk == 1){
            if (id_keluar == 1){
                switch (golongan){
                    case 1 :
                        harga=6000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                        break;
                    case 2 :
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                        break;
                    case 3 :
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                        break;
                }
            }else if(id_keluar == 2){
                switch (golongan){
                    case 1 :
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Porong");
                        break;
                    case 2 :
                        harga=14000;
                        System.out.println("Masuk Waru - Keluar Porong");
                        break;
                    case 3 :
                        harga=14000;
                        System.out.println("Masuk Waru - Keluar Porong");
                        break;
                }
        }
        }else if (id_masuk == 2){
            if(id_keluar == 1){
                switch (golongan){
                    case 1 :
                        harga=6000;
                        System.out.println("Masuk Sidoarjo - Keluar Waru");
                        break;
                    case 2 :
                        harga=6000;
                        System.out.println("Masuk Sidoarjo - Keluar Waru");
                        break;
                    case 3 :
                        harga=9000;
                        System.out.println("Masuk Sidoarjo - Keluar Waru");
                        break;    
                }
            }else if (id_keluar == 2){
                switch (golongan){
                    case 1 :
                        harga=5500;
                        System.out.println("Masuk Sidoarjo - Keluar Porong");
                        break;
                    case 2 :
                        harga=8500;
                        System.out.println("Masuk Sidoarjo - Keluar Porong");
                        break;
                    case 3 :
                        harga=8500;
                        System.out.println("Masuk Sidoarjo - Keluar Porong");
                        break;    
                }
        }else if(id_masuk == 3){
            if (id_keluar == 1){
                switch (golongan){
                    case 1 :
                        harga=5500;
                        System.out.println("Masuk Porong - Keluar Sidoarjo");
                        break;
                    case 2 :
                        harga=8500;
                        System.out.println("Masuk Porong - Keluar Sidoarjo");
                        break;
                    case 3 :
                        harga=8500;
                        System.out.println("Masuk Porong - Keluar Sidoarjo");
                        break;    
                }
            }else if (id_keluar == 2){
                switch (golongan){
                    case 1 :
                        harga=9000;
                        System.out.println("Masuk Porong - Keluar Waru");
                        break;
                    case 2 :
                        harga=1400;
                        System.out.println("Masuk Porong - Keluar Waru");
                        break;
                    case 3 :
                        harga=1400;
                        System.out.println("Masuk Porong - Keluar Waru");
                        break;    
                }
        }
    
}
        
        
        }
        System.out.println("Harga : "+harga);
        System.out.println("Golongan : "+golongan +" Kendaraan : "+Kendaraan);
    }
}
    
