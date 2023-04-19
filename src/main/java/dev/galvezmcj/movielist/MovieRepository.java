package dev.galvezmcj.movielist;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Acts as the data access layer for the API
 * Does the talking to the database
 * and gets the data back
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    /**
     * New method to be implemented
     * findMovieByImdbId
     * @param imdbId should be unique
     * @return the Movie object with the matching imdbId
     */
    Optional<Movie> findMovieByImdbId(String imdbId);
}
