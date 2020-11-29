package cl.alc.myappalc.Modelo;

public class CaliHtlHostalChillan {
    private String IdUsuario;
    private String NombreUsuario;
    private String CorreoUsuario;
    private String ComentarioUsuario;

    public CaliHtlHostalChillan() {
        IdUsuario = "";
        NombreUsuario = "";
        CorreoUsuario = "";
        ComentarioUsuario = "";
    }

    public CaliHtlHostalChillan(String idUsuario, String nombreUsuario, String correoUsuario, String comentarioUsuario) {
        IdUsuario = idUsuario;
        NombreUsuario = nombreUsuario;
        CorreoUsuario = correoUsuario;
        ComentarioUsuario = comentarioUsuario;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        CorreoUsuario = correoUsuario;
    }

    public String getComentarioUsuario() {
        return ComentarioUsuario;
    }
    public void setComentarioUsuario(String comentarioUsuario) {
        ComentarioUsuario = comentarioUsuario;
    }

    @Override
    public String toString() {
        return "CaliHtlHostalChillan{" +
                "IdUsuario='" + IdUsuario + '\'' +
                ", NombreUsuario='" + NombreUsuario + '\'' +
                ", CorreoUsuario='" + CorreoUsuario + '\'' +
                ", ComentarioUsuario='" + ComentarioUsuario + '\'' +
                '}';
    }
}
