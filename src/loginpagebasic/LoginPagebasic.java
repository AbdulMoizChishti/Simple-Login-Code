/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpagebasic;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class LoginPagebasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj= new Scanner (System.in);
    //var declaration 
    //lower case
    // if else "admin123" "password"
        System.out.println("Enter Username:");
    String un= obj.nextLine();
        System.out.println("Enter Password:");
    String ps= obj.nextLine();
    
    String u = un.toLowerCase();
    String p = ps.toLowerCase();
    
    
    if( u.equals("admin") ){
        if(p.equals("abc")){
        System.out.println("Login Success");
        }
    }
    else{
        System.out.println("Login unsuccess");
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}
