package app;

import model.Bateria;
import model.InstrumentoMusical;
import model.Violao;

import java.util.ArrayList;
import java.util.List;

public class TesteBanda {

    public static void main(String[] args) {

        // 1. Cria o violao (6 cordas) e a bateria (5 tambores)
        Violao violao = new Violao("Violao da banda", "madeira", 6);
        Bateria bateria = new Bateria("Bateria da banda", "metal", 5);

        // 2. Monta a List<InstrumentoMusical> com os dois
        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        // 3. Em um unico laco: afina cada instrumento e imprime o retorno de tocar()
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.tocar());
        }

        // 4. Conta e imprime quantos instrumentos estao afinados
        int totalAfinados = 0;
        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                totalAfinados++;
            }
        }
        System.out.println("Instrumentos afinados: " + totalAfinados + " de " + instrumentos.size());

        // 5. new InstrumentoMusical(...) nao compila porque InstrumentoMusical e uma
        // classe ABSTRATA (declarada com "abstract"). Classes abstratas nao podem ser
        // instanciadas diretamente com "new" -- elas so podem ser usadas como
        // superclasse para outras classes (como Violao e Bateria), que implementam
        // o metodo abstrato tocar(). Isso garante que nunca exista um "instrumento
        // generico" sem um tipo concreto definido.
    }
}
