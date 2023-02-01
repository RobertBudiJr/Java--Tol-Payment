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
public class UKL {

    public static void main(String[] args) {
        String Kendaraan=" ";
        int id_masuk;
        int id_keluar;
        int golongan=0;
        int harga=0;
        
        System.out.println("Daftar Kota:");
        System.out.println("1. Waru");
        System.out.println("2. Porong");
        System.out.println("3. Sidoarjo");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input golongan : ");golongan=input.nextInt();
        
        System.out.println("Input masuk : ");
        id_masuk = input.nextInt();
        System.out.println("Input keluar : ");
        id_keluar = input.nextInt();
        
        if (golongan == 1){
            Kendaraan = "Sedan, Jip, Pick up";
        } else if(golongan == 2){
            Kendaraan = "Truk dengan sumbu 2 roda";
        } else if(golongan == 3){
            Kendaraan = "Truk dengan sumbu 3 roda";
        }
        
        if (id_masuk == 1){
            if (id_keluar == 1){
                switch(golongan){
                    case 1:
                        harga=6000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                        break;
                    case 2:
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                        break;
                    case 3:
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Sidoarjo");
                }
            }else if (id_keluar == 2){
                switch (golongan){
                    case 1:
                        harga=9000;
                        System.out.println("Masuk Waru - Keluar Porong");
                        break;
                    case 2:
                        harga=14000;
                        System.out.println("Masuk Waru - Keluar Porong");
                        break;
                    case 3:
                        harga=14000;
                        System.out.println("Masuk Waru - Keluar Porong");
                }
            }
        }
        if (id_masuk == 2){
            if (id_keluar == 1){
                switch (golongan){
                    case 1:
                    harga=6000;
                    System.out.println("Masuk Sidoarjo - Keluar Waru");
                    break;
                    case 2:
                    harga=9000;
                    System.out.println("Masuk Sidoarjo - Keluar Waru");
                    break;
                    case 3:
                    harga=9000;
                    System.out.println("Masuk Sidoarjo - Keluar Waru");
                    break;
                }            
            }else if (id_keluar == 2){
                switch (golongan){
                    case 1:
                    harga=5500;
                    System.out.println("Masuk Sidoarjo - Keluar Porong");
                    break;
                    case 2:
                    harga=8500;
                    System.out.println("Masuk Sidoarjo - Keluar Porong");
                    break;
                    case 3:
                    harga=8500;
                    System.out.println("Masuk Sidoarjo - Keluar Porong");
                    break;
                }
            }
        }
        if (id_masuk == 3){
            if (id_keluar == 1){
                switch (golongan){
                    case 1:
                    harga=5500;
                    System.out.println("Masuk Porong - Keluar Sidoarjo");
                    break;
                    case 2:
                    harga=8500;
                    System.out.println("Masuk Porong - Keluar Sidoarjo");
                    break;
                    case 3:
                    harga=8500;
                    System.out.println("Masuk Porong - Keluar Sidoarjo");
                    break;
                }
            }else if (id_keluar == 2){
                switch (golongan){
                    case 1:
                    harga=9000;
                    System.out.println("Masuk Porong - Keluar Waru");
                    break;
                    case 2:
                    harga=14000;
                    System.out.println("Masuk Porong - Keluar Waru");
                    break;
                    case 3:
                    harga=14000;
                    System.out.println("Masuk Porong - Keluar Waru");
                    break;
                }
            }
        }
        
        System.out.println("Daftar Kota : \n");
        System.out.println("1. Waru \n");
        System.out.println("2. Porong \n");
        System.out.println("3. Sidoarjo \n");
        System.out.println("Harga = Rp "+harga);
        System.out.println("Kendaraan : "+Kendaraan+"Golongan : "+golongan);
        }
    }
    
   
   
    

