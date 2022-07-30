/*
 * Securityuserprofile.java
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
import film.interfaces.entity.pk.ISecurityuserprofilePK;
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
 * Entity class Securityuserprofile
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Securityuserprofile extends film.entity.eSecurityuserprofile implements ISecurityuserprofile {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Securityuserprofile entity
     */
    public Securityuserprofile() {
    }
    
    /**
     * Constructor
     * build an empty Securityuserprofile entity with initialized field values
     */
    public Securityuserprofile(java.lang.String siteusername, java.lang.String userprofile) {
        super(siteusername, userprofile);
    }

    /**
     * Constructor
     * build an empty Securityuserprofile entity with initialized Primarykey parameter
     * @param securityuserprofilePK: Securityuserprofile Primarykey
     */
    public Securityuserprofile(SecurityuserprofilePK securityuserprofilePK) {
        super(securityuserprofilePK);
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
