/*
 * WSITree7subject.java
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
public interface WSITree7subject {
    
    @WebMethod String getTree7subjects();

    @WebMethod String search(String json);

    @WebMethod String getTree7subject(String json);

    @WebMethod void insertTree7subject(String json);

    @WebMethod void updateTree7subject(String json);

    @WebMethod void deleteTree7subject(String json);

    @WebMethod String getTree7subjects4tree7subjectParentsubjectid(String json);

    @WebMethod void delete4tree7subjectParentsubjectid(String json);

    @WebMethod String getTree7subjects4phototree7subject(String json);


}

