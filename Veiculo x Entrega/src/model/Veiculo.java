package model;

public class Veiculo {

   private int idVeiculo;
   private String modelo;
   private double capacidadeCarga;
   private char status;
   private boolean alocado;

    public static int proximoID = 1000;

    public Veiculo(String modelo,double capacidadeCarga){
        this.idVeiculo = ++proximoID;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.status = 'D';
        this.alocado = false;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public char getStatus() {
        return status;
    }

    public boolean isAlocado() {
        return alocado;
    }

    public boolean alocar(){
        if(this.status == 'D'){
            alocado = true;
            status = 'O';
            return true;
        }else {
            return false;
        }
    }

    public boolean liberar(){
        if(this.status == 'O'){
            status = 'D';
            alocado = false;
            return true;
        }else{
            return false;
        }
    }

    public boolean enviarParaManutencao(){
        if(this.alocado == true){
            status = 'M';
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "----Veiculo----" +  "\n" +
                "Identificador:" + idVeiculo + "\n" +
                "Modelo:" + modelo + "\n" +
                "Carga Maxima:" + capacidadeCarga + "\n" +
                "Status:" + status + "\n" +
                "Alocado:" + alocado;
    }
}
