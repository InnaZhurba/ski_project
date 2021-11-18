package Card;

import java.util.HashMap;

public class SkiPassCreator {
    SkiPass skiPass;
    HashMap<Integer, SkiPass> characterMap = new HashMap<Integer, SkiPass>(){{
        this.put(1,new DayCard());
        put(2,new RideCard());
        put(3,new SeasonCard());
    }};

   public SkiPass createDayCard(CardType cardType, int daysORrides, int n){

        return new DayCard(cardType,daysORrides);
    }
    public SkiPass createRideCard(CardType cardType, int daysORrides, TypeClassification typeClassification){
       return new RideCard(cardType, daysORrides);
    }
}
