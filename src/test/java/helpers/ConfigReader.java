package helpers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigReader {
 private Properties properties;
 private static ConfigReader configReader;
 
 private ConfigReader() {
 BufferedReader reader;
     	String propertyFilePath = "src//test//resources//configs//configurations.properties";
         try {
             reader = new BufferedReader(new FileReader(propertyFilePath));
             properties = new Properties();
             try {
                 properties.load(reader);
                 reader.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
             throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
         } 
 }
 
    public static ConfigReader getInstance( ) {
    	if(configReader == null) {
     configReader = new ConfigReader();
    	}
        return configReader;
    }
 
    public String getBaseUrl() {
        String baseUrl = properties.getProperty("baseUrl");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("baseUrl not specified in the Configuration.properties file.");
    }
 
    public String getUserDirectory() {
        String directory = properties.getProperty("directoryPath");
        if(directory != null) return directory;
        else throw new RuntimeException("directoryPath not specified in the Configuration.properties file.");
    }
}
