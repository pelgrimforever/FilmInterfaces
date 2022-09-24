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
public interface WSIPhotosubjects {
    
    @WebMethod String getPhotosubjectss();

    @WebMethod String search(String json);

    @WebMethod String getPhotosubjects(String json);

    @WebMethod void insertPhotosubjects(String json);

    @WebMethod void updatePhotosubjects(String json);

    @WebMethod void deletePhotosubjects(String json);

    @WebMethod String getPhotosubjectss4photo(String json);

    @WebMethod void delete4photo(String json);

    @WebMethod String getPhotosubjectss4subject(String json);

    @WebMethod void delete4subject(String json);


}

