/*
 * eTree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
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
import film.interfaces.logicentity.ITree7subject;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Tree7subject
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tree7subject Entity
 * 
 * @author Franky Laseure
 */
public class eTree7subject extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Tree7subjectPK tree7subjectPK;
    private Tree7subjectPK tree7subjectParentsubjectidPK;
    private java.lang.String tree7id;
    private java.lang.String subject;
    private int treestep;
	  
    public static final String table = "tree7subject";
	  
    public String getFieldname(short fieldconstant) {
        return ITree7subject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITree7subject.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTree7subject.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTree7subject.connectionpool;
    }
    
    /**
     * 
     * @return table name for Tree7subject
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tree7subjectPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tree7subjectPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITree7subject.PARENTSUBJECTID, this.tree7subjectParentsubjectidPK.getSubjectid());

        updates.put(ITree7subject.TREE7ID, tree7id);
        updates.put(ITree7subject.SUBJECT, subject);
        updates.put(ITree7subject.TREESTEP, treestep);
        return getAllFields();
    }
	
    /**
     * @return Tree7subjectPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Tree7subjectPK
     */
    @Override
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
        updates.put(ITree7subject.TREESTEP, treestep);
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
