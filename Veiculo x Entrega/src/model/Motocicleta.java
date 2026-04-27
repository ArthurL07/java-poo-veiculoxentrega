package model;

public class Motocicleta extends Veiculo {

    private int cilindradas;
    private boolean possuiBau;


    public Motocicleta(String modelo, double capacidadeCarga,int cilindradas, boolean possuiBau){
        super(modelo, capacidadeCarga);
        this.cilindradas = cilindradas;
        this.possuiBau = possuiBau;
    }

    @Override
    public String toString() {
        return "----Motocicleta----" + "\n" +
                "Cilindradas:" + cilindradas + "\n" +
                "Báu:" + possuiBau;
    }
}
