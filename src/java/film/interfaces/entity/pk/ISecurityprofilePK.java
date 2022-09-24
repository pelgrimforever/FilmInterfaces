/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISecurityprofilePK extends EntityPK, Serializable {

    public java.lang.String getUserprofile();

    public void setUserprofile(java.lang.String userprofile);


    public boolean equals(ISecurityprofilePK securityprofilePK2);

}
