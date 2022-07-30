/*
 * IPhototree7subjectOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.interfaces.servlet;

/**
 * Interface IPhototree7subjectOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IPhototree7subjectOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_PHOTOTREE7SUBJECT = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Tree7subject = 100 + 0;
    public static final byte SELECT_Photo = 100 + 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_SUBJECT = 5;
    public static final byte SELECT_PHOTO = 6;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_PHOTOTREE7SUBJECT = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_PHOTOTREE7SUBJECT = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_PHOTOSUBJECT = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_PHOTOTREE7SUBJECT = 30;
    public static final byte DELETE_Tree7subject = 100 + 2;
    public static final byte DELETE_Photo = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

