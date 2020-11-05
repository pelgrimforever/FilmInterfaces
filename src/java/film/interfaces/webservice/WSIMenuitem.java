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
public interface WSIMenuitem {
    
    @WebMethod String getMenuitems();

    @WebMethod String search(String json);

    @WebMethod String getMenuitem(String json);

    @WebMethod void insertMenuitem(String json);

    @WebMethod void updateMenuitem(String json);

    @WebMethod void deleteMenuitem(String json);

    @WebMethod String getMenuitems4menu(String json);

    @WebMethod void delete4menu(String json);


}

