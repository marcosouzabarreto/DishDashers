
public class CaixaSobre extends Componente{

    public CaixaSobre(int corlinha, int corsombreamento, int posinicialx, int posinicialy) {
        this.setPosinicialx(posinicialx);
        this.setPosinicialy(posinicialy);
        this.setCorsombreamento(corsombreamento);
        this.setCorlinha(corlinha);
    }

    @Override
    public void imprimir() {
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setCor(CorFundo.CYAN, CorFonte.PRETO);
        Fjalp2.getTerminal().escreva("                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("       AUTORES       ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+2, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+5, this.getPosinicialy());
        Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("   Marco Barreto     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+6, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("   Pedro Wilker      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+7, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("   Helder Amaral     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+8, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("   Arthur Calasans   ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+9, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("   Maria Sao Paulo   ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+10, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("   Victor Morais     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+11, this.getPosinicialy());

    }
    
}
