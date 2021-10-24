/*
 * Locality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
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

//Custom code, do not change this line
//Custom code, do not change this line

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
