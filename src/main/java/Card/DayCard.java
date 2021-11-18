package Card;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class DayCard extends SkiPass{
    private int maxDays;
    private LocalDateTime data;

    public DayCard(){}

    public DayCard(CardType cardType, int numDays){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        super.setType(cardType);
        maxDays = (super.getType()==CardType.WEEKEND)?2:5;
        //iterate ID
        data = (numDays<=maxDays)? now.plusDays(numDays):now;
    }
}
