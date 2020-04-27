package resources.veiculos;

import resources.Veiculo;

public class Carro  extends Veiculo {
    private Double custoPedagio = 2.7;

    public Carro() {
    }

    public Carro(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }

    public Double calcularPedagio(){
        return custoPedagio;
    }

    public void setCustoPedagio(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }
}
