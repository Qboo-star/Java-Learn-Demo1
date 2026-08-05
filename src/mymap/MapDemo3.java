package mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();

        m.put("1","11");
        m.put("2","22");
        m.put("3","33");

        Set<Map.Entry<String, String>> e = m.entrySet();
        for(Map.Entry<String,String> entry:e){
            String k=entry.getKey();
            String v=entry.getValue();
            System.out.println(k+'='+v);
        }
    }
}
