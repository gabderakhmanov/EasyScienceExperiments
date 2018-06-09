package com.experiments.hxmultythrd;

public class MockLoader implements ITextLoader {

    private String textToLoad;

    public MockLoader(final String textToLoad){
        this.textToLoad = textToLoad;
    }

    @Override
    public String loadText() {

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return textToLoad;
    }
}
