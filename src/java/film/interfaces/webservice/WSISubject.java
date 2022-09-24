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
public interface WSISubject {
    
    @WebMethod String getSubjects();

    @WebMethod String search(String json);

    @WebMethod String getSubject(String json);

    @WebMethod void insertSubject(String json);

    @WebMethod void updateSubject(String json);

    @WebMethod void deleteSubject(String json);

    @WebMethod String getSubjects4subjectcatCat1(String json);

    @WebMethod void delete4subjectcatCat1(String json);

    @WebMethod String getSubjects4tree7subject(String json);

    @WebMethod void delete4tree7subject(String json);

    @WebMethod String getSubjects4subjectcatCat2(String json);

    @WebMethod void delete4subjectcatCat2(String json);

    @WebMethod String getSubjects4filmsubjects(String json);

    @WebMethod String getSubjects4photosubjects(String json);


}

