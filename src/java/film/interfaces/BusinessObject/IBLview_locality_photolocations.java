/*
 * IBLview_locality_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.interfaces.logicview.IView_locality_photolocations;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_locality_photolocations
 * 
 * methods for manipulating data- and database objects
 * for Entity View_locality_photolocations and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_locality_photolocations extends Serializable {
	
    /**
     * 
     * @return all View_locality_photolocations objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getView_locality_photolocationss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
