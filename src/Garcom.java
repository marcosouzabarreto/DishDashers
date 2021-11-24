import java.util.Stack;

public class Garcom {

  private int pos;

  private Stack<Integer> beverage;

  public void desenharGarcom(int pos) {
    switch (pos) {
      case 1: desenhar(2, pos);
        break;
      case 2: desenhar(6, pos);
        break;
      case 3: desenhar(10, pos);
        break;
      case 4: desenhar(15, pos);
        break;
      case 5: desenhar(20, pos);
        break;
      case 6: desenhar(24, pos);
        break;
      case 7: desenhar(28, pos);
        break;
      case 8: desenhar(34 , pos);
        break;
      default:
        break;
    }
  }

  public void desenhar(int x, int pos) {
    new Utils().drawBeverage(x, 29, this.beverage, false);
    Fjalp2.getTerminal().setPosicaoCursor(x, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("  ____");
    Fjalp2.getTerminal().setPosicaoCursor(x + 1, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" |    |");
    Fjalp2.getTerminal().setPosicaoCursor(x + 2, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("|      |");
    Fjalp2.getTerminal().setPosicaoCursor(x + 3, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("| (  ) |");
    Fjalp2.getTerminal().setPosicaoCursor(x + 4, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("|      |");
    Fjalp2.getTerminal().setPosicaoCursor(x + 5, 33);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" |____|");

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

  public void resetBeverage() {
    while (!this.beverage.empty()) {
      this.beverage.pop();
    }
  }

  public void handleInteraction(){
    if (pos == 8) {
      resetBeverage();
    }
    else {
      addIngredientToBeverage();
    }
  }

  public void addIngredientToBeverage () {
    if(this.beverage.size()<=4){
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
  }

}
