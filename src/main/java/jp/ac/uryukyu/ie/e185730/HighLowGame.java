package jp.ac.uryukyu.ie.e185730;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    Random rand = new Random();
    MakeCards list = new MakeCards();
    List<Integer> cars = list.makeCards();
    int TIME = 19;
    int userScore = 0;
    boolean userProspest = true;
    Scanner scanner = new Scanner(System.in);
    public void displayCards(){
            int point = rand.nextInt(TIME);
            System.out.println("ただいまの残りの枚数は"+cars.size()+"で," +
                    "あなたのスコアは"+userScore+"です");
            int carsNumber = cars.get(point);
            System.out.println(cars);
            System.out.println("これらの内0から数えて"+point+"番目の数,『"+carsNumber+"』が引かれました！");
            System.out.println(carsNumber+"です！");

            System.out.println("次の数が"+cars.get(point)+"以上だと思うならhigh,以下だと思うならlowとタイプしてください。");
            System.out.print("入力待ち→");
            String userAnswer = scanner.nextLine();
            System.out.println("あなたの答えは"+userAnswer+"ですね");
            point = rand.nextInt(TIME);
            int carsNumber2 = cars.get(point);
            if (carsNumber2>=carsNumber && userAnswer.equals("high")){
                System.out.println("次の数は"+carsNumber2+"なので正解！");
                userProspest = true;
            }else if (carsNumber2<=carsNumber && userAnswer.equals("low")){
            System.out.println("次の数は"+carsNumber2+"なので正解！");
                userProspest = true;
            }else{
                System.out.println("次の数は"+carsNumber2+"なのでざんねん!");
                userProspest = false;
            }
            cars.remove(point);
            TIME = TIME-1;
    }

}
