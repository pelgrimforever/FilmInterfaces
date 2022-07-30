/*
 * Art_photo.java
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
import film.interfaces.entity.pk.IArt_photoPK;
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
 * Entity class Art_photo
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Art_photo extends film.entity.eArt_photo implements IArt_photo {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Art_photo entity
     */
    public Art_photo() {
    }
    
    /**
     * Constructor
     * build an empty Art_photo entity with initialized field values
     */
    public Art_photo(java.lang.String film, int photo) {
        super(film, photo);
    }

    /**
     * Constructor
     * build an empty Art_photo entity with initialized Primarykey parameter
     * @param art_photoPK: Art_photo Primarykey
     */
    public Art_photo(Art_photoPK art_photoPK) {
        super(art_photoPK);
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
