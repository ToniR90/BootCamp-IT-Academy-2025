package org.example.service.calculator.price;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballClub;
import org.example.model.enums.FootballCompetition;
import org.example.model.enums.FootballPlayer;
import org.example.service.PriceCalculatorService;
import org.springframework.stereotype.Component;


@Component
public class FootballNewPriceCalculator implements PriceCalculatorService {

    @Override
    public double calculatePrice(New news) {
        if(!(news instanceof FootballNew footballNew)) {
            throw new IllegalArgumentException("Expected Football new");
        }
        double price = 300;

        if(footballNew.getCompetition() == FootballCompetition.CHAMPIONS_LEAGUE){
            price += 100;
        }
        if(footballNew.getClub() == FootballClub.BARCELONA || footballNew.getClub() == FootballClub.MADRID){
            price += 100;
        }
        if(footballNew.getPlayer() == FootballPlayer.FERRAN_TORRES || footballNew.getPlayer() == FootballPlayer.BENZEMA) {
            price += 50;
        }
        return price;
    }
}
