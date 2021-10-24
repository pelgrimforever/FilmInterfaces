/*
 * IArt_subgroup.java
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
 * Entity Interface IArt_subgroup
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IArt_subgroup extends LogicEntity {

	public IArt_subgroupPK getPrimaryKey();
	
    public static short GROUPID = 1;
    public static short SUBGROUPID = 2;
    public static short SUBGROUPNAME = 3;
    public static short LASTSEQNO = 4;

    public static final int SIZE_GROUPID = 5;
    public static final int SIZE_SUBGROUPID = 10;
    public static final int SIZE_SUBGROUPNAME = 20;
    public static final int SIZE_LASTSEQNO = 10;
    public static final String[] fieldnames = { "groupid", "subgroupid", "subgroupname", "lastseqno" };
    public static final byte[] fieldtypes = { Datatypes.type_int, Datatypes.type_int_serial, Datatypes.type_String, Datatypes.type_int };

    public static final String[] art_groupPKfields = { "art_group.groupid" };
    public static final String[] art_groupFKfields = { "art_subgroup.groupid" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return subgroupname value
     */
    public java.lang.String getSubgroupname();

    /**
     * set subgroupname value
     * @param subgroupname: new value
     */
    public void setSubgroupname(java.lang.String subgroupname);

    /**
     * 
     * @return lastseqno value
     */
    public int getLastseqno();

    /**
     * set lastseqno value
     * @param lastseqno: new value
     */
    public void setLastseqno(int lastseqno);

    /**
     * 
     * @return foreign key art_groupPK, instance of Art_groupPK
     */
    public IArt_groupPK getArt_groupPK();

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void setArt_groupPK(IArt_groupPK art_groupPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
