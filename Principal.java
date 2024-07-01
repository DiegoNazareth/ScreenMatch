public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre="TOy";
        miPelicula.fechaDeLanzamiento=2000;
        miPelicula.duracionEnMinutos=102;

        miPelicula.muestraFichaTecnica();

        Pelicula otraPelicula= new  Pelicula();
        miPelicula.evalua(9.4);
        miPelicula.evalua(8);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println((miPelicula.totalDeLasEvaluaciones));
        System.out.println(miPelicula.calculaMedia());

        otraPelicula.nombre="CARS";
        otraPelicula.fechaDeLanzamiento=2004;
        otraPelicula.duracionEnMinutos=120;

        //otraPelicula.muestraFichaTecnica();

    }
}
