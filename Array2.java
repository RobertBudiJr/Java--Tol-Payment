/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author MOKLET-2
 */
public class ar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 1, 5},{5, 4, 3, 2, 1, 0},{9, 8, 7, 6, 5, 4},{1, 3, 5, 7, 9, 2}};
        int b[][]={{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{5, 4, 3, 2, 1},{10, 9, 8, 7, 6},{2, 4, 6, 8, 10},{1, 3, 5, 7, 9}};
        int h[][]={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        
        System.out.println("Hasil AxB adalah ");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for (int k=0;k<6;k++){
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
