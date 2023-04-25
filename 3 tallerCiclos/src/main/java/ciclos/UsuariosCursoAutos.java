package ciclos;

public class UsuariosCursoAutos {
    private String nombre;
    private String identificacion;
    private double calificacion;

    public UsuariosCursoAutos(String nombre, String identificacion, double calificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
