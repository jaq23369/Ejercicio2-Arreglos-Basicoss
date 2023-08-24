/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 * La clase Habitacion representa una habitación de un hotel.
 */
public class Habitacion{
    private int numero; // Número de la habitación
    private int capacidadMaxima; // Capacidad máxima de la habitación
    private double precioPorNoche; // Precio por noche de la habitación
    private String tipo; // Tipo de la habitación
    private int ocupantes; // Número actual de ocupantes en la habitación

/**
     * Constructor de la clase Habitacion.
     * @param numero El número de la habitación.
     * @param capacidadMaxima La capacidad máxima de la habitación.
     * @param precioPorNoche El precio por noche de la habitación.
     * @param tipo El tipo de la habitación.
     */
    public Habitacion(int numero, int capacidadMaxima, double precioPorNoche, String tipo){
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
        this.precioPorNoche= precioPorNoche;
        this.tipo = tipo;
        this.ocupantes = 0;
    }

/**
     * Método para obtener el número de la habitación.
     * @return El número de la habitación.
     */
    public int getNumero(){
        return numero;
    }

/**
     * Método para obtener la capacidad máxima de la habitación.
     * @return La capacidad máxima de la habitación.
     */
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

/**
     * Método para obtener el precio por noche de la habitación.
     * @return El precio por noche de la habitación.
     */
    public double getPrecioPorNoche(){
        return precioPorNoche;
    }

/**
     * Método para obtener el tipo de la habitación.
     * @return El tipo de la habitación.
     */
    public String getTipo(){
        return tipo;
    }

/**
     * Método para obtener el número actual de ocupantes en la habitación.
     * @return El número actual de ocupantes en la habitación.
     */
    public int getOcupantes(){
        return ocupantes;
    }

/**
     * Método para agregar un ocupante a la habitación.
     */
    public void agregarOcupantes(){
        ocupantes++;
    }

/**
     * Método para quitar un ocupante de la habitación.
     */
    public void quitarOcupantes(){
        ocupantes--;
    }
    
/**
     * Método para verificar si la habitación está disponible.
     * @return True si la habitación está disponible, false en caso contrario.
     */

    public boolean estaDisponible(){
        return ocupantes < capacidadMaxima;
    }

/**
     * Método para reservar la habitación.
     */
    public void reservar(){
        ocupantes = capacidadMaxima;
    }

/**
     * Método para liberar la habitación.
     */
    public void liberar(){
        ocupantes = 0;
}
}