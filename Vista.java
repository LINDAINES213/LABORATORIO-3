import java.util.Scanner;

/**
 * Esta clase es la vista del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class Vista {

    //Obteto tipo scanner
    Scanner sn = new Scanner(System.in);
    
    /**
     * Metodo para imprimir el menu principal
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
    public int menuPrincipal(){

            int opcion;

            System.out.println();
            System.out.println();
            System.out.println("------------ QUE ONDA MANO ------------");
            System.out.println();
            System.out.println("Bienvendo a QUE ONDA MANO!");
            System.out.println("Esta es una red social en donde puedes publicar fotos, videos, audios y lo que desees de cualquier momento especial");
            System.out.println("Hora de Empezar! Que deseas realizar?");
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
    
            String menuPrincipal =   "\n1. Publicar un Post\n" +
                            "2. Ver Posts\n" +
                            "3. Buscar un Post\n" +
                            "4. Salir de la app\n";
    
            System.out.println(menuPrincipal);
            opcion =  sn.nextInt();
    
            return opcion;
    }

    /**
     * Metodo para imprimir el menu para hacer una publicacion
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
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

    /**
     * Metodo para imprimir el menu para publicar multimedia
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
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

    /**
     * Metodo para imprimir el menu para reaccionar o comentar una publicacion
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
    public int menuReaccion(){
        
        int opcion4;

        String menuReaccion = "\nDeseas reaccionar a alguna publicacion?\n" +
                                "1. Dar Like\n" +
                                "2. Comentar\n" +
                                "3. Regresar al menu principal\n";
        
        System.out.println(menuReaccion);
        opcion4 = sn.nextInt();

        return opcion4;
    }

    /**
     * Imprime el mensaje de despedida
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
    public String mensajeDespedida(){
        String mensajedespedida = "\n------------ Gracias por usar la app! Vuelve Pronto!------------";
        System.out.println(mensajedespedida);
        return mensajedespedida;
    }
    
}
