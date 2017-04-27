package com.mariana.rest;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Class of the presentation layer where the methods of the api rest are declared
*/
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//main Path
@Path("/search_information")
public class Rest {
	//search a product  by known code
	@GET
	@Path("/product/{code}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getCode(@PathParam("code") int codigo) {
		try {
			Object product = null;
			return Response.ok().entity(product).build();

		} catch (Exception e) {
			return Response.status(500).entity(e).build();
		}
	}
	//search Products by column
	@GET
	//word=column  code=variant to search
	@Path("/{word}/{code}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getsearchSpefic(@PathParam("code") String codigo, @PathParam("word") String word) {
		try {
			Object product = null;
			return Response.ok().entity(product).build();

		} catch (Exception e) {
			return Response.status(500).entity(e).build();
		}
	}
	//seach Producs with two variants Column A and Column B
	@GET
	@Path("/search_two_columns/{word}/{code}/{wordTwo}/{codeTwo}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getsearchSpeficReturn(@PathParam("code") String code, @PathParam("word") String word
			,@PathParam("wordTwo") String wordTwo, @PathParam("codeTwo") String codeTwo) {
		try {

			Object Product = null;
			return Response.ok().entity(Product).build();

		} catch (Exception e) {
			return Response.status(500).entity(e).build();
		}
	}

}
