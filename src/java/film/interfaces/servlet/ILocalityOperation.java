/*
 * ILocalityOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.interfaces.servlet;

/**
 * Interface ILocalityOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ILocalityOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_LOCALITY = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Postalcode = 100 + 0;
    public static final byte SELECT_Sublocality = 100 + 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_COUNTRY = 5;
    public static final byte SELECT_AL1 = 6;
    public static final byte SELECT_AL2 = 7;
    public static final byte SELECT_AL3 = 8;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_LOCALITY = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_LOCALITY = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_LOCALITY = 30;
    public static final byte DELETE_Postalcode = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

