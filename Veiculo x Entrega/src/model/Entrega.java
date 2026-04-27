package model;

public class Entrega {

    private int idEntrega;
    private String descricao;
    private char situacao;
    private Veiculo veiculo;

    public static int proximoId = 0;

    public Entrega(String descricao){
        this.idEntrega = ++proximoId;
        this.descricao = descricao;
        this.situacao = 'A';
    }

    public boolean alocarVeiculo(Veiculo veiculo){

        if(this.veiculo == null && veiculo.getStatus() == 'D'){
            if(veiculo.alocar()){
                this.veiculo = veiculo;
                return true;
            }
        }
        return false;
    }

    public boolean iniciarEntrega(){
        if(veiculo != null && situacao == 'A'){
            situacao = 'E';
            return true;
        }
        return false;
    }

    public boolean finalizarEntrega(){
        if(this.situacao == 'E' && veiculo != null){
            situacao = 'C';
            return true;
        }
        return false;
    }
}
