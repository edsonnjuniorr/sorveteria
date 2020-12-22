import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Sundae extends Sorvete {
    private int custoDaCalda;
    private int custoTotal;
    private int valor;
    private String cobertura;

    public Sundae() {
        super();
    }

    public static void main(String[] args) {
        new Sundae();
    }

    public Sundae (int custoDaCalda, int custoTotal, int valor, String cobertura) {
        this.custoDaCalda = custoDaCalda;
        this.custoTotal = custoTotal;
        this.valor = valor;
        this.cobertura = cobertura;
    }

    public Sundae(String sorvete_de_flocos, int custoTotal, String calda_de_caramelo, int i) {
    }

    public int getCusto(){
        return custoTotal;
    }

    public int getCustoDaCalda(){
        return custoDaCalda;
    }

    public int getValor(){
        return valor;
    }

    public String getCobertura(){
        return cobertura;
    }

    @Override
    public String toString() {
        return String.format("Sundae de %s com\n%-25s %6s", getCobertura(),
                getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

    }

