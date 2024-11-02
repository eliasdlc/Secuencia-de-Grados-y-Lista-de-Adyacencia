public class Nodo {
    private String nombre;
    private int valor;
    private Nodo sig;
    private Nodo ant;

    public Nodo(String nombre, int valor, Nodo sig, Nodo ant) {
        this.nombre = nombre;
        this.valor = valor;
        this.sig = sig;
        this.ant = ant;
    }
}
