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

    void handleDeliverBeverage() {

    }

    public void iniciar(){
        Garcom barman = new Garcom(1);
        Restaurante restaurante = new Restaurante(0,0);

        restaurante.desenhaRestaurante();
        barman.desenharGarcom(barman.getPos());

        while(true){
            int tecla = Fjalp2.getTerminal().leiaTecla();

            // cima
            if(tecla==Teclas.CIMA){
                if(barman.getPos() > 1) {
                    barman.setPos(barman.getPos() - 1);
                    barman.desenharGarcom(barman.getPos());
                }
            }

            // Baixo
            if(tecla==Teclas.BAIXO){
                if(barman.getPos() < 8) {
                    barman.setPos(barman.getPos() + 1);
                    barman.desenharGarcom(barman.getPos());
                }
            }

            if (tecla==Teclas.ESPACO) {
                if (barman.getPos() == 4){

                }
                barman.handleInteraction();
            }

            // Esc
            if (tecla==Teclas.ESC){
                new TelaInicial(1);
                break;
            }



            Fjalp2.getTerminal().limparTela();

            restaurante.desenhaRestaurante();
            barman.desenharGarcom(barman.getPos());


            }
    }
    
}
