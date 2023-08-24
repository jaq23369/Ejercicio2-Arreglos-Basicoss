import java.util.Date;

public class Hotel{
    private Habitacion[] habitaciones;
    private Reservacion[] reservaciones;
    private int capacidadListaEspera;
    private Cliente[] ListaEspera;

    public Hotel(Habitacion[] habitaciones, int capacidadListaEspera){
        this.habitaciones = habitaciones;
        this.reservaciones = new Reservacion[0];
        this.capacidadListaEspera=capacidadListaEspera;
        this.ListaEspera = new Cliente[capacidadListaEspera];
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public Reservacion[] getReservaciones(){
        return  reservaciones ;
    }

    public Cliente[] getListaEspera(){
        return ListaEspera;
    }

    public Habitacion buscarHabitacionDisponible(Date fechaInicio, Date fechaDeFin, int capacidadMinima){
        for (Habitacion habitacion : habitaciones){
            if (habitacion.estaDisponible() && habitacion.getCapacidadMaxima() >= capacidadMinima){
                boolean disponibleEnFechas = true;
                for (Reservacion.reservacion : reservaciones.){
                    if (reservacion.getHabitacion().equals(habitacion)){
                    if ((fechaDeInicio.after(Reservacion.getFechaDeInicio())) && fechaDeInicio.before(reservacion.getFechaDeFin()))
                    || (fechaDeFin.after(reservacion.getFechaDeInicio()) && fechaDeInicio.before(reservacion.getFechaDeFin())){
                disponibleEnFechas = false;
                break;
                }
            }
        }
    }
}
        if (disponibleEnFechas){
            return habitacion;
        }
    }
    return null;

    public void agregarReservacion(Reservacion reservacion){
        reservacion.getHabitacion().reservar();
        Cliente cliente = reservacion.getCliente();
        if (cliente != null){
            cliente.incrementarNumeroDeVisitas();
        }

        Reservacion[] nuevasReservaciones = new Reservacion[reservaciones.lenght + 1];
        System.arraycopy(reservaciones, 0, nuevasReservaciones, 0 ,reservaciones.lenght);
        nuevasReservaciones[reservaciones.lenght] = reservacion;
        reservaciones = nuevasReservaciones;
    }

    public void liberarHabitacion(Habitacion habitacion){
        habitacion.liberar();
        Reservacion[] nuevasReservaciones = new Reservacion[reservaciones.lenght - 1];
        int i = 0;
        for (Reservacion reservacion : reservaciones){
            if (!reservacion.getHabitacion().equals(habitacion)) {
                nuevasReservaciones [i] = reservacion;
                i++;
            }
        }

        public void agregarClienteAListaDeEspera(Cliente cliente){
            ListaEspera.agregarCliente(cliente);
        }

        private void asignarClienteAHabitacion(Cliente cliente){
            Habitacion habitacionDisponible = buscarHabitacionDisponible(null, null, 1);
            if (habitacionDisponible != null){
                Reservacion reservacion = new Reservacion(habitacionDisponible, cliente, null, null);
                agregarReservacion(reservacion);
                System.out.println("Se ha asignado una habitacion a " + cliente.getNombre());
            }else {
                agregarClienteAListaDeEspera(cliente);
                System.out.println("No hay habitaciones disponibles, " + cliente.getNombre() + "usted ha sido agregado a la lista de espera");
            }
        }
    }
}

