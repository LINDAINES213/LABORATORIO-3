public class MAIN{
    public static void main(String[] args){

        Vista vista = new Vista();
       // Archivo archivo = new Archivo();

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;

        while(opcion != 3){

            opcion = vista.menu();

            if (opcion == 1){

                vista.menuPublicar();
                if (opcion2 == 1){
                    vista.menuMultimedia();
                    if(opcion3 == 1){

                    }
                }

            } else if (opcion == 2){


            } else if (opcion == 3){

               vista.mensajeDespedida();
            }
        }

    }
}