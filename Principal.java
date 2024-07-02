import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("TOy");
        miPelicula.setFechaDeLanzamiento(2000);
        miPelicula.setDuracionEnMinutos(102);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();


        miPelicula.evalua(9.4);
        miPelicula.evalua(8);
        System.out.println((miPelicula.getTotalDeLasEvaluaciones()));
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula= new  Pelicula();
        otraPelicula.setNombre("CARS");
        otraPelicula.setFechaDeLanzamiento(2004);
        otraPelicula.setDuracionEnMinutos(120);
        otraPelicula.muestraFichaTecnica();


        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa Dragon");
        casaDragon.setFechaDeLanzamiento(2012);
        casaDragon.setTemporadas(5);
        casaDragon.setMinutosPorEpisodio(40);
        casaDragon.setEpisodiosPorTemporada(12);
        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();



        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        calculadora.incluye(casaDragon);

        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: " +calculadora.getTiempoTotal()+ " minutos");





    }
}
