package mymap;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();

        m.put("1","11");
        m.put("2","22");
        m.put("3","33");

        Set<String> keys=m.keySet();

        for(String k:keys){
            String v=m.get(k);
            System.out.println(k+"="+v);
        }

        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            System.out.println(m.get(it.next()));
        }

        m.forEach((str1,str2)-> System.out.println(str1+','+str2));

    }
}
