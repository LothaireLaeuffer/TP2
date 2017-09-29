package fr.cpe;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/add")
public interface ICalculRestService {

	@GET
	@Produces("application/json")
	Double add(@QueryParam("a") List<Double> a);
}
