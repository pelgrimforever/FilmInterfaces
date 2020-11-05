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
public interface WSIRoute {
    
    @WebMethod String getRoutes();

    @WebMethod String search(String json);

    @WebMethod String getRoute(String json);

    @WebMethod void insertRoute(String json);

    @WebMethod void updateRoute(String json);

    @WebMethod void deleteRoute(String json);

    @WebMethod String getRoutes4sublocality(String json);

    @WebMethod void delete4sublocality(String json);


}

