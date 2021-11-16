
package ujcar.controle;

public class Freio {
   
    private Double resistencia;
    
    //Construtor
    public Freio(Double resistencia){
        setResistencia(resistencia);
    }

    public int desaceleracao(int velocidade){
        //Checando se o garcom parou
        return (int)((velocidade < 10) ?  velocidade : Math.round(velocidade * this.resistencia));
    }
    
    // Gets e sets 
    public Double getResistencia(){
        return this.resistencia;
    }
    
    public void setResistencia(Double resistencia){
        if(resistencia > 1){
            System.out.println("E essa resistencia ai pai *-*");
        }else{
            this.resistencia = resistencia;
        } 
    }
}
