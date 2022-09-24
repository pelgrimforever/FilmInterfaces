/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISecurityuserprofilePK extends EntityPK, Serializable {

    public ISecurityprofilePK getSecurityprofilePK();
    public void setSecurityprofilePK(ISecurityprofilePK securityprofilePK);

    public java.lang.String getUserprofile();

    public void setUserprofile(java.lang.String userprofile);

    public java.lang.String getSiteusername();

    public void setSiteusername(java.lang.String siteusername);


    public boolean equals(ISecurityuserprofilePK securityuserprofilePK2);

}
