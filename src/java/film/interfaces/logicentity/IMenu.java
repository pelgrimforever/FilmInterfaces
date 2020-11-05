/*
 * IMenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IMenu
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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
