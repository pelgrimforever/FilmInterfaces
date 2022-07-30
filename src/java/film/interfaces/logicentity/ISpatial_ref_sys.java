/*
 * ISpatial_ref_sys.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * Entity Interface ISpatial_ref_sys
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISpatial_ref_sys extends LogicEntity {

    public ISpatial_ref_sysPK getPrimaryKey();
	
    public static short SRID = 1;
    public static short AUTH_NAME = 2;
    public static short AUTH_SRID = 3;
    public static short SRTEXT = 4;
    public static short PROJ4TEXT = 5;

    public static final int SIZE_SRID = 10;
    public static final int SIZE_AUTH_NAME = 256;
    public static final int SIZE_AUTH_SRID = 10;
    public static final int SIZE_SRTEXT = 2048;
    public static final int SIZE_PROJ4TEXT = 2048;
    public static final String[] fieldnames = { "srid", "auth_name", "auth_srid", "srtext", "proj4text" };
    public static final byte[] fieldtypes = { Datatypes.type_int, Datatypes.type_String, Datatypes.type_int, Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return auth_name value
     */
    public java.lang.String getAuth_name();

    /**
     * set auth_name value
     * @param auth_name: new value
     */
    public void setAuth_name(java.lang.String auth_name);

    /**
     * 
     * @return auth_srid value
     */
    public int getAuth_srid();

    /**
     * set auth_srid value
     * @param auth_srid: new value
     */
    public void setAuth_srid(int auth_srid);

    /**
     * 
     * @return srtext value
     */
    public java.lang.String getSrtext();

    /**
     * set srtext value
     * @param srtext: new value
     */
    public void setSrtext(java.lang.String srtext);

    /**
     * 
     * @return proj4text value
     */
    public java.lang.String getProj4text();

    /**
     * set proj4text value
     * @param proj4text: new value
     */
    public void setProj4text(java.lang.String proj4text);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
