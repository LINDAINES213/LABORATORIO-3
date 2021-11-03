import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.NoSuchElementException;

public class Publicacion {

    Scanner sn = new Scanner(System.in);
    Imagen imagen = new Imagen();
    Video video = new Video();
    Audio audio = new Audio();
    Texto texto = new Texto();
    Emoticon emoticon = new Emoticon();
    Post post = new Post();

    //Objeto File que crea o abre acceso al archivo txt
    File Publicaciones = new File("Publicaciones.txt");
    
   /**
    * Metodo para que el usuario ingrese la infromacion necesaria, y esta sea guardada en el archivo txt
    */ 
   public void publicarImagen(){

        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter publicar = new FileWriter(Publicaciones, true);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese los hashtags que desea utilizar: ");
            imagen.setHashtags(sn.nextLine());
            publicar.write("\n" + imagen.getHashtags() + "\n");
            System.out.println("Ingrese su nombre: ");
            imagen.setAutor(sn.nextLine());
            publicar.write("AUTOR: " + imagen.getAutor() + " ");
            System.out.println("Ingrese la fecha en el formato DIA/MES/ANO: ");
            imagen.setFecha(sn.nextLine());
            publicar.write("FECHA: " + imagen.getFecha() + " ");
            publicar.write("LIKES: " + imagen.getLikes() + "\n");
            System.out.println("Ingrese el URL: ");
            imagen.setURL(sn.nextLine());
            publicar.write("(IMAGEN) " +imagen.getURL() + "\n");
            System.out.println("Ingrese el formato de la imagen: ");
            imagen.setFormato(sn.nextLine());
            publicar.write("FORMATO: " + imagen.getFormato() + " | ");
            System.out.println("Ingrese el tamano de la imagen en KB: ");
            imagen.setTamano(sn.nextInt());
            publicar.write("TAMANO: " + imagen.getTamano() + " KB | ");
            System.out.println("Ingrese la resolucion de la imagen: ");
            imagen.setResolucion(sn.nextInt());
            publicar.write("RESOLUCION: " + imagen.getResolucion() + " Megapixeles\n");
            System.out.println("\n------------- PUBLICANDO... --------------\n");
           
            //Finaliza la escritura en el archivo
            publicar.close();

        } catch(Exception e) {
             System.out.println("NO FUE POSIBLE PUBLICAR! INTENTA DE NUEVO");
        }
    }

    /**
    * Metodo para que el usuario ingrese la infromacion necesaria, y esta sea guardada en el archivo txt
    */ 
   public void publicarVideo(){

        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter publicar = new FileWriter(Publicaciones, true);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese los hashtags que desea utilizar: ");
            video.setHashtags(sn.nextLine());
            publicar.write("\n" + video.getHashtags() + "\n");

            System.out.println("Ingrese su nombre: ");
            video.setAutor(sn.nextLine());
            publicar.write("AUTOR: " + video.getAutor() + " ");
            System.out.println("Ingrese la fecha en el formato DIA/MES/ANO: ");
            video.setFecha(sn.nextLine());
            publicar.write("FECHA: " + video.getFecha() + " ");
            publicar.write("LIKES: " + video.getLikes() + "\n");
            System.out.println("Ingrese el URL: ");
            video.setURL(sn.nextLine());
            publicar.write("(VIDEO) " +video.getURL() + "\n");
            System.out.println("Ingrese el FrameRate del video: ");
            video.setFPS(sn.nextInt());
            publicar.write("FRAMERATE: " + video.getFPS() + " fps | ");
            System.out.println("Ingrese el tamano de la imagen en KB: ");
            video.setTamano(sn.nextInt());
            publicar.write("TAMANO: " + video.getTamano() + " KB\n");
            System.out.println("\n------------- PUBLICANDO... --------------\n");
        
            //Finaliza la escritura en el archivo
            publicar.close();

        } catch(Exception e) {
            System.out.println("NO FUE POSIBLE PUBLICAR! INTENTA DE NUEVO");
        }
    }

    /**
    * Metodo para que el usuario ingrese la infromacion necesaria, y esta sea guardada en el archivo txt
    */ 
    public void publicarAudios(){

        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter publicar = new FileWriter(Publicaciones, true);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese los hashtags que desea utilizar: ");
            audio.setHashtags(sn.nextLine());
            publicar.write("\n" + audio.getHashtags() + "\n");

            System.out.println("Ingrese su nombre: ");
            audio.setAutor(sn.nextLine());
            publicar.write("AUTOR: " + audio.getAutor() + " ");
            System.out.println("Ingrese la fecha en el formato DIA/MES/ANO: ");
            audio.setFecha(sn.nextLine());
            publicar.write("FECHA: " + audio.getFecha() + " ");
            publicar.write("LIKES: " + audio.getLikes() + "\n");
            System.out.println("Ingrese el URL: ");
            audio.setURL(sn.nextLine());
            publicar.write("(AUDIO) " +audio.getURL() + "\n");
            System.out.println("Ingrese el BitDepth del audio: ");
            audio.setBitDepth(sn.nextInt());
            publicar.write("BITDEPTH: " + audio.getBitDepth() + " | ");
            System.out.println("Ingrese el SampleRate del audio: ");
            audio.setSampleRate(sn.nextDouble());
            publicar.write("SAMPLERATE: " + audio.getSampleRate() + " kHz | ");
            System.out.println("Ingrese el tamano del audio en KB: ");
            audio.setTamano(sn.nextInt());
            publicar.write("TAMANO: " + audio.getTamano() + " KB\n");
            System.out.println("\n------------- PUBLICANDO... --------------\n");
        
            //Finaliza la escritura en el archivo
            publicar.close();

        } catch(Exception e) {
            System.out.println("NO FUE POSIBLE PUBLICAR! INTENTA DE NUEVO");
        }
    }

    /**
    * Metodo para que el usuario ingrese la infromacion necesaria, y esta sea guardada en el archivo txt
    */ 
    public void publicarTexto(){

        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter publicar = new FileWriter(Publicaciones, true);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese los hashtags que desea utilizar: ");
            texto.setHashtags(sn.nextLine());
            publicar.write("\n" + texto.getHashtags() + "\n");

            System.out.println("Ingrese su nombre: ");
            texto.setAutor(sn.nextLine());
            publicar.write("AUTOR: " + texto.getAutor() + " ");
            System.out.println("Ingrese la fecha en el formato DIA/MES/ANO: ");
            texto.setFecha(sn.nextLine());
            publicar.write("FECHA: " + texto.getFecha() + " ");
            publicar.write("LIKES: " + texto.getLikes() + "\n");
            System.out.println("Ingrese el contenido de su publicacion: ");
            texto.setContenido(sn.nextLine());
            publicar.write("(TEXTO) " +texto.getContenido() + "\n");
            System.out.println("\n------------- PUBLICANDO... --------------\n");
        
            //Finaliza la escritura en el archivo
            publicar.close();

        } catch(Exception e) {
            System.out.println("NO FUE POSIBLE PUBLICAR! INTENTA DE NUEVO");
        }
    }

    public void publicarEmoticon(){

        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter publicar = new FileWriter(Publicaciones, true);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese los hashtags que desea utilizar: ");
            emoticon.setHashtags(sn.nextLine());
            publicar.write("\n" + emoticon.getHashtags() + "\n");

            System.out.println("Ingrese su nombre: ");
            emoticon.setAutor(sn.nextLine());
            publicar.write("AUTOR: " + emoticon.getAutor() + " ");
            System.out.println("Ingrese la fecha en el formato DIA/MES/ANO: ");
            emoticon.setFecha(sn.nextLine());
            publicar.write("FECHA: " + emoticon.getFecha() + " ");
            publicar.write("LIKES: " + emoticon.getLikes() + "\n");
            System.out.println("Ingrese el contenido de su publicacion: ");
            emoticon.setEmoticon(sn.nextLine());
            publicar.write("(EMOTICON) " +emoticon.getEmoticon() + "\n");
            System.out.println("\n------------- PUBLICANDO... --------------\n");
        
            //Finaliza la escritura en el archivo
            publicar.close();

        } catch(Exception e) {
            System.out.println("NO FUE POSIBLE PUBLICAR! INTENTA DE NUEVO");
        }
    }

    public void imprimirPosts(){

        String contenido = " ";

        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader leer = new FileReader("Publicaciones.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader posts = new BufferedReader(leer);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((contenido = posts.readLine()) != null) {
            System.out.println(contenido);
            //System.out.println("\n---------------- PUBLICADO ----------------\n");
            }   
        } catch(Exception e) { 
            System.out.println("ERROR EN LA CARGA DE PUBLICACIONES");
        }
    }

    public void BuscarPost(){

        Scanner sc;
        String contenido = " ";
        boolean contains = false;
        String fechaOhashtags;

    
        try {
            
            sc = new Scanner(new File("Publicaciones.txt"));
            System.out.print("Ingresa la fecha (DIA/MES/ANO), o Hashtag (#abc) de la publicacion que deseas buscar: ");
            fechaOhashtags = sn.nextLine();

            FileReader leer = new FileReader("Publicaciones.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader posts = new BufferedReader(leer);

            //ystem.out.println("Texto a buscar: " + texto);
             //mientras no se llegue al final del fichero
             while(sc.hasNext()){   
                contenido = sc.nextLine();  //se lee una línea
                if (contenido.contains(fechaOhashtags)) {   //si la línea contiene el texto buscado se muestra por pantalla         
                    System.out.println("\n" + contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contains = true;
                }
            }
            
            if(!contains){ //si el archivo no contienen el texto se muestra un mensaje indicándolo

                System.out.println("\nNo hay ninguna publicacion en esa fecha\n");
            }

        } catch (NoSuchElementException e) {
            System.out.println("\nBUSQUEDA FINALIZADA\n");

        } catch(Exception e) { 
            System.out.println("\nERROR EN LA CARGA DE PUBLICACIONES\n");
        }
    }
}