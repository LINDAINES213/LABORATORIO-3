import java.util.Scanner;
import java.time.LocalTime;

public class Vista {

    Scanner sn = new Scanner(System.in);
    //Archivo archivo = new Archivo();
    
    public int menu(){

            int opcion;

            System.out.println();
            System.out.println();
            System.out.println("------------ QUE ONDA MANO ------------");
            System.out.println();
            System.out.println("Bienvendo a QUE ONDA MANO!");
            System.out.println("Esta es una red social en donde puedes publicar fotos, videos, audios y lo que desees de cualquier momento especial");
            System.out.println("Hora de Empezar! Que deseas realizar?");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
    
            String menu =   "\n1. Publicar un Post\n" +
                            "2. Buscar un Post\n" +
                            "3. Salir de la app\n";
    
            System.out.println(menu);
            opcion =  sn.nextInt();
    
            return opcion;
    }

    public int menuPublicar(){
        int opcion2;

        String menuPublicar = "\nQue deseas publicar?\n" +
                                "1. Multimedia\n" +
                                "2. Texto\n" +
                                "3. Emoticon\n";
        
        System.out.println(menuPublicar);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    public int menuMultimedia(){
        int opcion3;

        String menuMultimedia = "\nQue deseas publicar?\n" +
                                "1. Foto\n" +
                                "2. Video\n" +
                                "3. Audio\n";
        
        System.out.println(menuMultimedia);
        opcion3 = sn.nextInt();

        return opcion3;
    }

    public String mensajeDespedida(){
        String mensajedespedida = "\n------------ Gracias por usar la app! ------------\n------------ Vuelve proto! ------------\n";
        System.out.println(mensajedespedida);
        return mensajedespedida;
    }
    
}
