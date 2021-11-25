import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class FaseUm {
    int[][] espacos;
    int largura;
    int altura;
    int pontuacao;

    public FaseUm(int largura, int altura) {
        espacos = new int[altura][largura];
        this.largura = largura;
        this.altura = altura;
        this.pontuacao = 0;
    }

    private boolean handleDeliverBeverage(Stack<Integer> userBeverage, Stack<Integer> clientBeverage) {
        return new Utils().validateBeverageDelivery(userBeverage, clientBeverage);
    }

    public void iniciar(){
        Garcom barman = new Garcom(1);
        Cliente cliente1 = new Cliente(3);
        Cliente cliente2 = new Cliente(4);

        LinkedList<Cliente> activeClients = new LinkedList<>();

        activeClients.add(cliente1);
        activeClients.add(cliente2);

        Restaurante restaurante = new Restaurante(0,0);

        restaurante.desenhaRestaurante();

        for (int j = 0; j < activeClients.size(); j++) {
            activeClients.get(j).desenharCliente(j+1);
        }

        barman.desenharGarcom(barman.getPos());

        while(true){
            int tecla = Fjalp2.getTerminal().leiaTecla();

            // cima
            if(tecla==Teclas.CIMA){
                if(barman.getPos() > 1) {
                    barman.setPos(barman.getPos() - 1);
                }
            }

            // Baixo
            if(tecla==Teclas.BAIXO){

                if(barman.getPos() < 8) {
                    barman.setPos(barman.getPos() + 1);
                }
            }

            if (tecla==Teclas.ESPACO) {
                if (barman.getPos() == 4){
                    if(handleDeliverBeverage(barman.getBeverage(), activeClients.get(0).getBeverage())) {
                        activeClients.remove();
                        barman.resetBeverage();
                    }
                } else {
                    barman.handleInteraction();
                }
            }

            // Esc
            if (tecla==Teclas.ESC){
                new TelaInicial(1);
                break;
            }

            Fjalp2.getTerminal().limparTela();

            restaurante.desenhaRestaurante();

            for (int j = 0; j < activeClients.size(); j++) {
                activeClients.get(j).desenharCliente(j+1);
            }

            barman.desenharGarcom(barman.getPos());
        }
    }
    
}
