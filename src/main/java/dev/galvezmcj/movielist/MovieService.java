package dev.galvezmcj.movielist;

import org.springframework.beans.factory.annotation.Autowired; // automatically instantiate a class
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
