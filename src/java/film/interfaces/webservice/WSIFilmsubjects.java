/*
 * WSIFilmsubjects.java
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
public interface WSIFilmsubjects {
    
    @WebMethod String getFilmsubjectss();

    @WebMethod String search(String json);

    @WebMethod String getFilmsubjects(String json);

    @WebMethod void insertFilmsubjects(String json);

    @WebMethod void updateFilmsubjects(String json);

    @WebMethod void deleteFilmsubjects(String json);

    @WebMethod String getFilmsubjectss4subject(String json);

    @WebMethod void delete4subject(String json);

    @WebMethod String getFilmsubjectss4film(String json);

    @WebMethod void delete4film(String json);


}

