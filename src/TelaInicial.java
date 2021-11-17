
public class TelaInicial extends Componente implements Tela {
  private int fase;

  public TelaInicial (int fase) {
    this.fase = fase;
  }

  @Override
  public void imprimir() {
    int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
    int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();

    new Header(CorFundo.PRETO, CorFonte.AZUL, CorFonte.BRANCO, 4, 8).imprimir();

    if (getComponentselect() == 0) {
      new Botao(CorFonte.PRETO, CorFundo.AMARELO, 5, 65, "Play").imprimir();
    } else {
      new Botao(CorFonte.AMARELO, CorFundo.PRETO, 5, 65, "Play").imprimir();
    }

    if (getComponentselect() == 1) {
      new Botao(CorFonte.PRETO, CorFundo.AMARELO, 10, 65, "Sobre").imprimir();
    } else {
      new Botao(CorFonte.AMARELO, CorFundo.PRETO, 10, 65, "Sobre").imprimir();
    }

    if (getComponentselect() == 2) {
      new Botao(CorFonte.PRETO, CorFundo.AMARELO, 15, 65, "Salvar").imprimir();
    } else {
      new Botao(CorFonte.AMARELO, CorFundo.PRETO, 15, 65, "Salvar").imprimir();
    }

    if (getComponentselect() == 3) {
      new Botao(CorFonte.PRETO, CorFundo.AMARELO, 20, 65, "Carregar").imprimir();
    } else {
      new Botao(CorFonte.AMARELO, CorFundo.PRETO, 20, 65, "Carregar").imprimir();
    }


    Fjalp2.getTerminal().setPosicaoCursor(height - 1, 0);
    Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.AMARELO);
    Fjalp2.getTerminal().escreva("Navegue entre as opcoes com as setas e selecione com enter");

    int tecla = Fjalp2.getTerminal().leiaTecla();

    if (tecla == 14 && getComponentselect() < 3){
      setComponentselect(getComponentselect() + 1);
    } else if (tecla == 16 && getComponentselect() > 0) {
      setComponentselect(getComponentselect() - 1);
    }

    if (tecla == 13) {
      Fjalp2.getTerminal().limparTela();

      if (getComponentselect() == 0) {
        FaseUm fase = new FaseUm(height, width);
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().limparFundo();
        fase.iniciar();
      }

      if (getComponentselect() == 1) {
        new TelaSobre().imprimir();
      }

      if (getComponentselect() == 2) {
        SaveGame saveGame = new SaveGame(fase);
        saveGame.save();
      }

    } else if (tecla==27){
      Fjalp2.getTerminal().limparTela();
      Fjalp2.getTerminal().limparFundo();
      Fjalp2.getTerminal().setPosicaoCursor(0,0);
      System.exit(0);
    }
    else {
      Fjalp2.getTerminal().limparTela();
      this.imprimir();
    }

  }

  public int getFase() {
    return fase;
  }

  public void setFase(int fase) {
    this.fase = fase;
  }

  @Override
  public void imprimircabecalho() {
    new Cabecalho().imprimir();
  }

  @Override
  public void resetCursorPosition() {

  }

}
