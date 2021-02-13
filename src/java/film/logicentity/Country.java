/*
 * Country.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.ICountryPK;
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
 * Entity class Country
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Country extends film.entity.eCountry implements ICountry {

    public static final String SQLSelect = "select country.* from country";

//Custom code, do not change this line
    public static final String OrderBy = " order by name";
    public static final String SQLSelectAll = "select country.* from country" + OrderBy;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Country entity
     */
    public Country() {
    }
    
    /**
     * Constructor
     * build an empty Country entity with initialized field values
     */
    public Country(java.lang.String code) {
        super(code);
    }

    /**
     * Constructor
     * build an empty Country entity with initialized Primarykey parameter
     * @param countryPK: Country Primarykey
     */
    public Country(CountryPK countryPK) {
        super(countryPK);
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
