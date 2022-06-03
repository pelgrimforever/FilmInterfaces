/*
 * WSIArt_group.java
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
public interface WSIArt_group {
    
    @WebMethod String getArt_groups();

    @WebMethod String search(String json);

    @WebMethod String getArt_group(String json);

    @WebMethod void insertArt_group(String json);

    @WebMethod void updateArt_group(String json);

    @WebMethod void deleteArt_group(String json);


}

