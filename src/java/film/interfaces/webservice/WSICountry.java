package film.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Franky Laseure
 */
//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface WSICountry {
    
    @WebMethod String getCountrys();

    @WebMethod String search(String json);

    @WebMethod String getCountry(String json);

    @WebMethod void insertCountry(String json);

    @WebMethod void updateCountry(String json);

    @WebMethod void deleteCountry(String json);

    @WebMethod String getCountrys4arealevel1(String json);


}
