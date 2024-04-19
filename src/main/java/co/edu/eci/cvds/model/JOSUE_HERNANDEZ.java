package co.edu.eci.cvds.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOSUE_HERNANDEZ")
public class JOSUE_HERNANDEZ {
    @Id
    @Column(name = "Pregunta")
    private String pregunta;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Argumento")
    private String argumento;

    public JOSUE_HERNANDEZ() {
    }

    public JOSUE_HERNANDEZ(String pregunta, String respuesta, String argumento) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.argumento = argumento;
    }
    public String getPregunta(){
        return pregunta;
    }
    public void setPregunta(String pregunta){
        this.pregunta = pregunta;
    }
    public String getRespuesta(){
        return respuesta;
    }
    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }
    public String getArgumento(){
        return argumento;
    }
    public void setArgumento(String argumento){
        this.argumento = argumento;
    }
   
}
