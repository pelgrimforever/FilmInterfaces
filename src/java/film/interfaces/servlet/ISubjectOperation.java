/*
 * ISubjectOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface ISubjectOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ISubjectOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SUBJECT = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Subjectcatcat1 = 100 + 0;
    public static final byte SELECT_Tree7subject = 100 + 1;
    public static final byte SELECT_Subjectcatcat2 = 100 + 2;
    public static final byte SELECT_Filmsubjects = 100 + 3;
    public static final byte SELECT_Photosubjects = 100 + 4;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_CAT1CAT2 = 50;
    public static final byte SELECT_SUBJECTPKLIST = 51;
    public static final byte SELECT_PHOTOPK = 52;
    public static final byte SELECT_FILMPK = 53;
    public static final byte SELECT_Tree7subjecttree7subjectid = 54;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SUBJECT = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SUBJECT = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SUBJECT = 30;
    public static final byte DELETE_Subjectcatcat1 = 100 + 5;
    public static final byte DELETE_Tree7subject = 100 + 6;
    public static final byte DELETE_Subjectcatcat2 = 100 + 7;
//Custom code, do not change this line
//add here custom operations
    public static final byte DELETE_Tree7subjecttree7subjectid = 55;
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

