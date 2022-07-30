/*
 * WSISpatial_ref_sys.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
public interface WSISpatial_ref_sys {
    
    @WebMethod String getSpatial_ref_syss();

    @WebMethod String search(String json);

    @WebMethod String getSpatial_ref_sys(String json);

    @WebMethod void insertSpatial_ref_sys(String json);

    @WebMethod void updateSpatial_ref_sys(String json);

    @WebMethod void deleteSpatial_ref_sys(String json);


}

