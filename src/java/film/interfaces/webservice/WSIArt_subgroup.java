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
public interface WSIArt_subgroup {
    
    @WebMethod String getArt_subgroups();

    @WebMethod String search(String json);

    @WebMethod String getArt_subgroup(String json);

    @WebMethod void insertArt_subgroup(String json);

    @WebMethod void updateArt_subgroup(String json);

    @WebMethod void deleteArt_subgroup(String json);

    @WebMethod String getArt_subgroups4art_group(String json);

    @WebMethod void delete4art_group(String json);


}

