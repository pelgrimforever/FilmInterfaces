/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public interface WSIFilmtest {
    
    @WebMethod String test();
    
    @WebMethod ArrayList testarray();
}
