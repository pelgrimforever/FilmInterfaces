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
import film.interfaces.logicentity.IPhototree7subject;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class ePhototree7subject extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Phototree7subjectPK phototree7subjectPK;
	  
    public static final String table = "phototree7subject";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototree7subject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototree7subject.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return ePhototree7subject.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return ePhototree7subject.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public ePhototree7subject() {
    }

    public ePhototree7subject(java.lang.String film, int id, long subjectid) {
        this.phototree7subjectPK = new Phototree7subjectPK(film, id, subjectid);
    }
  
    public ePhototree7subject(Phototree7subjectPK phototree7subjectPK) {
        this.phototree7subjectPK = phototree7subjectPK;
    }

    public boolean isEmpty() {
        return this.phototree7subjectPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.phototree7subjectPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.phototree7subjectPK.getPrimarykeyvalues();	  
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
    public Phototree7subjectPK getPrimaryKey() {
        return this.phototree7subjectPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
