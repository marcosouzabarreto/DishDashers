package dishdashers.controle;

public class Garcom {

    private int y;
    
    //Método que faz o garcom andar
    //Sobrescrita
    public void andar(int y){
            this.y = y;
    }

    
    //Método construtor de objetos
    public Garcom(){
        this.setY(0);
    }
    
    public String imprimir(){
        return "#"; 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
