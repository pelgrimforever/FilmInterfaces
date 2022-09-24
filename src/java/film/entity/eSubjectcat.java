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
import film.interfaces.logicentity.ISubjectcat;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSubjectcat extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SubjectcatPK subjectcatPK;
    private int catno;
    private java.lang.String description;
	  
    public static final String table = "subjectcat";
	  
    public String getFieldname(short fieldconstant) {
        return ISubjectcat.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISubjectcat.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSubjectcat.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSubjectcat.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSubjectcat() {
    }

    public eSubjectcat(java.lang.String cat) {
        this.subjectcatPK = new SubjectcatPK(cat);
    }
  
    public eSubjectcat(SubjectcatPK subjectcatPK) {
        this.subjectcatPK = subjectcatPK;
    }

    public boolean isEmpty() {
        return this.subjectcatPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.subjectcatPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.subjectcatPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISubjectcat.CATNO, catno);
        updates.put(ISubjectcat.DESCRIPTION, description);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SubjectcatPK getPrimaryKey() {
        return this.subjectcatPK;
    }

    public int getCatno() {
        return this.catno;
    }

    public void initCatno(int catno) {
        this.catno = catno;
    }

    public void setCatno(int catno) {
        updates.put(ISubjectcat.CATNO, catno);
        this.catno = catno;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(ISubjectcat.DESCRIPTION, description);
        }
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
