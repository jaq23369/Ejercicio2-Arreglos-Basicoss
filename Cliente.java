public class Cliente{
    private String nombre;
    private String apellido;
    private String tipoCliente;
    private int visitas;

    public Cliente(String nombre, String apellido, int visitas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.visitas = visitas;

        if(visitas >= 5) {
            tipoCliente = "VIP";
        } else if (visitas >= 2){
            tipoCliente = "Frecuente";
        } else {
            tipoCliente = "Regular"
        }
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getTipoCliente(){
        return tipoCliente;
    }

    public int getVisitas(){
        return visitas;
    }

    public void aumentarVisitas(){
        visitas++;
        if (visitas >= 5) {
            tipoCliente = "VIP";
        } else if (visitas >= 2) {
            tipoCliente = "Frecuente";
        } else {
            tipoCliente = "Regular";
        }
    }
}
