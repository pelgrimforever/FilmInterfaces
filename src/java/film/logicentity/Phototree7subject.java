/*
 * Phototree7subject.java
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
import film.interfaces.entity.pk.IPhototree7subjectPK;
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
 * Entity class Phototree7subject
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Phototree7subject extends film.entity.ePhototree7subject implements IPhototree7subject {

    public static final String SQLSelect = "select phototree7subject.* from phototree7subject";
    public static final String SQLWheretree7subject = "subjectid = :tree7subject.subjectid:";
    public static final String SQLWherephoto = "film = :photo.film: and id = :photo.id:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4tree7subject = "select * from phototree7subject where " + SQLWheretree7subject + OrderBy;
    public static final String SQLDelete4tree7subject = "delete from phototree7subject where " + SQLWheretree7subject + OrderBy;
    public static final String SQLSelect4photo = "select * from phototree7subject where " + SQLWherephoto + OrderBy;
    public static final String SQLDelete4photo = "delete from phototree7subject where " + SQLWherephoto + OrderBy;

    /**
     * Constructor
     * Creates an empty Phototree7subject entity
     */
    public Phototree7subject() {
    }
    
    /**
     * Constructor
     * build an empty Phototree7subject entity with initialized field values
     */
    public Phototree7subject(java.lang.String film, int id, long subjectid) {
        super(film, id, subjectid);
    }

    /**
     * Constructor
     * build an empty Phototree7subject entity with initialized Primarykey parameter
     * @param phototree7subjectPK: Phototree7subject Primarykey
     */
    public Phototree7subject(Phototree7subjectPK phototree7subjectPK) {
        super(phototree7subjectPK);
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
