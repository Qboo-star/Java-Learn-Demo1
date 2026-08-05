package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Consumer;

public class Hashset {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();

        boolean r1=s.add("zhangsan");
        boolean r2=s.add("lisi");
        s.add("wangwu");

        /*Iterator<String> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        /*for(String x:s){
            System.out.println(x);
        }*/

       /* s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });*/
        s.forEach(str-> System.out.println(str));
    }
}
