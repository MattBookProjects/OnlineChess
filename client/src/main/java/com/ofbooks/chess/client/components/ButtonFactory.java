package com.ofbooks.chess.client;

import java.awt.Color;
import java.awt.event.ActionListener;


public class ButtonFactory {

    private int width; 
    private int height; 
    private Color backgroundColor; 
    private Color textColor;
    private Color borderShadowColor;
    private Color borderDarkShadowColor;
    private Color borderHighlightColor;
    private Color borderLightHighlightColor;

    public ButtonFactory(
        int width, 
        int height, 
        Color backgroundColor, 
        Color textColor,
        Color borderShadowColor,
        Color borderDarkShadowColor,
        Color borderHighlightColor,
        Color borderLightHighlightColor
        ){
            this.width = width;
            this.height = height;
            this.backgroundColor = backgroundColor;
            this.textColor = textColor;
            this.borderShadowColor = borderShadowColor;
            this.borderDarkShadowColor = borderDarkShadowColor;
            this.borderHighlightColor = borderHighlightColor;
            this.borderLightHighlightColor = borderLightHighlightColor;
        }

    public Button createButton(String text, ActionListener listener){
        return new Button(
            this.width,
            this.height,
            this.backgroundColor,
            this.textColor,
            this.borderShadowColor,
            this.borderDarkShadowColor,
            this.borderHighlightColor,
            this.borderLightHighlightColor,
            text,
            listener
        );
    }
}