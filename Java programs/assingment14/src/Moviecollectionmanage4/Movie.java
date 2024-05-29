package Moviecollectionmanage4;

import java.util.ArrayList;
import java.util.List;

class Movie {
    private int movieID;
    private String title;
    private String director;
    private String genre;
    private int yearReleased;

    public Movie(int movieID, String title, String director, String genre, int yearReleased) {
        this.movieID = movieID;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }

    public static class MovieCollectionManager {
        private List<Movie> movies;

        public MovieCollectionManager() {
            movies = new ArrayList<>();
        }

        public void addMovie(Movie movie) {
            movies.add(movie);
        }

        public void removeMovieById(int movieID) {
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getMovieID() == movieID) {
                    movies.remove(i);
                    break;
                }
            }
        }

        public Movie findMovieByTitle(String title) {
            for (Movie movie : movies) {
                if (movie.getTitle().equalsIgnoreCase(title)) {
                    return movie;
                }
            }
            return null;
        }

        public void displayMoviesByGenre(String genre) {
            for (Movie movie : movies) {
                if (movie.getGenre().equalsIgnoreCase(genre)) {
                    System.out.println(movie);
                }
            }
        }

        public static void main(String[] args) {
            MovieCollectionManager movieManager = new MovieCollectionManager();
            movieManager.addMovie(new Movie(1, "Inception", "Christopher Nolan", "Sci-Fi", 2010));
            movieManager.addMovie(new Movie(2, "The Dark Knight", "Christopher Nolan", "Action", 2008));
            movieManager.addMovie(new Movie(3, "Interstellar", "Christopher Nolan", "Sci-Fi", 2014));

            // Display all movies
            System.out.println("All movies:");
            for (Movie movie : movieManager.movies) {
                System.out.println(movie);
            }
            System.out.println();

            // Remove a movie by ID
            movieManager.removeMovieById(2);

            // Display all movies after removing one
            System.out.println("All movies after removing one:");
            for (Movie movie : movieManager.movies) {
                System.out.println(movie);
            }
            System.out.println();

            // Find and display a movie by title
            System.out.println("Find and display a movie by title:");
            Movie foundMovie = movieManager.findMovieByTitle("Inception");
            if (foundMovie != null) {
                System.out.println(foundMovie);
            } else {
                System.out.println("Movie not found");
            }
            System.out.println();

            // Display movies by genre
            System.out.println("Movies by genre:");
            movieManager.displayMoviesByGenre("Sci-Fi");
        }
    }
}
