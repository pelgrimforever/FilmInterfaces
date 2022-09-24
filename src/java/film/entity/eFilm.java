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
import film.interfaces.logicentity.IFilm;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eFilm extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected FilmPK filmPK;
    private FilmtypePK filmtypePK;
    private java.lang.String iso;
    private java.sql.Date startdate;
    private java.sql.Date enddate;
    private java.lang.String owner;
    private java.lang.String cd;
    private boolean publicf_;
    private boolean backup;
	  
    public static final String table = "film";
	  
    public String getFieldname(short fieldconstant) {
        return IFilm.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilm.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eFilm.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFilm.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFilm() {
    }

    public eFilm(java.lang.String id) {
        this.filmPK = new FilmPK(id);
    }
  
    public eFilm(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public boolean isEmpty() {
        return this.filmPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IFilm.TYPE, this.filmtypePK.getType());

        updates.put(IFilm.ISO, iso);
        updates.put(IFilm.STARTDATE, startdate);
        updates.put(IFilm.ENDDATE, enddate);
        updates.put(IFilm.OWNER, owner);
        updates.put(IFilm.CD, cd);
        updates.put(IFilm.PUBLIC, publicf_);
        updates.put(IFilm.BACKUP, backup);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public FilmPK getPrimaryKey() {
        return this.filmPK;
    }

    public java.lang.String getIso() {
        return this.iso;
    }

    public void initIso(java.lang.String iso) {
        this.iso = iso;
    }

    public void setIso(java.lang.String iso) {
	if(iso==null && iso!=this.iso || iso!=null && !iso.equals(this.iso)) {
            updates.put(IFilm.ISO, iso);
        }
        this.iso = iso;
    }

    public java.sql.Date getStartdate() {
        return this.startdate;
    }

    public void initStartdate(java.sql.Date startdate) {
        this.startdate = startdate;
    }

    public void setStartdate(java.sql.Date startdate) {
	if(startdate==null && startdate!=this.startdate || startdate!=null && !startdate.equals(this.startdate)) {
            updates.put(IFilm.STARTDATE, startdate);
        }
        this.startdate = startdate;
    }

    public java.sql.Date getEnddate() {
        return this.enddate;
    }

    public void initEnddate(java.sql.Date enddate) {
        this.enddate = enddate;
    }

    public void setEnddate(java.sql.Date enddate) {
	if(enddate==null && enddate!=this.enddate || enddate!=null && !enddate.equals(this.enddate)) {
            updates.put(IFilm.ENDDATE, enddate);
        }
        this.enddate = enddate;
    }

    public java.lang.String getOwner() {
        return this.owner;
    }

    public void initOwner(java.lang.String owner) {
        this.owner = owner;
    }

    public void setOwner(java.lang.String owner) {
	if(owner==null && owner!=this.owner || owner!=null && !owner.equals(this.owner)) {
            updates.put(IFilm.OWNER, owner);
        }
        this.owner = owner;
    }

    public java.lang.String getCd() {
        return this.cd;
    }

    public void initCd(java.lang.String cd) {
        this.cd = cd;
    }

    public void setCd(java.lang.String cd) {
	if(cd==null && cd!=this.cd || cd!=null && !cd.equals(this.cd)) {
            updates.put(IFilm.CD, cd);
        }
        this.cd = cd;
    }

    public boolean getPublic() {
        return this.publicf_;
    }

    public void initPublic(boolean publicf_) {
        this.publicf_ = publicf_;
    }

    public void setPublic(boolean publicf_) {
        updates.put(IFilm.PUBLIC, publicf_);
        this.publicf_ = publicf_;
    }

    public boolean getBackup() {
        return this.backup;
    }

    public void initBackup(boolean backup) {
        this.backup = backup;
    }

    public void setBackup(boolean backup) {
        updates.put(IFilm.BACKUP, backup);
        this.backup = backup;
    }

    public FilmtypePK getFilmtypePK() {
        return this.filmtypePK;
    }

    public void initFilmtypePK(IFilmtypePK filmtypePK) {
        this.filmtypePK = (FilmtypePK)filmtypePK;
    }

    public void setFilmtypePK(IFilmtypePK filmtypePK) {
	if(filmtypePK==null && filmtypePK!=this.filmtypePK || filmtypePK!=null) {
            if(filmtypePK==null) {
                updates.put(IFilm.TYPE, null);
            } else {
                updates.put(IFilm.TYPE, filmtypePK.getType());
            }
        }
        this.filmtypePK = (FilmtypePK)filmtypePK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
