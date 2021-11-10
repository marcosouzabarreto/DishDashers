
import static java.lang.Boolean.FALSE;
import java.util.Random;
import ujcar.controle.Carro;
import ujcar.controle.Freio;
import ujcar.controle.Motor;
import ujcar.controle.Turbo;

public class FaseUm {
    int[][] espacos;
    int largura;
    int altura;
    int pontuacao;
    int y_gas = 0;
    int x_gas = 0;
    int count_gas=0;
    
    public FaseUm(int largura, int altura) {
        espacos = new int[altura][largura];
        this.largura = largura;
        this.altura = altura;
        this.pontuacao = 200;
    }
    
    public void iniciar(){
        int largura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
            int altura_tela = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();
            Carro carrodopedro = new Carro("Azul","Porshe", new Motor(470), new Freio(0.4), new Turbo());
            FaseUm fase = new FaseUm(altura_tela, largura_tela);

            while(true){
                int tecla = Fjalp2.getTerminal().leiaTecla();

                //para cima
                if(tecla==14){
                    carrodopedro.setX(carrodopedro.getX()+1);
                }

                //para baixo
                if(tecla==16){
                    carrodopedro.setX(carrodopedro.getX()-1);
                }

                // direita
                if(tecla==6){
                    carrodopedro.setY(carrodopedro.getY()+1);
                }

                // esquerda
                if(tecla==2){
                    carrodopedro.setY(carrodopedro.getY()-1);
                }

                //Checagens
                if(carrodopedro.getY()<3){
                    carrodopedro.setY(4);
                }

                if(carrodopedro.getY()>largura_tela-3){
                    carrodopedro.setY(largura_tela-3);
                }

                if(carrodopedro.getX()<3){
                    carrodopedro.setX(3);
                }

                if(carrodopedro.getX()> altura_tela-1){
                    carrodopedro.setX(altura_tela-1);
                }

                Fjalp2.getTerminal().limparTela();
                if(fase.geraGAS(carrodopedro)==1){
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

                Fjalp2.getTerminal().setPosicaoCursor(carrodopedro.getX(), carrodopedro.getY());
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva(carrodopedro.imprimir());




    //            try { Thread.sleep (150); } catch (InterruptedException ex) {}
            }
    }
        
    public int geraGAS(Carro car){
        int pegou = 0;
        Random sorteador = new Random();
        
        if (x_gas ==0 && y_gas==0){
            x_gas = sorteador.nextInt(largura - 3);
            
            if(x_gas<4){
                x_gas = 4;
            }
            
            y_gas = sorteador.nextInt(altura - 3);
            
            if(y_gas<4){
                y_gas = 4;
            }
        }
        
        pegou = (car.getX()== x_gas && car.getY()== y_gas)? 1 : 0;
        
        Fjalp2.getTerminal().setPosicaoCursor(x_gas, y_gas);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva('0');
            
        if(pegou==1){
            x_gas = sorteador.nextInt(largura - 3);
            y_gas = sorteador.nextInt(altura - 3);
            
            if(x_gas<4){
                x_gas = 4;
            }
            
            if(y_gas<4){
                y_gas = 4;
            }
            
            this.pontuacao+= 50 ;
            count_gas++;
            pegou=0;
        }else{
            this.pontuacao--;
        }
        
        Fjalp2.getTerminal().setPosicaoCursor(0, 0);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("COMBUSTIVEL: " + String.valueOf(this.pontuacao));
        
        if(count_gas==5){
            return 1;
        }else{
            return 0;
        }
            
    }
    
    
}
