import java.util.Scanner;

public class DirverProgram{
    public static void main(String[] args){
        Hotel hotel = new Hotel();
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
                    hotel.recibirHuesped();
                    break;
                case 2:
                    hotel.asignarHabitacion();
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