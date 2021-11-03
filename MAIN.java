public class MAIN{
    public static void main(String[] args){

        Vista vista = new Vista();
        Publicacion publicacion = new Publicacion();
        Post post = new Post();

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;

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
                System.out.println("Si desea dar like o comentar la publicacion, busquela por medio de su fecha depublicacion o hashtag");


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