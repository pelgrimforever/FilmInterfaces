/*
 * WSIFilmtype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
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
public interface WSIFilmtype {
    
    @WebMethod String getFilmtypes();

    @WebMethod String search(String json);

    @WebMethod String getFilmtype(String json);

    @WebMethod void insertFilmtype(String json);

    @WebMethod void updateFilmtype(String json);

    @WebMethod void deleteFilmtype(String json);


}

