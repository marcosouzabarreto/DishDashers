package ujcar.controle;

public class Garcom1  extends Veiculo {
    
    private Energetico turbo;
    
    private int x;
    private int y;
    
    //Método que faz o garcom andar
    //Sobrescrita
    public void andar1(){
            super.setVelocidade(getVelocidade() + this.turbo.turbinar(super.getMotor().aceleracao()));
            System.out.println("Vrum vrum");
    }
    
    //Sobrecarga
    public void acelerar(Boolean usarturbo){
        if(usarturbo){
            super.setVelocidade(getVelocidade() + this.turbo.turbinar(super.getMotor().aceleracao()));
        }else{
            super.andar1();
        }
    }
    
    //Método construtor de objetos
    public Garcom1(String cor, String marca, Motor motor, Freio freio, Energetico turbo){
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

    public Energetico getTurbo() {
        return turbo;
    }

    public void setTurbo(Energetico turbo) {
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
