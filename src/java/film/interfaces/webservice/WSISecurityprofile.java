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
public interface WSISecurityprofile {
    
    @WebMethod String getSecurityprofiles();

    @WebMethod String search(String json);

    @WebMethod String getSecurityprofile(String json);

    @WebMethod void insertSecurityprofile(String json);

    @WebMethod void updateSecurityprofile(String json);

    @WebMethod void deleteSecurityprofile(String json);

    @WebMethod String getSecurityprofiles4securityuserprofile(String json);


}

