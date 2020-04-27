package resources.veiculos;

import resources.Veiculo;

public class Caminhao extends Veiculo {
    private Double custoPorEixo = 2.7;

    public Caminhao() {
    }

    public Caminhao(double custoPorEixo) {
        this.custoPorEixo = custoPorEixo;
    }

    public Caminhao(Integer eixos, double custoPorEixo) {
        super(eixos);
        this.custoPorEixo = custoPorEixo;
    }

    public Double calcularPedagio(){
        return super.getEixos() * this.custoPorEixo;
    }

    public Double getCustoPorEixo() {
        return custoPorEixo;
    }

    public void setCustoPorEixo(Double custoPorEixo) {
        this.custoPorEixo = custoPorEixo;
    }
}
