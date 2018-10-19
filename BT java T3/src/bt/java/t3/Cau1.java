 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.java.t3;

/**
 *
 * @author GiangMUng
 */
import java.util.Scanner;
public class Cau1{

    /**
     * @param args the command line arguments
     */
    // Nhap tu ban phim
    private static final Scanner scanner = new Scanner(System.in);
    // Tim UCLN
    public static int UCLN(int a, int b){
        while(a != b){
            if(a > b)
                a = a - b;
            else 
                b = b - a;
        }
        return a;   
    }
     // Fibonaxi
    public static int Fibonaxi(int n){
        if(n < 0)
            return -1;
        else if(n == 0 || n == 1)
            return n;
        else 
            return Fibonaxi(n - 1) + Fibonaxi(n - 2);
    }
    public static void main(String[] args){
        /*
        UCLN
        */
        int a, b;
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        b = scanner.nextInt();
       System.out.println("UCLN cua a va b la: " + UCLN(a,b));
    
        /*
        Fibonaxi
        */
        int n;
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        for(int i = 0;i <= n; i++){
            System.out.println("So fibonaxi cua "  + i + " la: " + Fibonaxi(i));
        }
}
}



