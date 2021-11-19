package Card;

import Card.Types.CardType;
import Card.Types.SeasonType;
import Card.Types.TypeClassification;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class SkiPassCreator {
    @Getter @Setter
    private SkiPass skiPass;

    //***
    //doesn't work right
    HashMap<Integer, SkiPass> characterMap = new HashMap<Integer, SkiPass>(){{
        this.put(1,new DayCard());
        put(2,new RideCard());
        put(3,new SeasonCard());
    }};
    //doesn't work right
   public static SkiPass createDayCard(CardType cardType, int daysORrides, int n){
        return new DayCard(cardType,daysORrides);
    }
    //***

    public SkiPass createRideCard(CardType cardType, int Rides){//, TypeClassification typeClassification){
       setSkiPass(new RideCard(cardType, Rides));
       return getSkiPass();
    }
    public SkiPass createDayCard(CardType cardType, int Days){//, TypeClassification typeClassification){
        setSkiPass(new DayCard(cardType, Days));
        return getSkiPass();
        //return new DayCard(cardType, Days);
    }
    public SkiPass createSeasonCard(CardType cardType, SeasonType seasonType){//, TypeClassification typeClassification){
        setSkiPass(new SeasonCard(cardType, seasonType));
        return getSkiPass();
       //return new SeasonCard(cardType, seasonType);
    }
}
