/*
 * Sublocality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.entity.pk.*;
import film.interfaces.entity.pk.ISublocalityPK;
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
 * Entity class Sublocality
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Sublocality extends film.entity.eSublocality implements ISublocality {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Sublocality entity
     */
    public Sublocality() {
    }
    
    /**
     * Constructor
     * build an empty Sublocality entity with initialized field values
     */
    public Sublocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        super(countrycode, postalcode, locality, sublocality);
    }

    /**
     * Constructor
     * build an empty Sublocality entity with initialized Primarykey parameter
     * @param sublocalityPK: Sublocality Primarykey
     */
    public Sublocality(SublocalityPK sublocalityPK) {
        super(sublocalityPK);
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
