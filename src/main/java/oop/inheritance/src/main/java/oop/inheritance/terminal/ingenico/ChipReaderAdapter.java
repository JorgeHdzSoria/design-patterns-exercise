package oop.inheritance.terminal.ingenico;
import oop.inheritance.terminal.ChipReader;
import oop.library.ingenico.model.Card;
import oop.library.ingenico.services.IngenicoChipReader;

public class ChipReaderAdapter implements ChipReader {
    private final IngenicoChipReader ingenicoChipReader;

    public ChipReaderAdapter(){
        this.ingenicoChipReader = new IngenicoChipReader();
    }

    @Override
    public Card readCard() {
        return ingenicoChipReader.readCard();
    }
}
