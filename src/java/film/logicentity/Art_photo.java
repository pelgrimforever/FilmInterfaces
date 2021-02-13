/*
 * Art_photo.java
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

    public static final String SQLSelect = "select art_photo.* from art_photo";
    public static final String SQLWherephoto = "film = :photo.film: and photo = :photo.id:";
    public static final String SQLWhereart_subgroup = "photosubgroup = :art_subgroup.subgroupid:";
    public static final String SQLWhereart_academy = "academy = :art_academy.academyid:";
    public static final String SQLWhereart_group = "photogroup = :art_group.groupid:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4photo = "select * from art_photo where " + SQLWherephoto + OrderBy;
    public static final String SQLDelete4photo = "delete from art_photo where " + SQLWherephoto + OrderBy;
    public static final String SQLSelect4art_subgroup = "select * from art_photo where " + SQLWhereart_subgroup + OrderBy;
    public static final String SQLDelete4art_subgroup = "delete from art_photo where " + SQLWhereart_subgroup + OrderBy;
    public static final String SQLSelect4art_academy = "select * from art_photo where " + SQLWhereart_academy + OrderBy;
    public static final String SQLDelete4art_academy = "delete from art_photo where " + SQLWhereart_academy + OrderBy;
    public static final String SQLSelect4art_group = "select * from art_photo where " + SQLWhereart_group + OrderBy;
    public static final String SQLDelete4art_group = "delete from art_photo where " + SQLWhereart_group + OrderBy;

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
