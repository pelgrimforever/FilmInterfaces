/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.servlet;

public interface IFilmOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_FILM = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Filmtype = 100 + 0;
    public static final byte SELECT_Filmsubjects = 100 + 1;
    public static final byte SELECT_Photo = 100 + 2;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ALL4EDIT = 5;
    public static final byte SELECT_GROUPS = 6;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_FILM = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_PROPERTIES = 11;
    public static final byte UPDATE_LOADJPGPROPERTIES = 12;
    public static final byte UPDATE_LOADGPSTRACKS = 13;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_FILM = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_FILM = 30;
    public static final byte DELETE_Filmtype = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
    public static final byte BACKUP_PHOTO = 50;
    public static final byte BACKUP_PHOTOIMAGE = 51;
//Custom code, do not change this line   

}

