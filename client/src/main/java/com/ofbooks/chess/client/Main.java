package com.ofbooks.chess.client;
import java.awt.Color;

public class Main {
    public static void main(String[] args){
        Builder builder = new Builder();
        builder.setWindowSize(1200, 800);
        builder.setLargeButtonSize(200, 120);
        builder.setSmallButtonSize(100, 60);
        builder.setColorPallette(
            new ColorPallette(
                Color.GRAY,
                Color.WHITE,
                Color.DARK_GRAY,
                Color.BLACK,
                Color.LIGHT_GRAY,
                Color.YELLOW
            ));
        builder.setLanguage(Language.DE);
        App app = builder.build();
        app.run();
    }
}