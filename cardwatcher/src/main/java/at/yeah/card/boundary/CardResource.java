package at.yeah.card.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import at.yeah.card.control.CardController;
import at.yeah.card.entity.Card;

@Path("/card")
public class CardResource {

    @Inject
    private CardController cardController;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Card card() {
        return cardController.create();
    }
}