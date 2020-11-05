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
public interface WSIArealevel3 {
    
    @WebMethod String getArealevel3s();

    @WebMethod String search(String json);

    @WebMethod String getArealevel3(String json);

    @WebMethod void insertArealevel3(String json);

    @WebMethod void updateArealevel3(String json);

    @WebMethod void deleteArealevel3(String json);

    @WebMethod String getArealevel3s4arealevel2(String json);

    @WebMethod void delete4arealevel2(String json);


}

