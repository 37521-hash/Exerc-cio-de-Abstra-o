package model;

public class Bateria extends InstrumentoMusical {

    private int numeroTambores;

    public Bateria(String nome, String material, int numeroTambores) {
        super(nome, material);
        this.numeroTambores = numeroTambores;
    }

    @Override
    public String tocar() {
        return nome + " faz um som grave de batidas (" + numeroTambores + " tambores).";
    }

    public int getNumeroTambores() {
        return numeroTambores;
    }
}
