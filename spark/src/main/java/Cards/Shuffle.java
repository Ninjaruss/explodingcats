package Cards;

import GameObjects.*;
import java.util.Stack;

public class Shuffle extends CardObject{
    public Shuffle(){
        name = "Shuffle";
        id = 7;
        desc = "Shuffles the deck.";
    }

    public void activate(Game g){
        g.getDeck().shuffle();
        g.tellAllClients("cardActivated", this, "Shuffle activated.");
    }
}
