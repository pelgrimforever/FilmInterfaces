/*
 * IMainmenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
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

/**
 * Entity Interface IMainmenu
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return popuplabel value
     */
    public java.lang.String getPopuplabel();

    /**
     * set popuplabel value
     * @param popuplabel: new value
     */
    public void setPopuplabel(java.lang.String popuplabel);

    /**
     * 
     * @return icon value
     */
    public java.lang.String getIcon();

    /**
     * set icon value
     * @param icon: new value
     */
    public void setIcon(java.lang.String icon);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
