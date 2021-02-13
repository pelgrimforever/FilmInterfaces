/*
 * IBLview_backupstatus.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.interfaces.logicview.IView_backupstatus;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_backupstatus
 * 
 * methods for manipulating data- and database objects
 * for Entity View_backupstatus and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_backupstatus extends Serializable {
	
    /**
     * 
     * @return all View_backupstatus objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getView_backupstatuss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
