/*
 * WSIArealevel2.java
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
public interface WSIArealevel2 {
    
    @WebMethod String getArealevel2s();

    @WebMethod String search(String json);

    @WebMethod String getArealevel2(String json);

    @WebMethod void insertArealevel2(String json);

    @WebMethod void updateArealevel2(String json);

    @WebMethod void deleteArealevel2(String json);

    @WebMethod String getArealevel2s4arealevel1(String json);

    @WebMethod void delete4arealevel1(String json);

    @WebMethod String getArealevel2s4arealevel3(String json);


}

