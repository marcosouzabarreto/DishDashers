import dishdashers.controle.Garcom;

public class FaseUm {
    int[][] espacos;
    int largura;
    int altura;
    int pontuacao;
    
    public FaseUm(int largura, int altura) {
        espacos = new int[altura][largura];
        this.largura = largura;
        this.altura = altura;
        this.pontuacao = 200;
    }
    
    public void iniciar(){
        int largura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
            int altura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
            FaseUm fase = new FaseUm(altura_tela, largura_tela);
            Garcom barman = new Garcom();

            while(true){
                int tecla = Fjalp2.getTerminal().leiaTecla();

                // Baixo
                if(tecla==14){
                    barman.setY(barman.getY()+1);
                }

                // Cima
                if(tecla==16){
                    barman.setY(barman.getY()-1);
                    break;
                }

                //Checagens
                if(barman.getY()<3){
                    barman.setY(4);
                }

                if(barman.getY()>largura_tela-3){
                    barman.setY(largura_tela-3);
                }


                Fjalp2.getTerminal().limparTela();

                Fjalp2.getTerminal().setPosicaoCursor(0, barman.getY());
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva(barman.imprimir());

    //            try { Thread.sleep (150); } catch (InterruptedException ex) {}
            }
    }
    
}
