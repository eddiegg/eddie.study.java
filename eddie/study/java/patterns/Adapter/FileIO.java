package eddie.study.java.patterns.Adapter;

import java.io.IOException;

/**
 * Created by user on 2017/3/16.
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);

}
