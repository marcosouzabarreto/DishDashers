public class Restaurante {
    private final int posinicialx;
    private final int posinicialy;

    public Restaurante(int posinicialx, int posinicialy){
        this.posinicialx = posinicialx;
        this.posinicialy = posinicialy;
    }

    public void desenhaRestaurante(){
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("    •••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                                         ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                                         ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••.           •••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                                         ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          ••             ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                          •••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                                                         ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                          •••••••••••••••••••••••••••••••••             ");
        Fjalp2.getTerminal().escrevaln("    ••                          •••          ▀                 ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                          •••     █    █  ▀█ █▀ █▀▀█     ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                          •••     █    █   █•█  █  █     ••             ");
        Fjalp2.getTerminal().escrevaln("    ••                          •••     ▀▀▀  ▀  ▀▀ ▀▀ ▀▀▀▀     ••             ");
        Fjalp2.getTerminal().escrevaln("    •••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••             ");
    }

    public int getPosinicialx() {
        return posinicialx;
    }

    public int getPosinicialy() {
        return posinicialy;
    }

}
