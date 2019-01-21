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
        //while (TIME > 14 ){
            int point = rand.nextInt(TIME);
            System.out.println("ただいまの残りの枚数は"+cars.size()+"です");
            int carsNumber = cars.get(point);
            System.out.println(cars);
            System.out.println("これらの内0から数えて"+point+"番目の数,『"+carsNumber+"』が引かれました！");
            System.out.println(carsNumber+"です！");
            /*
            int sampnum = cars.get(point);
            if (TIME<19){
                System.out.println(sampnum);
            }
             */

            System.out.println("次の数が"+cars.get(point)+"以上だと思うならhigh,以下だと思うならlowとタイプしてください。");
            System.out.print("入力待ち→");
            String userAnswer = scanner.nextLine();
            System.out.println("あなたの答えは"+userAnswer+"ですね");
            point = rand.nextInt(TIME);
            int carsNumber2 = cars.get(point);
            if (carsNumber2>=carsNumber && userAnswer.equals("high")){
                System.out.println("次の数は"+carsNumber2+"なので正解！");
            }else if (carsNumber2<=carsNumber && userAnswer.equals("low")){
            System.out.println("次の数は"+carsNumber2+"なので正解！");
            }else{System.out.println("ざんねん");}
            cars.remove(point);
            //System.out.println(cars);
            TIME = TIME-1;
            //System.out.println("ただいまの残りの枚数は"+cars.size()+"です");
       // }
    }

    public void checkAnser(String answer){
        //if (answer)
    }
}
