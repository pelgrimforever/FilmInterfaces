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
import film.interfaces.logicentity.IPhotosubjects;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class ePhotosubjects extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected PhotosubjectsPK photosubjectsPK;
	  
    public static final String table = "photosubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IPhotosubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhotosubjects.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return ePhotosubjects.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return ePhotosubjects.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public ePhotosubjects() {
    }

    public ePhotosubjects(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.photosubjectsPK = new PhotosubjectsPK(film, id, cat1, cat2, subject);
    }
  
    public ePhotosubjects(PhotosubjectsPK photosubjectsPK) {
        this.photosubjectsPK = photosubjectsPK;
    }

    public boolean isEmpty() {
        return this.photosubjectsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.photosubjectsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.photosubjectsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public PhotosubjectsPK getPrimaryKey() {
        return this.photosubjectsPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
