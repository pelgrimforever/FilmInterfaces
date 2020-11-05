/*
 * Menuitem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.IMenuitemPK;
import film.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * Entity class Menuitem
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Menuitem extends film.entity.eMenuitem implements IMenuitem {

    public static final String SQLSelect = "select menuitem.* from menuitem";
    public static final String SQLWheremenu = "mainmenu = :menu.mainmenu: and menu = :menu.menu:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4menu = "select * from menuitem where " + SQLWheremenu + OrderBy;
    public static final String SQLDelete4menu = "delete from menuitem where " + SQLWheremenu + OrderBy;

    /**
     * Constructor
     * Creates an empty Menuitem entity
     */
    public Menuitem() {
    }
    
    /**
     * Constructor
     * build an empty Menuitem entity with initialized field values
     */
    public Menuitem(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem) {
        super(mainmenu, menu, menuitem);
    }

    /**
     * Constructor
     * build an empty Menuitem entity with initialized Primarykey parameter
     * @param menuitemPK: Menuitem Primarykey
     */
    public Menuitem(MenuitemPK menuitemPK) {
        super(menuitemPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
