import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pelicula {
    private String titulo;
    private int anioLanzamiento;
    private String genero;

    public Pelicula(String titulo, int anioLanzamiento, String genero) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + anioLanzamiento + ", Género: " + genero;
    }
}

public class SistemaOrdenarPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        System.out.println("¿Cuántas películas desea ingresar?");
        int numPeliculas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPeliculas; i++) {
            System.out.println("\nPelícula " + (i + 1) + ":");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Año de lanzamiento: ");
            int anioLanzamiento = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Género: ");
            String genero = scanner.nextLine();

            peliculas.add(new Pelicula(titulo, anioLanzamiento, genero));
        }

        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getAnioLanzamiento));

        System.out.println("\nLista de películas ordenada por año de lanzamiento:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        scanner.close();
    }
}
