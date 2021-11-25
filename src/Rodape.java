public class Rodape extends Componente{

    @Override
    public void imprimir() {
        
        int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
        int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
        
        Fjalp2.getTerminal().setCor(CorFonte.PRETO ,CorFundo.CYAN);
        Fjalp2.getTerminal().setPosicaoCursor(height, 0);
        
        for (int i=0; i<=(width-1); i++){
            Fjalp2.getTerminal().escreva(" ");
        }
    }
    
    
}
