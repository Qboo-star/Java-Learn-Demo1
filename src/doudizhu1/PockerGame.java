package doudizhu1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PockerGame {
    static ArrayList<String> list=new ArrayList<>();
    //准备
    //静态代码块：随类加载而加载，只执行一次
    static{
        String[] color={"♦","♣","♥","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //ArrayList<String> list=new ArrayList<>();
        for(String c:color){
            for(String n:number){
                list.add(c+n);
            }
        }
        list.add("大王");
        list.add("小王");
    }



    public PockerGame(){
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        //遍历牌盒拿牌
        for(int i=0;i<list.size();i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            //轮流发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        //看牌
        lookPocker("底牌",lord);
        lookPocker("1",player1);
        lookPocker("2",player2);
        lookPocker("3",player3);
    }
    public void lookPocker(String name,ArrayList<String> list){
        System.out.println(name+":");

        for(String poker:list){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
