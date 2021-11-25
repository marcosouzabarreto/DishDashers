public class CongratulationsScreen {

    private final int posinicialx;
    private final int posinicialy;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public CongratulationsScreen(int posInicialX, int posInicialY){
        this.posinicialx = posInicialX;
        this.posinicialy = posInicialY;

    }

    public int getPosinicialx() {
        return posinicialx;
    }

    public int getPosinicialy() {
        return posinicialy;
    }

    public void imprimir(int pontuacao){
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln(" "+ ANSI_WHITE +" _____    _     _____    _            _____    _       _ ______      "+ ANSI_RESET +"   ");
        Fjalp2.getTerminal().escrevaln(" "+ ANSI_WHITE +" |   |   / \\   |   |   / \\   |____  |____   / \\    /  |_____      "+ ANSI_RESET +" ");
        Fjalp2.getTerminal().escrevaln(" "+ ANSI_WHITE +" |___|  /___\\  |   |  /___\\  |    | |      /   \\  /         |"+ ANSI_RESET +" ");
        Fjalp2.getTerminal().escrevaln(" "+ ANSI_WHITE +" |     /     \\ |   | /     \\ |____| |____ /     \\/    ______|   "+ ANSI_RESET +" ");
        Fjalp2.getTerminal().escrevaln("");
        Fjalp2.getTerminal().escrevaln("");
        Fjalp2.getTerminal().escrevaln("");
        Fjalp2.getTerminal().escrevaln("Pontuacao total: " + pontuacao);
        Fjalp2.getTerminal().escrevaln("Digite qualquer tecla para sair");

        int tecla = Fjalp2.getTerminal().leiaTecla();

        if(tecla!=-1) {
            Fjalp2.getTerminal().limparTela();
            System.exit(1);
        }
    }

}
