package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {


    private static Properties properties = new Properties();


    static {

        String pathForPropertiesFile= "configs.properties";

        try {

            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);

            properties.load(fileInputStream);

        }catch (IOException f){
            f.printStackTrace();

            System.out.println("Properties not found!!!!!!!");
        }


    }

    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }

}
