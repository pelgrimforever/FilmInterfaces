/*
 * IView_countryphotocountOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_countryphotocountOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_countryphotocountOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ALLSECURE = 2;
//Custom code, do not change this line
}

