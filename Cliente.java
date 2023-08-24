/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 * La clase Cliente representa un cliente de un hotel.
 */
public class Cliente{
    private String nombre; // Nombre del cliente
    private String apellido; // Apellido del cliente
    private String tipoCliente; // Tipo de cliente (Regular, Frecuente o VIP)
    private int visitas; // Número de visitas del cliente

/**
     * Constructor de la clase Cliente.
     * @param nombre El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param visitas El número de visitas del cliente.
     */
    public Cliente(String nombre, String apellido, int visitas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.visitas = visitas;

// Se determina el tipo de cliente según el número de visitas
        if(visitas >= 5) {
            tipoCliente = "VIP";
        } else if (visitas >= 2){
            tipoCliente = "Frecuente";
        } else {
            tipoCliente = "Regular";
        }
    }

/**
     * Método para obtener el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }

/**
     * Método para obtener el apellido del cliente.
     * @return El apellido del cliente.
     */
    public String getApellido(){
        return apellido;
    }

/**
     * Método para obtener el tipo de cliente.
     * @return El tipo de cliente.
     */
    public String getTipoCliente(){
        return tipoCliente;
    }

/**
     * Método para obtener el número de visitas del cliente.
     * @return El número de visitas del cliente.
     */
    public int getVisitas(){
        return visitas;
    }

 /**
     * Método para aumentar el número de visitas del cliente en 1 y actualizar su tipo de cliente según corresponda.
     */
    public void aumentarVisitas(){
        visitas++;
        // Se actualiza el tipo de cliente según el nuevo número de visitas
        if (visitas >= 5) {
            tipoCliente = "VIP";
        } else if (visitas >= 2) {
            tipoCliente = "Frecuente";
        } else {
            tipoCliente = "Regular";
        }
    }
}
