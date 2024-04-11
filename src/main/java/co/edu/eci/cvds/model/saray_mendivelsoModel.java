package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class saray_mendivelsoModel {
    @Entity
@Table(name = "CONFIGURATION")
public class Configuration {
    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "RESPUESTA")
    private String respuesta;
    @Column(name = "ACLARACION")
    private String aclaracion;

    public Configuration() {
    }

    public Configuration(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Configuration other = (Configuration) obj;
        if (pregunta == null) {
            if (other.pregunta != null)
                return false;
        } else if (!pregunta.equals(other.pregunta))
            return false;
        if (respuesta == null) {
            if (other.respuesta != null)
                return false;
        } else if (!respuesta.equals(other.respuesta))
            return false;
         if (aclaracion == null) {
            if (other.aclaracion != null)
                return false;
        } else if (!aclaracion.equals(other.aclaracion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Configuration [pregunta = " + pregunta + ", respuesta = " + respuesta + ", aclaracion = " + aclaracion +"]";
    }
}


}
