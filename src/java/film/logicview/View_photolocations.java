/*
 * View_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import film.interfaces.logicview.IView_photolocations;
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
 * View class View_photolocations
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_photolocations extends film.view.eView_photolocations implements IView_photolocations {

//Custom code, do not change this line
    public static final String SQLWherelocality = "countrycode = :countrycode: and locality = :locality:";
    public static final String SQLSelect4locality = SQLSelectAll + " where " + SQLWherelocality;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_photolocations entity
     */
    public View_photolocations() {
    }
    
//Custom code, do not change this line
//Custom code, do not change this line
}
