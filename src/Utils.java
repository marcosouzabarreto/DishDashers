import java.util.Stack;

public class Utils {

    public boolean validateBeverageDelivery(
            Stack<Integer> userBeverage, Stack<Integer> clientBeverage
    ) {
        return userBeverage.equals(clientBeverage);
    }

    public void drawBeverage(int x, int y, Stack<Integer> beverage, boolean client) {
        Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
        int offset = client ? 2 : 0;
        Fjalp2.getTerminal().setPosicaoCursor(x + beverage.size() + 1 - offset, y);
        Fjalp2.getTerminal().escreva("|--|");
        for (int j = 0; j < beverage.size(); j++) {
            Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
            Fjalp2.getTerminal().setPosicaoCursor(x + beverage.size() - j - offset, y);
            Fjalp2.getTerminal().escrevaln("|");
            Integer ingredientColor = beverage.elementAt(j);
            Fjalp2.getTerminal().setCorFonte(ingredientColor);
            Fjalp2.getTerminal().setPosicaoCursor(x + beverage.size() - j - offset, y+1);
            Fjalp2.getTerminal().escrevaln("X");
            Fjalp2.getTerminal().setPosicaoCursor(x + beverage.size() - j - offset, y+2);
            Fjalp2.getTerminal().escrevaln("X");
            Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
            Fjalp2.getTerminal().setPosicaoCursor(x + beverage.size() - j - offset, y+3);
            Fjalp2.getTerminal().escrevaln('|');
        }
    }
}
