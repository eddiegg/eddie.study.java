package eddie.study.java.json;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 2017/3/16.
 */
public class JsonParser {

    public static <T> T jsonToClass(String json, Class<T> classOfT){
        T t = null;
        try {
            t = new Gson().fromJson(json, classOfT);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static void main(String args[]){
        File inf = new File("E:\\学习资料\\java\\eddie.study.java\\eddie\\study\\java\\json\\JsonSample");
        String result = null;
        try {
            result = FileUtils.readFileToString(inf,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        CompBean comp = jsonToClass(result, CompBean.class);
        System.out.println(comp.status);
        System.out.println(comp.data.abnormal_items);
        for (CompBean.DataEntity.EmployeesEntity et: comp.data.employees) {
            System.out.println(et.name +":  " +et.job_title);
        }
    }
}
