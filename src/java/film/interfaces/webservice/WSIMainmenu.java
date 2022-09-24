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
public interface WSIMainmenu {
    
    @WebMethod String getMainmenus();

    @WebMethod String search(String json);

    @WebMethod String getMainmenu(String json);

    @WebMethod void insertMainmenu(String json);

    @WebMethod void updateMainmenu(String json);

    @WebMethod void deleteMainmenu(String json);

    @WebMethod String getMainmenus4menu(String json);


}

