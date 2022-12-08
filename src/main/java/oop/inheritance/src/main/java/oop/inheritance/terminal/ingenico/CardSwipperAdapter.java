package oop.inheritance.terminal.ingenico;
import oop.inheritance.terminal.CardSwipper;
import oop.library.ingenico.model.Card;
import oop.library.ingenico.services.IngenicoCardSwipper;


public class CardSwipperAdapter implements CardSwipper {

    private final IngenicoCardSwipper ingenicoCardSwipper;

    public CardSwipperAdapter(){
        this.ingenicoCardSwipper = new IngenicoCardSwipper();
    }

    @Override
    public Card readCard() {
        return ingenicoCardSwipper.readCard();
    }
}
