import java.util.Date;

/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 * La clase Hotel representa un hotel con habitaciones, clientes y reservaciones.
 */
public class Hotel{
    private Habitacion[] habitaciones; // Arreglo de habitaciones del hotel
    private Cliente[] clientes; // Arreglo de clientes del hotel
    private Reservacion[] reservaciones; // Arreglo de reservaciones del hotel
    private int numClientes; // Número actual de clientes del hotel
    private int numReservaciones; // Número actual de reservaciones del hotel
    private ListaEspera listaEspera; // Lista de espera de clientes para una habitación del hotel

/**
     * Constructor de la clase Hotel.
     * @param habitaciones Arreglo de habitaciones del hotel.
     * @param capacidadListaEspera Capacidad máxima de la lista de espera de clientes.
     */
    public Hotel(Habitacion[] habitaciones, int capacidadListaEspera){
        this.habitaciones = habitaciones;
        this.clientes = new Cliente[100];
        this.reservaciones = new Reservacion[100];
        this.numClientes = 0;
        this.numReservaciones = 0;
        this.listaEspera = new ListaEspera();
    }

/**
     * Método para obtener el arreglo de habitaciones del hotel.
     * @return El arreglo de habitaciones del hotel.
     */
    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

/**
     * Método para obtener el arreglo de reservaciones del hotel.
     * @return El arreglo de reservaciones del hotel.
     */
    public Reservacion[] getReservaciones(){
        return  reservaciones ;
    }

/**
     * Método para obtener el arreglo de clientes en la lista de espera.
     * @return El arreglo de clientes en la lista de espera.
     */
    public Cliente[] getListaEspera(){
        return listaEspera.getClientes();
    }

 /**
     * Método para recibir un cliente en el hotel.
     * @param cliente El cliente a recibir en el hotel.
     */
    public void recibirCliente(Cliente cliente){
        if (numClientes < clientes.length){
            clientes[numClientes] = cliente;
            numClientes++;
        }else{
            System.out.println("Numero maximo de clientes alcanzado");
        }
    }

/**
     * Método para asignar una habitación a un cliente según su tipo de cliente.
     * @param cliente El cliente al que se le va a asignar una habitación.
     */
    public void asignarHabitacion(Cliente cliente){
        switch (cliente.getTipoCliente()){
            case "Regular":
                asignarHabitacionRegular(cliente);
                break;
            case "Frecuente":
                asignarHabitacionFrecuente(cliente);
                break;
            case "VIP":
                asignarHabitacionVIP(cliente);
                break;
        }
    }

 /**
     * Método para asignar una habitación a un cliente frecuente.
     * @param cliente El cliente frecuente al que se le va a asignar una habitación.
     */
    public void asignarHabitacionFrecuente(Cliente cliente){
        asignarHabitacionRegular(cliente);
    }
/**
     * Método para asignar una habitación a un cliente VIP.
     * @param cliente El cliente VIP al que se le va a asignar una habitación.
     */
     public void asignarHabitacionVIP(Cliente cliente){
        asignarHabitacionRegular(cliente);
    }

 /**
     * Método para buscar una habitación disponible en el hotel.
     * @return La primera habitación disponible encontrada en el arreglo de habitaciones, o null si no hay ninguna disponible.
     */
     public Habitacion buscarHabitacionDisponible(){
        for(Habitacion habitacion : habitaciones){
            if(habitacion.estaDisponible()){
                return habitacion;
            }
        }
        return null;
     }

/**
     * Método para agregar una reservación al hotel.
     * @param reservacion La reservación a agregar al hotel.
     */
    public void agregarReservacion(Reservacion reservacion){
        if (numReservaciones < reservaciones.length){
            reservaciones[numReservaciones] = reservacion;
            numReservaciones++;
        }else{
            System.out.println("Numero maximo de reservaciones alcanzado");
        }
    }


 /**
     * Método para liberar una habitación del hotel.
     * @param habitacion La habitación a liberar.
     */
    public void liberarHabitacion(Habitacion habitacion){
        habitacion.liberar();
        Reservacion[] nuevasReservaciones = new Reservacion[reservaciones.length - 1];
        int i = 0;
        for (Reservacion reservacion : reservaciones){
            if (!reservacion.getHabitacion().equals(habitacion)) {
                nuevasReservaciones [i] = reservacion;
                i++;
            }
        }
        reservaciones = nuevasReservaciones;
    }

/**
     * Método para agregar un cliente a la lista de espera para una habitación del hotel.
     * @param cliente El cliente a agregar a la lista de espera.
     */
        public void agregarClienteAListaDeEspera(Cliente cliente){
            listaEspera.agregarCliente(cliente);
        }

 /**
     * Método para asignar una habitación a un cliente regular.
     * @param cliente El cliente regular al que se le va a asignar una habitación.
     */
        private void asignarHabitacionRegular(Cliente cliente){
            Habitacion habitacionDisponible = buscarHabitacionDisponible();
            if (habitacionDisponible != null){
                Reservacion reservacion = new Reservacion(cliente, habitacionDisponible);
                agregarReservacion(reservacion);
                System.out.println("Se ha asignado una habitacion a " + cliente.getNombre());
            }else {
                agregarClienteAListaDeEspera(cliente);
                System.out.println("No hay habitaciones disponibles, " + cliente.getNombre() + "usted ha sido agregado a la lista de espera");
            }
        }

/**
     * Método para mostrar las reservaciones actuales del hotel (aún no implementado).
     */
        public void mostrarReservaciones(){
            System.out.println("Metodo de mostrar reservaciones aun no implementado");
        }
}

