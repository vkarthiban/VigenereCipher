import java.util.Scanner;

public class VigenereCipher
{
    public static String encrypt(String text, final String key)
    {
        String out = "";
        text = text.toUpperCase();
       

 for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            out += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return out;
    }
    public static String decrypt(String text, final String key)
    {
        String out = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            out += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return out;
    }
     public static void main(String[] args)
    {
    	 Scanner scr=new Scanner(System.in);
    	 System.out.println("please enter the key in Capital letters");
        String key = scr.nextLine();
        System.out.println("please enter the message insmall letter");
        String message =scr.nextLine();
        String encryptedMsg = encrypt(message, key);
        System.out.println("String: " + message);
        System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
    }
}






