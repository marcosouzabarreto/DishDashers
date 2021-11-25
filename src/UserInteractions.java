public class UserInteractions {
    public void movimentarBarman(int tecla, Garcom barman) {
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

    }


}
