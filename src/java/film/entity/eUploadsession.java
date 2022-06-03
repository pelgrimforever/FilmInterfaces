/*
 * eUploadsession.java
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
import film.interfaces.logicentity.IUploadsession;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Uploadsession
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Uploadsession Entity
 * 
 * @author Franky Laseure
 */
public class eUploadsession extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected UploadsessionPK uploadsessionPK;
    private CreatorPK creatorPK;
    private boolean upload;
    private float rotation;
    private java.lang.String filmgroupid;
    private java.lang.String photosubjects;
    private java.lang.String description;
	  
    public static final String table = "uploadsession";
	  
    public String getFieldname(short fieldconstant) {
        return IUploadsession.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUploadsession.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eUploadsession.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eUploadsession.connectionpool;
    }
    
    /**
     * 
     * @return table name for Uploadsession
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Uploadsession class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Uploadsession entity
     */
    public eUploadsession() {
    }

    /**
     * Constructor
     * build an empty Uploadsession entity with initialized field values
     */
    public eUploadsession(java.lang.String filename) {
        this.uploadsessionPK = new UploadsessionPK(filename);
    }
  
    /**
     * Constructor
     * build an empty Uploadsession entity with initialized Primarykey parameter
     * @param uploadsessionPK: Uploadsession Primarykey
     */
    public eUploadsession(UploadsessionPK uploadsessionPK) {
        this.uploadsessionPK = uploadsessionPK;
    }

    /**
     * @return is Uploadsession Empty ?
     */
    public boolean isEmpty() {
        return this.uploadsessionPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.uploadsessionPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.uploadsessionPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IUploadsession.CREATOR, this.creatorPK.getCreatorid());

        updates.put(IUploadsession.UPLOAD, upload);
        updates.put(IUploadsession.ROTATION, rotation);
        updates.put(IUploadsession.FILMGROUPID, filmgroupid);
        updates.put(IUploadsession.PHOTOSUBJECTS, photosubjects);
        updates.put(IUploadsession.DESCRIPTION, description);
        return getAllFields();
    }
	
    /**
     * @return UploadsessionPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return UploadsessionPK
     */
    @Override
    public UploadsessionPK getPrimaryKey() {
        return this.uploadsessionPK;
    }

    /**
     * 
     * @return upload value
     */
    public boolean getUpload() {
        return this.upload;
    }

    /**
     * set upload value
     * @param upload: new value
     */
    public void initUpload(boolean upload) {
        this.upload = upload;
    }

    /**
     * set upload value
     * @param upload: new value
     */
    public void setUpload(boolean upload) {
        updates.put(IUploadsession.UPLOAD, upload);
        this.upload = upload;
    }

    /**
     * 
     * @return rotation value
     */
    public float getRotation() {
        return this.rotation;
    }

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void initRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void setRotation(float rotation) {
        updates.put(IUploadsession.ROTATION, rotation);
        this.rotation = rotation;
    }

    /**
     * 
     * @return filmgroupid value
     */
    public java.lang.String getFilmgroupid() {
        return this.filmgroupid;
    }

    /**
     * set filmgroupid value
     * @param filmgroupid: new value
     */
    public void initFilmgroupid(java.lang.String filmgroupid) {
        this.filmgroupid = filmgroupid;
    }

    /**
     * set filmgroupid value
     * @param filmgroupid: new value
     */
    public void setFilmgroupid(java.lang.String filmgroupid) {
	if(filmgroupid==null && filmgroupid!=this.filmgroupid || filmgroupid!=null && !filmgroupid.equals(this.filmgroupid)) {
            updates.put(IUploadsession.FILMGROUPID, filmgroupid);
        }
        this.filmgroupid = filmgroupid;
    }

    /**
     * 
     * @return photosubjects value
     */
    public java.lang.String getPhotosubjects() {
        return this.photosubjects;
    }

    /**
     * set photosubjects value
     * @param photosubjects: new value
     */
    public void initPhotosubjects(java.lang.String photosubjects) {
        this.photosubjects = photosubjects;
    }

    /**
     * set photosubjects value
     * @param photosubjects: new value
     */
    public void setPhotosubjects(java.lang.String photosubjects) {
	if(photosubjects==null && photosubjects!=this.photosubjects || photosubjects!=null && !photosubjects.equals(this.photosubjects)) {
            updates.put(IUploadsession.PHOTOSUBJECTS, photosubjects);
        }
        this.photosubjects = photosubjects;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IUploadsession.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return foreign key creatorPK, instance of CreatorPK
     */
    public CreatorPK getCreatorPK() {
        return this.creatorPK;
    }

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void initCreatorPK(ICreatorPK creatorPK) {
        this.creatorPK = (CreatorPK)creatorPK;
    }

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void setCreatorPK(ICreatorPK creatorPK) {
	if(creatorPK==null && creatorPK!=this.creatorPK || creatorPK!=null) {
            if(creatorPK==null) {
                updates.put(IUploadsession.CREATOR, null);
            } else {
                updates.put(IUploadsession.CREATOR, creatorPK.getCreatorid());
            }
        }
        this.creatorPK = (CreatorPK)creatorPK;
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
