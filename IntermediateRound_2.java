/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyround_2;

/**
 *
 * @author MITO
 */
public class IntermediateRound_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = 0;
        int i,j,l = 0,c = 0;
        t = scanner.nextInt();
        while(t < 100)
        {
            l = scanner.nextInt();
            c = scanner.nextInt();
            while(l<100&&c<100)
            {
                for(i=1;i<l;i++)
            {
                for(j=1;j<c;j++)
            {
                if(i%2==0)
            {
                if(j%2==0)
                System.out.println(".");
            else
                System.out.println("*");
            }
            else
            {
            if(j%2==0)
                System.out.println("*");
            else
                System.out.println("*");
            }
            }
        }
    }
}
    