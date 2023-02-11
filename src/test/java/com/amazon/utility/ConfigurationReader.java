package com.amazon.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\AmazonProject\\configuration.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }


}
