package com.experiments.hxmultythrd;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("fileFromWeb");

        final Long before = System.currentTimeMillis();

        System.out.println(fileTextLoader.loadText());
        System.out.println(webTextLoader.loadText());

        final Long after = System.currentTimeMillis();

        System.out.printf("time delta: %d", (after-before)/1000);

    }

}
