/*
 * Arealevel3.java
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
import film.interfaces.entity.pk.IArealevel3PK;
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
 * Entity class Arealevel3
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Arealevel3 extends film.entity.eArealevel3 implements IArealevel3 {

    public static final String SQLSelect = "select arealevel3.* from arealevel3";
    public static final String SQLWherearealevel2 = "countrycode = :arealevel2.countrycode: and al1code = :arealevel2.al1code: and al2code = :arealevel2.al2code:";

//Custom code, do not change this line
public static final String OrderBy = " order by name";
//Custom code, do not change this line

    public static final String SQLSelect4arealevel2 = "select * from arealevel3 where " + SQLWherearealevel2 + OrderBy;
    public static final String SQLDelete4arealevel2 = "delete from arealevel3 where " + SQLWherearealevel2 + OrderBy;

    /**
     * Constructor
     * Creates an empty Arealevel3 entity
     */
    public Arealevel3() {
    }
    
    /**
     * Constructor
     * build an empty Arealevel3 entity with initialized field values
     */
    public Arealevel3(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code) {
        super(countrycode, al1code, al2code, al3code);
    }

    /**
     * Constructor
     * build an empty Arealevel3 entity with initialized Primarykey parameter
     * @param arealevel3PK: Arealevel3 Primarykey
     */
    public Arealevel3(Arealevel3PK arealevel3PK) {
        super(arealevel3PK);
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
