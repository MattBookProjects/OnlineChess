package com.ofbooks.chess.client;

public class Main {
    public static void main(String[] args){
        Builder builder = new Builder();
        builder.setWindowSize(1200, 800);
        App app = builder.build();
        app.run();
    }
}