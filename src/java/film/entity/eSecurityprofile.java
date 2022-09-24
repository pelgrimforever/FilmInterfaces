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
import film.interfaces.logicentity.ISecurityprofile;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eSecurityprofile.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSecurityprofile.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSecurityprofile() {
    }

    public eSecurityprofile(java.lang.String userprofile) {
        this.securityprofilePK = new SecurityprofilePK(userprofile);
    }
  
    public eSecurityprofile(SecurityprofilePK securityprofilePK) {
        this.securityprofilePK = securityprofilePK;
    }

    public boolean isEmpty() {
        return this.securityprofilePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.securityprofilePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.securityprofilePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SecurityprofilePK getPrimaryKey() {
        return this.securityprofilePK;
    }

    public boolean getPrivateaccess() {
        return this.privateaccess;
    }

    public void initPrivateaccess(boolean privateaccess) {
        this.privateaccess = privateaccess;
    }

    public void setPrivateaccess(boolean privateaccess) {
        updates.put(ISecurityprofile.PRIVATEACCESS, privateaccess);
        this.privateaccess = privateaccess;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
