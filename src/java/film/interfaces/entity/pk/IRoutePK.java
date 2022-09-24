/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IRoutePK extends EntityPK, Serializable {

    public ISublocalityPK getSublocalityPK();
    public void setSublocalityPK(ISublocalityPK sublocalityPK);

    public java.lang.String getCountrycode();

    public void setCountrycode(java.lang.String countrycode);

    public java.lang.String getPostalcode();

    public void setPostalcode(java.lang.String postalcode);

    public java.lang.String getLocality();

    public void setLocality(java.lang.String locality);

    public java.lang.String getSublocality();

    public void setSublocality(java.lang.String sublocality);

    public java.lang.String getRoutecode();

    public void setRoutecode(java.lang.String routecode);


    public boolean equals(IRoutePK routePK2);

}
