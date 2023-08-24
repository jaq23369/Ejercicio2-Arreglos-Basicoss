import java.util.Scanner;

/**Estudiante: Joel Antonio Jaquez Lopez
 * Carné: #23369
 * Carrera: Ingeniería en Sistemas
 * Fecha de inicio: 21/8/2023
 * Ultima fecha de actualizacion: 24/8/2023
 * La clase DriverProgram es la clase principal del programa. 
 * 
 */

public class DriverProgram{
    public static void main(String[] args){
        Habitacion[] habitacionesIniciales = new Habitacion[10];
        Hotel hotel = new Hotel(habitacionesIniciales, 10);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Bienvenido al sistema de reservaciones del Hotel.");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Asignar Habitacion");
            System.out.println("3. Mostrar reservaciones");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Porfavor ingresa el nombre del cliente: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Porfavor ingresa el apellido del cliente: ");
                    String apellido = scanner.nextLine();

                    System.out.println("Porfavor ingresa el numero de visitas del cliente: ");
                    int visitas = scanner.nextInt();
                    scanner.nextLine();

                    Cliente cliente = new Cliente(nombre, apellido, visitas);
                    hotel.recibirCliente(cliente);
                    System.out.println("Cliente registrado con exito.");
                    break;
                case 2:
                    System.out.println("Por favor, ingrese el nombre del cliente para asignar habitación:");
                    String nombreAsignacion = scanner.nextLine();
    
                    System.out.println("Por favor, ingrese el apellido del cliente para asignar habitación:");
                    String apellidoAsignacion = scanner.nextLine();
    
                    System.out.println("Por favor, ingrese el número de visitas del cliente para asignar habitación:");
                    int visitasAsignacion = scanner.nextInt();
                    scanner.nextLine();  
    
                    Cliente clienteAsignacion = new Cliente(nombreAsignacion, apellidoAsignacion, visitasAsignacion);
                    hotel.asignarHabitacion(clienteAsignacion);
                    System.out.println("Habitación asignada o cliente agregado a la lista de espera.");
                    break;
                case 3:
                    hotel.mostrarReservaciones();
                    break;
                case 4:
                    System.out.println("Gracias por hacer uso de nuestro servicio");
                    return;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
}
//Este código define la clase `DriverProgram`, que es la clase principal del programa. El programa utiliza un objeto de la clase `Scanner` para leer la entrada del usuario y un objeto de la clase `Hotel` para manejar las reservaciones de habitaciones.
//El programa muestra un menú con cuatro opciones: registrar un cliente, asignar una habitación a un cliente, mostrar las reservaciones actuales y salir del programa. Dependiendo de la opción seleccionada por el usuario, se ejecuta una acción diferente.
//En la opción 1, el programa solicita al usuario que ingrese el nombre, apellido y número de visitas del cliente y crea un objeto `Cliente` con esta información. Luego, llama al método `recibirCliente` del objeto `Hotel` para agregar el cliente al arreglo de clientes.
//En la opción 2, el programa solicita al usuario que ingrese el nombre, apellido y número de visitas del cliente al que se le asignará una habitación. Crea un objeto `Cliente` con esta información y llama al método `asignarHabitacion` del objeto `Hotel` para asignar una habitación al cliente o agregarlo a la lista de espera si no hay habitaciones disponibles.
//En la opción 3, el programa llama al método `mostrarReservaciones` del objeto `Hotel` para mostrar las reservaciones actuales.
//En la opción 4, el programa muestra un mensaje de despedida y sale del bucle principal.