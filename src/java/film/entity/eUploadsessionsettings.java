/*
 * eUploadsessionsettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IUploadsessionsettings;
import film.interfaces.entity.pk.*;

/**
 * Entity class Uploadsessionsettings
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Uploadsessionsettings Entity
 * 
 * @author Franky Laseure
 */
public class eUploadsessionsettings extends AbstractEntity implements EntityInterface {

    protected UploadsessionsettingsPK uploadsessionsettingsPK;
    private java.lang.String uploadtype;
    private java.lang.String filmgroups;
    private int lastposition;
    private java.lang.String copymode;
    private int uploadingposition;
	  
    public static final String table = "uploadsessionsettings";
    public static final String SQLWhere1 = "directory = :uploadsessionsettings.directory:";
    public static final String SQLSelect1 = "select uploadsessionsettings.* from uploadsessionsettings where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from uploadsessionsettings where " + SQLWhere1;
    public static final String SQLSelectAll = "select uploadsessionsettings.* from uploadsessionsettings";
	  
    public String getFieldname(short fieldconstant) {
        return IUploadsessionsettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUploadsessionsettings.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Uploadsessionsettings
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Uploadsessionsettings (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Uploadsessionsettings (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Uploadsessionsettingss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Uploadsessionsettings class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Uploadsessionsettings entity
     */
    public eUploadsessionsettings() {
    }

    /**
     * Constructor
     * build an empty Uploadsessionsettings entity with initialized field values
     */
    public eUploadsessionsettings(java.lang.String directory) {
        this.uploadsessionsettingsPK = new UploadsessionsettingsPK(directory);
    }
  
    /**
     * Constructor
     * build an empty Uploadsessionsettings entity with initialized Primarykey parameter
     * @param uploadsessionsettingsPK: Uploadsessionsettings Primarykey
     */
    public eUploadsessionsettings(UploadsessionsettingsPK uploadsessionsettingsPK) {
        this.uploadsessionsettingsPK = uploadsessionsettingsPK;
    }

    /**
     * @return is Uploadsessionsettings Empty ?
     */
    public boolean isEmpty() {
        return this.uploadsessionsettingsPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.uploadsessionsettingsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.uploadsessionsettingsPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IUploadsessionsettings.UPLOADTYPE, uploadtype);
        updates.put(IUploadsessionsettings.FILMGROUPS, filmgroups);
        updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
        updates.put(IUploadsessionsettings.COPYMODE, copymode);
        updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public UploadsessionsettingsPK getPrimaryKey() {
        return this.uploadsessionsettingsPK;
    }

    /**
     * 
     * @return uploadtype value
     */
    public java.lang.String getUploadtype() {
        return this.uploadtype;
    }

    /**
     * set uploadtype value
     * @param uploadtype: new value
     */
    public void initUploadtype(java.lang.String uploadtype) {
        this.uploadtype = uploadtype;
    }

    /**
     * set uploadtype value
     * @param uploadtype: new value
     */
    public void setUploadtype(java.lang.String uploadtype) {
	if(uploadtype==null && uploadtype!=this.uploadtype || uploadtype!=null && !uploadtype.equals(this.uploadtype)) {
            updates.put(IUploadsessionsettings.UPLOADTYPE, uploadtype);
        }
        this.uploadtype = uploadtype;
    }

    /**
     * 
     * @return filmgroups value
     */
    public java.lang.String getFilmgroups() {
        return this.filmgroups;
    }

    /**
     * set filmgroups value
     * @param filmgroups: new value
     */
    public void initFilmgroups(java.lang.String filmgroups) {
        this.filmgroups = filmgroups;
    }

    /**
     * set filmgroups value
     * @param filmgroups: new value
     */
    public void setFilmgroups(java.lang.String filmgroups) {
	if(filmgroups==null && filmgroups!=this.filmgroups || filmgroups!=null && !filmgroups.equals(this.filmgroups)) {
            updates.put(IUploadsessionsettings.FILMGROUPS, filmgroups);
        }
        this.filmgroups = filmgroups;
    }

    /**
     * 
     * @return lastposition value
     */
    public int getLastposition() {
        return this.lastposition;
    }

    /**
     * set lastposition value
     * @param lastposition: new value
     */
    public void initLastposition(int lastposition) {
        this.lastposition = lastposition;
    }

    /**
     * set lastposition value
     * @param lastposition: new value
     */
    public void setLastposition(int lastposition) {
	if(lastposition!=this.lastposition) {
            updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
        }
        this.lastposition = lastposition;
    }

    /**
     * 
     * @return copymode value
     */
    public java.lang.String getCopymode() {
        return this.copymode;
    }

    /**
     * set copymode value
     * @param copymode: new value
     */
    public void initCopymode(java.lang.String copymode) {
        this.copymode = copymode;
    }

    /**
     * set copymode value
     * @param copymode: new value
     */
    public void setCopymode(java.lang.String copymode) {
	if(copymode==null && copymode!=this.copymode || copymode!=null && !copymode.equals(this.copymode)) {
            updates.put(IUploadsessionsettings.COPYMODE, copymode);
        }
        this.copymode = copymode;
    }

    /**
     * 
     * @return uploadingposition value
     */
    public int getUploadingposition() {
        return this.uploadingposition;
    }

    /**
     * set uploadingposition value
     * @param uploadingposition: new value
     */
    public void initUploadingposition(int uploadingposition) {
        this.uploadingposition = uploadingposition;
    }

    /**
     * set uploadingposition value
     * @param uploadingposition: new value
     */
    public void setUploadingposition(int uploadingposition) {
	if(uploadingposition!=this.uploadingposition) {
            updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        }
        this.uploadingposition = uploadingposition;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
