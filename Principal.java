import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("TOy");
        miPelicula.setFechaDeLanzamiento(2000);
        miPelicula.setDuracionEnMinutos(102);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();

        Pelicula otraPelicula= new  Pelicula();
        miPelicula.evalua(9.4);
        miPelicula.evalua(8);


        System.out.println((miPelicula.getTotalDeLasEvaluaciones()));
        System.out.println(miPelicula.calculaMedia());

//        otraPelicula.nombre="CARS";
//        otraPelicula.fechaDeLanzamiento=2004;
//        otraPelicula.duracionEnMinutos=120;
//
//        //otraPelicula.muestraFichaTecnica();

    }
}
