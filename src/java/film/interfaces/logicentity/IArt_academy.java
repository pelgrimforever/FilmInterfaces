/*
 * IArt_academy.java
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
 * Entity Interface IArt_academy
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return academy value
     */
    public java.lang.String getAcademy();

    /**
     * set academy value
     * @param academy: new value
     */
    public void setAcademy(java.lang.String academy);

    /**
     * 
     * @return academylocation value
     */
    public java.lang.String getAcademylocation();

    /**
     * set academylocation value
     * @param academylocation: new value
     */
    public void setAcademylocation(java.lang.String academylocation);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
