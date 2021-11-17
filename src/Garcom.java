public class Garcom {

  private int pos;

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
    Fjalp2.getTerminal().setPosicaoCursor(x, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" || ||  ||||   //");
    Fjalp2.getTerminal().setPosicaoCursor(x + 1, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" ||"+ pos +"|||||||||||");
    Fjalp2.getTerminal().setPosicaoCursor(x + 2, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" || ||  |||||  \\\\");
  }

  public Garcom(int pos) {
    this.setPos(pos);
  }

  public int getPos() {
    return pos;
  }

  public void setPos(int pos) {
    this.pos = pos;
  }
}
