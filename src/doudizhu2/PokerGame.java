package doudizhu2;

import java.util.*;

public class PokerGame {
    /*"♦","♣","♥","♠"*/
    /*"3","4","5","6","7","8","9","10","J","Q","K","A","2"*/

    static HashMap<Integer,String> hm=new HashMap<>();
    static ArrayList<Integer>list=new ArrayList<>();
    static{
        String[] color={"♦","♣","♥","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int sNumber=1;
        for(String n:number){
            for(String c:color){
                hm.put(sNumber,c+n);
                list.add(sNumber);
                sNumber++;
            }
        }
        hm.put(sNumber,"小王");
        list.add(sNumber);
        sNumber++;
        hm.put(sNumber,"大王");
        list.add(sNumber);
        System.out.println(list);
    }
    public PokerGame(){
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();

        for(int i=0;i<list.size();i++) {
            int sNumber = list.get(i);
            if (i <= 2) {
                lord.add(sNumber);
                continue;
            }
            //轮流发牌
            if (i % 3 == 0) {
                player1.add(sNumber);
            } else if (i % 3 == 1) {
                player2.add(sNumber);
            } else {
                player3.add(sNumber);
            }
        }
        lookPoker("底牌",lord);
        lookPoker("1",player1);
        lookPoker("2",player2);
        lookPoker("3",player3);
    }
    
    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.println(name+":");
        //遍历TreeSet集合
        for (Integer sNumber : ts) {
            String poker=hm.get(sNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
