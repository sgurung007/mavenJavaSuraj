package org.example.seleniumWebdriver.udemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
    private static FileInputStream fileInputStream;
    private static FileInputStream fileInputStream1;

    public static void main(String[] args) {
        Properties properties = new Properties();
        Properties config = new Properties();
        try {
            fileInputStream = new FileInputStream("src/main/resources/suraj.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("userName_ID"));
        System.out.println("your password is: "+properties.getProperty("pasWords"));

        try {
            fileInputStream1 = new FileInputStream("src/main/resources/configuration.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            config.load(fileInputStream1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("http from config: "+config.getProperty("http"));

    }
}
