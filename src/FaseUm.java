
import static java.lang.Boolean.FALSE;
import java.util.Random;
import ujcar.controle.Carro;
import ujcar.controle.Freio;
import ujcar.controle.Motor;
import ujcar.controle.Energetico;

public class FaseUm {
    int[][] espacos;
    int largura;
    int altura;
    int pontuacao;
    int y_passos = 0;
    int x_passos = 0;
    int count_passos=0;
    
    public FaseUm(int largura, int altura) {
        espacos = new int[altura][largura];
        this.largura = largura;
        this.altura = altura;
        this.pontuacao = 200;
    }
    
    public void iniciar(){
        int largura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
            int altura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
            Carro barman = new Carro("Azul","Porshe", new Motor(470), new Freio(0.4), new Energetico());
            FaseUm fase = new FaseUm(altura_tela, largura_tela);

            while(true){
                int tecla = Fjalp2.getTerminal().leiaTecla();

                //para cima
                if(tecla==14){
                    barman.setX(barman.getX()+1);
                }

                //para baixo
                if(tecla==16){
                    barman.setX(barman.getX()-1);
                }

                // direita
                if(tecla==6){
                    barman.setY(barman.getY()+1);
                }

                // esquerda
                if(tecla==2){
                    barman.setY(barman.getY()-1);
                }

                //Checagens
                if(barman.getY()<3){
                    barman.setY(4);
                }

                if(barman.getY()>largura_tela-3){
                    barman.setY(largura_tela-3);
                }

                if(barman.getX()<3){
                    barman.setX(3);
                }

                if(barman.getX()> altura_tela-1){
                    barman.setX(altura_tela-1);
                }

                Fjalp2.getTerminal().limparTela();
                if(fase.geraGAS(barman)==1){
                    Fjalp2.getTerminal().limparTela();
                    Fjalp2.getTerminal().setPosicaoCursor(0, 0);
                    Fjalp2.getTerminal().escreva("Voce acabou a Fase. Sua pontuacao foi " + fase.pontuacao);
                    
                    Fjalp2.getTerminal().escreva("Pressione enter para voltar a tela inicial!");
                    tecla = Fjalp2.getTerminal().leiaTecla();

                    if(tecla==13){
                        Fjalp2.getTerminal().limparTela();
                        Fjalp2.getTerminal().limparFundo();
                        new TelaInicial().imprimir();
                    }else{
                        break;
                    }
                    
                }

                Fjalp2.getTerminal().setPosicaoCursor(barman.getX(), barman.getY());
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva(barman.imprimir());




    //            try { Thread.sleep (150); } catch (InterruptedException ex) {}
            }
    }
        
    public int geraGAS(Carro car){
        int pegou = 0;
        Random sorteador = new Random();
        
        if (x_passos ==0 && y_passos==0){
            x_passos = sorteador.nextInt(largura - 3);
            
            if(x_passos<4){
                x_passos = 4;
            }
            
            y_passos = sorteador.nextInt(altura - 3);
            
            if(y_passos<4){
                y_passos = 4;
            }
        }
        
        pegou = (car.getX()== x_passos && car.getY()== y_passos)? 1 : 0;
        
        Fjalp2.getTerminal().setPosicaoCursor(x_passos, y_passos);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva('0');
            
        if(pegou==1){
            x_passos = sorteador.nextInt(largura - 3);
            y_passos = sorteador.nextInt(altura - 3);
            
            if(x_passos<4){
                x_passos = 4;
            }
            
            if(y_passos<4){
                y_passos = 4;
            }
            
            this.pontuacao+= 50 ;
            count_passos++;
            pegou=0;
        }else{
            this.pontuacao--;
        }
        
        Fjalp2.getTerminal().setPosicaoCursor(0, 0);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("Energia: " + String.valueOf(this.pontuacao));
        
        if(count_passos==5){
            return 1;
        }else{
            return 0;
        }
            
    }
    
    
}
