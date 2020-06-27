import models.Decrypt;
import models.Encrypt;

import java.io.Console;

import static java.lang.Integer.parseInt;

class CaesarCipher {
    public static void main (String args []){

        Console myConsole = System.console();

        System.out.println("Enter a word:");
        String enteredWord = myConsole.readLine();


        System.out.println("Enter a number between 1 and 26:");
        Integer shiftKey = parseInt(myConsole.readLine());
        Encrypt word = new Encrypt(enteredWord,shiftKey);

       System.out.println("The Encrypted word is :" +Encrypt.encryptWord(enteredWord,shiftKey));

       System.out.println("Enter word to Decrypt: ");
       String enteredWordToDecrypt = myConsole.readLine();

        System.out.println("Enter a number between 1 and 26:");
        Integer shiftKey2 = parseInt(myConsole.readLine());

        System.out.println("The Decrypted word is :" + Decrypt.decryptWord(enteredWord,shiftKey));








    }


}