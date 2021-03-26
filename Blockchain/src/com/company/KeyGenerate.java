package com.company;
import java.security.*;
import javax.crypto.*;
import org.web3j.crypto.ECKeyPair;
import java.math.BigInteger;


public class KeyGenerate {

    static String alg = "AES";
    static Key key;
    static Cipher cipher;


    public static void main(String[] args) throws Exception {
        key = KeyGenerator.getInstance(alg).generateKey();
        cipher = Cipher.getInstance(alg);
        String name = "Asim Iqbal";
        byte[] encryptedBytes = encryptIt(name);
        System.out.println("our key: " + key.toString());
        System.out.println("Our Encrypted text " + encryptIt(name));
        System.out.println("Our decrypted text " + decrypt(encryptedBytes));


    }

    private static byte[] encryptIt(String input) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] iBytes = input.getBytes();
        return cipher.doFinal(iBytes);
    }

    private static String decrypt(byte[] encryptBytes) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] recoverBytes = cipher.doFinal(encryptBytes);
        String originalText = new String(recoverBytes);
        return originalText;
    }

}
