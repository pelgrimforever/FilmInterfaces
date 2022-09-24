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
public interface WSISecurityuserprofile {
    
    @WebMethod String getSecurityuserprofiles();

    @WebMethod String search(String json);

    @WebMethod String getSecurityuserprofile(String json);

    @WebMethod void insertSecurityuserprofile(String json);

    @WebMethod void updateSecurityuserprofile(String json);

    @WebMethod void deleteSecurityuserprofile(String json);

    @WebMethod String getSecurityuserprofiles4securityprofile(String json);

    @WebMethod void delete4securityprofile(String json);


}

