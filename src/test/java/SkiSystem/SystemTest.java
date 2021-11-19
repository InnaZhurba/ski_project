package SkiSystem;

import Card.DayCard;
import Card.RideCard;
import Card.SkiPass;
import Card.Types.CardType;
import Card.Types.DayType;
import Card.Types.RideType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SystemTest {
    int n = 5;
    System system = new System(5);

    @BeforeEach
    void setUp() {
    }

    @Test
    void createCard() {
        system.createCard(CardType.WORKDAY, DayType.FIVE);
        SkiPass card = system.getSkiPasses()[0];
        assertEquals(5,((DayCard)card).getActualDays());
    }

    @Test
    void testCreateCard() {
        system.createCard(CardType.WORKDAY, RideType.HUNDRED);
        SkiPass card = system.getSkiPasses()[0];
        assertEquals(100,((RideCard)card).getNumRides());
    }

    @Test
    void blockCard() {
        system.createCard(CardType.WORKDAY, RideType.HUNDRED);
        SkiPass card = system.getSkiPasses()[0];
        system.BlockCard(card);
        assertEquals(false,((RideCard)card).getActive());
    }
}