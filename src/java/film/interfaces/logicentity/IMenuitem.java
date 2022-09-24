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

public interface IMenuitem extends LogicEntity {

    public IMenuitemPK getPrimaryKey();
	
    public static short MAINMENU = 1;
    public static short MENU = 2;
    public static short MENUITEM = 3;
    public static short TABPANEL = 4;
    public static short EDITPANEL = 5;
    public static short SERVLET = 6;

    public static final int SIZE_MAINMENU = 25;
    public static final int SIZE_MENU = 25;
    public static final int SIZE_MENUITEM = 25;
    public static final int SIZE_TABPANEL = 50;
    public static final int SIZE_EDITPANEL = 50;
    public static final int SIZE_SERVLET = 50;
    public static final String[] fieldnames = { "mainmenu", "menu", "menuitem", "tabpanel", "editpanel", "servlet" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };

    public static final String[] menuPKfields = { "menu.mainmenu", "menu.menu" };
    public static final String[] menuFKfields = { "menuitem.mainmenu", "menuitem.menu" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getTabpanel();

    public void setTabpanel(java.lang.String tabpanel);

    public java.lang.String getEditpanel();

    public void setEditpanel(java.lang.String editpanel);

    public java.lang.String getServlet();

    public void setServlet(java.lang.String servlet);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
