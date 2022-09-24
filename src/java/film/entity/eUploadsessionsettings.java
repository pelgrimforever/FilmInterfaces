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
import film.interfaces.logicentity.IUploadsessionsettings;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eUploadsessionsettings extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected UploadsessionsettingsPK uploadsessionsettingsPK;
    private java.lang.String uploadtype;
    private java.lang.String filmgroups;
    private int lastposition;
    private java.lang.String copymode;
    private int uploadingposition;
	  
    public static final String table = "uploadsessionsettings";
	  
    public String getFieldname(short fieldconstant) {
        return IUploadsessionsettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUploadsessionsettings.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eUploadsessionsettings.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eUploadsessionsettings.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eUploadsessionsettings() {
    }

    public eUploadsessionsettings(java.lang.String directory) {
        this.uploadsessionsettingsPK = new UploadsessionsettingsPK(directory);
    }
  
    public eUploadsessionsettings(UploadsessionsettingsPK uploadsessionsettingsPK) {
        this.uploadsessionsettingsPK = uploadsessionsettingsPK;
    }

    public boolean isEmpty() {
        return this.uploadsessionsettingsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.uploadsessionsettingsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.uploadsessionsettingsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IUploadsessionsettings.UPLOADTYPE, uploadtype);
        updates.put(IUploadsessionsettings.FILMGROUPS, filmgroups);
        updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
        updates.put(IUploadsessionsettings.COPYMODE, copymode);
        updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public UploadsessionsettingsPK getPrimaryKey() {
        return this.uploadsessionsettingsPK;
    }

    public java.lang.String getUploadtype() {
        return this.uploadtype;
    }

    public void initUploadtype(java.lang.String uploadtype) {
        this.uploadtype = uploadtype;
    }

    public void setUploadtype(java.lang.String uploadtype) {
	if(uploadtype==null && uploadtype!=this.uploadtype || uploadtype!=null && !uploadtype.equals(this.uploadtype)) {
            updates.put(IUploadsessionsettings.UPLOADTYPE, uploadtype);
        }
        this.uploadtype = uploadtype;
    }

    public java.lang.String getFilmgroups() {
        return this.filmgroups;
    }

    public void initFilmgroups(java.lang.String filmgroups) {
        this.filmgroups = filmgroups;
    }

    public void setFilmgroups(java.lang.String filmgroups) {
	if(filmgroups==null && filmgroups!=this.filmgroups || filmgroups!=null && !filmgroups.equals(this.filmgroups)) {
            updates.put(IUploadsessionsettings.FILMGROUPS, filmgroups);
        }
        this.filmgroups = filmgroups;
    }

    public int getLastposition() {
        return this.lastposition;
    }

    public void initLastposition(int lastposition) {
        this.lastposition = lastposition;
    }

    public void setLastposition(int lastposition) {
        updates.put(IUploadsessionsettings.LASTPOSITION, lastposition);
        this.lastposition = lastposition;
    }

    public java.lang.String getCopymode() {
        return this.copymode;
    }

    public void initCopymode(java.lang.String copymode) {
        this.copymode = copymode;
    }

    public void setCopymode(java.lang.String copymode) {
	if(copymode==null && copymode!=this.copymode || copymode!=null && !copymode.equals(this.copymode)) {
            updates.put(IUploadsessionsettings.COPYMODE, copymode);
        }
        this.copymode = copymode;
    }

    public int getUploadingposition() {
        return this.uploadingposition;
    }

    public void initUploadingposition(int uploadingposition) {
        this.uploadingposition = uploadingposition;
    }

    public void setUploadingposition(int uploadingposition) {
        updates.put(IUploadsessionsettings.UPLOADINGPOSITION, uploadingposition);
        this.uploadingposition = uploadingposition;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
