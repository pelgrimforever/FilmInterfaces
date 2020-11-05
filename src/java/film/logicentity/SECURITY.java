/*
 * SECURITY.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2012 16:29
 *
 */

package film.logicentity;

import film.entity.pk.SECURITYPK;
import film.interfaces.entity.pk.ISECURITYPK;
import film.interfaces.logicentity.ISECURITY;

/**
 * Entity class SECURITY
 *
 * Standard Security class, real security class can subclass SECURITY
 * SECURITY class is used throughout the application to check security details
 * Template Attributes: primary key, foreign keys en fields
 * @author Franky Laseure
 */
public class SECURITY implements ISECURITY {

    /**
     * Constructor
     * Creates an empty SECURITY entity
     */
    public SECURITY() {
    }

    /**
     * @return Dummy Primary Key Object
     * needs to be overriden
     */
    public ISECURITYPK getPrimaryKey() {
        return new SECURITYPK("dummy");
    }

    /**
     *
     * @return username value
     */
    public java.lang.String getUsername() {
        return "Dummy";
    }

    /**
     *
     * @return firstname value
     */
    public java.lang.String getFirstname() {
        return "Dummy";
    }

    /**
     *
     * @return lastname value
     */
    public java.lang.String getLastname() {
        return "Dummy";
    }

    /**
     *
     * @return password value
     */
    public java.lang.String getPassword() {
        return "";
    }

    /**
     *
     * @return boolean isadmin
     */
    public boolean getIsadmin() {
        return false;
    }
}
