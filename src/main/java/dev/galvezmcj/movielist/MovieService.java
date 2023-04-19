package dev.galvezmcj.movielist;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired; // automatically instantiate a class
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Most of the business logic will be written
 * Uses the repository class
 */
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    /**
     * Fetches all movies from the database
     * @return a list with Movie objects as elements
     */
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    /**
     * Fetch a single movie from the database
     * @param imdbId the equivalent imdbId of the movie
     * @return a Movie object containing the details of the movie
     */
    public Optional<Movie> oneMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
