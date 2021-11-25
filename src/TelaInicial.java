import java.util.Objects;

public class TelaInicial extends Componente implements Tela {
  private int fase;
  private int pontuacao = 0;

  public TelaInicial (int fase, int pontuacao) {
    this.pontuacao = pontuacao;
    this.fase = fase;
  }

  @Override
  public void imprimir() {
    int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
    int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();

    new Header(CorFundo.PRETO, CorFonte.AZUL, CorFonte.BRANCO, 4, 8).imprimir();

    if (getComponentselect() == 0) {
      new Botao(CorFonte.PRETO, CorFundo.CYAN, 5, 65, "Play").imprimir();
    } else {
      new Botao(CorFonte.CYAN, CorFundo.PRETO, 5, 65, "Play").imprimir();
    }

    if (getComponentselect() == 1) {
      new Botao(CorFonte.PRETO, CorFundo.CYAN, 10, 65, "Sobre").imprimir();
    } else {
      new Botao(CorFonte.CYAN, CorFundo.PRETO, 10, 65, "Sobre").imprimir();
    }

    if (getComponentselect() == 2) {
      new Botao(CorFonte.PRETO, CorFundo.CYAN, 15, 65, "Salvar").imprimir();
    } else {
      new Botao(CorFonte.CYAN, CorFundo.PRETO, 15, 65, "Salvar").imprimir();
    }

    if (getComponentselect() == 3) {
      new Botao(CorFonte.PRETO, CorFundo.CYAN, 20, 65, "Carregar").imprimir();
    } else {
      new Botao(CorFonte.CYAN, CorFundo.PRETO, 20, 65, "Carregar").imprimir();
    }

    Fjalp2.getTerminal().setPosicaoCursor(height - 3, 0);
    Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.CYAN);
    Fjalp2.getTerminal().escreva("Voce esta na fase " + this.fase);

    Fjalp2.getTerminal().setPosicaoCursor(height - 1, 0);
    Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.CYAN);
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
        if(this.fase == 1) {
          FaseUm fase = new FaseUm(height, width, pontuacao);
          Fjalp2.getTerminal().limparTela();
          Fjalp2.getTerminal().limparFundo();
          fase.iniciar();
        } else if (this.fase == 2) {
          FaseDois fase = new FaseDois(height, width, pontuacao);
          Fjalp2.getTerminal().limparTela();
          Fjalp2.getTerminal().limparFundo();
          fase.iniciar();
        } else if (this.fase == 3) {
          FaseTres fase = new FaseTres(height, width, pontuacao);
          Fjalp2.getTerminal().limparTela();
          Fjalp2.getTerminal().limparFundo();
          fase.iniciar();
        }
      }

      if (getComponentselect() == 1) {
        new TelaSobre(this.pontuacao).imprimir();
      }

      if (getComponentselect() == 2) {
        new SaveGame().save(fase);
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().setPosicaoCursor(height - 4, 0);
        Fjalp2.getTerminal().escreva("Jogo salvo com sucesso!");
        this.imprimir();
      }

      if (getComponentselect() == 3) {
        int loaded = new SaveGame().load();
        if(loaded != -1) {
          setFase(loaded);
          Fjalp2.getTerminal().limparTela();
          Fjalp2.getTerminal().setPosicaoCursor(height - 4, 0);
          Fjalp2.getTerminal().escreva("Jogo carregado para a fase " + this.fase);
        } else {
          Fjalp2.getTerminal().limparTela();
          Fjalp2.getTerminal().setPosicaoCursor(height - 4, 0);
          Fjalp2.getTerminal().escreva("Erro ao carregar fase");
        }
        this.imprimir();
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
