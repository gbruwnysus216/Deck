package src;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class StandardDeck implements Deck{
    //Feilds
    private List<Card> cards;

    public List<Card> newDeck(){
        List<Card> newDeck = new ArrayList<>();

        for (Suit s :Suit.values()){
            for (FaceValue fv : FaceValue.values()){
                newDeck.add(new Card(s,fv));
            }
        }
        return newDeck;
    }

    public List<Card> newDeckMap(){
        Arrays.stream(FaceValue.values()).map(fv -> new Card(suit,FaceValue)).forEach(newDeck::add);
    return newDeck;
    }


    //Methods

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void cut(int index){

    }

    @Override
    public Card deal(){
        return null;
    }

    @Override
    public Card turnOver(){
        return null;
    }

    @Override
    public int search(Card card){
        return 0;
    }

    @Override
    public void newOrder(Deck cards){

    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("standardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }

}
