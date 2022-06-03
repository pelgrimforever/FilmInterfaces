/*
 * IView_photolocationsOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.interfaces.servlet;

/**
 * Interface IView_photolocationsOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_photolocationsOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SECURESELECT_ALL = 2;
    public static final byte SELECT_LOCALITY = 3;
//Custom code, do not change this line
}

