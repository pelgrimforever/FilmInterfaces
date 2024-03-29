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
public interface WSISubjectcat {
    
    @WebMethod String getSubjectcats();

    @WebMethod String search(String json);

    @WebMethod String getSubjectcat(String json);

    @WebMethod void insertSubjectcat(String json);

    @WebMethod void updateSubjectcat(String json);

    @WebMethod void deleteSubjectcat(String json);

    @WebMethod String getSubjectcats4subjectCat1(String json);

    @WebMethod String getSubjectcats4subjectCat2(String json);


}

