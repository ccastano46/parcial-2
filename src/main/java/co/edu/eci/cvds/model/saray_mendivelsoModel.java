package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "saray_mendivelso")
public class saray_mendivelsoModel {
    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "RESPUESTA")
    private String respuesta;
    @Column(name = "ACLARACION")
    private String aclaracion;

    public saray_mendivelsoModel() {
    }

    public saray_mendivelsoModel(String pregunta, String respuesta, String aclaracion) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.aclaracion = aclaracion;
    }

    public String getpregunta() {
        return pregunta;
    }

    public void setpregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getrespuesta() {
        return respuesta;
    }

    public void setrespuesta(String respuesta) {
        this.respuesta= respuesta;
    }

    public String getaclaracion() {
        return aclaracion;
    }

    public void setaclaracion(String aclaracion) {
        this.aclaracion= aclaracion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
        result = prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
        result = prime * result + ((aclaracion == null) ? 0 : aclaracion.hashCode());
        return result;
    }

   

    @Override
    public String toString() {
        return "Configuration [pregunta = " + pregunta + ", respuesta = " + respuesta + ", aclaracion = " + aclaracion +"]";
    }
}



