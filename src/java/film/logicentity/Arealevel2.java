/*
 * Arealevel2.java
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
import film.interfaces.entity.pk.IArealevel2PK;
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
 * Entity class Arealevel2
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Arealevel2 extends film.entity.eArealevel2 implements IArealevel2 {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Arealevel2 entity
     */
    public Arealevel2() {
    }
    
    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized field values
     */
    public Arealevel2(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code) {
        super(countrycode, al1code, al2code);
    }

    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized Primarykey parameter
     * @param arealevel2PK: Arealevel2 Primarykey
     */
    public Arealevel2(Arealevel2PK arealevel2PK) {
        super(arealevel2PK);
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
