/*
 * ISECURITY.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2012 16:29
 *
 */

package film.interfaces.logicentity;

import data.interfaces.db.EntityPKInterface;

/**
 * Entity class ISECURITY
 *
 * Standard Security interface
 * SECURITY interface is used throughout the application to check security details
 * Template Attributes
 * @author Franky Laseure
 */
public interface ISECURITY {

    /**
     * @return Dummy Primary Key Object
     * needs to be overriden
     */
    public EntityPKInterface getPrimaryKey();

    public static final int SIZE_USERNAME = 10;
    public static final int SIZE_FIRSTNAME = 25;
    public static final int SIZE_LASTNAME = 25;
    public static final int SIZE_PASSWORD = 15;
    public static final int SIZE_ISADMIN = 1;

    /**
     *
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     *
     * @return firstname value
     */
    public java.lang.String getFirstname();

    /**
     *
     * @return lastname value
     */
    public java.lang.String getLastname();

    /**
     *
     * @return password value
     */
    public java.lang.String getPassword();

    /**
     *
     * @return boolean isadmin
     */
    public boolean getIsadmin();
}
