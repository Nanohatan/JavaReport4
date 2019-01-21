package jp.ac.uryukyu.ie.e185730;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    Random rand = new Random();
    MakeCards list = new MakeCards();
    //int point = rand.nextInt(19);
    List<Integer> cars = list.makeCards();
    int TIME = 19;
    Scanner scanner = new Scanner(System.in);
    public void displayCards(){
        //int num = point;
        while (TIME > 14 ){
            int point = rand.nextInt(TIME);
            System.out.println("ただいまの残りの枚数は"+cars.size()+"です");
            System.out.println(cars);
            System.out.println("これらの内0から数えて"+point+"番目の数,『"+cars.get(point)+"』が引かれました！");
            System.out.println(cars.get(point)+"です！");
            System.out.println("次の数が"+cars.get(point)+"以上だと思うならhigh,以下だと思うならlowとタイプしてください。");
            System.out.print("入力待ち→");
            String userAnswer = scanner.nextLine();
            System.out.println("あなたの答えは"+userAnswer+"ですね");
            cars.remove(point);
            //System.out.println(cars);
            TIME = TIME-1;
            //System.out.println("ただいまの残りの枚数は"+cars.size()+"です");
        }
    }

    public void checkAnser(String answer){
        //if (answer)
    }
}
