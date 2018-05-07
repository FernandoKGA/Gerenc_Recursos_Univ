package objetos;

public class Reserva {

    private String horaInicio;
    private String horaFim;
    private String data;
    private Usuario usuario; //vai ser importante para o BD
    private Recurso recurso; //vai ser importante para o BD

    public Reserva() {
    }
    
    //Getters
    public String getHoraInicio() {
        return horaInicio;
    }
    public String getHoraFim() {
        return horaFim;
    }
    
    public String getData() {
        return data;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public Recurso getRecurso() {
        return recurso;
    }

    //Setters
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
}
