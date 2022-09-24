/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

public interface ISecurityuserprofile extends LogicEntity {

    public ISecurityuserprofilePK getPrimaryKey();
	
    public static short SITEUSERNAME = 1;
    public static short USERPROFILE = 2;

    public static final int SIZE_SITEUSERNAME = 20;
    public static final int SIZE_USERPROFILE = 20;
    public static final String[] fieldnames = { "siteusername", "userprofile" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };

    public static final String[] securityprofilePKfields = { "securityprofile.userprofile" };
    public static final String[] securityprofileFKfields = { "securityuserprofile.userprofile" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
