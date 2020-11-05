/*
 * Menu.java
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
import film.interfaces.entity.pk.IMenuPK;
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
 * Entity class Menu
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Menu extends film.entity.eMenu implements IMenu {

    public static final String SQLSelect = "select menu.* from menu";
    public static final String SQLWheremainmenu = "mainmenu = :mainmenu.mainmenu:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4mainmenu = "select * from menu where " + SQLWheremainmenu + OrderBy;
    public static final String SQLDelete4mainmenu = "delete from menu where " + SQLWheremainmenu + OrderBy;

    /**
     * Constructor
     * Creates an empty Menu entity
     */
    public Menu() {
    }
    
    /**
     * Constructor
     * build an empty Menu entity with initialized field values
     */
    public Menu(java.lang.String mainmenu, java.lang.String menu) {
        super(mainmenu, menu);
    }

    /**
     * Constructor
     * build an empty Menu entity with initialized Primarykey parameter
     * @param menuPK: Menu Primarykey
     */
    public Menu(MenuPK menuPK) {
        super(menuPK);
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
