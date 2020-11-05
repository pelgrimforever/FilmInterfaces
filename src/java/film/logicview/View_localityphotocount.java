/*
 * View_localityphotocount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import film.interfaces.logicview.IView_localityphotocount;
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
 * View class View_localityphotocount
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_localityphotocount extends film.view.eView_localityphotocount implements IView_localityphotocount {

//Custom code, do not change this line
    public static final String SQLwherecountrycode = " view_localityphotocount.countrycode = :countrycode: ";
    public static final String SQLSelect4countrycode = "select view_localityphotocount.* from view_localityphotocount where " + SQLwherecountrycode;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_localityphotocount entity
     */
    public View_localityphotocount() {
    }
    
//Custom code, do not change this line
//Custom code, do not change this line
}