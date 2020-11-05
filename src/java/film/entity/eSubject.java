/*
 * eSubject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.ISubject;
import film.interfaces.entity.pk.*;

/**
 * Entity class Subject
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Subject Entity
 * 
 * @author Franky Laseure
 */
public class eSubject extends AbstractEntity implements EntityInterface {

    protected SubjectPK subjectPK;
    private Tree7subjectPK tree7subjectPK;
    private java.lang.String subject;
    private java.lang.String description;
	  
    public static final String table = "subject";
    public static final String SQLWhere1 = "cat1 = :subject.cat1: and cat2 = :subject.cat2: and id = :subject.id:";
    public static final String SQLSelect1 = "select subject.* from subject where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from subject where " + SQLWhere1;
    public static final String SQLSelectAll = "select subject.* from subject";
	  
    public String getFieldname(short fieldconstant) {
        return ISubject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISubject.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Subject
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Subject (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Subject (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Subjects
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Subject class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Subject entity
     */
    public eSubject() {
    }

    /**
     * Constructor
     * build an empty Subject entity with initialized field values
     */
    public eSubject(java.lang.String cat1, java.lang.String cat2, int id) {
        this.subjectPK = new SubjectPK(cat1, cat2, id);
    }
  
    /**
     * Constructor
     * build an empty Subject entity with initialized Primarykey parameter
     * @param subjectPK: Subject Primarykey
     */
    public eSubject(SubjectPK subjectPK) {
        this.subjectPK = subjectPK;
    }

    /**
     * @return is Subject Empty ?
     */
    public boolean isEmpty() {
        return this.subjectPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.subjectPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.subjectPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISubject.TREE7SUBJECTID, this.tree7subjectPK.getSubjectid());

        updates.put(ISubject.SUBJECT, subject);
        updates.put(ISubject.DESCRIPTION, description);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public SubjectPK getPrimaryKey() {
        return this.subjectPK;
    }

    /**
     * 
     * @return subject value
     */
    public java.lang.String getSubject() {
        return this.subject;
    }

    /**
     * set subject value
     * @param subject: new value
     */
    public void initSubject(java.lang.String subject) {
        this.subject = subject;
    }

    /**
     * set subject value
     * @param subject: new value
     */
    public void setSubject(java.lang.String subject) {
	if(subject==null && subject!=this.subject || subject!=null && !subject.equals(this.subject)) {
            updates.put(ISubject.SUBJECT, subject);
        }
        this.subject = subject;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(ISubject.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return foreign key tree7subjectPK, instance of Tree7subjectPK
     */
    public Tree7subjectPK getTree7subjectPK() {
        return this.tree7subjectPK;
    }

    /**
     * set foreign key tree7subject
     * @param tree7subjectPK: instance of Tree7subjectPK
     */
    public void initTree7subjectPK(ITree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = (Tree7subjectPK)tree7subjectPK;
    }

    /**
     * set foreign key tree7subject
     * @param tree7subjectPK: instance of Tree7subjectPK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
