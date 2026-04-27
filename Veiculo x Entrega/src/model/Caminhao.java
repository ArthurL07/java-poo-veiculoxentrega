package model;

public class Caminhao extends Veiculo {

   private int quantidadesEixos;
   private boolean possuiBau;

   public Caminhao(String modelo, double capacidadeCarga, int quantidadeEixos, boolean possuiBau){
       super(modelo, capacidadeCarga);
       this.quantidadesEixos = quantidadeEixos;
       this.possuiBau = possuiBau;
   }

    @Override
    public String toString() {
        return "----Caminhao----" + "\n" +
                "Quantidades Eixos:" + quantidadesEixos + "\n" +
                "Báu:" + possuiBau;
    }
}
