package jp.ac.uryukyu.ie.e185730;
import java.util.ArrayList;
import java.util.List;

public class MakeCards {
    public List<Integer> cardslist = new ArrayList<Integer>();

    /**
     * ２０個のランダムな数字の要素を持つリストを作る
     * @return 作ったリスト
     */
    public List<Integer> makeCards(){
        for (int i=0;i<20;i++){
            cardslist.add((int)(Math.random()*100));
        }
        return cardslist;
    }
}
