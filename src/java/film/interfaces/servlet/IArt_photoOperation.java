/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.servlet;

public interface IArt_photoOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_ART_PHOTO = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Photo = 100 + 0;
    public static final byte SELECT_Art_subgroup = 100 + 1;
    public static final byte SELECT_Art_academy = 100 + 2;
    public static final byte SELECT_Art_group = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_ART_PHOTO = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_ART_PHOTO = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_ART_PHOTO = 30;
    public static final byte DELETE_Photo = 100 + 4;
    public static final byte DELETE_Art_subgroup = 100 + 5;
    public static final byte DELETE_Art_academy = 100 + 6;
    public static final byte DELETE_Art_group = 100 + 7;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

