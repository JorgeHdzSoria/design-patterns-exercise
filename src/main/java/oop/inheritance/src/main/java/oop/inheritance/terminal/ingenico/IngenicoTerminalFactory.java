package oop.inheritance.terminal.ingenico;
import oop.inheritance.terminal.*;

public class IngenicoTerminalFactory extends TerminalFactory {
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
    public CardSwipper getCardSwipper() {
        return new CardSwipperAdapter();
    }

    @Override
    public ChipReader getChipReader() {
        return new ChipReaderAdapter();
    }

    @Override
    public Ethernet getEthernet() { return new EthernetAdapter(); }

    @Override
    public Modem getModem() { return new ModemAdapter(); }

    @Override
    public GPS getGPS() { return new GPSAdapter(); }
}
