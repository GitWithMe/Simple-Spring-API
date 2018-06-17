package io.namitproject.springbootquickstart.movielist;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Indicates that this class deals with HTTP Requests
public class MovieListControl {
	

	@RequestMapping("/movieslist") //Maps to all the HTTP Request
	public List<Lists> getAllMovies() {   //Should be of same name as the public class in the same package
		return Arrays.asList( //Designing the RESTful API according the respective id,name,desc
			  new Lists("1","Shawshank Redemption","Wrongly Accused Convict plots to break free and makes a good friend on the way"),
			  new Lists("2","The Matrix","In an apocolyptic future, humans are put into a fake reality created by Machines"),
			  new Lists("3","Avengers: Infinity War","Mr Stark, I don't feel so good")
			);
		
	}

}
