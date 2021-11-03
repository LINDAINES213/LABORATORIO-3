import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.NoSuchElementException;

/**
 * Esta clase contiene metodos para guardar las publicaciones en un archivo txt.
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class Publicacion {

    //Objeto tipo scanner
    Scanner sn = new Scanner(System.in);
    //Objeto tipo imagen
    Imagen imagen = new Imagen();
    //Objeto tipo video
    Video video = new Video();
    //Objeto tipo audio
    Audio audio = new Audio();
    //Objeto tipo texto
    Texto texto = new Texto();
    //Objeto tipo emoticon
    Emoticon emoticon = new Emoticon();
    //Objeto tipo post
    Post post = new Post();
    //Objeto File que crea o abre acceso al archivo txt
    File Publicaciones = new File("Publicaciones.txt");
    
   /**
    * Metodo para que el usuario ingrese la infromacion necesaria para publicar una imagen, y esta sea guardada en el archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
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
    * Metodo para que el usuario ingrese la infromacion necesaria para publicar un video, y esta sea guardada en el archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
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
    * Metodo para que el usuario ingrese la infromacion necesaria para publicar un audio, y esta sea guardada en el archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
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
    * Metodo para que el usuario ingrese la infromacion necesaria para publicar texto, y esta sea guardada en el archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
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

    /**
    * Metodo para que el usuario ingrese la infromacion necesaria para publicar un emoticon, y esta sea guardada en el archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
    */ 
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

    /**
    * Metodo para imprimir el contenido (publicaciones) del archivo txt
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
    */ 
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

    /**
    * Metodo para que el usuario busque una publicacion por fecha o hashtag
    * @author: Linda Ines Jimenez Vides
    * @version: 2 - noviembre - 2021
    */ 
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
            BufferedReader posts = new BufferedReader(leer);

             while(sc.hasNext()){   
                contenido = sc.nextLine();
                if (contenido.contains(fechaOhashtags)) {        
                    System.out.println("\n" + contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contenido = sc.nextLine(); 
                    System.out.println(contenido);
                    contains = true;
                }
            } if (!contains){

                System.out.println("\nNo hay ninguna publicacion en esa fecha o hashtag\n");
            }

        } catch (NoSuchElementException e) {
            System.out.println("\nBUSQUEDA FINALIZADA\n");

        } catch (Exception e) { 
            System.out.println("\nERROR EN LA CARGA DE PUBLICACIONES\n");
        }
    }
}