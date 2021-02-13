/*
 * View_publiclocalityphotocount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import film.interfaces.logicview.IView_publiclocalityphotocount;
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
 * View class View_publiclocalityphotocount
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_publiclocalityphotocount extends film.view.eView_publiclocalityphotocount implements IView_publiclocalityphotocount {

//Custom code, do not change this line
    public static final String SQLwherecountrycode = " view_publiclocalityphotocount.countrycode = :countrycode: ";
    public static final String SQLSelect4countrycode = "select view_publiclocalityphotocount.* from view_publiclocalityphotocount where " + SQLwherecountrycode;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_publiclocalityphotocount entity
     */
    public View_publiclocalityphotocount() {
    }
    
//Custom code, do not change this line
//Custom code, do not change this line
}
