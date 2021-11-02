public class Post {

    protected String tipo;
    protected String autor;
    protected String fecha;
    protected int likes;
    protected String [] comentarios;

    public String getTipo() {
        return tipo;
    }
    
    public String getAutor(){
        return autor;
    }

    public String getFecha(){
        return fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setLikes(String likes){
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
