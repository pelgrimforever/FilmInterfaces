/*
 * Locality.java
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
import film.interfaces.entity.pk.ILocalityPK;
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
 * Entity class Locality
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Locality extends film.entity.eLocality implements ILocality {

    public static final String SQLSelect = "select locality.* from locality";
    public static final String SQLWherepostalcode = "countrycode = :postalcode.countrycode: and postalcode = :postalcode.postalcode:";

//Custom code, do not change this line
public static final String OrderBy = " order by locality.countrycode, locality.postalcode, locality.locality";
public static final String SQLWherecountryPK = "countrycode = :country.code:";
public static final String SQLSelect4countryPK = "select * from locality where " + SQLWherecountryPK + OrderBy;
public static final String SQLSelect4arealevel1PK = "select * from locality "
        + "inner join postalcode on locality.countrycode = postalcode.countrycode and locality.postalcode = postalcode.postalcode "
        + "where postalcode.countrycode = :arealevel1.countrycode: and postalcode.al1code = :arealevel1.al1code: " + OrderBy;
public static final String SQLSelect4arealevel2PK = "select * from locality "
        + "inner join postalcode on locality.countrycode = postalcode.countrycode and locality.postalcode = postalcode.postalcode "
        + "where postalcode.countrycode = :arealevel2.countrycode: and postalcode.al1code = :arealevel2.al1code: "
        + "and postalcode.al2code = :arealevel2.al2code: " + OrderBy;
public static final String SQLSelect4arealevel3PK = "select * from locality "
        + "inner join postalcode on locality.countrycode = postalcode.countrycode and locality.postalcode = postalcode.postalcode "
        + "where postalcode.countrycode = :arealevel3.countrycode: and postalcode.al1code = :arealevel3.al1code: "
        + "and postalcode.al2code = :arealevel3.al2code: and postalcode.al3code = :arealevel3.al3code: " + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4postalcode = "select * from locality where " + SQLWherepostalcode + OrderBy;
    public static final String SQLDelete4postalcode = "delete from locality where " + SQLWherepostalcode + OrderBy;

    /**
     * Constructor
     * Creates an empty Locality entity
     */
    public Locality() {
    }
    
    /**
     * Constructor
     * build an empty Locality entity with initialized field values
     */
    public Locality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality) {
        super(countrycode, postalcode, locality);
    }

    /**
     * Constructor
     * build an empty Locality entity with initialized Primarykey parameter
     * @param localityPK: Locality Primarykey
     */
    public Locality(LocalityPK localityPK) {
        super(localityPK);
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
