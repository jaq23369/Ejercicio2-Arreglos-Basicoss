public class ListaEspera{
    private Cliente[] clientesEnEspera;
    private int cantidadDeClientesEnEspera;

    public ListaEspera(){
        this.clientesEnEspera;
        this.cantidadDeClientesEnEspera = 0;
    }

    public void agregarCliente(Cliente cliente){
        if (cantidadDeClientesEnEspera < 10){
            clientesEnEspera[cantidadDeClientesEnEspera] = cliente;
            cantidadDeClientesEnEspera++;
        }else {
            System.out.println("La lista de espera se encuetra llena");
        }
    }

    public Cliente obtenerSiguienteCliente(){
        if (cantidadDeClientesEnEspera > 0){
            Cliente siguienteCliente = clientesEnEspera[0];
            for (int i = 0; i < cantidadDeClientesEnEspera - 1; i++){
                clientesEnEspera[i] = clientesEnEspera[i + 1];
            }
            cantidadDeClientesEnEspera--;
            return siguienteCliente;
        }else {
            System.out.println("No hay clientes en la lista de espera");
            return null;
        }
    }
}
