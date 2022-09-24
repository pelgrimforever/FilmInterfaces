/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

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

