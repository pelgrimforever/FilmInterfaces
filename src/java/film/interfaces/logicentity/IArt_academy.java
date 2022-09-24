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

public interface IArt_academy extends LogicEntity {

    public IArt_academyPK getPrimaryKey();
	
    public static short ACADEMYID = 1;
    public static short ACADEMY = 2;
    public static short ACADEMYLOCATION = 3;

    public static final int SIZE_ACADEMYID = 19;
    public static final int SIZE_ACADEMY = 50;
    public static final int SIZE_ACADEMYLOCATION = 25;
    public static final String[] fieldnames = { "academyid", "academy", "academylocation" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getAcademy();

    public void setAcademy(java.lang.String academy);

    public java.lang.String getAcademylocation();

    public void setAcademylocation(java.lang.String academylocation);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
