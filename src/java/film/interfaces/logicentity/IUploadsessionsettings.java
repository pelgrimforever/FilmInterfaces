/*
 * IUploadsessionsettings.java
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
 * Entity Interface IUploadsessionsettings
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IUploadsessionsettings extends LogicEntity {

	public IUploadsessionsettingsPK getPrimaryKey();
	
    public static short DIRECTORY = 1;
    public static short UPLOADTYPE = 2;
    public static short FILMGROUPS = 3;
    public static short LASTPOSITION = 4;
    public static short COPYMODE = 5;
    public static short UPLOADINGPOSITION = 6;

    public static final int SIZE_DIRECTORY = 100;
    public static final int SIZE_UPLOADTYPE = 10;
    public static final int SIZE_FILMGROUPS = 2147483647;
    public static final int SIZE_LASTPOSITION = 10;
    public static final int SIZE_COPYMODE = 15;
    public static final int SIZE_UPLOADINGPOSITION = 10;
    public static final String[] fieldnames = { "directory", "uploadtype", "filmgroups", "lastposition", "copymode", "uploadingposition" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_int, Datatypes.type_String, Datatypes.type_int };


//Custom code, do not change this line
//Put custom variables here
    public static final String MODE_NOCOPY = "nocopy";
    public static final String MODE_COPYPROPERTIES = "copyproperties";    
//Custom code, do not change this line

    /**
     * 
     * @return uploadtype value
     */
    public java.lang.String getUploadtype();

    /**
     * set uploadtype value
     * @param uploadtype: new value
     */
    public void setUploadtype(java.lang.String uploadtype);

    /**
     * 
     * @return filmgroups value
     */
    public java.lang.String getFilmgroups();

    /**
     * set filmgroups value
     * @param filmgroups: new value
     */
    public void setFilmgroups(java.lang.String filmgroups);

    /**
     * 
     * @return lastposition value
     */
    public int getLastposition();

    /**
     * set lastposition value
     * @param lastposition: new value
     */
    public void setLastposition(int lastposition);

    /**
     * 
     * @return copymode value
     */
    public java.lang.String getCopymode();

    /**
     * set copymode value
     * @param copymode: new value
     */
    public void setCopymode(java.lang.String copymode);

    /**
     * 
     * @return uploadingposition value
     */
    public int getUploadingposition();

    /**
     * set uploadingposition value
     * @param uploadingposition: new value
     */
    public void setUploadingposition(int uploadingposition);

    
//Custom code, do not change this line
//Put custom functions here
    public ArrayList<String> getGroupidlist();
    
    public String[] getGroupids();

    public void setGroupids(String[] groupids);

    public void setGroupids(ArrayList<String> groupids);
    
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
