
public class Botao extends Componente {

    public Botao(int corlinha, int corsombreamento, int posinicialx, int posinicialy, String texto) {
        this.setPosinicialx(posinicialx);
        this.setPosinicialy(posinicialy);
        this.setTexto(texto);
        this.setCorsombreamento(corsombreamento);
        this.setCorlinha(corlinha);
    }
    
    @Override
    public void imprimir(){
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setCor(this.getCorlinha(), CorFonte.PRETO);
        Fjalp2.getTerminal().escrevaln(" _________________ ");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("|                 |");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+2, this.getPosinicialy());
        
        int tamanhoespacos = 12-getTexto().length();
        
        for(int i=0; i<tamanhoespacos; i++) setTexto(getTexto()+" ");
        Fjalp2.getTerminal().escrevaln("|     "+getTexto()+"|");
        
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+3, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("|_________________|");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+4, this.getPosinicialy());
    }
}
