package org.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
    public static String BASE_CONFIG_FILENAME = "C:\\Users\\devarajan.r\\IdeaProjects\\AmexTest\\src\\test\\resources\\config.properties";
    public static String getValueFromPropertyFile(String fileName, String key){
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        String value = "";
        try {
            inputStream = new FileInputStream(BASE_CONFIG_FILENAME);
            properties.load(inputStream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

    public static String getBaseURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "BASE_URL");
    }

    public static String getFRURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "FR_URL");
    }

    public static String getMultiSelectURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "MULTISELECTURL");
    }

    public static String getAutoCompleteURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "AUTOCOMPLETEURL");
    }

    public static String getFileUploadURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "FILEUPLOADURL");
    }

    public static String getBrowserWindowURL() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "BROWSERWINDOWURL");
    }


    public static String getBrowser() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "BROWSER").toUpperCase();
    }

    public static String getSheetPath() {
        return getValueFromPropertyFile(BASE_CONFIG_FILENAME, "SHEETPATH");
    }
}

