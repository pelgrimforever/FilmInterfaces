/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.servlet;

public interface IPhotoOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_PHOTO = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Route = 100 + 0;
    public static final byte SELECT_Creator = 100 + 1;
    public static final byte SELECT_Film = 100 + 2;
    public static final byte SELECT_Phototree7subject = 100 + 3;
    public static final byte SELECT_Art_photo = 100 + 4;
    public static final byte SELECT_Photosubjects = 100 + 5;
    public static final byte SELECT_Phototags = 100 + 6;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_4FILM = 5;
    public static final byte SELECT_4FILM_EDIT = 6;

    public static final byte SELECT_SMALLIMAGE = 7;
    public static final byte SELECT_CROPPEDIMAGE = 8;
    public static final byte SELECT_SEARCHAUTH = 9;
    
    public static final byte SELECT_LOCATION = 12;
    public static final byte DOWNLOAD_SMALLIMAGE = 13;
    public static final byte SELECT_SEARCHWITHIMAGESBASE64 = 14;
    public static final byte SECURESELECT_SEARCHCOUNT = 15;
    public static final byte SECURESELECT_DESCRIPTIONS = 16;
    public static final byte SECURESELECT_COUNT = 17;
    public static final byte SECURESELECT_DATE = 18;
    public static final byte SELECT_LOCATIONS = 19;
    
    public static final byte GETTHUMBNAIL = 20;
    public static final byte GETSMALL = 21;
    public static final byte SELECT_FilmWITHIMAGESBASE64 = 22;
    
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_PHOTO = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_PROPERTIES = 11;
    public static final byte UPDATE_GEOLOCATION = 16;
    public static final byte UPDATE_COPYPREVGEOLOCATION = 17;
    public static final byte UPDATE_COPYPHOTOGEOLOCATION = 18;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_PHOTO = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_ROOT = 21;
    public static final byte INSERT_CROPPED = 22;
    public static final byte INSERT_MANUAL = 23;
    public static final byte INSERT_CONROOT = 24;
    public static final byte INSERT_CONCROPPED = 25;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_PHOTO = 30;
    public static final byte DELETE_Route = 100 + 7;
    public static final byte DELETE_Creator = 100 + 8;
    public static final byte DELETE_Film = 100 + 9;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

