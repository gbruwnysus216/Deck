public class Card implements Comaprable<Card>{

    private Suit s;
    private FaceValue fv;

    private Card(){
    }

    public Card(Suit s, FaceValue fv){
        this.s = s;
        this.fv = fv;
    }

    public Suit getSuit(){
        return s;
    }

    public FaceValue getFaceValue(){
        return fv;
    }

    @Override int compateTo(Card o){
        return 0;
    }

    public String toString(){
        String sb = new StringBuilder ("Card{");
        sb.append("suit=").append(s);
        sb.append(", faceValue=").append(fv);
        sb.append('}');
        return sb.toString();
    }
}
