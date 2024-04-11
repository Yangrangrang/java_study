package org.example.ch11;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println(sysProp);

        System.out.println("java.version" + sysProp.getProperty("java.version"));       // java.version1.8.0_332
        System.out.println("user.language" + sysProp.getProperty("user.language"));     // user.languageko
        sysProp.list(System.out);
    }
}
