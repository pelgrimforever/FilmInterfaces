/*
 * IFilm.java
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
 * Entity Interface IFilm
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IFilm extends LogicEntity {

	public IFilmPK getPrimaryKey();
	
    public static short ID = 1;
    public static short TYPE = 2;
    public static short ISO = 3;
    public static short STARTDATE = 4;
    public static short ENDDATE = 5;
    public static short OWNER = 6;
    public static short CD = 7;
    public static short PUBLIC = 8;
    public static short BACKUP = 9;

    public static final int SIZE_ID = 6;
    public static final int SIZE_TYPE = 3;
    public static final int SIZE_ISO = 3;
    public static final int SIZE_STARTDATE = 13;
    public static final int SIZE_ENDDATE = 13;
    public static final int SIZE_OWNER = 30;
    public static final int SIZE_CD = 6;
    public static final int SIZE_PUBLIC = 1;
    public static final int SIZE_BACKUP = 1;
    public static final String[] fieldnames = { "id", "type", "iso", "startdate", "enddate", "owner", "cd", "public", "backup" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_Date, Datatypes.type_Date, Datatypes.type_String, Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_boolean };

    public static final String[] filmtypePKfields = { "filmtype.type" };
    public static final String[] filmtypeFKfields = { "film.type" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return iso value
     */
    public java.lang.String getIso();

    /**
     * set iso value
     * @param iso: new value
     */
    public void setIso(java.lang.String iso);

    /**
     * 
     * @return startdate value
     */
    public java.sql.Date getStartdate();

    /**
     * set startdate value
     * @param startdate: new value
     */
    public void setStartdate(java.sql.Date startdate);

    /**
     * 
     * @return enddate value
     */
    public java.sql.Date getEnddate();

    /**
     * set enddate value
     * @param enddate: new value
     */
    public void setEnddate(java.sql.Date enddate);

    /**
     * 
     * @return owner value
     */
    public java.lang.String getOwner();

    /**
     * set owner value
     * @param owner: new value
     */
    public void setOwner(java.lang.String owner);

    /**
     * 
     * @return cd value
     */
    public java.lang.String getCd();

    /**
     * set cd value
     * @param cd: new value
     */
    public void setCd(java.lang.String cd);

    /**
     * 
     * @return publicf_ value
     */
    public boolean getPublic();

    /**
     * set public value
     * @param publicf_: new value
     */
    public void setPublic(boolean publicf_);

    /**
     * 
     * @return backup value
     */
    public boolean getBackup();

    /**
     * set backup value
     * @param backup: new value
     */
    public void setBackup(boolean backup);

    /**
     * 
     * @return foreign key filmtypePK, instance of FilmtypePK
     */
    public IFilmtypePK getFilmtypePK();

    /**
     * set foreign key filmtype
     * @param filmtypePK: instance of FilmtypePK
     */
    public void setFilmtypePK(IFilmtypePK filmtypePK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
