package jp.ac.uryukyu.ie.e185730;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    private Random rand = new Random();
    private MakeCards list = new MakeCards();
    private List<Integer> cards = list.makeCards();
    private int TIME = 19;
    int userScore = 0;
    boolean userProspect = true;
    private Scanner scanner = new Scanner(System.in);

    /**
     * 数値の表示
     */

    public void displayCards(){
        int point = rand.nextInt(TIME);
        int carsNumber = cards.get(point);
        printQuestion(point,carsNumber);
        String userAnswer = scanner.nextLine();
        System.out.println("あなたの答えは"+userAnswer+"ですね");
        point = rand.nextInt(TIME);
        check(point,carsNumber,userAnswer);
        cards.remove(point);
        TIME = TIME-1;
    }

    private void printQuestion(int point,int carsNumber){
        System.out.println("ただいまの残りの枚数は"+cards.size()+"で," + "あなたのスコアは"+userScore+"です");
        System.out.println(cards);
        System.out.println("これらの内0から数えて"+point+"番目の数,『"+carsNumber+"』が引かれました！");
        System.out.println(carsNumber+"です！");
        System.out.println("次の数が"+carsNumber+"以上だと思うならhigh,以下だと思うならlowとタイプしてください。");
        System.out.print("入力待ち→");
    }

    private void check(int point,int carsNumber,String userAnswer){
        int carsNumber2 = cards.get(point);
        if (carsNumber2>=carsNumber && userAnswer.equals("high")){
            System.out.println("次の数は"+carsNumber2+"なので正解！");
            userProspect = true;
        }else if (carsNumber2<=carsNumber && userAnswer.equals("low")){
            System.out.println("次の数は"+carsNumber2+"なので正解！");
            userProspect = true;
        }else{
            System.out.println("次の数は"+carsNumber2+"なのでざんねん!");
            userProspect = false;
        }
    }



}
