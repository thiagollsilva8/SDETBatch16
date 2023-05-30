package class26;

import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {

    public static void main(String[] args) throws IOException {

        //System.getProperty("user.dir") gives the path of the project
        System.out.println(System.getProperty("user.dir"));

        String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";
        System.out.println(Constants.ConfigReaderPath);

        FileInputStream fileInputStream=new FileInputStream(Constants.ConfigReaderPath);

        // That special class which knows how this file works
        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("userName"));


    }
}
