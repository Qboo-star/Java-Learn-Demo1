package mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*
         单列集合        default Stream<E> stream()
         双列集合        无
         数组           public static <T> stream(T[] array)
         零散数据        public static<T> of(T..values)
        */

        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"a","b","c","d","e");

        //Stream<String> stream1=list1.stream();
        list1.stream().forEach(s-> System.out.println(s));
    }
}
