package com.company;

public class Main {

    public static void main(String[] args) {

        BlockChain issyCoin = new BlockChain();

      //  issyCoin.addBlock(new Block("25/02", new Transaction("0323","7938", 3445), 0));
        //issyCoin.addBlock(new Block(2,"1/3","Transaction 2: £30", 0));

        issyCoin.createTransaction(new Transaction("address1", "address2", 5));
        issyCoin.createTransaction(new Transaction("address4", "address23", 45));

        System.out.println("starting miner");

        issyCoin.minePendingTransactions("addressG");

        System.out.println("Miner AddressG balance is: "+ issyCoin.getBalanceOfAddress("addressG"));

        System.out.println("starting miner");

        issyCoin.minePendingTransactions("addressG");

        System.out.println("Miner AddressG balance is now: "+ issyCoin.getBalanceOfAddress("addressG"));






//        System.out.println("Genesis Hash "+ issyCoin.chain.get(0).getHash());
//
//        System.out.println("Block2 Hash "+ issyCoin.chain.get(1).getHash() + " Block2 Previous Hash " + issyCoin.chain.get(1).getPreviousHash());
        //System.out.println("Block3 Hash "+issyCoin.chain.get(2).getHash() + " Block3 Previous Hash " + issyCoin.chain.get(2).getPreviousHash());
//        System.out.println(issyCoin.isBlockChainValid());

//        issyCoin.chain.get(1).setData("Transaction1 was £9999");
//        issyCoin.chain.get(1).setHash(issyCoin.chain.get(1).calculateHash());
//        issyCoin.chain.get(2).setPreviousHash(issyCoin.chain.get(1).calculateHash());
//        issyCoin.chain.get(2).setHash(issyCoin.chain.get(2).calculateHash());
//
//        System.out.println("-------------------------------------");
//
//        System.out.println("Genesis Hash "+ issyCoin.chain.get(0).getHash());
//        System.out.println("Block2 Hash "+ issyCoin.chain.get(1).getHash() + " Block2 Previous Hash " + issyCoin.chain.get(1).getPreviousHash());
//        System.out.println("Block3 Hash "+issyCoin.chain.get(2).getHash() + " Block3 Previous Hash " + issyCoin.chain.get(2).getPreviousHash());
//
//
//        System.out.println(issyCoin.isBlockChainValid());







    }
}
