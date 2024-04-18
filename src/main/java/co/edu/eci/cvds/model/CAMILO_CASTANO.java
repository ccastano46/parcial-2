package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "CAMILO_CASTANO")
public class CAMILO_CASTANO {
    @Id
    @Column(name = "Pregunta")
    private String pregunta;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Justificacion")
    private String justificacion;

    public CAMILO_CASTANO() {
     
    }

    public CAMILO_CASTANO(String pregunta, String respuesta, String justificacion) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.justificacion = justificacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
        result = prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
        result = prime * result + ((justificacion == null) ? 0 : justificacion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            CAMILO_CASTANO o = (CAMILO_CASTANO) obj;
            if(pregunta.equals(o.getPregunta()) && respuesta.equals(o.getRespuesta())
             && justificacion.equals(o.getJustificacion())) return true;
             return false;

        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Configuration [pregunta = " + pregunta + ", respuesta = " + respuesta + "]";
    }
}