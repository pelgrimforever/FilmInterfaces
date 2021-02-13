/*
 * Phototags.java
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
import film.interfaces.entity.pk.IPhototagsPK;
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
 * Entity class Phototags
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Phototags extends film.entity.ePhototags implements IPhototags {

    public static final String SQLSelect = "select phototags.* from phototags";
    public static final String SQLWherephoto = "film = :photo.film: and id = :photo.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by tag";
    public static final String SQLSelect4phototags_photo_sorted = "select * from phototags where " + SQLWherephoto + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4photo = "select * from phototags where " + SQLWherephoto + OrderBy;
    public static final String SQLDelete4photo = "delete from phototags where " + SQLWherephoto + OrderBy;

    /**
     * Constructor
     * Creates an empty Phototags entity
     */
    public Phototags() {
    }
    
    /**
     * Constructor
     * build an empty Phototags entity with initialized field values
     */
    public Phototags(java.lang.String film, int id, java.lang.String tag) {
        super(film, id, tag);
    }

    /**
     * Constructor
     * build an empty Phototags entity with initialized Primarykey parameter
     * @param phototagsPK: Phototags Primarykey
     */
    public Phototags(PhototagsPK phototagsPK) {
        super(phototagsPK);
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
