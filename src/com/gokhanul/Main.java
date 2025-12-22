package com.gokhanul;

import com.gokhanul.classes.TextBoX;

public class Main {

    public static void main(String[] args) {

        // Example for TextBox class
        var textBox1 = new TextBoX();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBoX();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());

        //----------------------------------------------------------------------------
    }

}
