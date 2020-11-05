/*
 * SECURITYPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2012 16:29
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.ISECURITYPK;

/**
 * Primary Key class SECURITYPK for entity class SECURITY
 * This class should not change, only subclassed
 * @author Franky Laseure
 */
public class SECURITYPK implements EntityPKInterface, ISECURITYPK {

	private java.lang.String username;

	/**
         * Constructor
         * Creates an empty SECURITYPK
         */
	public SECURITYPK() {
	}

	/**
	 * Constructor
         * build an empty SECURITYPK with initialized field values
	 */
	public SECURITYPK(java.lang.String username) {
            this.username = username;
	}

        /**
         *
         * @return 2 dimentional Object array with primarykey fields (fieldname, value)
         */
	public Object[][] getKeyFields() {
            Object[][] keyfields = { 
                    {"username", username} };
            return keyfields;
	}

        /**
         *
         * @return Username value
         */
	public java.lang.String getUsername() {
		return this.username;
	}

        /**
         * set Username value
         * @param username: new value
         */
	public void setUsername(java.lang.String username) {
		this.username = username;
	}

        /**
         *
         * @return primary key in one formatted string
         */
        public String getKeystring() {
            return this.username;
        }
}
