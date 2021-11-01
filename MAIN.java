public class MAIN{
    public static void main(String[] args){

        Vista vista = new Vista();
       // Archivo archivo = new Archivo();

        int opcion = 0;
        int opcionp = 0;

        while(opcion != 3){

            opcion = vista.menu();

            if (opcion == 1){

                //vista.nuevaRAM();

            } else if (opcion == 2){

               // vista.datosRAM();

            } else if (opcion == 3){

               vista.mensajeDespedida();
            }
        }

    }
}