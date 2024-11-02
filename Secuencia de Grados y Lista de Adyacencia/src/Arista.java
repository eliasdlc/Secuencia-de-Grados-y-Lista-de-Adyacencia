public class Arista {
    private Nodo nodoOrigen;
    private Nodo nodoDestino;
    private int valor;

    public Arista(Nodo nodoOrigen, Nodo nodoDestino, int valor) {
        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.valor = valor;
    }

    public Nodo getNodoOrigen() {
        return nodoOrigen;
    }

    public void setNodoOrigen(Nodo nodoOrigen) {
        this.nodoOrigen = nodoOrigen;
    }

    public Nodo getNodoDestino() {
        return nodoDestino;
    }

    public void setNodoDestino(Nodo nodoDestino) {
        this.nodoDestino = nodoDestino;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
