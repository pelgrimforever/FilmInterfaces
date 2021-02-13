/*
 * IBLgeometry_columns.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.interfaces.logicview.IGeometry_columns;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class Geometry_columns
 * 
 * methods for manipulating data- and database objects
 * for Entity Geometry_columns and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLgeometry_columns extends Serializable {
	
    /**
     * 
     * @return all Geometry_columns objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getGeometry_columnss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
