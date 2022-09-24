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
public interface WSIPhototree7subject {
    
    @WebMethod String getPhototree7subjects();

    @WebMethod String search(String json);

    @WebMethod String getPhototree7subject(String json);

    @WebMethod void insertPhototree7subject(String json);

    @WebMethod void updatePhototree7subject(String json);

    @WebMethod void deletePhototree7subject(String json);

    @WebMethod String getPhototree7subjects4tree7subject(String json);

    @WebMethod void delete4tree7subject(String json);

    @WebMethod String getPhototree7subjects4photo(String json);

    @WebMethod void delete4photo(String json);


}

