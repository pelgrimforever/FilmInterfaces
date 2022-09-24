/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IMenuitemPK extends EntityPK, Serializable {

    public IMenuPK getMenuPK();
    public void setMenuPK(IMenuPK menuPK);

    public java.lang.String getMainmenu();

    public void setMainmenu(java.lang.String mainmenu);

    public java.lang.String getMenu();

    public void setMenu(java.lang.String menu);

    public java.lang.String getMenuitem();

    public void setMenuitem(java.lang.String menuitem);


    public boolean equals(IMenuitemPK menuitemPK2);

}
