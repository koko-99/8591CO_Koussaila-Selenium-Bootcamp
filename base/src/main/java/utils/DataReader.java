package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {

    public static Properties properties;
    private static final File propertiesFile = new File(System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "Data" + File.separator
            + "testData.properties");

    private static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propertiesFile);

        prop.load(fis);
        fis.close();

        return prop;
    }
    public static Properties readData(){
        try{
           properties=loadProperties();


        }
        catch(IOException e){
            e.printStackTrace();
        }
        return properties;
    }


}
