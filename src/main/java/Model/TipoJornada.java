package Model;

/**
 *
 * @author Gabri
 */
public class TipoJornada {
    int ID;
    String Nombre;
    float horas;

    public TipoJornada(int ID, String Nombre, float horas) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.horas = horas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
