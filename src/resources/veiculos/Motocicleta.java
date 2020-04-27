package resources.veiculos;

import resources.Veiculo;

public class Motocicleta  extends Veiculo {
    private Double custoPedagio = 1.35;

    public Motocicleta() {
    }

    public Motocicleta(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }

    public Double calcularPedagio() {
        return custoPedagio;
    }

    public void setCustoPedagio(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }
}
