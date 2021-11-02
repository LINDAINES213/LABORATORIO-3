import java.util.Scanner;

public class Post {

    protected String autor;
    protected String fecha;
    protected int likes;
    protected String [] comentarios;
    Scanner sn = new Scanner(System.in);

    
    public String getAutor(){
        return autor;
    }

    public String getFecha(){
        return fecha;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setLikes(int likes){
        this.likes += 1;

    }

    public int getLikes(){
        return this.likes;
    }
    
    /*public String[] comentarios(){
        String[] comentarios = new String[];
        return comentarios;
    }*/
}
