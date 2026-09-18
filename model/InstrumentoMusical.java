package model;

public abstract class InstrumentoMusical {

    protected String nome;
    protected String material;
    protected boolean afinado;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false;
    }

    // Metodo abstrato: cada instrumento toca de um jeito diferente
    public abstract String tocar();

    // Metodo concreto: afinar e igual para todos os instrumentos
    public void afinar() {
        this.afinado = true;
    }

    // Metodo concreto: exibe as informacoes do instrumento
    public void exibirInfo() {
        System.out.println("Nome: " + nome
                + " | Material: " + material
                + " | Afinado: " + (afinado ? "sim" : "nao"));
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }
}
