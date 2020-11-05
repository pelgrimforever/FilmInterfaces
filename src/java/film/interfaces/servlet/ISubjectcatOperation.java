/*
 * ISubjectcatOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface ISubjectcatOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ISubjectcatOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SUBJECTCAT = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Subjectcat1 = 100 + 0;
    public static final byte SELECT_Subjectcat2 = 100 + 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_GROUPS = 5;
    public static final byte SELECT_CAT1 = 6;
    public static final byte SELECT_CAT2 = 7;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SUBJECTCAT = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SUBJECTCAT = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_CAT1 = 21;
    public static final byte INSERT_CAT2 = 22;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SUBJECTCAT = 30;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

