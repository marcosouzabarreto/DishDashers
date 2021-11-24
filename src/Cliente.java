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
