/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 *  La clase ListaEspera representa una lista de espera de clientes para una habitación de hotel.
 */
public class ListaEspera{
    private Cliente[] clientes; // Arreglo de clientes en la lista de espera
    private int numClientes; // Número actual de clientes en la lista de espera

/**
     * Constructor de la clase ListaEspera.
     * Crea un arreglo de clientes con capacidad para 10 elementos y establece el número actual de clientes en 0.
     */
    public ListaEspera(){
        this.clientes = new Cliente[10];
        this.numClientes = 0;
    }

/**
     * Método para agregar un cliente a la lista de espera.
     * @param cliente El cliente a agregar a la lista de espera.
     */
    public void agregarCliente(Cliente cliente){
          // Si hay espacio en la lista de espera, se agrega el cliente y se incrementa el número actual de clientes
        if (numClientes < 10){
            clientes[numClientes] = cliente;
            numClientes++;
        }else {
            System.out.println("La lista de espera se encuentra llena");
        }
    }

/**
     * Método para obtener el arreglo de clientes en la lista de espera.
     * @return El arreglo de clientes en la lista de espera.
     */
    public Cliente[] getClientes(){
        return clientes;
        }
    }

