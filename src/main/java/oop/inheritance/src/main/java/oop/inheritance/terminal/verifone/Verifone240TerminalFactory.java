package oop.inheritance.terminal.verifone;
import oop.inheritance.terminal.*;

public class Verifone240TerminalFactory extends TerminalFactory {
    @Override
    public Display getDisplay() {
        return new DisplayAdapter();
    }

    @Override
    public Keyboard getKeyboard() {
        return new KeyboardAdapter();
    }

    @Override
    public Printer getPrinter() {
        return new PrinterAdapter();
    }

    @Override
    public CardSwipper getCardSwipper() { return null; }

    @Override
    public ChipReader getChipReader() { return null;}

    @Override
    public Ethernet getEthernet() { return null; }

    @Override
    public Modem getModem() { return null;}

    @Override
    public GPS getGPS() { return null; }
}
