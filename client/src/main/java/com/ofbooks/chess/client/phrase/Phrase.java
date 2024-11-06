package com.ofbooks.chess.client;

public class Phrase {
    private String pl;
    private String en;
    private String de;

    public Phrase(String pl, String en, String de){
        this.pl = pl;
        this.en = en;
        this.de = de;
    }

    public String translate(int language){
        switch(language){
            case Language.PL:
                return this.pl;
            case Language.EN:
                return this.en;
            case Language.DE:
                return this.de;
            default:
                return null;
        }
    }

}