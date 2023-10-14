package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
in this class., we will be creatin th reusable logic to read from
configuration.properties file
 */
public class ConfigurationReader {

    //1- creat the properties object-> Create object
    //make it private so we are limitting acces to the object
    // staits is to mae sure its created and loded before everything

    private static Properties properties=new Properties();

    static {
        try {
            //2- open file using fileinputstream-> open file
            FileInputStream file = new FileInputStream("configuration.properties");

            //3-load the properites object with file-> load properties
            properties.load(file);
            //close the file in the memorey
            file.close();

        }catch (IOException e){

            System.out.println("FILE NOT FOUND");
            e.printStackTrace();
        }
    }
    //creat a utility method to sue the object to read
    //4- use proeprties obejct to read from file

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
