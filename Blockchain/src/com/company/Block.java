package com.company;

/* Each Block will have list of transactions
    and the previous HASH with it

    Seems as though each block gets
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.security.MessageDigest;

public class Block {


    private String timestamp;
    public ArrayList<Transaction> Transactions = new ArrayList<>();
    private int previousHash;
    private String hash;
    private int nonce;

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }





    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }





    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }



    public Block(String timestamp, ArrayList<Transaction> Transactions, String previousHash) {


        this.timestamp = timestamp ;
        this.Transactions.addAll(Transactions);
        this.hash = calculateHash();
        this.nonce = 0;

    }


    public String calculateHash() {

        Object[] items = {this.Transactions, this.previousHash, this.timestamp, this.nonce};

        String calculatedHash = Block.applySha256(
                previousHash +
                        Transactions.toString() +
                        timestamp + nonce);

        return calculatedHash;

    }

    public static String applySha256(String input){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Applies sha256 to our input,
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void mineBlock(int difficulty){
        String strHash = this.hash;
        //System.out.println(this.hash + "STRHASH1: " + strHash);
        char[] c = new char[difficulty];
        Arrays.fill(c, '1');
        String result = new String(c);
        //System.out.println("result: " + result);
        //System.out.println("substring "+ strHash.substring(0,difficulty));
        while(strHash.substring(0, difficulty) != result){

            this.nonce++;
            this.hash = this.calculateHash();
            System.out.println("SUBSTRING "+ strHash.substring(0,difficulty));
            System.out.println("result: " + result);
            System.out.println("hash: " + this.hash);
            System.out.println("hash: " + this.hash);
            strHash = this.hash;
            if (strHash.substring(0, difficulty).equals(result)){
                System.out.println("ITS BROKENNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
                break;
            }

        }

        System.out.println("Block Mined: " + this.hash);

    }




}
