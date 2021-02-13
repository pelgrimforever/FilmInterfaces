/*
 * eSecurityuserprofile.java
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
import film.interfaces.logicentity.ISecurityuserprofile;
import film.interfaces.entity.pk.*;

/**
 * Entity class Securityuserprofile
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Securityuserprofile Entity
 * 
 * @author Franky Laseure
 */
public class eSecurityuserprofile extends AbstractEntity implements EntityInterface {

    protected SecurityuserprofilePK securityuserprofilePK;
	  
    public static final String table = "securityuserprofile";
    public static final String SQLWhere1 = "siteusername = :securityuserprofile.siteusername: and userprofile = :securityuserprofile.userprofile:";
    public static final String SQLSelect1 = "select securityuserprofile.* from securityuserprofile where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from securityuserprofile where " + SQLWhere1;
    public static final String SQLSelectAll = "select securityuserprofile.* from securityuserprofile";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurityuserprofile.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurityuserprofile.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Securityuserprofile
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Securityuserprofile (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Securityuserprofile (=Primarykey)
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
     * @return SQL select statement for all Securityuserprofiles
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Securityuserprofile class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Securityuserprofile entity
     */
    public eSecurityuserprofile() {
    }

    /**
     * Constructor
     * build an empty Securityuserprofile entity with initialized field values
     */
    public eSecurityuserprofile(java.lang.String siteusername, java.lang.String userprofile) {
        this.securityuserprofilePK = new SecurityuserprofilePK(siteusername, userprofile);
    }
  
    /**
     * Constructor
     * build an empty Securityuserprofile entity with initialized Primarykey parameter
     * @param securityuserprofilePK: Securityuserprofile Primarykey
     */
    public eSecurityuserprofile(SecurityuserprofilePK securityuserprofilePK) {
        this.securityuserprofilePK = securityuserprofilePK;
    }

    /**
     * @return is Securityuserprofile Empty ?
     */
    public boolean isEmpty() {
        return this.securityuserprofilePK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.securityuserprofilePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.securityuserprofilePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
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
    public SecurityuserprofilePK getPrimaryKey() {
        return this.securityuserprofilePK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
