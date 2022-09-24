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
import film.interfaces.logicentity.IFilmtype;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eFilmtype extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected FilmtypePK filmtypePK;
    private java.lang.String description;
	  
    public static final String table = "filmtype";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmtype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmtype.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eFilmtype.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFilmtype.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFilmtype() {
    }

    public eFilmtype(java.lang.String type) {
        this.filmtypePK = new FilmtypePK(type);
    }
  
    public eFilmtype(FilmtypePK filmtypePK) {
        this.filmtypePK = filmtypePK;
    }

    public boolean isEmpty() {
        return this.filmtypePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmtypePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmtypePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IFilmtype.DESCRIPTION, description);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public FilmtypePK getPrimaryKey() {
        return this.filmtypePK;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IFilmtype.DESCRIPTION, description);
        }
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
