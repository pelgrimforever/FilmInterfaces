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
public interface WSIPhoto {
    
    @WebMethod String getPhotos();

    @WebMethod String search(String json);

    @WebMethod String getPhoto(String json);

    @WebMethod void insertPhoto(String json);

    @WebMethod void updatePhoto(String json);

    @WebMethod void deletePhoto(String json);

    @WebMethod String getPhotos4route(String json);

    @WebMethod void delete4route(String json);

    @WebMethod String getPhotos4creator(String json);

    @WebMethod void delete4creator(String json);

    @WebMethod String getPhotos4film(String json);

    @WebMethod void delete4film(String json);

    @WebMethod String getPhotos4phototree7subject(String json);

    @WebMethod String getPhotos4art_photo(String json);

    @WebMethod String getPhotos4photosubjects(String json);

    @WebMethod String getPhotos4phototags(String json);


}

