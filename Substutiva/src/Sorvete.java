import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Sorvete extends ItemSobremesa {

    private int valor;
    private int custoTotal;
    private String name;

    public Sorvete() {
        super();
    }

    public static void main(String[] args) {
        new Sorvete();
    }

    public Sorvete(int valor, int custoTotal, String name) {
        this.valor = valor;
        this.custoTotal = custoTotal;
        this.name = name;

    }

    public Sorvete(String sorvete_de_baunilha, int custoTotal) {
    }

    public int getCusto(){
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

}
