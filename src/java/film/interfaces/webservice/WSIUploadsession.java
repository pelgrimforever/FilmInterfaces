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
public interface WSIUploadsession {
    
    @WebMethod String getUploadsessions();

    @WebMethod String search(String json);

    @WebMethod String getUploadsession(String json);

    @WebMethod void insertUploadsession(String json);

    @WebMethod void updateUploadsession(String json);

    @WebMethod void deleteUploadsession(String json);

    @WebMethod String getUploadsessions4creator(String json);

    @WebMethod void delete4creator(String json);


}

