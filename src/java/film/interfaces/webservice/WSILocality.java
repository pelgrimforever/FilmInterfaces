/*
 * WSILocality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

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
public interface WSILocality {
    
    @WebMethod String getLocalitys();

    @WebMethod String search(String json);

    @WebMethod String getLocality(String json);

    @WebMethod void insertLocality(String json);

    @WebMethod void updateLocality(String json);

    @WebMethod void deleteLocality(String json);

    @WebMethod String getLocalitys4postalcode(String json);

    @WebMethod void delete4postalcode(String json);

    @WebMethod String getLocalitys4sublocality(String json);


}

