
package ujcar.controle;

public class Moto extends Veiculo {
    
    //Método construtor de objetos
    public Moto(String cor, String marca, Motor motor, Freio freio){
        super.setCor(cor);
        super.setMarca(marca);
        super.setMotor(motor);
        super.setFreio(freio);
    }
    
}
