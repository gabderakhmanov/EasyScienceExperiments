package com.experiments.hxmultythrd;

public class MainWithThreads {

    public static void main(String[] args) throws InterruptedException {

        final ITextLoader fileTextLoad = new MockLoader("fileTextLoader");
        final ITextLoader webTextLoad = new MockLoader("webTextLoader");

        final Long before = System.currentTimeMillis();

        System.out.println("start");

        Thread fileTextLoadThread = new Thread(){
            @Override
            public void run() {
                System.out.println(fileTextLoad.loadText());
            }
        };
        fileTextLoadThread.start();

        Thread webTextLoadThread = new Thread(){
            @Override
            public void run() {
                System.out.println(webTextLoad.loadText());
            }
        };
        webTextLoadThread.start();

        fileTextLoadThread.join(); // main Thread will wait for fileTextLoadThread
        webTextLoadThread.join(); // main Thread will wait for webTextLoadThread

        final Long after = System.currentTimeMillis();

        System.out.printf("Delta: %d \n", (before- after)/1000);


    }

}
