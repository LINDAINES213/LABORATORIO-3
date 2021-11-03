/**
 * Esta clase hereddada de post contiene getters y setters del objeto tipo multimedia
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class Multimedia extends Post {

    protected String URL;
    protected int tamano;


    public String getURL(){
        return URL;
    }

    public int getTamano(){
        return tamano;
    }

    public void setURL(String URL){
        this.URL = URL;
    }

    public void setTamano(int tamano){
        this.tamano = tamano;
    }   
}
