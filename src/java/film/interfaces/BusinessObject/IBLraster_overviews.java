/*
 * IBLraster_overviews.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.interfaces.logicview.IRaster_overviews;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class Raster_overviews
 * 
 * methods for manipulating data- and database objects
 * for Entity Raster_overviews and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLraster_overviews extends Serializable {
	
    /**
     * 
     * @return all Raster_overviews objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getRaster_overviewss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
