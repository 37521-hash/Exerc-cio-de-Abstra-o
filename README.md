# Exercicio POO - Banda Escolar

**Nome:** Murilo Dias Oliveira Neto

## Parte 2 - Perguntas de extracao

1. **Quantas classes concretas (instrumentos) o texto descreve? Quais sao?**
   Duas: `Violao` e `Bateria`.

2. **Quais atributos aparecem em TODOS os instrumentos?**
   `nome`, `material` e o estado `afinado`. Esses ficam na classe abstrata
   `InstrumentoMusical`.

3. **Qual atributo e exclusivo de cada instrumento?**
   - `Violao`: numero de cordas (6) -> `int numeroCordas`.
   - `Bateria`: numero de tambores (5) -> `int numeroTambores`.

4. **Comportamento diferente vs. comportamento igual para todos:**
   - Diferente (metodo abstrato): `tocar()` -- cada instrumento produz um som
     diferente (cordas dedilhadas x batidas graves).
   - Igual para todos (metodo concreto na classe mae): `afinar()` -- o
     processo de afinar e o mesmo para qualquer instrumento.

5. **Qual recurso do Java garante que nao se crie um "instrumento generico"?**
   Declarar `InstrumentoMusical` como uma classe **abstrata** (`abstract
   class`). Classes abstratas nao podem ser instanciadas com `new`.

6. **Que tipo a `List<?>` do teste deve ter para percorrer todos sem
   `instanceof`/cast?**
   `List<InstrumentoMusical>` -- o tipo da superclasse abstrata.

## Estrutura

```
model/
  InstrumentoMusical.java   (abstrata)
  Violao.java
  Bateria.java
app/
  TesteBanda.java
```
