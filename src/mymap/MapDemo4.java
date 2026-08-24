package mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();

        m.put("1","11");
        m.put("2","22");
        m.put("3","33");
        m.put("4","44");

        m.forEach((k,v)-> System.out.println(k+","+v));

    }
}
