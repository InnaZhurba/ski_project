package SkiSystem;

import Card.DayCard;
import Card.RideCard;
import Card.SkiPass;
import Card.Types.CardClassify;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Turnstile {
    public static Boolean CheckCard(SkiPass skiPass, CardClassify cardClassify){
        if(skiPass!=null) {
            if (skiPass.getActive()) {
                if (cardClassify == CardClassify.DAY) {
                    if (((DayCard) skiPass).getActualDays() > 0) {//actualdays зніматимуться при завершенні дня, чи щось таке - тільки це ще треба прописати
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();

                        if (((DayCard) skiPass).getData().isBefore(now) || ((DayCard) skiPass).getData().isEqual(now))
                            return true;

                        return true;
                    }
                } else if (cardClassify == CardClassify.RIDE) {
                    if (((RideCard) skiPass).getNumRides() > 0) {
                        ((RideCard) skiPass).setNumRides(((RideCard) skiPass).getNumRides() - 1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
