/*
 * eUploadsessionsettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity;

import film.filmDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IUploadsessionsettings;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Uploadsessionsettings
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Uploadsessionsettings Entity
 * 
 * @author Franky Laseure
 */
public class eUploadsessionsettings extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected UploadsessionsettingsPK uploadsessionsettingsPK;
    private java.lang.String uploadtype;
    private java.lang.String filmgroups;
    private int lastposition;
    private java.lang.String copymode;
    private int uploadingposition;
	  
    public static final String table = "uploadsessionsettings";
	  
    public String getFieldname(short fieldconstant) {
        return IUploadsessionsettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUploadsessionsettings.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eUploadsessionsettings.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eUploadsessionsettings.connectionpool;
    }
    
    /**
     * 
     * @return table name for Uploadsessionsettings
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.uploadsessionsettingsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.uploadsessionsettingsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IUploadsessionsettings.UPLOADTYPE, uploadtype);
        updates.put(IUploadsessionsettings.FILMGROUPS, filmgroups);
        updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
        updates.put(IUploadsessionsettings.COPYMODE, copymode);
        updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        return getAllFields();
    }
	
    /**
     * @return UploadsessionsettingsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return UploadsessionsettingsPK
     */
    @Override
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
        updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
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
        updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        this.uploadingposition = uploadingposition;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
