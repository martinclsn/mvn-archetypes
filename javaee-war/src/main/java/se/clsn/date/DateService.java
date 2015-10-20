package se.clsn.date;

import javax.ejb.Stateless;
import java.util.Date;

@Stateless
public class DateService {

    public String getDate() {
        return new Date().toString();
    }

}
