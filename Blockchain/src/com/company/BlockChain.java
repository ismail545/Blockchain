package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BlockChain {

    public ArrayList<Block> chain = new ArrayList<>();
    public ArrayList<Transaction> pendingTransactions = new ArrayList<>();
    private int difficulty;
    private int miningReward;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public BlockChain() {

        this.chain.add(createGenesisBlock());
        this.difficulty = 2;
        this.miningReward = 100;
        this.pendingTransactions.clear();


    }

    public Block createGenesisBlock() {
        Transaction genesis = new Transaction("123", "798", 345);
        ArrayList<Transaction> GenesisList = new ArrayList<>();
        GenesisList.add(genesis);
        return new Block("3/05", GenesisList, "0");
    }

    public Block getLatestBlock() {
        return this.chain.get(chain.size() - 1);
    }

//    public void addBlock(Block newBlock) {
//        newBlock.setPreviousHash(this.getLatestBlock().getHash());
//        System.out.println("difficulty: " + this.difficulty);
//        newBlock.mineBlock(this.difficulty);
//        this.chain.add(newBlock);
//    }

    public void minePendingTransactions(String miningRewardAddress) {

        Block block = new Block(LocalDateTime.now().toString(), this.pendingTransactions, this.getLatestBlock().getHash());
        block.mineBlock(this.difficulty);

        System.out.println("Block mined successfully");
        this.chain.add(block);

        this.pendingTransactions.add(new Transaction(null, miningRewardAddress, this.miningReward));


    }

    public void createTransaction(Transaction transaction) {
        this.pendingTransactions.add(transaction);
    }

    public int getBalanceOfAddress(String address) {
        int balance = 0;
        for (Block block : this.chain) {
            for (Transaction trans : block.Transactions) {
                if (trans.getFromAddress() == address) {
                    balance -= trans.getAmount();
                }

                if (trans.getToAddress() == address) {
                    balance += trans.getAmount();
                }

            }

        }

        return balance;
    }


//    public boolean isBlockChainValid() {
////        for (int i = 1; i < this.chain.size(); i++ ){
////            Block currentBlock = this.chain.get(i);
////            Block previousBlock = this.chain.get(i - 1);
////
////            if (! (currentBlock.getHash().equals(this.calculateHash()))) {
////                //System.out.println(currentBlock.getTransactions());
////                return false;
////            }
////
////            if (currentBlock.getPreviousHash() != previousBlock.getHash()) {
////                return false;
////            }
////
////        }
////
////        return true;
////    }
//
//
//    }

}