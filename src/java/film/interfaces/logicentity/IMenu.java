/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

public interface IMenu extends LogicEntity {

    public IMenuPK getPrimaryKey();
	
    public static short MAINMENU = 1;
    public static short MENU = 2;

    public static final int SIZE_MAINMENU = 25;
    public static final int SIZE_MENU = 25;
    public static final String[] fieldnames = { "mainmenu", "menu" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };

    public static final String[] mainmenuPKfields = { "mainmenu.mainmenu" };
    public static final String[] mainmenuFKfields = { "menu.mainmenu" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
