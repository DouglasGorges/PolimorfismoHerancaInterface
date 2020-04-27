package resources.veiculos;

import resources.Veiculo;

public class Bicicleta extends Veiculo{
    private Double custoPedagio = 0.0;

    public Bicicleta() {
    }

    public Bicicleta(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }

    public Double calcularPedagio() {
        return custoPedagio;
    }

    public void setCustoPedagio(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }
}
