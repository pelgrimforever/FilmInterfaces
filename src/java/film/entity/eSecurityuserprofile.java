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
import film.interfaces.logicentity.ISecurityuserprofile;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSecurityuserprofile extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SecurityuserprofilePK securityuserprofilePK;
	  
    public static final String table = "securityuserprofile";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurityuserprofile.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurityuserprofile.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSecurityuserprofile.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSecurityuserprofile.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSecurityuserprofile() {
    }

    public eSecurityuserprofile(java.lang.String siteusername, java.lang.String userprofile) {
        this.securityuserprofilePK = new SecurityuserprofilePK(siteusername, userprofile);
    }
  
    public eSecurityuserprofile(SecurityuserprofilePK securityuserprofilePK) {
        this.securityuserprofilePK = securityuserprofilePK;
    }

    public boolean isEmpty() {
        return this.securityuserprofilePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.securityuserprofilePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.securityuserprofilePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SecurityuserprofilePK getPrimaryKey() {
        return this.securityuserprofilePK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
