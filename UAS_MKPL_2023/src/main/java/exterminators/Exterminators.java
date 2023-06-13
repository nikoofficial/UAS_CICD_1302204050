/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exterminators;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Exterminators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hello");
        int a = 3;
        int b = 2;
        
        System.out.println("Matriks AxB");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        
        System.out.println("Isi matrix");
        int mat[][] = new int [a][b];
        mat[0] = new int[]{1,2};
        mat[1] = new int[]{3,4};
        mat[2] = new int[]{5,6};
        
        int i;
        for (i=0;i<3;i++){
            int k;
            for (k=0;k<2;k++){
                System.out.print(mat[i][k]+" ");
            }
            System.out.println();
        }
        
        //transpose
        int trans[][] = new int[b][a];
        for (i=0;i<2;i++){
            int k;
            for (k=0;k<3;k++){
                trans[i][k] = mat[k][i];
            }
        }
        
        // hasil
        System.out.println("Hasil transpose");
        for (i=0;i<2;i++){
            int k;
            for (k=0;k<3;k++){
                System.out.print(trans[i][k]+" ");
            }
            System.out.println();
        }
    }
}