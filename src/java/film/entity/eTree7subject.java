/*
 * eTree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
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
import film.interfaces.logicentity.ITree7subject;
import film.interfaces.entity.pk.*;

/**
 * Entity class Tree7subject
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tree7subject Entity
 * 
 * @author Franky Laseure
 */
public class eTree7subject extends AbstractEntity implements EntityInterface {

    protected Tree7subjectPK tree7subjectPK;
    private Tree7subjectPK tree7subjectParentsubjectidPK;
    private java.lang.String tree7id;
    private java.lang.String subject;
    private int treestep;
	  
    public static final String table = "tree7subject";
    public static final String SQLWhere1 = "subjectid = :tree7subject.subjectid:";
    public static final String SQLSelect1 = "select tree7subject.* from tree7subject where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from tree7subject where " + SQLWhere1;
    public static final String SQLSelectAll = "select tree7subject.* from tree7subject";
	  
    public String getFieldname(short fieldconstant) {
        return ITree7subject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITree7subject.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Tree7subject
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Tree7subject (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Tree7subject (=Primarykey)
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
     * @return SQL select statement for all Tree7subjects
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Tree7subject class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Tree7subject entity
     */
    public eTree7subject() {
    }

    /**
     * Constructor
     * build an empty Tree7subject entity with initialized field values
     */
    public eTree7subject(long subjectid) {
        this.tree7subjectPK = new Tree7subjectPK(subjectid);
    }
  
    /**
     * Constructor
     * build an empty Tree7subject entity with initialized Primarykey parameter
     * @param tree7subjectPK: Tree7subject Primarykey
     */
    public eTree7subject(Tree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = tree7subjectPK;
    }

    /**
     * @return is Tree7subject Empty ?
     */
    public boolean isEmpty() {
        return this.tree7subjectPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.tree7subjectPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.tree7subjectPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ITree7subject.PARENTSUBJECTID, this.tree7subjectParentsubjectidPK.getSubjectid());

        updates.put(ITree7subject.TREE7ID, tree7id);
        updates.put(ITree7subject.SUBJECT, subject);
        updates.put(ITree7subject.TREESTEP, treestep);
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
    public Tree7subjectPK getPrimaryKey() {
        return this.tree7subjectPK;
    }

    /**
     * 
     * @return tree7id value
     */
    public java.lang.String getTree7id() {
        return this.tree7id;
    }

    /**
     * set tree7id value
     * @param tree7id: new value
     */
    public void initTree7id(java.lang.String tree7id) {
        this.tree7id = tree7id;
    }

    /**
     * set tree7id value
     * @param tree7id: new value
     */
    public void setTree7id(java.lang.String tree7id) {
	if(tree7id==null && tree7id!=this.tree7id || tree7id!=null && !tree7id.equals(this.tree7id)) {
            updates.put(ITree7subject.TREE7ID, tree7id);
        }
        this.tree7id = tree7id;
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
            updates.put(ITree7subject.SUBJECT, subject);
        }
        this.subject = subject;
    }

    /**
     * 
     * @return treestep value
     */
    public int getTreestep() {
        return this.treestep;
    }

    /**
     * set treestep value
     * @param treestep: new value
     */
    public void initTreestep(int treestep) {
        this.treestep = treestep;
    }

    /**
     * set treestep value
     * @param treestep: new value
     */
    public void setTreestep(int treestep) {
	if(treestep!=this.treestep) {
            updates.put(ITree7subject.TREESTEP, treestep);
        }
        this.treestep = treestep;
    }

    /**
     * 
     * @return foreign key tree7subjectPK1, instance of Tree7subjectPK
     */
    public Tree7subjectPK getTree7subjectparentsubjectidPK() {
        return this.tree7subjectParentsubjectidPK;
    }

    /**
     * set foreign key tree7subject
     * @param tree7subjectPK: instance of Tree7subjectPK
     */
    public void initTree7subjectparentsubjectidPK(ITree7subjectPK tree7subjectParentsubjectidPK) {
        this.tree7subjectParentsubjectidPK = (Tree7subjectPK)tree7subjectParentsubjectidPK;
    }

    /**
     * set foreign key tree7subject
     * @param tree7subjectPK: instance of Tree7subjectPK
     */
    public void setTree7subjectparentsubjectidPK(ITree7subjectPK tree7subjectParentsubjectidPK) {
	if(tree7subjectParentsubjectidPK==null && tree7subjectParentsubjectidPK!=this.tree7subjectParentsubjectidPK || tree7subjectParentsubjectidPK!=null) {
            if(tree7subjectParentsubjectidPK==null) {
                updates.put(ITree7subject.PARENTSUBJECTID, null);
            } else {
                updates.put(ITree7subject.PARENTSUBJECTID, tree7subjectParentsubjectidPK.getSubjectid());
            }
        }
        this.tree7subjectParentsubjectidPK = (Tree7subjectPK)tree7subjectParentsubjectidPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
