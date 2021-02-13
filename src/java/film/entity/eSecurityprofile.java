/*
 * eSecurityprofile.java
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
import film.interfaces.logicentity.ISecurityprofile;
import film.interfaces.entity.pk.*;

/**
 * Entity class Securityprofile
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Securityprofile Entity
 * 
 * @author Franky Laseure
 */
public class eSecurityprofile extends AbstractEntity implements EntityInterface {

    protected SecurityprofilePK securityprofilePK;
    private boolean privateaccess;
	  
    public static final String table = "securityprofile";
    public static final String SQLWhere1 = "userprofile = :securityprofile.userprofile:";
    public static final String SQLSelect1 = "select securityprofile.* from securityprofile where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from securityprofile where " + SQLWhere1;
    public static final String SQLSelectAll = "select securityprofile.* from securityprofile";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurityprofile.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurityprofile.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Securityprofile
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Securityprofile (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Securityprofile (=Primarykey)
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
     * @return SQL select statement for all Securityprofiles
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Securityprofile class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Securityprofile entity
     */
    public eSecurityprofile() {
    }

    /**
     * Constructor
     * build an empty Securityprofile entity with initialized field values
     */
    public eSecurityprofile(java.lang.String userprofile) {
        this.securityprofilePK = new SecurityprofilePK(userprofile);
    }
  
    /**
     * Constructor
     * build an empty Securityprofile entity with initialized Primarykey parameter
     * @param securityprofilePK: Securityprofile Primarykey
     */
    public eSecurityprofile(SecurityprofilePK securityprofilePK) {
        this.securityprofilePK = securityprofilePK;
    }

    /**
     * @return is Securityprofile Empty ?
     */
    public boolean isEmpty() {
        return this.securityprofilePK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.securityprofilePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.securityprofilePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
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
    public SecurityprofilePK getPrimaryKey() {
        return this.securityprofilePK;
    }

    /**
     * 
     * @return privateaccess value
     */
    public boolean getPrivateaccess() {
        return this.privateaccess;
    }

    /**
     * set privateaccess value
     * @param privateaccess: new value
     */
    public void initPrivateaccess(boolean privateaccess) {
        this.privateaccess = privateaccess;
    }

    /**
     * set privateaccess value
     * @param privateaccess: new value
     */
    public void setPrivateaccess(boolean privateaccess) {
	if(privateaccess!=this.privateaccess) {
            updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
        }
        this.privateaccess = privateaccess;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
