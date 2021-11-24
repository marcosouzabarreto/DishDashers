import java.util.Random;
import java.util.Stack;

public class Cliente {

    private final int orderSize;
    private final Stack<Integer> beverage;

    public Cliente (int orderSize) {
        this.orderSize = orderSize;
        this.beverage = createBeverage();
    }

    public int getOrderSize() {

        return orderSize;
    }

    public void desenharCliente(int pos) {
        switch (pos) {
            case 1: desenhar(98);
                break;
            case 2: desenhar(108);
                break;
            case 3: desenhar(118);
                break;
            default:
                break;
        }

    }

    public void desenhar(int x) {

        new Utils().drawBeverage(17-this.orderSize-2, x+2, this.beverage, true);
        Fjalp2.getTerminal().setPosicaoCursor(15, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln("  ____");
        Fjalp2.getTerminal().setPosicaoCursor(16, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln(" |    |");
        Fjalp2.getTerminal().setPosicaoCursor(17, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln("|      |");
        Fjalp2.getTerminal().setPosicaoCursor(18, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln("| (  ) |");
        Fjalp2.getTerminal().setPosicaoCursor(19, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln("|      |");
        Fjalp2.getTerminal().setPosicaoCursor(20, x);
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        Fjalp2.getTerminal().escrevaln(" |____|");
    }


    public Stack<Integer> createBeverage() {

        Integer[] colorOptions = { CorFonte.VERMELHO, CorFonte.VERDE,
                CorFonte.AMARELO, CorFonte.AZUL, CorFonte.MAGENTA, CorFonte.CYAN };
        Random randomizer = new Random();

        Stack<Integer> beverage = new Stack<>();
        for (int i=0; i < orderSize; i++) {
            /*
            * Pushes a new color for the drink
            getting a random color within the colorOptions array
            */
            beverage.push(colorOptions[randomizer.nextInt(colorOptions.length)]);
        }
        return beverage;
    }

    // Getters and Setters

    public Stack<Integer> getBeverage() {
        return beverage;
    }
}
