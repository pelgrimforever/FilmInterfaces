/*
 * WSIPhotosubjects.java
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

