package Card;

import lombok.Getter;
import lombok.Setter;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

@Getter @Setter
public class RideCard extends SkiPass{
    private int numRides;
    Map<Integer, Boolean> mydict = new Hashtable<>(){{
        mydict.put(10,true);
        mydict.put(20,true);
        mydict.put(50,true);
        mydict.put(100,true);
    }};

    public RideCard(){}

    public RideCard(CardType cardType, int rides){
        int defaultRides =1;
        super.setType(cardType);
        numRides = (mydict.getOrDefault(rides, false))?rides:defaultRides;
        //iterate ID
    }
}
