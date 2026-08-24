package mymap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Students,String> hm=new HashMap<>();

        Students s1=new Students("zhangsan",23);
        Students s2=new Students("lisi",24);
        Students s3=new Students("wangwu",25);

        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");

        Set<Students> keys=hm.keySet();
        for(Students k:keys){
            String v=hm.get(k);
            System.out.println(k+"="+v);
        }

    }
}
