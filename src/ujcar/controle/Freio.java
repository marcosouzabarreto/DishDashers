
package ujcar.controle;

public class Freio {
   
    private Double resistencia;
    
    //Construtor
    public Freio(Double resistencia){
        setResistencia(resistencia);
    }

    public int desaceleracao(int velocidade){
        //Checando se o carro parou
        return (int)((velocidade < 10) ?  velocidade : Math.round(velocidade * this.resistencia));
    }
    
    // Gets e sets 
    public Double getResistencia(){
        return this.resistencia;
    }
    
    public void setResistencia(Double resistencia){
        if(resistencia > 1){
            System.out.println("Cara nao da pra ser maior que um ne nao?");
        }else{
            this.resistencia = resistencia;
        } 
    }
}
