/*
 * Art_academy.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.IArt_academyPK;
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
 * Entity class Art_academy
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Art_academy extends film.entity.eArt_academy implements IArt_academy {

    public static final String SQLSelect = "select art_academy.* from art_academy";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Art_academy entity
     */
    public Art_academy() {
    }
    
    /**
     * Constructor
     * build an empty Art_academy entity with initialized field values
     */
    public Art_academy(long academyid) {
        super(academyid);
    }

    /**
     * Constructor
     * build an empty Art_academy entity with initialized Primarykey parameter
     * @param art_academyPK: Art_academy Primarykey
     */
    public Art_academy(Art_academyPK art_academyPK) {
        super(art_academyPK);
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
