package cz.jzeman.swagger.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import cz.jzeman.swagger.entity.Plus;
import cz.jzeman.swagger.entity.PlusResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by jazeman on 27/01/2017.
 */
@Path("/entry-point")
@Api(value = "/entry-point", description = "Arithmetic operations")
public class Main {
    /**
     * Count a result of plus operation
     *
     * @param msg    json serialization of {@link Plus}
     * @return
     * @responseType    cz.jzeman.swagger.entity.PlusResult
     * @inputType   cz.jzeman.swagger.entity.Plus
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("plus")
    @ApiOperation(value = "Plus operation",
            notes = "Plus operation returns result of plus operation. For example 2 + 3 = 5",
            response = PlusResult.class)
    public PlusResult plus(Plus msg) throws Exception{
        return new PlusResult(msg.getOperatorA(), msg.getOperatorB());
    }
}
