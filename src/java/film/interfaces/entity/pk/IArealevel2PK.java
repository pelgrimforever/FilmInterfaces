/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IArealevel2PK extends EntityPK, Serializable {

    public IArealevel1PK getArealevel1PK();
    public void setArealevel1PK(IArealevel1PK arealevel1PK);

    public java.lang.String getCountrycode();

    public void setCountrycode(java.lang.String countrycode);

    public java.lang.String getAl1code();

    public void setAl1code(java.lang.String al1code);

    public java.lang.String getAl2code();

    public void setAl2code(java.lang.String al2code);


    public boolean equals(IArealevel2PK arealevel2PK2);

}
