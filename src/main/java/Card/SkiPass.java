package Card;

import Card.Types.CardType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class SkiPass {
    private int ID;
    private CardType type;
    private Boolean active;
}
