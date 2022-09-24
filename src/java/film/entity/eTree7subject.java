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
import film.interfaces.logicentity.ITree7subject;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eTree7subject.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eTree7subject.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eTree7subject() {
    }

    public eTree7subject(long subjectid) {
        this.tree7subjectPK = new Tree7subjectPK(subjectid);
    }
  
    public eTree7subject(Tree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = tree7subjectPK;
    }

    public boolean isEmpty() {
        return this.tree7subjectPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tree7subjectPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tree7subjectPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ITree7subject.PARENTSUBJECTID, this.tree7subjectParentsubjectidPK.getSubjectid());

        updates.put(ITree7subject.TREE7ID, tree7id);
        updates.put(ITree7subject.SUBJECT, subject);
        updates.put(ITree7subject.TREESTEP, treestep);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Tree7subjectPK getPrimaryKey() {
        return this.tree7subjectPK;
    }

    public java.lang.String getTree7id() {
        return this.tree7id;
    }

    public void initTree7id(java.lang.String tree7id) {
        this.tree7id = tree7id;
    }

    public void setTree7id(java.lang.String tree7id) {
	if(tree7id==null && tree7id!=this.tree7id || tree7id!=null && !tree7id.equals(this.tree7id)) {
            updates.put(ITree7subject.TREE7ID, tree7id);
        }
        this.tree7id = tree7id;
    }

    public java.lang.String getSubject() {
        return this.subject;
    }

    public void initSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public void setSubject(java.lang.String subject) {
	if(subject==null && subject!=this.subject || subject!=null && !subject.equals(this.subject)) {
            updates.put(ITree7subject.SUBJECT, subject);
        }
        this.subject = subject;
    }

    public int getTreestep() {
        return this.treestep;
    }

    public void initTreestep(int treestep) {
        this.treestep = treestep;
    }

    public void setTreestep(int treestep) {
        updates.put(ITree7subject.TREESTEP, treestep);
        this.treestep = treestep;
    }

    public Tree7subjectPK getTree7subjectparentsubjectidPK() {
        return this.tree7subjectParentsubjectidPK;
    }

    public void initTree7subjectparentsubjectidPK(ITree7subjectPK tree7subjectParentsubjectidPK) {
        this.tree7subjectParentsubjectidPK = (Tree7subjectPK)tree7subjectParentsubjectidPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
