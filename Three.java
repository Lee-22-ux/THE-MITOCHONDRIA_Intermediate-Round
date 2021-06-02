/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three;

/**
 *
 * @author MilkTea
 */
import java.util.Scanner;
public class Three {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mito = new Scanner(System.in);
        System.out.println("Enter a number:");
        String chondria = mito.nextLine();
        
        char [] mitochondria = chondria.toCharArray();
        
        for (char c : mitochondria) {
            System.out.println(c);
        }
        
    }
    
}
