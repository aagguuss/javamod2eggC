

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class JavaMod2Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int t;
      t = leer.nextInt();
     
        for(int i=0 ; i < t; i++ ) {
            for (int j=0;j < t ; j++ ){
                if (i==0 && j !=t-1) {
                    System.out.print("*");
                   
                }
                if (i==0 && j == t-1) {
                    System.out.println("*");
                   
                }
                if (j==0){
                    if (i>0){
                        if (i<t-1){
                            System.out.print("*");
                            
                        }
                    }
                }
                if (j!=0){
                    if (i!=0){
                        if (i!=t-1){
                            if (j!=t-1){
                                System.out.print(" ");
                                
                            }
                        }
                    }
                }
                if (j==t-1){
                    if (i>0){
                        if (i<t-1){
                            System.out.println("*");
                            
                        }
                    }
                }
                if (i==t-1) {
                    System.out.print("*");
                    
                }
            }
        }

    }}