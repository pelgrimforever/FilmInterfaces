/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.servlet;

public interface ISublocalityOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SUBLOCALITY = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Locality = 100 + 0;
    public static final byte SELECT_Route = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SUBLOCALITY = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SUBLOCALITY = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SUBLOCALITY = 30;
    public static final byte DELETE_Locality = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

