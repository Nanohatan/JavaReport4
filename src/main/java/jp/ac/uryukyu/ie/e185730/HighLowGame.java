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
     * 数値の表示とユーザー入力に対する返答
     */

    protected void displayCards(){
            int point = rand.nextInt(TIME);
            System.out.println("ただいまの残りの枚数は"+cards.size()+"で," +
                    "あなたのスコアは"+userScore+"です");
            int carsNumber = cards.get(point);
            System.out.println(cards);
            System.out.println("これらの内0から数えて"+point+"番目の数,『"+carsNumber+"』が引かれました！");
            System.out.println(carsNumber+"です！");

            System.out.println("次の数が"+cards.get(point)+"以上だと思うならhigh,以下だと思うならlowとタイプしてください。");
            System.out.print("入力待ち→");
            String userAnswer = scanner.nextLine();
            System.out.println("あなたの答えは"+userAnswer+"ですね");
            point = rand.nextInt(TIME);
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
            cards.remove(point);
            TIME = TIME-1;
    }

}
