/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package la_gran_neli_banana;

import java.util.Scanner;
/**
 *
 * @author yosoytony64/Neli Alexandra Dumitru
 */
public class La_Gran_Neli_Banana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int n,a,b,c;
        a = 1;
        b = 0;
        c = 0;
        
       Scanner teclado;
       teclado = new Scanner(System.in);
       
       System.out.println("Cuantos digitos quieres ver de la serie Fibonacci?");
       n = teclado.nextInt();
       
       for (int i = a ; i<n ; i++){
        c = a + b;
        a = b;
        b = c;
        System.out.print(a+",");
    }
       }
    }
    

