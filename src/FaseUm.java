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
        Garcom barman = new Garcom(1);
        Restaurante restaurante = new Restaurante(0,0);

        restaurante.desenhaRestaurante();
        barman.desenharGarcom(barman.getPos());

        while(true){
            int tecla = Fjalp2.getTerminal().leiaTecla();

            // cima
            if(tecla==16){
                if(barman.getPos() > 1) {
                    barman.setPos(barman.getPos() - 1);
                    barman.desenharGarcom(barman.getPos());
                }
            }

            // Baixo
            if(tecla==14){
                if(barman.getPos() < 8) {
                    barman.setPos(barman.getPos() + 1);
                    barman.desenharGarcom(barman.getPos());
                }
            }

            // Esc
            if (tecla==27){
                new TelaInicial(1);
            }

            // Checagens

            Fjalp2.getTerminal().limparTela();

            restaurante.desenhaRestaurante();
            barman.desenharGarcom(barman.getPos());


            }
    }
    
}
