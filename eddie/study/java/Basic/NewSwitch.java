package eddie.study.java.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/3/30.
 */
public class NewSwitch {
    public static void main(String[] args) {
        String colorString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your choice:");
        String color = sc.nextLine();
        switch (color) {
            case "red":
                colorString = "red color";
                break;
            case "blue":
                colorString = "blue color";
                break;
            default:
                colorString = "a color";
                break;
        }
        System.out.println(colorString);

    }
}
