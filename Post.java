import java.util.Scanner;

public class Post {

    protected String autor;
    protected String fecha;
    protected int likes = 0;
    protected String [] comentarios;
    protected String hashtags;
    Scanner sn = new Scanner(System.in);

    
    public String getAutor(){
        return autor;
    }

    public String getFecha(){
        return fecha;
    }

    public String getHashtags(){
        return hashtags;
    }

    public int getLikes(){
        return this.likes;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setHashtags(String hashtags){
        this.hashtags = hashtags;
    }

    public void setLikes(int likes){
        this.likes = likes;

    }

    public int darLike(){
        this.likes++;
        return this.likes;
    }
    /*public String[] comentarios(){
        String[] comentarios = new String[];
        return comentarios;
    }*/
}
