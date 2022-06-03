/*
 * Art_subgroup.java
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
import film.interfaces.entity.pk.IArt_subgroupPK;
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
 * Entity class Art_subgroup
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Art_subgroup extends film.entity.eArt_subgroup implements IArt_subgroup {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Art_subgroup entity
     */
    public Art_subgroup() {
    }
    
    /**
     * Constructor
     * build an empty Art_subgroup entity with initialized field values
     */
    public Art_subgroup(int subgroupid) {
        super(subgroupid);
    }

    /**
     * Constructor
     * build an empty Art_subgroup entity with initialized Primarykey parameter
     * @param art_subgroupPK: Art_subgroup Primarykey
     */
    public Art_subgroup(Art_subgroupPK art_subgroupPK) {
        super(art_subgroupPK);
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
