/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IMainmenuPK extends EntityPK, Serializable {

    public java.lang.String getMainmenu();

    public void setMainmenu(java.lang.String mainmenu);


    public boolean equals(IMainmenuPK mainmenuPK2);

}
