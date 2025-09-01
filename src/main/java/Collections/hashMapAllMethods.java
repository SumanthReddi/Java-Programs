//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMapAllMethods {
    public static void main(String[] args) {
        Map<String, String> hp = new HashMap();
        hp.put("firstName", "Neeraj");
        hp.put("lastName", "Napit");
        String value = (String)hp.get("lastName");
        System.out.println(value);
    }
}
