/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IArealevel1PK extends EntityPK, Serializable {

    public ICountryPK getCountryPK();
    public void setCountryPK(ICountryPK countryPK);

    public java.lang.String getCountrycode();

    public void setCountrycode(java.lang.String countrycode);

    public java.lang.String getAl1code();

    public void setAl1code(java.lang.String al1code);


    public boolean equals(IArealevel1PK arealevel1PK2);

}
