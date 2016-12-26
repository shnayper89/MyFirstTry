package Preparations;

import Utils.PropertiesReader;

import java.util.Properties;

/**
 * Created by spirit on 04.12.16.
 */
public class ReadPropertiesForTest {
    private Properties anyDatas = PropertiesReader.readProperties("data.properties");

    protected String anyData(String data) {
        return anyDatas.getProperty(data);
    }
}