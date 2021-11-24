import java.util.Stack;

public class Garcom {

  private int pos;

  private Stack<Integer> beverage;

  public void desenharGarcom(int pos) {
    switch (pos) {
      case 1: desenhar(5, pos);
        break;
      case 2: desenhar(8, pos);
        break;
      case 3: desenhar(11, pos);
        break;
      case 4: desenhar(15, pos);
        break;
      case 5: desenhar(18, pos);
        break;
      case 6: desenhar(20, pos);
        break;
      case 7: desenhar(22, pos);
        break;
      case 8: desenhar(25, pos);
        break;
      default:
        break;
    }
  }

  public void desenhar(int x, int pos) {
    drawBeverage(x);
    Fjalp2.getTerminal().setPosicaoCursor(x, 18);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" || ||  ||||   //");
    Fjalp2.getTerminal().setPosicaoCursor(x + 1, 18);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" ||"+ pos +"|||||||||||");
    Fjalp2.getTerminal().setPosicaoCursor(x + 2, 18);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" || ||  |||||  \\\\");
  }

  public Garcom(int pos) {
    this.setPos(pos);
    this.beverage = new Stack<>();
  }

  // Getters and setters

  public int getPos() {
    return pos;
  }

  public void setPos(int pos) {
    this.pos = pos;
  }

  public Stack<Integer> getBeverage(){
    return this.beverage;
  }

  public void handleInteraction(){
    if (pos == 8) {
      // Remove all ingredients from beverage
      while (!this.beverage.empty()) {
        this.beverage.pop();
      }
    }
    else {
      addIngredientToBeverage();
    }
  }

  public void addIngredientToBeverage () {
    switch (pos) {
      case 1:
        this.beverage.push(CorFonte.VERMELHO);
        break;
      case 2:
        this.beverage.push(CorFonte.VERDE);
        break;
      case 3:
        this.beverage.push(CorFonte.AMARELO);
        break;
      case 5:
        this.beverage.push(CorFonte.AZUL);
        break;
      case 6:
        this.beverage.push(CorFonte.MAGENTA);
        break;
      case 7:
        this.beverage.push(CorFonte.CYAN);
        break;
      default:
        break;
    }
  }

  public void drawBeverage(int x) {
  int offset = 2;
    Fjalp2.getTerminal().setPosicaoCursor(x + this.beverage.size() + 1 - offset, 10);
    Fjalp2.getTerminal().escreva("|--|");
    for (int j = 0; j < this.beverage.size(); j++) {
      Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
      Fjalp2.getTerminal().setPosicaoCursor(x + this.beverage.size() - j - offset, 10);
      Fjalp2.getTerminal().escrevaln("|");
      Integer ingredientColor = this.beverage.elementAt(j);
      Fjalp2.getTerminal().setCorFonte(ingredientColor);
      Fjalp2.getTerminal().setPosicaoCursor(x + this.beverage.size() - j - offset, 11);
      Fjalp2.getTerminal().escrevaln("X");
      Fjalp2.getTerminal().setPosicaoCursor(x + this.beverage.size() - j - offset, 12);
      Fjalp2.getTerminal().escrevaln("X");
      Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
      Fjalp2.getTerminal().setPosicaoCursor(x + this.beverage.size() - j - offset, 13);
      Fjalp2.getTerminal().escrevaln('|');
    }
  }

}
