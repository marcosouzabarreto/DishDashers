public class Header extends Componente{

    public Header(int corsombreamento, int corlinha, int corfrontal, int posinicialx, int posinicialy) {
        this.setCorsombreamento(corsombreamento);
        this.setCorfrontal(corfrontal);
        this.setCorlinha(corlinha);
        this.setPosinicialx(posinicialx);
        this.setPosinicialy(posinicialy);
    }
    
    //Sobreescrita
    @Override
    public void imprimir(){
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+1, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("           XXXXXXXXXXX      XXXXXXXXXXX                           ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+2, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX        XX    XXX        XX                          ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+3, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX         XX   XXX         XX                         ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+4, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX          XX  XXX          XX                        ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+5, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX           XX XXX           XX                       ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+6, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX           XX XXX           XX                       ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+7, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("          XXX        XX    XXX        XX                          ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+8, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("           XXXXXXXXXXX      XXXXXXXXXXX                           ");
    }
   
    
}
