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
public interface WSIMenuitem {
    
    @WebMethod String getMenuitems();

    @WebMethod String search(String json);

    @WebMethod String getMenuitem(String json);

    @WebMethod void insertMenuitem(String json);

    @WebMethod void updateMenuitem(String json);

    @WebMethod void deleteMenuitem(String json);

    @WebMethod String getMenuitems4menu(String json);

    @WebMethod void delete4menu(String json);


}

