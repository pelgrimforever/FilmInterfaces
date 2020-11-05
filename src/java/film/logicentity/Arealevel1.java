/*
 * Arealevel1.java
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
import film.interfaces.entity.pk.IArealevel1PK;
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
 * Entity class Arealevel1
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Arealevel1 extends film.entity.eArealevel1 implements IArealevel1 {

    public static final String SQLSelect = "select arealevel1.* from arealevel1";
    public static final String SQLWherecountry = "countrycode = :country.code:";

//Custom code, do not change this line
//add here custom operations
    public static final String OrderBy = " order by name";
//Custom code, do not change this line

    public static final String SQLSelect4country = "select * from arealevel1 where " + SQLWherecountry + OrderBy;
    public static final String SQLDelete4country = "delete from arealevel1 where " + SQLWherecountry + OrderBy;

    /**
     * Constructor
     * Creates an empty Arealevel1 entity
     */
    public Arealevel1() {
    }
    
    /**
     * Constructor
     * build an empty Arealevel1 entity with initialized field values
     */
    public Arealevel1(java.lang.String countrycode, java.lang.String al1code) {
        super(countrycode, al1code);
    }

    /**
     * Constructor
     * build an empty Arealevel1 entity with initialized Primarykey parameter
     * @param arealevel1PK: Arealevel1 Primarykey
     */
    public Arealevel1(Arealevel1PK arealevel1PK) {
        super(arealevel1PK);
    }

//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line
}
