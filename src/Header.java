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
        Fjalp2.getTerminal().escrevaln("                                      //                            ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+2, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                                    //                        ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+3, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                                  //                        ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+4, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                                //                        ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+5, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                        _______||                      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+6, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                   ,-'''       ||`-.                   ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+7, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  (            ||   )                      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+8, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |`-..._______,..-'|                   ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+9, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |            ||   |                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+10, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |     _______||   |                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+11, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |,-'''_ _  ~ ||`-.|                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+12, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |~ / `-.\\ ,-'\\ ~|                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+13, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |`-...___/___,..-'|                      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+14, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  |   `-./-'_ \\/_| |                      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+15, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  | -'  ~~     || -.|");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+16, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                  (   ~      ~   ~~ )                      ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx()+17, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("                   `-..._______,..-'                       ");
    }
   
    
}
