import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Cookie extends ItemSobremesa {
    private int numero;
    private int precoPorDuzia;
    private int custoTotal;
    private String name;

    public Cookie() {
        super(Objects.requireNonNull(null));
    }

    public static void main(String[] args) {
        new Cookie();
    }

    public Cookie (int numero, int precoPorDuzia, String name) {
       this.numero = numero;
       this.precoPorDuzia = precoPorDuzia;
       this.name = name;
    }

    public Cookie(String cookies_com_passas_e_aveia, int precoPorDuzia, int custoTotal) {
    }

    public int getCusto(){
        return custoTotal;
    }

    public int getNumero(){
        return numero;
    }

    public int getPrecoPorDuzia(){
        return precoPorDuzia;
    }


    @Override
    public String toString() {
        return String.format("%d @ %s /dz\n%-25s %6s", getNumero(),
                Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }



}

