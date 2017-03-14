
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private int number;
    private String suit;
    private boolean ace;
    private boolean faceUp;
    public Card(int value, String s) {
        number = value;
        suit = s;
    }
    //setters
    public void declareAce11(){
        //Sets ace to value of 11
        if (number == 1){ 
            number = 11;
            ace = true;
        }
    }
    public void setFaceUp(boolean t){
        faceUp = t;
    }
    //getter
    private boolean faceCard() {
        //returns true if card is a face card(11-13)
        if (number > 10 && ace != true) {
            if (number > 13){
                return false;
            }
            return true;
        }
        return false;
    }
    public String getSuit(){
        return suit;
    }
    public boolean getFaceUp(){
        return faceUp;
    }
    public int getNumber(){
        //Sets face cards to equal 10
        if (faceCard() == true){ 
            number = 10;
        }
        return number;
    }
    
}
