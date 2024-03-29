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
public interface WSIPostalcode {
    
    @WebMethod String getPostalcodes();

    @WebMethod String search(String json);

    @WebMethod String getPostalcode(String json);

    @WebMethod void insertPostalcode(String json);

    @WebMethod void updatePostalcode(String json);

    @WebMethod void deletePostalcode(String json);

    @WebMethod String getPostalcodes4arealevel3(String json);

    @WebMethod void delete4arealevel3(String json);

    @WebMethod String getPostalcodes4locality(String json);


}

