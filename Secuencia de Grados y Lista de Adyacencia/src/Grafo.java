import java.sql.SQLOutput;
import java.util.*;

public class Grafo {
    private HashMap<String, List<String>> listaAdyacencia;

    public Grafo(){
        listaAdyacencia = new HashMap<>();
    }

    public void addNodo(String nodo){
        listaAdyacencia.putIfAbsent(nodo, new ArrayList<>());
    }

    public void addArista(String nodo1, String nodo2){
        listaAdyacencia.putIfAbsent(nodo1, new ArrayList<>());
        listaAdyacencia.putIfAbsent(nodo2, new ArrayList<>());
        listaAdyacencia.get(nodo1).add(nodo2);
        listaAdyacencia.get(nodo2).add(nodo1);
    }

    public void imprimirGrafo() {
        for (String nodo : listaAdyacencia.keySet()) {
            System.out.print("Nodo " + nodo + ": ");
            List<String> vecinos = listaAdyacencia.get(nodo);
            System.out.println(String.join(" -> ", vecinos));
        }
    }
}
