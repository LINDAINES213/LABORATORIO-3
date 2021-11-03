/**
 * Esta clase hereddada de multimedia contiene getters y setters del objeto tipo imagen
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class Imagen extends Multimedia {

    private int resolucion;
    private String formato;

    public int getResolucion() {
        return resolucion;
    }

    public String getFormato() {
        return formato;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
