/*
 * Spatial_ref_sys.java
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
import film.interfaces.entity.pk.ISpatial_ref_sysPK;
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
 * Entity class Spatial_ref_sys
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Spatial_ref_sys extends film.entity.eSpatial_ref_sys implements ISpatial_ref_sys {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Spatial_ref_sys entity
     */
    public Spatial_ref_sys() {
    }
    
    /**
     * Constructor
     * build an empty Spatial_ref_sys entity with initialized field values
     */
    public Spatial_ref_sys(int srid) {
        super(srid);
    }

    /**
     * Constructor
     * build an empty Spatial_ref_sys entity with initialized Primarykey parameter
     * @param spatial_ref_sysPK: Spatial_ref_sys Primarykey
     */
    public Spatial_ref_sys(Spatial_ref_sysPK spatial_ref_sysPK) {
        super(spatial_ref_sysPK);
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
