public class DishDashers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().limparFundo();

        TelaInicial telainicial = new TelaInicial(1);
        telainicial.imprimircabecalho();
        telainicial.imprimir();

    }
    
}
