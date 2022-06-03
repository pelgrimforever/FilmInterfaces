/*
 * Filmtype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.entity.pk.*;
import film.interfaces.entity.pk.IFilmtypePK;
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
 * Entity class Filmtype
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Filmtype extends film.entity.eFilmtype implements IFilmtype {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Filmtype entity
     */
    public Filmtype() {
    }
    
    /**
     * Constructor
     * build an empty Filmtype entity with initialized field values
     */
    public Filmtype(java.lang.String type) {
        super(type);
    }

    /**
     * Constructor
     * build an empty Filmtype entity with initialized Primarykey parameter
     * @param filmtypePK: Filmtype Primarykey
     */
    public Filmtype(FilmtypePK filmtypePK) {
        super(filmtypePK);
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
