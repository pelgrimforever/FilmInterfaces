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
import film.interfaces.logicentity.IPhototags;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class ePhototags extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected PhototagsPK phototagsPK;
    private java.lang.String tagformat;
    private java.lang.String tagvalue;
	  
    public static final String table = "phototags";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototags.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototags.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return ePhototags.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return ePhototags.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public ePhototags() {
    }

    public ePhototags(java.lang.String film, int id, java.lang.String tag) {
        this.phototagsPK = new PhototagsPK(film, id, tag);
    }
  
    public ePhototags(PhototagsPK phototagsPK) {
        this.phototagsPK = phototagsPK;
    }

    public boolean isEmpty() {
        return this.phototagsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.phototagsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.phototagsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IPhototags.TAGFORMAT, tagformat);
        updates.put(IPhototags.TAGVALUE, tagvalue);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public PhototagsPK getPrimaryKey() {
        return this.phototagsPK;
    }

    public java.lang.String getTagformat() {
        return this.tagformat;
    }

    public void initTagformat(java.lang.String tagformat) {
        this.tagformat = tagformat;
    }

    public void setTagformat(java.lang.String tagformat) {
	if(tagformat==null && tagformat!=this.tagformat || tagformat!=null && !tagformat.equals(this.tagformat)) {
            updates.put(IPhototags.TAGFORMAT, tagformat);
        }
        this.tagformat = tagformat;
    }

    public java.lang.String getTagvalue() {
        return this.tagvalue;
    }

    public void initTagvalue(java.lang.String tagvalue) {
        this.tagvalue = tagvalue;
    }

    public void setTagvalue(java.lang.String tagvalue) {
	if(tagvalue==null && tagvalue!=this.tagvalue || tagvalue!=null && !tagvalue.equals(this.tagvalue)) {
            updates.put(IPhototags.TAGVALUE, tagvalue);
        }
        this.tagvalue = tagvalue;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
