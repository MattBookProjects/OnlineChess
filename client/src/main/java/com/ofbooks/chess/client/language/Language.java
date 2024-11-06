package com.ofbooks.chess.client;

public class Language {
    public static final int PL = 0;
    public static final int EN = 1;
    public static final int DE = 2;


    public static String languageToString(int language){
        switch(language){
            case PL:
                return "Polski";
            case EN:
                return "English";
            case DE:
                return "Deutsch";
            default:
                return null;
        }
    }
}