package Card;


import Card.Types.CardType;
import Card.Types.TypeClassification;
import org.junit.jupiter.api.Assertions;

class SkiPassCreatorTest {

    SkiPassCreator skiPassCreator = new SkiPassCreator();
    @org.junit.jupiter.api.BeforeEach
     void setUp() {
    }

    @org.junit.jupiter.api.Test
    void createRideCard() {
        SkiPass skiPass = new RideCard(CardType.WEEKEND,20);
        SkiPass newSkiPass = skiPassCreator.createRideCard(CardType.WEEKEND, 20);
        Assertions.assertEquals(skiPass.getType(),newSkiPass.getType());
        Assertions.assertEquals(((RideCard)skiPass).getNumRides(),((RideCard)newSkiPass).getNumRides());
    }

    @org.junit.jupiter.api.Test
    void createDayCard() {
        SkiPass skiPass = new DayCard(CardType.WORKDAY,20);
        SkiPass newSkiPass = skiPassCreator.createDayCard(CardType.WORKDAY, 20);
        Assertions.assertEquals(skiPass.getType(),newSkiPass.getType());
        Assertions.assertEquals(((DayCard)skiPass).getActualDays(),1);
    }
}