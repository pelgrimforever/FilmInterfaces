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
public interface WSIUploadsessionsettings {
    
    @WebMethod String getUploadsessionsettingss();

    @WebMethod String search(String json);

    @WebMethod String getUploadsessionsettings(String json);

    @WebMethod void insertUploadsessionsettings(String json);

    @WebMethod void updateUploadsessionsettings(String json);

    @WebMethod void deleteUploadsessionsettings(String json);


}
