package jp.ac.uryukyu.ie.e185730;


public class Main {
    public static void main(String args[]){

        HighLowGame game = new HighLowGame();
        for (int i=0;i<5;i++){
            game.displayCards();
            if (game.userProspect){
                game.userScore++;
            }
        }
        System.out.println("あなたのスコアは"+game.userScore+"でした");

    }

}
