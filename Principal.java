import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("TOy",2000);

        miPelicula.setFechaDeLanzamiento(2000);
        miPelicula.setDuracionEnMinutos(102);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();


        miPelicula.evalua(9.4);
        miPelicula.evalua(8);
        System.out.println((miPelicula.getTotalDeLasEvaluaciones()));
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula= new  Pelicula("CARS",2004);

        otraPelicula.setFechaDeLanzamiento(2004);
        otraPelicula.setDuracionEnMinutos(120);
        otraPelicula.muestraFichaTecnica();


        Serie casaDragon = new Serie("Casa Dragon",2012);
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


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio= new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeDiego = new Pelicula("Avengers End Game",2022);

        peliculaDeDiego.setDuracionEnMinutos(250);
        peliculaDeDiego.setFechaDeLanzamiento(2022);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeDiego);

        System.out.println("Tamano de la lista: "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: "+listaDePeliculas.get(0).toString());


    }
}
