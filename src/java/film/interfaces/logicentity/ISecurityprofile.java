/*
 * ISecurityprofile.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
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

/**
 * Entity Interface ISecurityprofile
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return privateaccess value
     */
    public boolean getPrivateaccess();

    /**
     * set privateaccess value
     * @param privateaccess: new value
     */
    public void setPrivateaccess(boolean privateaccess);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
