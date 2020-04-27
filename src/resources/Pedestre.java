package resources;

public class Pedestre {
    private Double custoPedagio = 0.0;

    public Pedestre() {
    }

    public Pedestre(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }

    public Double calcularPedagio() {
        return custoPedagio;
    }

    public void setCustoPedagio(Double custoPedagio) {
        this.custoPedagio = custoPedagio;
    }
}
