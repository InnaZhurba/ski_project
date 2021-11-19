package SkiSystem;

import Card.RideCard;
import Card.SkiPass;
import Card.Types.CardClassify;
import Card.Types.CardType;
import Card.Types.RideType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurnstileTest {
SkiPass skiPass = new RideCard(CardType.WORKDAY, 50);

    @BeforeEach
    void setUp() {
    }

    @Test
    void checkCard() {
        Turnstile.CheckCard(skiPass, CardClassify.RIDE);
        assertEquals(49, ((RideCard)skiPass).getNumRides());
    }
}