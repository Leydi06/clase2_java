/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author leydi
 */
public class caso14 {
     public static void main(String[] args) {
        // TODO code application logic here
		Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese Numero: ");
		int n = sc.nextInt();
                
                int numero = (int) (n * (n+1)/2);
                
                 System.out.println("-------------------");
                System.out.println("------Resultados---");
                System.out.println("-------------------");
                System.out.println("Sumatoria: "+numero);
                
                
                
     }   
}
