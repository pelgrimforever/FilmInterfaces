/*
 * Photosubjects.java
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
import film.interfaces.entity.pk.IPhotosubjectsPK;
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
 * Entity class Photosubjects
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Photosubjects extends film.entity.ePhotosubjects implements IPhotosubjects {

    public static final String SQLSelect = "select photosubjects.* from photosubjects";
    public static final String SQLWherephoto = "film = :photo.film: and id = :photo.id:";
    public static final String SQLWheresubject = "cat1 = :subject.cat1: and cat2 = :subject.cat2: and subject = :subject.id:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4photo = "select * from photosubjects where " + SQLWherephoto + OrderBy;
    public static final String SQLDelete4photo = "delete from photosubjects where " + SQLWherephoto + OrderBy;
    public static final String SQLSelect4subject = "select * from photosubjects where " + SQLWheresubject + OrderBy;
    public static final String SQLDelete4subject = "delete from photosubjects where " + SQLWheresubject + OrderBy;

    /**
     * Constructor
     * Creates an empty Photosubjects entity
     */
    public Photosubjects() {
    }
    
    /**
     * Constructor
     * build an empty Photosubjects entity with initialized field values
     */
    public Photosubjects(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject) {
        super(film, id, cat1, cat2, subject);
    }

    /**
     * Constructor
     * build an empty Photosubjects entity with initialized Primarykey parameter
     * @param photosubjectsPK: Photosubjects Primarykey
     */
    public Photosubjects(PhotosubjectsPK photosubjectsPK) {
        super(photosubjectsPK);
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
