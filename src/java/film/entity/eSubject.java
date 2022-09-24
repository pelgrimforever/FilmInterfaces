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
import film.interfaces.logicentity.ISubject;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSubject extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SubjectPK subjectPK;
    private Tree7subjectPK tree7subjectPK;
    private java.lang.String subject;
    private java.lang.String description;
	  
    public static final String table = "subject";
	  
    public String getFieldname(short fieldconstant) {
        return ISubject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISubject.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSubject.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSubject.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSubject() {
    }

    public eSubject(java.lang.String cat1, java.lang.String cat2, int id) {
        this.subjectPK = new SubjectPK(cat1, cat2, id);
    }
  
    public eSubject(SubjectPK subjectPK) {
        this.subjectPK = subjectPK;
    }

    public boolean isEmpty() {
        return this.subjectPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.subjectPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.subjectPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISubject.TREE7SUBJECTID, this.tree7subjectPK.getSubjectid());

        updates.put(ISubject.SUBJECT, subject);
        updates.put(ISubject.DESCRIPTION, description);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SubjectPK getPrimaryKey() {
        return this.subjectPK;
    }

    public java.lang.String getSubject() {
        return this.subject;
    }

    public void initSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public void setSubject(java.lang.String subject) {
	if(subject==null && subject!=this.subject || subject!=null && !subject.equals(this.subject)) {
            updates.put(ISubject.SUBJECT, subject);
        }
        this.subject = subject;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(ISubject.DESCRIPTION, description);
        }
        this.description = description;
    }

    public Tree7subjectPK getTree7subjectPK() {
        return this.tree7subjectPK;
    }

    public void initTree7subjectPK(ITree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = (Tree7subjectPK)tree7subjectPK;
    }

    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK) {
	if(tree7subjectPK==null && tree7subjectPK!=this.tree7subjectPK || tree7subjectPK!=null) {
            if(tree7subjectPK==null) {
                updates.put(ISubject.TREE7SUBJECTID, null);
            } else {
                updates.put(ISubject.TREE7SUBJECTID, tree7subjectPK.getSubjectid());
            }
        }
        this.tree7subjectPK = (Tree7subjectPK)tree7subjectPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
