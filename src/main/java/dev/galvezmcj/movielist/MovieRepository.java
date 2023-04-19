package dev.galvezmcj.movielist;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Acts as the data access layer for the API
 * Does the talking to the database
 * and gets the data back
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
