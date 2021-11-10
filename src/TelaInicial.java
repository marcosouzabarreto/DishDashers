
public class TelaInicial extends Componente implements Tela{
    
    @Override
    public void imprimir() {
        int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
        int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
        
        new Header(CorFundo.PRETO,CorFonte.AZUL,CorFonte.BRANCO,4,8).imprimir();
        
        if(getComponentselect() == 0){
            new Botao(CorFonte.PRETO,CorFundo.AMARELO, 5, 65, "Comecar").imprimir();
        }else{
            new Botao(CorFonte.AMARELO,CorFundo.PRETO, 5, 65, "Comecar").imprimir();
        }
        
        if(getComponentselect() == 1){
            new Botao(CorFonte.PRETO,CorFundo.AMARELO, 10, 65, "Sobre").imprimir();
        }else{
            new Botao(CorFonte.AMARELO,CorFundo.PRETO, 10, 65, "Sobre").imprimir();
        }
        
        
        Fjalp2.getTerminal().setPosicaoCursor(height-1, 0);
        Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("Navegue entre as opcoes com as setas e selecione com enter!");
        
        int tecla = Fjalp2.getTerminal().leiaTecla();
        
        if(getComponentselect() == 0 && tecla==14) setComponentselect(1);
        if(getComponentselect() == 1 && tecla==16) setComponentselect(0);
        
               
        if(tecla==13){
            Fjalp2.getTerminal().limparTela();
            
            if(getComponentselect()==0){
                FaseUm fase = new FaseUm(height,  width );
                Fjalp2.getTerminal().limparTela();
                Fjalp2.getTerminal().limparFundo();
                fase.iniciar();
            }
            
            if(getComponentselect()==1){
                new TelaSobre().imprimir();
            }
            
        }else{
            Fjalp2.getTerminal().limparTela();
            this.imprimir();
        }
        
    }

    @Override
    public void imprimircabecalho() {
        new Cabecalho().imprimir();
    }

    @Override
    public void resetCursorPosition() {
        
    }
    
}
