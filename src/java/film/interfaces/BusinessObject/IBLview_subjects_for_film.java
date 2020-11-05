/*
 * IBLview_subjects_for_film.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.interfaces.logicview.IView_subjects_for_film;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_subjects_for_film
 * 
 * methods for manipulating data- and database objects
 * for Entity View_subjects_for_film and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_subjects_for_film extends Serializable {
	
    /**
     * 
     * @return all View_subjects_for_film objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getView_subjects_for_films() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
