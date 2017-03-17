package eddie.study.java.patterns.Adapter.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by eddie on 2017/3/16.
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename),"write by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key,"");
    }
}
