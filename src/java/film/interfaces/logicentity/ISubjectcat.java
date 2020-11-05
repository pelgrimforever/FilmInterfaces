/*
 * ISubjectcat.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
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
 * Entity Interface ISubjectcat
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISubjectcat extends LogicEntity {

	public ISubjectcatPK getPrimaryKey();
	
    public static short CAT = 1;
    public static short CATNO = 2;
    public static short DESCRIPTION = 3;

    public static final int SIZE_CAT = 30;
    public static final int SIZE_CATNO = 5;
    public static final int SIZE_DESCRIPTION = 100;
    public static final String[] fieldnames = { "cat", "catno", "description" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return catno value
     */
    public int getCatno();

    /**
     * set catno value
     * @param catno: new value
     */
    public void setCatno(int catno);

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
