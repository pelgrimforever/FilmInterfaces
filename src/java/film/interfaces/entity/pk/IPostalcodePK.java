/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IPostalcodePK extends EntityPK, Serializable {

    public java.lang.String getCountrycode();

    public void setCountrycode(java.lang.String countrycode);

    public java.lang.String getPostalcode();

    public void setPostalcode(java.lang.String postalcode);


    public boolean equals(IPostalcodePK postalcodePK2);

}
