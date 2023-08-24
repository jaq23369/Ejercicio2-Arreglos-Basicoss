import java.util.Date;

/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 * La clase Reservacion representa una reservación de una habitación de hotel.
 */
public class Reservacion{
    private Cliente cliente; // Cliente que realizó la reservación
    private Habitacion habitacion; // Habitación reservada
    private Date fechaDeInicio; // Fecha de inicio de la reservación
    private Date fechaDeFin; // Fecha de fin de la reservación

 /**
     * Constructor de la clase Reservacion.
     * @param cliente El cliente que realizó la reservación.
     * @param habitacion La habitación reservada.
     */
    public Reservacion(Cliente cliente, Habitacion habitacion){
        this.cliente = cliente;
        this.habitacion=habitacion;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
    }

/**
     * Método para obtener el cliente que realizó la reservación.
     * @return El cliente que realizó la reservación.
     */
    public Cliente getCliente(){
        return cliente;
    }

 /**
     * Método para obtener la habitación reservada.
     * @return La habitación reservada.
     */
    public Habitacion getHabitacion(){
        return habitacion;
    }

 /**
     * Método para obtener la fecha de inicio de la reservación.
     * @return La fecha de inicio de la reservación.
     */
    public Date getFechaDeInicio(){
        return fechaDeInicio;
    }

/**
     * Método para obtener la fecha de fin de la reservación.
     * @return La fecha de fin de la reservación.
     */
    public Date getFechaDeFin(){
        return fechaDeFin;
    }
}