// Clase Principal con listas

public class PrincipalConListas{
  public static void main(String[] arg){
    Pelicula miPelicula = new Pelicula( "Encanto", 2021);
    miPelicula.evalua(2)
    Pelicula otraPelicula = new Pelicula( "Avatar", 2023);
    otraPelicula.evalua(6) 
    var peliculaDeBruno = new Pelicula( "El senor de los anillos", 2001);
    peliculaDeBruno.evalua(10)
    Serie lost = new Serie("Lost", 2000)

    ArrayList<Object> lista = new ArrayList<>(); // Aqui Cambio Pelicula por titulo dado que serie y Pelicula heredan de Titulo// 
    lista.add(peliculaDeBruno);
    lista.add(miPelicula);
    lista.add(otraPelicula);
    lista.add(lost); // Debemos cambiar lista de tipo array pelicula a tipo de array Serie 

    for (Titulo Item: Lista){ // Del lado derecho ponemo lo que queremos iterar y de lado izquierdo ponemmos como queremos llamar a cada uno de esos item
      System.out.println(item.getNombre());
      if (item instanceof Pelicula pelicula && pelicula.getClasificacion > 2 ){
        //Pelicula pelicula =  (Pelicula) item; //Casting colocar entre parentesis el nombre de la variable que voy a convertir, porque el casting  se hace solo de pelicula y no de string
        System.out.println(item.getClasificacion());
        
        //int numero1 = 1;
        //int numero2 = numero1; // si actualizo o cambio el valor de esta variable numero1 se actualiza 
        Pelicula p1 = peliculaDeBruno; 
        
      }
    }

    ArrayList<String> listaDeArtistas = new Arraylist<>();
    listaDeArtistas.add("Penemope Cruz")
    listaDeArtistas.add("Antonio Banderas")
    listaDeArtistas.add("Ricardo Darin")

      Collections.sort(listaDeArtistas); //biblioteca del paquete JAVALAND para ordenar por orden de los nombres
      System.out.println("Lista de artistas ordenada" + listaDeArtistas)
}
