public class Restaurante {
    private final int posinicialx;
    private final int posinicialy;

    public Restaurante(int posinicialx, int posinicialy){
        this.posinicialx = posinicialx;
        this.posinicialy = posinicialy;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void desenhaRestaurante(int pontuacao){
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln("    00000000000000000000000000000000000000000000000000000000000000000000000       Pontuacao atual:" + pontuacao + " | Digite ESC para voltar ao menu");
        Fjalp2.getTerminal().escrevaln("    00                                                                   00                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_RED + " ||-.|| " + ANSI_RESET +"              00                      ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_RED + " ||__|| " + ANSI_RESET +"              00                      ");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                   000000000000000000000000000000000000000000");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_GREEN + " ||-.|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_GREEN + " ||__|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_YELLOW + " ||-.|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_YELLOW + " ||__|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00.   "+ ANSI_RED +"  ___________"+ ANSI_RESET +"        000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00.   "+ ANSI_RED +" |           | "+ ANSI_RESET+"      000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00.   "+ ANSI_RED +"|             |"+ ANSI_RESET+"      000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00.   "+ ANSI_RED +" |___________| "+ ANSI_RESET+"      000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00.                        000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                   00                           ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_BLUE + " ||`-|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_BLUE + " ||__|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                   00                                        ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_PURPLE + " ||`-|| " + ANSI_RESET +"              00                   00");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_PURPLE + " ||__|| " + ANSI_RESET +"              00                   000000000000000000000000000000000000000000");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       00                          00                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_CYAN + " ||`-|| " + ANSI_RESET +"              00                     ");
        Fjalp2.getTerminal().escrevaln("    00                                       00    " + ANSI_CYAN + " ||__|| " + ANSI_RESET +"              00                     ");
        Fjalp2.getTerminal().escrevaln("    00                                       000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                                                   00                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                   0000000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                   000    "+ ANSI_WHITE +" |     |  |  |  |   |"+ ANSI_RESET +"   000                               ");
        Fjalp2.getTerminal().escrevaln("    00                                   000    "+ ANSI_WHITE +" |     |   ||   |   |"+ ANSI_RESET +"   000                               ");
        Fjalp2.getTerminal().escrevaln("    00                                   000    "+ ANSI_WHITE +" |___  |  /  \\  |___|"+ ANSI_RESET +"   000                               ");
        Fjalp2.getTerminal().escrevaln("    00                                   0000000000000000000000000000000000                                                             ");
        Fjalp2.getTerminal().escrevaln("    00                                                                   00                                                             ");
        Fjalp2.getTerminal().escrevaln("    00000000000000000000000000000000000000000000000000000000000000000000000                                                             ");
    }

    public int getPosinicialx() {
        return posinicialx;
    }

    public int getPosinicialy() {
        return posinicialy;
    }

}
