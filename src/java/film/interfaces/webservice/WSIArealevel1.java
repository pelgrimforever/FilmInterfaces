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
public interface WSIArealevel1 {
    
    @WebMethod String getArealevel1s();

    @WebMethod String search(String json);

    @WebMethod String getArealevel1(String json);

    @WebMethod void insertArealevel1(String json);

    @WebMethod void updateArealevel1(String json);

    @WebMethod void deleteArealevel1(String json);

    @WebMethod String getArealevel1s4country(String json);

    @WebMethod void delete4country(String json);

    @WebMethod String getArealevel1s4arealevel2(String json);


}

