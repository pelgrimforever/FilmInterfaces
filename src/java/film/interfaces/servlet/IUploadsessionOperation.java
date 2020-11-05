/*
 * IUploadsessionOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IUploadsessionOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IUploadsessionOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_UPLOADSESSION = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Creator = 100 + 0;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ALLWITHPHOTOPK = 5;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_UPLOADSESSION = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_UPLOADSESSION = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_UPLOADSESSIONS = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_UPLOADSESSION = 30;
    public static final byte DELETE_Creator = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

