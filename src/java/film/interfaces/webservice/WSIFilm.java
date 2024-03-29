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
public interface WSIFilm {
    
    @WebMethod String getFilms();

    @WebMethod String search(String json);

    @WebMethod String getFilm(String json);

    @WebMethod void insertFilm(String json);

    @WebMethod void updateFilm(String json);

    @WebMethod void deleteFilm(String json);

    @WebMethod String getFilms4filmtype(String json);

    @WebMethod void delete4filmtype(String json);

    @WebMethod String getFilms4filmsubjects(String json);

    @WebMethod String getFilms4photo(String json);


}

