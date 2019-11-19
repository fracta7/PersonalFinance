package com.fractal;

import com.fractal.settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        init();
        //System.out.println(Text.get("PROGRAM_NAME"));
        //System.out.println(Arrays.toString(Text.getMonths()));
    }

    private static void init() {
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/GoogleSans-Regular.ttf")));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
