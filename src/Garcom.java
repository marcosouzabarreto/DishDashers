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
    Fjalp2.getTerminal().escrevaln(" xxxxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 1, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("x   " + pos + "   x");
    Fjalp2.getTerminal().setPosicaoCursor(x + 2, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("x      x");
    Fjalp2.getTerminal().setPosicaoCursor(x + 3, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln(" xxxxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 4, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("   xx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 5, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("   xx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 6, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("  xxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 7, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("  xxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 8, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("  xxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 9, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("  xxxx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 10, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escrevaln("   xx");
    Fjalp2.getTerminal().setPosicaoCursor(x + 11, 8);
    Fjalp2.getTerminal().setCor(CorFonte.BRANCO, CorFundo.PRETO);
    Fjalp2.getTerminal().escreva("   xx");
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
