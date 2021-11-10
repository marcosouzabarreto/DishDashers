public abstract class Componente {
    
    private int Corsombreamento;
    private int Corlinha;
    private int Corfrontal;
    private int posinicialx;
    private int posinicialy;
    private String texto;
    private int componentselect = 0;
    
    public abstract void imprimir();
    
    public int getCorsombreamento() {
        return Corsombreamento;
    }

    public void setCorsombreamento(int Corsombreamento) {
        this.Corsombreamento = Corsombreamento;
    }

    public int getCorlinha() {
        return Corlinha;
    }

    public void setCorlinha(int Corlinha) {
        this.Corlinha = Corlinha;
    }

    public int getCorfrontal() {
        return Corfrontal;
    }

    public void setCorfrontal(int Corfrontal) {
        this.Corfrontal = Corfrontal;
    }

    public int getPosinicialx() {
        return posinicialx;
    }

    public void setPosinicialx(int posinicialx) {
        this.posinicialx = posinicialx;
    }

    public int getPosinicialy() {
        return posinicialy;
    }

    public void setPosinicialy(int posinicialy) {
        this.posinicialy = posinicialy;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getComponentselect() {
        return componentselect;
    }

    public void setComponentselect(int componentselect) {
        this.componentselect = componentselect;
    }
    
    
}
