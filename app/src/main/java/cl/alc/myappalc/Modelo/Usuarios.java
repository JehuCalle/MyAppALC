package cl.alc.myappalc.Modelo;

public class Usuarios {
    private String IdUsuario;
    private String NombreUsuario;
    private String ApellidoUsuario;
    private String CorreoUsuario;
    private String ContraseñaUsuario;

    public Usuarios() {
        IdUsuario = "";
        NombreUsuario = "";
        ApellidoUsuario = "";
        CorreoUsuario = "";
        ContraseñaUsuario = "";
    }

    public Usuarios(String idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String contraseñaUsuario) {
        IdUsuario = idUsuario;
        NombreUsuario = nombreUsuario;
        ApellidoUsuario = apellidoUsuario;
        CorreoUsuario = correoUsuario;
        ContraseñaUsuario = contraseñaUsuario;
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

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }
    public void setApellidoUsuario(String apellidoUsuario) {
        ApellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        CorreoUsuario = correoUsuario;
    }

    public String getContraseñaUsuario() {
        return ContraseñaUsuario;
    }
    public void setContraseñaUsuario(String contraseñaUsuario) {
        ContraseñaUsuario = contraseñaUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "IdUsuario='" + IdUsuario + '\'' +
                ", NombreUsuario='" + NombreUsuario + '\'' +
                ", ApellidoUsuario='" + ApellidoUsuario + '\'' +
                ", CorreoUsuario='" + CorreoUsuario + '\'' +
                ", ContraseñaUsuario='" + ContraseñaUsuario + '\'' +
                '}';
    }
}
