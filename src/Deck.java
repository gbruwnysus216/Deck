package src;
public class Deck {
    
    public interface Deck{
        public void shuffle();
        public void cut(int index);
        Card deal();
        Card turnOver();
        int search(Card card);
        void newOrder(Deck cards);
        int size();
    }
}
