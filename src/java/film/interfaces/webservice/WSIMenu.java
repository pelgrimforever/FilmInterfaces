/*
 * WSIMenu.java
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
public interface WSIMenu {
    
    @WebMethod String getMenus();

    @WebMethod String search(String json);

    @WebMethod String getMenu(String json);

    @WebMethod void insertMenu(String json);

    @WebMethod void updateMenu(String json);

    @WebMethod void deleteMenu(String json);

    @WebMethod String getMenus4mainmenu(String json);

    @WebMethod void delete4mainmenu(String json);

    @WebMethod String getMenus4menuitem(String json);


}

