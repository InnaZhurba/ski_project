package Card;

import Card.Types.CardType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Getter @Setter
public class RideCard extends SkiPass{
    private int numRides;
    /*HashMap<Integer, Boolean> mydict = new HashMap<>();/*{{
        mydict.put(10,true);
        mydict.put(20,true);
        mydict.put(50,true);
        mydict.put(100,true);
    }};*/

    public RideCard(){}

    public RideCard(CardType cardType, int rides){
        HashMap<Integer, Boolean> mydict = new HashMap<>();
        createMap(mydict);
        int defaultRides =1;
        super.setType(cardType);
        numRides = (mydict.getOrDefault(rides, false))?rides:defaultRides;
        super.setActive(true);
        //iterate ID
    }
    void createMap(HashMap<Integer, Boolean> mydict){
        mydict.put(10,true);
        mydict.put(20,true);
        mydict.put(50,true);
        mydict.put(100,true);
    }
}
