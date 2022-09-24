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

public interface IMainmenu extends LogicEntity {

    public IMainmenuPK getPrimaryKey();
	
    public static short MAINMENU = 1;
    public static short POPUPLABEL = 2;
    public static short ICON = 3;

    public static final int SIZE_MAINMENU = 25;
    public static final int SIZE_POPUPLABEL = 100;
    public static final int SIZE_ICON = 50;
    public static final String[] fieldnames = { "mainmenu", "popuplabel", "icon" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getPopuplabel();

    public void setPopuplabel(java.lang.String popuplabel);

    public java.lang.String getIcon();

    public void setIcon(java.lang.String icon);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
