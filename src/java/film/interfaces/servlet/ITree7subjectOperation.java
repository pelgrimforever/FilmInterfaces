/*
 * ITree7subjectOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.interfaces.servlet;

/**
 * Interface ITree7subjectOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ITree7subjectOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_TREE7SUBJECT = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Tree7subjectparentsubjectid = 100 + 0;
    public static final byte SELECT_Phototree7subject = 100 + 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_STEP1 = 5;
    public static final byte SELECT_CHILDREN4PARENT = 6;
    public static final byte SELECT_SEARCHTEXT = 7;
    public static final byte SELECT_PHOTOPK = 8;
    public static final byte SELECT_FILMPK = 9;
    public static final byte SELECT_MOSTUSED = 50;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_TREE7SUBJECT = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_SUBJECT = 11;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_TREE7SUBJECT = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_SUBJECT = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_TREE7SUBJECT = 30;
    public static final byte DELETE_Tree7subjectparentsubjectid = 100 + 2;
//Custom code, do not change this line
//add here custom operations
    public static final byte DELETE_SUBJECT = 31;
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

