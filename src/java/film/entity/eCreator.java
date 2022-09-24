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
import film.interfaces.logicentity.ICreator;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eCreator extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected CreatorPK creatorPK;
    private java.lang.String name;
    private java.lang.String surname;
	  
    public static final String table = "creator";
	  
    public String getFieldname(short fieldconstant) {
        return ICreator.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICreator.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eCreator.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eCreator.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eCreator() {
    }

    public eCreator(java.lang.String creatorid) {
        this.creatorPK = new CreatorPK(creatorid);
    }
  
    public eCreator(CreatorPK creatorPK) {
        this.creatorPK = creatorPK;
    }

    public boolean isEmpty() {
        return this.creatorPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.creatorPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.creatorPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ICreator.NAME, name);
        updates.put(ICreator.SURNAME, surname);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public CreatorPK getPrimaryKey() {
        return this.creatorPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICreator.NAME, name);
        }
        this.name = name;
    }

    public java.lang.String getSurname() {
        return this.surname;
    }

    public void initSurname(java.lang.String surname) {
        this.surname = surname;
    }

    public void setSurname(java.lang.String surname) {
	if(surname==null && surname!=this.surname || surname!=null && !surname.equals(this.surname)) {
            updates.put(ICreator.SURNAME, surname);
        }
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
