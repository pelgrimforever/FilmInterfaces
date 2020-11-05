/*
 * IPhototags.java
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
 * Entity Interface IPhototags
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IPhototags extends LogicEntity {

	public IPhototagsPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short ID = 2;
    public static short TAG = 3;
    public static short TAGFORMAT = 4;
    public static short TAGVALUE = 5;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_ID = 5;
    public static final int SIZE_TAG = 50;
    public static final int SIZE_TAGFORMAT = 20;
    public static final int SIZE_TAGVALUE = 200;
    public static final String[] fieldnames = { "film", "id", "tag", "tagformat", "tagvalue" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };

    public static final String[] photoPKfields = { "photo.film", "photo.id" };
    public static final String[] photoFKfields = { "phototags.film", "phototags.id" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return tagformat value
     */
    public java.lang.String getTagformat();

    /**
     * set tagformat value
     * @param tagformat: new value
     */
    public void setTagformat(java.lang.String tagformat);

    /**
     * 
     * @return tagvalue value
     */
    public java.lang.String getTagvalue();

    /**
     * set tagvalue value
     * @param tagvalue: new value
     */
    public void setTagvalue(java.lang.String tagvalue);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
