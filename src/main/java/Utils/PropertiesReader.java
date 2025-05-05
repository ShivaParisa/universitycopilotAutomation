package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
    Properties pro;

    public PropertiesReader(){
        File src = new File("./src/main/resources/resource.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is"+e.getMessage());
        }
    }
    public String getApplicationURL(){
        String url = pro.getProperty("baseUrl");
        return url;
    }

}
