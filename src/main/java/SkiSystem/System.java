package SkiSystem;

import Card.DayCard;
import Card.RideCard;
import Card.SkiPass;
import Card.SkiPassCreator;
import Card.Types.CardType;
import Card.Types.DayType;
import Card.Types.RideType;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class System {
    SkiPassCreator skiPassCreator = new SkiPassCreator();
    SkiPass[] skiPasses;
    int maxNumCards;
    int actualCardNum;
    SkiPassCreator creator = new SkiPassCreator();

    public System(int n){
        actualCardNum = 0;
        maxNumCards = n;
        skiPasses = new SkiPass[maxNumCards];
    }

    public Boolean createCard(CardType cardType, RideType rideType){
        HashMap<RideType, Integer> mydict = new HashMap<>();
        createRideMap(mydict);


        int rides = (mydict.getOrDefault(rideType,1));
        skiPasses[actualCardNum]=creator.createRideCard(cardType,rides);
        actualCardNum++;

        return true;
    }
    void createRideMap(HashMap<RideType, Integer> mydict){
        mydict.put(RideType.TEN,10);
        mydict.put(RideType.TWENTY,20);
        mydict.put(RideType.FIFTY,50);
        mydict.put(RideType.HUNDRED,100);
    }
    public Boolean createCard(CardType cardType, DayType dayType){
        HashMap<DayType, Integer> mydict = new HashMap<>();
        createDayMap(mydict);

        int days = (mydict.getOrDefault(dayType,1));
        skiPasses[actualCardNum]=creator.createDayCard(cardType,days);
        actualCardNum++;

        return true;
    }
    void createDayMap(HashMap<DayType, Integer> mydict){
        mydict.put(DayType.ONE,1);
        mydict.put(DayType.FIVE,5);
        mydict.put(DayType.TWO,2);
    }

    public static void BlockCard(SkiPass card){
        card.setActive(false);
    }
}

