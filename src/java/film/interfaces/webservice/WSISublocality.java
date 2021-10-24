/*
 * WSISublocality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
public interface WSISublocality {
    
    @WebMethod String getSublocalitys();

    @WebMethod String search(String json);

    @WebMethod String getSublocality(String json);

    @WebMethod void insertSublocality(String json);

    @WebMethod void updateSublocality(String json);

    @WebMethod void deleteSublocality(String json);

    @WebMethod String getSublocalitys4locality(String json);

    @WebMethod void delete4locality(String json);

    @WebMethod String getSublocalitys4route(String json);


}

