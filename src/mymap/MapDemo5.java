package mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    /*
        V put(K key,V value)                添加元素
        V remove(Object kry)                根据键删除键值对元素
        void clear()                        移除所有键值对元素
        boolean containsKey(Object Key)     判断集合是否包含指定键
        boolean containsValue(Object value) 判断集合是否包含指定值
        boolean isEmpty()                   判断集合是否为空
        int size()                          集合长度，集合中键值对的个数
     */
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();

        m.put("1","11");
        m.put("2","22");
        m.put("3","33");

        System.out.println(m);

        m.remove("2");
        System.out.println(m);

        boolean k1=m.containsKey("1");
        boolean k2=m.containsKey("2");

        System.out.println(k1);
        System.out.println(k2);
    }

}
