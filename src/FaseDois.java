import java.util.LinkedList;
import java.util.Stack;

public class FaseDois {
    int[][] espacos;
    int largura;
    int altura;
    int pontuacao;

    public FaseDois(int largura, int altura, int pontuacao) {
        espacos = new int[altura][largura];
        this.largura = largura;
        this.altura = altura;
        this.pontuacao = pontuacao;
    }

    private boolean handleDeliverBeverage(Stack<Integer> userBeverage, Stack<Integer> clientBeverage) {
        return new Utils().validateBeverageDelivery(userBeverage, clientBeverage);
    }

    public void iniciar(){
        Garcom barman = new Garcom(1);
        Cliente cliente1 = new Cliente(5);
        Cliente cliente2 = new Cliente(3);
        Cliente cliente3 = new Cliente(4);

        LinkedList<Cliente> activeClients = new LinkedList<>();

        activeClients.add(cliente1);
        activeClients.add(cliente2);
        activeClients.add(cliente3);

        Restaurante restaurante = new Restaurante(0,0);

        restaurante.desenhaRestaurante(pontuacao);

        for (int j = 0; j < activeClients.size(); j++) {
            activeClients.get(j).desenharCliente(j+1);
        }

        barman.desenharGarcom(barman.getPos());

        while(true){
            int tecla = Fjalp2.getTerminal().leiaTecla();

            if (tecla == Teclas.CIMA || tecla == Teclas.BAIXO)
                new UserInteractions().movimentarBarman(tecla, barman);


            if (tecla==Teclas.ESPACO) {
                if (barman.getPos() == 4){
                    if(handleDeliverBeverage(barman.getBeverage(), activeClients.get(0).getBeverage())) {
                        activeClients.remove();
                        pontuacao += 50;
                        barman.resetBeverage();
                    }
                } else {
                    barman.handleInteraction();
                }
            }

            if (tecla==Teclas.ESC){
                Fjalp2.getTerminal().limparTela();
                new TelaInicial(2, this.pontuacao).imprimir();
                break;
            }

            if (activeClients.isEmpty()) {
                Fjalp2.getTerminal().limparTela();
                new TelaInicial(3, this.pontuacao).imprimir();
                break;
            }

            Fjalp2.getTerminal().limparTela();

            restaurante.desenhaRestaurante(pontuacao);

            for (int j = 0; j < activeClients.size(); j++) {
                activeClients.get(j).desenharCliente(j+1);
            }

            barman.desenharGarcom(barman.getPos());


        }
    }
}
