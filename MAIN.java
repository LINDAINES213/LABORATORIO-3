public class MAIN{
    public static void main(String[] args){

        Vista vista = new Vista();
        Publicacion publicacion = new Publicacion();

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;

        while (opcion != 4){

            opcion = vista.menu();

            if (opcion == 1){

                opcion2 = vista.menuPublicar();

                if (opcion2 == 1){

                    opcion3 = vista.menuMultimedia();
                    
                    if (opcion3 == 1){
                        publicacion.publicarImagen();
                        publicacion.imprimirPosts();
                    } else if (opcion3 == 2){
                        publicacion.publicarVideo();
                        publicacion.imprimirPosts();
                    } else if (opcion3 == 3){
                        publicacion.publicarAudios();
                        publicacion.imprimirPosts();
                    }
                } else if (opcion2 == 2){

                    publicacion.publicarTexto();

                } else if (opcion2 == 3){

                    publicacion.publicarEmoticon();

                }

            } else if (opcion == 2){

                publicacion.imprimirPosts();


            } else if (opcion == 3){


            } else if (opcion == 4){

               vista.mensajeDespedida();
            }
        }

    }
}