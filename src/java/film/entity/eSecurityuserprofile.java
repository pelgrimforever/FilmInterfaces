/*
 * eSecurityuserprofile.java
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
import film.interfaces.logicentity.ISecurityuserprofile;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Securityuserprofile
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Securityuserprofile Entity
 * 
 * @author Franky Laseure
 */
public class eSecurityuserprofile extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SecurityuserprofilePK securityuserprofilePK;
	  
    public static final String table = "securityuserprofile";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurityuserprofile.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurityuserprofile.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSecurityuserprofile.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSecurityuserprofile.connectionpool;
    }
    
    /**
     * 
     * @return table name for Securityuserprofile
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.securityuserprofilePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.securityuserprofilePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    /**
     * @return SecurityuserprofilePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SecurityuserprofilePK
     */
    @Override
    public SecurityuserprofilePK getPrimaryKey() {
        return this.securityuserprofilePK;
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
