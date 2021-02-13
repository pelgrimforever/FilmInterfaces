/*
 * Creator.java
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
import film.interfaces.entity.pk.ICreatorPK;
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
 * Entity class Creator
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Creator extends film.entity.eCreator implements ICreator {

    public static final String SQLSelect = "select creator.* from creator";

//Custom code, do not change this line
    public static final String OrderBy = " order by creator.creatorid";
    
    public static final String SQLSelectAll = "select creator.* from creator" + OrderBy;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Creator entity
     */
    public Creator() {
    }
    
    /**
     * Constructor
     * build an empty Creator entity with initialized field values
     */
    public Creator(java.lang.String creatorid) {
        super(creatorid);
    }

    /**
     * Constructor
     * build an empty Creator entity with initialized Primarykey parameter
     * @param creatorPK: Creator Primarykey
     */
    public Creator(CreatorPK creatorPK) {
        super(creatorPK);
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
