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

public interface ISecurityprofile extends LogicEntity {

    public ISecurityprofilePK getPrimaryKey();
	
    public static short USERPROFILE = 1;
    public static short PRIVATEACCESS = 2;

    public static final int SIZE_USERPROFILE = 20;
    public static final int SIZE_PRIVATEACCESS = 1;
    public static final String[] fieldnames = { "userprofile", "privateaccess" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_boolean };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public boolean getPrivateaccess();

    public void setPrivateaccess(boolean privateaccess);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
