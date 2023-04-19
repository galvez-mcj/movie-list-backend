package dev.galvezmcj.movielist;

import org.springframework.beans.factory.annotation.Autowired; // automatically instantiate a class
import org.springframework.stereotype.Service;

import java.util.List;

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
     * @return a list with movie elements
     */
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
