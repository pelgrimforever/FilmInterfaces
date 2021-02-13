/*
 * IArt_group.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IArt_group
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IArt_group extends LogicEntity {

	public IArt_groupPK getPrimaryKey();
	
    public static short GROUPID = 1;
    public static short GROUPNAME = 2;

    public static final int SIZE_GROUPID = 19;
    public static final int SIZE_GROUPNAME = 20;
    public static final String[] fieldnames = { "groupid", "groupname" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return groupname value
     */
    public java.lang.String getGroupname();

    /**
     * set groupname value
     * @param groupname: new value
     */
    public void setGroupname(java.lang.String groupname);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
