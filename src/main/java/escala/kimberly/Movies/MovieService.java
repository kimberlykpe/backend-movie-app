package escala.kimberly.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    // instantiate MovieRepository using framework with @Autowired
    @Autowired
    //ref of repository
    private MovieRepository movieRepository;
    // List<Movie> rtype
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    // Optional because can be null. apply to all forms of the singleMovie function
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
