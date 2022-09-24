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

    public java.lang.String getSubgroupname();

    public void setSubgroupname(java.lang.String subgroupname);

    public int getLastseqno();

    public void setLastseqno(int lastseqno);

    public IArt_groupPK getArt_groupPK();

    public void setArt_groupPK(IArt_groupPK art_groupPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
