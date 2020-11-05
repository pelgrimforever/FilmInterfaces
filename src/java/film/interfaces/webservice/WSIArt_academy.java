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
public interface WSIArt_academy {
    
    @WebMethod String getArt_academys();

    @WebMethod String search(String json);

    @WebMethod String getArt_academy(String json);

    @WebMethod void insertArt_academy(String json);

    @WebMethod void updateArt_academy(String json);

    @WebMethod void deleteArt_academy(String json);


}

