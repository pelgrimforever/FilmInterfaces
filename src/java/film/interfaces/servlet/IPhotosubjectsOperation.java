/*
 * IPhotosubjectsOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IPhotosubjectsOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IPhotosubjectsOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_PHOTOSUBJECTS = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Photo = 100 + 0;
    public static final byte SELECT_Subject = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_PHOTOSUBJECTS = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_PHOTOSUBJECTS = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_PHOTOSUBJECT_RELOAD = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_PHOTOSUBJECTS = 30;
    public static final byte DELETE_Photo = 100 + 2;
    public static final byte DELETE_Subject = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

