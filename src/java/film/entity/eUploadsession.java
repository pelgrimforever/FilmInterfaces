/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eUploadsession.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eUploadsession.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eUploadsession() {
    }

    public eUploadsession(java.lang.String filename) {
        this.uploadsessionPK = new UploadsessionPK(filename);
    }
  
    public eUploadsession(UploadsessionPK uploadsessionPK) {
        this.uploadsessionPK = uploadsessionPK;
    }

    public boolean isEmpty() {
        return this.uploadsessionPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.uploadsessionPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.uploadsessionPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public UploadsessionPK getPrimaryKey() {
        return this.uploadsessionPK;
    }

    public boolean getUpload() {
        return this.upload;
    }

    public void initUpload(boolean upload) {
        this.upload = upload;
    }

    public void setUpload(boolean upload) {
        updates.put(IUploadsession.UPLOAD, upload);
        this.upload = upload;
    }

    public float getRotation() {
        return this.rotation;
    }

    public void initRotation(float rotation) {
        this.rotation = rotation;
    }

    public void setRotation(float rotation) {
        updates.put(IUploadsession.ROTATION, rotation);
        this.rotation = rotation;
    }

    public java.lang.String getFilmgroupid() {
        return this.filmgroupid;
    }

    public void initFilmgroupid(java.lang.String filmgroupid) {
        this.filmgroupid = filmgroupid;
    }

    public void setFilmgroupid(java.lang.String filmgroupid) {
	if(filmgroupid==null && filmgroupid!=this.filmgroupid || filmgroupid!=null && !filmgroupid.equals(this.filmgroupid)) {
            updates.put(IUploadsession.FILMGROUPID, filmgroupid);
        }
        this.filmgroupid = filmgroupid;
    }

    public java.lang.String getPhotosubjects() {
        return this.photosubjects;
    }

    public void initPhotosubjects(java.lang.String photosubjects) {
        this.photosubjects = photosubjects;
    }

    public void setPhotosubjects(java.lang.String photosubjects) {
	if(photosubjects==null && photosubjects!=this.photosubjects || photosubjects!=null && !photosubjects.equals(this.photosubjects)) {
            updates.put(IUploadsession.PHOTOSUBJECTS, photosubjects);
        }
        this.photosubjects = photosubjects;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IUploadsession.DESCRIPTION, description);
        }
        this.description = description;
    }

    public CreatorPK getCreatorPK() {
        return this.creatorPK;
    }

    public void initCreatorPK(ICreatorPK creatorPK) {
        this.creatorPK = (CreatorPK)creatorPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
