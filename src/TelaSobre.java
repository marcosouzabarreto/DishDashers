
public class TelaSobre extends Componente implements Tela{

    @Override
    public void imprimir() {
        Fjalp2.getTerminal().setCorFundo(CorFonte.PRETO);
        Fjalp2.getTerminal().limparFundo();
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().setPosicaoCursor(0, 0);
        
        int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
        int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
        
        imprimircabecalho();
        new Header(CorFundo.PRETO,CorFonte.AZUL,CorFonte.BRANCO,4,8).imprimir();  
        
        new CaixaSobre(CorFundo.PRETO,CorFonte.AZUL, 5, 65).imprimir();
        
        Fjalp2.getTerminal().setPosicaoCursor(height-1, 0);
        
        Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("Pressione enter para voltar a tela inicial!");
        int tecla = Fjalp2.getTerminal().leiaTecla();
        
        if(tecla==13){
            Fjalp2.getTerminal().limparTela();
            Fjalp2.getTerminal().limparFundo();
            new TelaInicial(1).imprimir();
        }else{
            this.imprimir();
        }
        
    }

    @Override
    public void imprimircabecalho() {
        new Cabecalho().imprimir();
    }

    @Override
    public void resetCursorPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
