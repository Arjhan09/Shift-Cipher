/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author jen1234
 */
import java.util.Scanner;

class ShiftCipherApp 
{
    public static void main (String[] args)
    {
         Scanner sc = new Scanner (System.in);
         int shift;
         String message;
         
         System.out.println("Shift Cipher Algorithm Quiz");
         System.out.println("==========================");
         System.out.print("How many shifts would you want to use?");
          try {
              shift =sc.nextInt();
              sc.nextLine(); // consume the next line
          } catch (Exception e) {
               System.out.println("That is not an integer.");
               System.exit(0);
               return;
          }
           System.out.println("Please enter a message to hit enter to encrypt it");
            message= sc.next();
            sc.close();
            
            ShiftCipher shc = new ShiftCipher(message, shift);
            shc.cipher();
            System.out.print("Encrypted word: " + shc.getCiphered());
            shc.decipher();
            System.out.print("Decrypted word: " + shc.getDeciphered());     
      
    } 
       
}
