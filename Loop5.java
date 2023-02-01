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
public class Loop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=2, b=3, n=12, u=a, s=a;
        System.out.println("Deret aritmatikanya adalah :");
        for (int i=0;i<12;i++){
            if (u>5){
                System.out.println(u);}
                u=u+b;
                s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah deret aritmatikanya adalah "+s);
    }
    
}
