/*
 * Film.java
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
import film.interfaces.entity.pk.IFilmPK;
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
 * Entity class Film
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Film extends film.entity.eFilm implements IFilm {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Film entity
     */
    public Film() {
    }
    
    /**
     * Constructor
     * build an empty Film entity with initialized field values
     */
    public Film(java.lang.String id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Film entity with initialized Primarykey parameter
     * @param filmPK: Film Primarykey
     */
    public Film(FilmPK filmPK) {
        super(filmPK);
    }

//Custom code, do not change this line
    public static String getDirectoryName(IFilmPK filmPK) {
        return new StringBuffer(filmPK.getId().substring(0, 3)).append("-").append(filmPK.getId().substring(3, 6)).toString();
    }

    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
