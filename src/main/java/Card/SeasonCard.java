package Card;

import Card.Types.CardType;
import Card.Types.SeasonType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SeasonCard extends SkiPass{
    //private ;
    public SeasonCard(){}
    public SeasonCard(CardType cardType, SeasonType seasonType){}

}
