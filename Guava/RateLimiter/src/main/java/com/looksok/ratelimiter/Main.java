package com.looksok.ratelimiter;

public class Main {

    public static void main(String args[]){
        System.out.println("Welcome my precious!");

        LongRunningProcess process = new LongRunningProcess(10000, new ProgressGuiUpdater());
        new Thread(process).run();
    }
}
