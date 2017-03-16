package eddie.study.java.patterns.Adapter;

import java.io.IOException;

/**
 * Created by user on 2017/3/16.
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);

}
