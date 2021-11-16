
package ujcar.controle;

import ujcar.controle.Freio;
import ujcar.controle.Motor;

public class Veiculo {
  //Atributos da classe
    private String cor = "";
    private String marca = "";
    private Integer velocidade = 0;
    
    //Associação em OO
    private Motor motor;
    private Freio freio;

    //Método que printa no console os atributos do objeto.
    public void mostraTudo(){
       //Printa no console a cor armazenada no objeto.
       System.out.println(this.cor);
       System.out.println(this.marca);
       System.out.println(this.velocidade);
    }
    
    //Método que acelera
    public void andar1(){
        setVelocidade(getVelocidade() + getMotor().aceleracao());
        System.out.println("Bi bi");
    }

    //Método que freia
    public void pda(){
        setVelocidade(getpda().desaceleracao(getVelocidade()));
    }    
    
    //Método que para o veiculo
    public void parar(){
        //Utilizamos o this para referenciar a variável do objeto e não o parâmetro.
        this.velocidade = 0;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Freio getpda() {
        return freio;
    }

    public void setFreio(Freio freio) {
        this.freio = freio;
    }
    
    
}
