package application;

import resources.Veiculo;
import resources.veiculos.Caminhao;

public class Toll {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao();
        caminhao.setEixos(2);
        System.out.println(caminhao.calcularPedagio());
    }
}
