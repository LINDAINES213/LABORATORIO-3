import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Publicacion {

    //private Arrays publicaciones = new Arrays();
    //Scanner sn = new Scanner(System.in);
    Imagen imagen = new Imagen();
    Post post = new Post();
    File Publicaciones = new File("Publicaciones.java");

   
    public void publicarImagen(){

        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(Publicaciones, true);


            //Escribimos en el archivo con el metodo write
            /*System.out.println("Ingrese su nombre: ");
            sn.nextLine();
            System.out.println("Ingrese la fecha: ");
            sn.nextLine();
            System.out.println("Ingrese el URL de la imagen: ");
            sn.nextLine();
            System.out.println("Ingrese el tamano de la imagen en KB");
            sn.nextInt();
            System.out.println("Ingrese el formato de la imagen: ");
            sn.nextLine();*/

           /* escribir.write(imagen.getAutor());
            escribir.write(imagen.getFecha());
            escribir.write(imagen.getLikes());
            escribir.write("(imagen)" +imagen.getURL());
            escribir.write(imagen.getTamano() + "KB");
            escribir.write(imagen.getFormato());
            escribir.write(imagen.getResolucion());*/


            //Cerramos la conexion
            escribir.close();

            }
            //Si existe un problema al escribir cae aqui
            catch(Exception e) {
             System.out.println("Error al escribir");
            }
    }

    public void leerArchivo(){

        String texto = "";

        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("Publicaciones.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((texto = contenido.readLine())!= null) {
            System.out.println(texto);
            }
            
        }

            //Si se causa un error al leer cae aqui
        catch(Exception e) {
            System.out.println("Error al leer");
        }
    }
}