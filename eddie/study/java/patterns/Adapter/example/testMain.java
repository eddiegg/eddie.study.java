package eddie.study.java.patterns.Adapter.example;

import java.io.IOException;

/**
 * Created by user on 2017/3/16.
 */
public class testMain {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./resources/file.txt");
//            f.setValue("year","2017");
//            f.setValue("month","3");
//            f.setValue("day","16");
            f.writeToFile("./resources/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
