package com.ofbooks.chess.client;

import java.awt.Color;


public class ColorPallette {

    private Color backgroundColor;
    private Color textColor;
    private Color borderShadowColor;
    private Color borderDarkShadowColor;
    private Color borderHighlightColor;
    private Color borderLightHighlightColor;

    public ColorPallette (
            Color backgroundColor,
            Color textColor,
            Color borderShadowColor,
            Color borderDarkShadowColor,
            Color borderHighlightColor,
            Color borderLightHighlightColor
    ) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.borderShadowColor = borderShadowColor;
        this.borderDarkShadowColor = borderDarkShadowColor;
        this.borderHighlightColor =  borderHighlightColor;
        this.borderLightHighlightColor = borderLightHighlightColor;
    }

    public Color getBackgroundColor(){
        return this.backgroundColor;
    }

    public Color getTextColor(){
        return this.textColor;
    }

    public Color getBorderShadowColor(){
        return this.borderShadowColor;
    }

    public Color getBorderDarkShadowColor(){
        return this.borderDarkShadowColor;
    }

    public Color getBorderHighlighColor(){
        return this.borderHighlightColor;
    }

    public Color getBorderLightHighlightColor(){
        return this.borderLightHighlightColor;
    }
}