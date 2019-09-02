package diego;

public class nodo {
   
    private int valor;
    
    private nodo siguiente;

    public void nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }   
}
