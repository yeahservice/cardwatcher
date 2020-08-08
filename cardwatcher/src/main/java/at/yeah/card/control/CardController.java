package at.yeah.card.control;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import at.yeah.card.entity.Card;

@ApplicationScoped
@Transactional
public class CardController {

    public Card create() {
        Card card = new Card();
        card.name = "Card";
        card.persist();
        return card;
    }

}