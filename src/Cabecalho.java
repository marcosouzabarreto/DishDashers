
public class Cabecalho extends Componente{

    @Override
    public void imprimir() {
        int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
        Fjalp2.getTerminal().setCor(CorFonte.PRETO ,CorFundo.CYAN);
        Fjalp2.getTerminal().setPosicaoCursor(0, 0);
        
        for (int i=0; i<=(width-9); i++){
            if (i==(width/2)) Fjalp2.getTerminal().escreva(" Dish Dashers ");
            Fjalp2.getTerminal().escreva(" ");
        }
    }
    
    
}
