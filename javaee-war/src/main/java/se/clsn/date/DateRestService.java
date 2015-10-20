package se.clsn.date;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/date")
public class DateRestService {

    @Inject
    DateService dateService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getHelloWorldJSON() {
        return Json.createObjectBuilder().add("date", dateService.getDate()).build();
    }


}
