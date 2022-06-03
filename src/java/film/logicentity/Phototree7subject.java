/*
 * Phototree7subject.java
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

//Custom code, do not change this line
//Custom code, do not change this line

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
