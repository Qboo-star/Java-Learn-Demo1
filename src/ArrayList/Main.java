package ArrayList;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }


    }
}

