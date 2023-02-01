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
public class Loop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1, b=2, u=a, s=a;
        System.out.println("Deret aritmatikanya adalah ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah deret aritmatikanya adalah "+s);
    }
    
}
