/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.java.t3;

import java.io.File;
import java.util.Scanner;




/**
 *
 * @author 84122
 */
public class NewClass {
    
    public static void main(String[] args){
        File file = new File("C:\\Users\\84122\\Desktop\\DictionaryAnhViet\\src\\dictionaryanhviet\\tudien.txt");
     
        try(Scanner sc = new Scanner(file)){
            
            for(int i = 0; file != null; i++){
                String str = sc.nextLine();
                System.out.println(str);
            }
                    
        } catch (Exception e) {
        }
    }
}
