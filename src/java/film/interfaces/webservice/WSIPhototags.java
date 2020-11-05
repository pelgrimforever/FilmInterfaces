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
public interface WSIPhototags {
    
    @WebMethod String getPhototagss();

    @WebMethod String search(String json);

    @WebMethod String getPhototags(String json);

    @WebMethod void insertPhototags(String json);

    @WebMethod void updatePhototags(String json);

    @WebMethod void deletePhototags(String json);

    @WebMethod String getPhototagss4photo(String json);

    @WebMethod void delete4photo(String json);


}

