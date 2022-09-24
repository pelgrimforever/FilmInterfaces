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
import film.interfaces.logicentity.IFilmsubjects;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eFilmsubjects extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected FilmsubjectsPK filmsubjectsPK;
	  
    public static final String table = "filmsubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmsubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmsubjects.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eFilmsubjects.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFilmsubjects.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFilmsubjects() {
    }

    public eFilmsubjects(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.filmsubjectsPK = new FilmsubjectsPK(film, cat1, cat2, subject);
    }
  
    public eFilmsubjects(FilmsubjectsPK filmsubjectsPK) {
        this.filmsubjectsPK = filmsubjectsPK;
    }

    public boolean isEmpty() {
        return this.filmsubjectsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmsubjectsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmsubjectsPK.getPrimarykeyvalues();	  
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
    public FilmsubjectsPK getPrimaryKey() {
        return this.filmsubjectsPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
