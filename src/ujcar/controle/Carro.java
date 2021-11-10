package ujcar.controle;

public class Carro  extends Veiculo {
    
    private Turbo turbo;
    
    private int x;
    private int y;
    
    //Método que acelera o carro
    //Sobrescrita
    public void acelerar(){
            super.setVelocidade(getVelocidade() + this.turbo.turbinar(super.getMotor().aceleracao()));
            System.out.println("Vrum vrum");
    }
    
    //Sobrecarga
    public void acelerar(Boolean usarturbo){
        if(usarturbo){
            super.setVelocidade(getVelocidade() + this.turbo.turbinar(super.getMotor().aceleracao()));
        }else{
            super.acelerar();
        }
    }
    
    //Método construtor de objetos
    public Carro(String cor, String marca, Motor motor, Freio freio, Turbo turbo){
        super.setCor(cor);
        super.setMarca(marca);
        super.setMotor(motor);
        super.setFreio(freio);
        this.turbo = turbo;
        this.setX(0);
        this.setY(0);
    }
    
    public String imprimir(){
        return "#"; 
    }

    public Turbo getTurbo() {
        return turbo;
    }

    public void setTurbo(Turbo turbo) {
        this.turbo = turbo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
