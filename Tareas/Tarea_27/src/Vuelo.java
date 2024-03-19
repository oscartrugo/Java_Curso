import java.util.Date;

public class Vuelo {
    private String vuelo;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Integer numeroPasajeros;

    public Vuelo() {
    }

    public Vuelo(String vuelo, String origen, String destino, Date fechaLlegada, Integer numeroPasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
}