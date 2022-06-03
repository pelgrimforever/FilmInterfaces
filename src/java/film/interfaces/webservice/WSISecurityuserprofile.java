/*
 * WSISecurityuserprofile.java
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

