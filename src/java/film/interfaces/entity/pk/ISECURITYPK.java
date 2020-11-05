/*
 * ISECURITYPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2012 16:29
 */

package film.interfaces.entity.pk;

import data.interfaces.db.EntityPKInterface;
import java.io.Serializable;

/**
 * Primary Key class SECURITYPK for entity class SECURITY
 * This interface should not change, only subclassed
 * @author Franky Laseure
 */
public interface ISECURITYPK extends EntityPKInterface, Serializable {

        /**
         *
         * @return 2 dimentional Object array with primarykey fields (fieldname, value)
         */
	public Object[][] getKeyFields();

        /**
         *
         * @return Username value
         */
	public java.lang.String getUsername();
        /**
         * set Username value
         * @param username: new value
         */
	public void setUsername(java.lang.String username);

        /**
         *
         * @return primary key in one formatted string
         */
        public String getKeystring();
}
