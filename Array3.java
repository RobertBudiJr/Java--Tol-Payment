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
public class ArR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1, 2},{3, 4}};
        int b[][]={{4, 3},{2, 1}};
        int c[][]={{2, 3},{1, 4}};
        int d[][]={{4, 1},{3, 2}};
        int e[][]={{8, 5},{20, 13}};
        int f[][]={{25, 13},{36, 22}};
        int h[][]={{0,0},{0,0}};
        
        System.out.println("Hasil A1 X A2 adalah ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for (int k=0;k<2;k++){
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }System.out.println();
        }
        System.out.println("Hasil B1 X B2 adalah ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for (int k=0;k<2;k++){
                    h[i][j]=h[i][j]+c[i][k]*d[k][j];
                }
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }System.out.println();
        }
        System.out.println("Hasil A x B adalah ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for (int k=0;k<2;k++){
                    h[i][j]=h[i][j]+e[i][k]*f[k][j];
                }
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }System.out.println();
        }
          
    }
    
}
