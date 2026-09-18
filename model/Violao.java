package model;

public class Violao extends InstrumentoMusical {

    private int numeroCordas;

    public Violao(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public String tocar() {
        return nome + " solta um som de cordas dedilhadas (" + numeroCordas + " cordas).";
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
}
