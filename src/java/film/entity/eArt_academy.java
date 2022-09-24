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
import film.interfaces.logicentity.IArt_academy;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eArt_academy extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Art_academyPK art_academyPK;
    private java.lang.String academy;
    private java.lang.String academylocation;
	  
    public static final String table = "art_academy";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_academy.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_academy.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eArt_academy.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArt_academy.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArt_academy() {
    }

    public eArt_academy(long academyid) {
        this.art_academyPK = new Art_academyPK(academyid);
    }
  
    public eArt_academy(Art_academyPK art_academyPK) {
        this.art_academyPK = art_academyPK;
    }

    public boolean isEmpty() {
        return this.art_academyPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_academyPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_academyPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_academy.ACADEMY, academy);
        updates.put(IArt_academy.ACADEMYLOCATION, academylocation);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Art_academyPK getPrimaryKey() {
        return this.art_academyPK;
    }

    public java.lang.String getAcademy() {
        return this.academy;
    }

    public void initAcademy(java.lang.String academy) {
        this.academy = academy;
    }

    public void setAcademy(java.lang.String academy) {
	if(academy==null && academy!=this.academy || academy!=null && !academy.equals(this.academy)) {
            updates.put(IArt_academy.ACADEMY, academy);
        }
        this.academy = academy;
    }

    public java.lang.String getAcademylocation() {
        return this.academylocation;
    }

    public void initAcademylocation(java.lang.String academylocation) {
        this.academylocation = academylocation;
    }

    public void setAcademylocation(java.lang.String academylocation) {
	if(academylocation==null && academylocation!=this.academylocation || academylocation!=null && !academylocation.equals(this.academylocation)) {
            updates.put(IArt_academy.ACADEMYLOCATION, academylocation);
        }
        this.academylocation = academylocation;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
