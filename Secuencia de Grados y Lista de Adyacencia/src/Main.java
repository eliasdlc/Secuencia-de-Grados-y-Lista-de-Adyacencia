public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        grafo.addNodo("A");
        grafo.addNodo("B");
        grafo.addNodo("C");
        grafo.addNodo("D");
        grafo.addNodo("E");
        grafo.addNodo("F");
        grafo.addNodo("G");
        grafo.addNodo("H");
        grafo.addNodo("I");

        grafo.addArista("A", "B");
        grafo.addArista("A", "C");
        grafo.addArista("B", "D");
        grafo.addArista("B", "E");
        grafo.addArista("C", "F");
        grafo.addArista("C", "G");
        grafo.addArista("D", "E");
        grafo.addArista("D", "H");
        grafo.addArista("E", "I");
        grafo.addArista("F", "G");
        grafo.addArista("G", "H");
        grafo.addArista("H", "I");
        grafo.addArista("I", "F");

        grafo.imprimirGrafo();




    }
}