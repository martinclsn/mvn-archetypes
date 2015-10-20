package se.clsn.date;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/date")
public class DateRestService {

    @EJB
    DateService dateService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getDate() {
        String date = dateService.getDate();
        return Json.createObjectBuilder().add("date", date).build();
    }


}
