/**
 * Esta clase es el controlador del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class MAIN{
    public static void main(String[] args){

        //Objeto tipo vista
        Vista vista = new Vista();
        //Objeto tipo publicacion
        Publicacion publicacion = new Publicacion();
        //Objeto tipo post
        Post post = new Post();

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        
        /**
         * Esta clase es el controlador del programa.
         * @author: Linda Ines Jimenez Vides
         * @version: 2 - noviembre - 2021
         */
        while (opcion != 4){

            opcion = vista.menuPrincipal();

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
                    publicacion.imprimirPosts();

                } else if (opcion2 == 3){

                    publicacion.publicarEmoticon();
                    publicacion.imprimirPosts();

                }

            } else if (opcion == 2){

                publicacion.imprimirPosts();
                System.out.println("\nSi desea dar like o comentar la publicacion, busquela por medio de su fecha depublicacion o hashtag\n");


            } else if (opcion == 3){
                
                publicacion.BuscarPost();
                vista.menuReaccion();
                if (opcion4 == 1){
                    post.darLike();
                    publicacion.imprimirPosts();
                }

            } else if (opcion == 4){

               vista.mensajeDespedida();
            }
        }

    }
}