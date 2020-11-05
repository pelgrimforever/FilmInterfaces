/*
 * Arealevel2.java
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
import film.interfaces.entity.pk.IArealevel2PK;
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
 * Entity class Arealevel2
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Arealevel2 extends film.entity.eArealevel2 implements IArealevel2 {

    public static final String SQLSelect = "select arealevel2.* from arealevel2";
    public static final String SQLWherearealevel1 = "countrycode = :arealevel1.countrycode: and al1code = :arealevel1.al1code:";

//Custom code, do not change this line
public static final String OrderBy = " order by name";
//Custom code, do not change this line

    public static final String SQLSelect4arealevel1 = "select * from arealevel2 where " + SQLWherearealevel1 + OrderBy;
    public static final String SQLDelete4arealevel1 = "delete from arealevel2 where " + SQLWherearealevel1 + OrderBy;

    /**
     * Constructor
     * Creates an empty Arealevel2 entity
     */
    public Arealevel2() {
    }
    
    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized field values
     */
    public Arealevel2(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code) {
        super(countrycode, al1code, al2code);
    }

    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized Primarykey parameter
     * @param arealevel2PK: Arealevel2 Primarykey
     */
    public Arealevel2(Arealevel2PK arealevel2PK) {
        super(arealevel2PK);
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
