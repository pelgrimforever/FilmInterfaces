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
public interface WSIArt_photo {
    
    @WebMethod String getArt_photos();

    @WebMethod String search(String json);

    @WebMethod String getArt_photo(String json);

    @WebMethod void insertArt_photo(String json);

    @WebMethod void updateArt_photo(String json);

    @WebMethod void deleteArt_photo(String json);

    @WebMethod String getArt_photos4photo(String json);

    @WebMethod void delete4photo(String json);

    @WebMethod String getArt_photos4art_subgroup(String json);

    @WebMethod void delete4art_subgroup(String json);

    @WebMethod String getArt_photos4art_academy(String json);

    @WebMethod void delete4art_academy(String json);

    @WebMethod String getArt_photos4art_group(String json);

    @WebMethod void delete4art_group(String json);


}

