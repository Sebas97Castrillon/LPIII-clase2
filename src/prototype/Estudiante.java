package src.prototype;

public class Estudiante {

    private String nombre;
    private long id;
    private short creditos;

    public Estudiante (Estudiante estudiante){
        this.nombre = estudiante.nombre;
        this.id = estudiante.id;
        this.creditos = estudiante.creditos;
    }

    public Estudiante(String nombre, long id, short creditos) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
    }

    @Override
    public Object clone() {
        return new Estudiante(this);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", creditos=" + creditos +
                '}';
    }
}
