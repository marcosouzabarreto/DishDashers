import java.util.Random;
import java.util.Stack;

public class Cliente {

    private final int orderSize;

    public Cliente (int orderSize) {
        this.orderSize = orderSize;
    }

    public int getOrderSize() {
        return orderSize;
    }

    public Stack<String> getBeverage() {
        String[] colorOptions = {"VERMELHO", "VERDE", "AMARELO", "AZUL", "MAGENTA", "CYAN"};
        Random randomizer = new Random();

        Stack<String> beverage = new Stack<>();
        for (int i=0; i < orderSize; i++) {
            /*
            * Pushes a new color for the drink
            getting a random color within the colorOptions array
            */
            beverage.push(colorOptions[randomizer.nextInt(colorOptions.length)]);
        }
        return beverage;
    }

}
