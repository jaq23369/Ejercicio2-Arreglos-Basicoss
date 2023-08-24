public class Habitacion{
    private int numero;
    private int capacidadMaxima;
    private double precioPorNoche;
    private String tipo;
    private int ocupantes;

    public Habitacion(int numero, int capacidadMaxima, double precioPorNoche, String tipo){
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
        this.precioPorNoche= precioPorNoche;
        this.tipo = tipo;
        this.ocupantes = 0;
    }

    public int getNumero(){
        return numero;
    }

    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public double getPrecioPorNoche(){
        return precioPorNoche;
    }

    public String getTipo(){
        return tipo;
    }

    public int getOcupantes(){
        return ocupantes;
    }

    public void agregarOcupantes(){
        ocupantes++;
    }

    public void quitarOcupantes(){
        ocupantes--;
    }
    
    public boolean estaDisponible(){
        return ocupantes < capacidadMaxima;
    }
}