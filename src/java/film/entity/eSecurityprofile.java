/*
 * eSecurityprofile.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
import film.interfaces.logicentity.ISecurityprofile;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Securityprofile
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Securityprofile Entity
 * 
 * @author Franky Laseure
 */
public class eSecurityprofile extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SecurityprofilePK securityprofilePK;
    private boolean privateaccess;
	  
    public static final String table = "securityprofile";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurityprofile.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurityprofile.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSecurityprofile.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSecurityprofile.connectionpool;
    }
    
    /**
     * 
     * @return table name for Securityprofile
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.securityprofilePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.securityprofilePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
        return getAllFields();
    }
	
    /**
     * @return SecurityprofilePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SecurityprofilePK
     */
    @Override
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
        updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
        this.privateaccess = privateaccess;
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
