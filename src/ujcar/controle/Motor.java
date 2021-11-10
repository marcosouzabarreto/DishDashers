package ujcar.controle;

public class Motor {
 
    private int potencia;
    
    //Construtor do motor
    public Motor(int potencia){
        this.potencia = potencia;
    }
    
    public int aceleracao(){
        return Math.round(potencia/10);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    
}
