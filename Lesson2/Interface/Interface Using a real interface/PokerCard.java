public class PokerCard implements Comparable<PokerCard> {
    
    int suit;       // 4 - spades, 3 - hearts, 2 - clubs, 1 - diamonds
    int number;     // from 2 to 14, being 11 the Jack, 12 the Queen, 13 the King and 14 the Ace
    
    public PokerCard (int s, int n) {
        suit = s;
        number = n;
    }
    
    public int compareTo (PokerCard pc) {
        
        if (this.number < pc.number) {
            return -1;
        } else if (this.number > pc.number) {
            return 1;
        } else {
            
            if (this.suit < pc.suit) {
                return -1;
            } else if (this.suit > pc.suit) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}