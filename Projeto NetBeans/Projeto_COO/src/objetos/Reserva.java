package objetos;

public class Reserva {

    private int horaInicio;
    private int horaFim;
    private String data;
    private int nUSP; //serve para BD
    private int idRecurso; //serve para BD

    public Reserva() {
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getnUSP() {
        return nUSP;
    }

    public void setnUSP(int nUSP) {
        this.nUSP = nUSP;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }
    
    

    
}
