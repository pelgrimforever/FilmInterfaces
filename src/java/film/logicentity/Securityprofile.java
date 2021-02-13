/*
 * Securityprofile.java
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
import film.interfaces.entity.pk.ISecurityprofilePK;
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
 * Entity class Securityprofile
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Securityprofile extends film.entity.eSecurityprofile implements ISecurityprofile {

    public static final String SQLSelect = "select securityprofile.* from securityprofile";

//Custom code, do not change this line
    public static final String OrderBy = "";
    public static final String SQLWhereUsername = "securityuserprofile.siteusername = :siteusername:";
    public static final String SQLSelectUsername = "select securityprofile.* from securityprofile inner join securityuserprofile on securityprofile.userprofile = securityuserprofile.userprofile where " + SQLWhereUsername;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Securityprofile entity
     */
    public Securityprofile() {
    }
    
    /**
     * Constructor
     * build an empty Securityprofile entity with initialized field values
     */
    public Securityprofile(java.lang.String userprofile) {
        super(userprofile);
    }

    /**
     * Constructor
     * build an empty Securityprofile entity with initialized Primarykey parameter
     * @param securityprofilePK: Securityprofile Primarykey
     */
    public Securityprofile(SecurityprofilePK securityprofilePK) {
        super(securityprofilePK);
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
