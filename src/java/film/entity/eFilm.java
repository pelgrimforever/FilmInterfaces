/*
 * eFilm.java
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
import film.interfaces.logicentity.IFilm;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Film
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Film Entity
 * 
 * @author Franky Laseure
 */
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
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFilm.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFilm.connectionpool;
    }
    
    /**
     * 
     * @return table name for Film
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Film class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Film entity
     */
    public eFilm() {
    }

    /**
     * Constructor
     * build an empty Film entity with initialized field values
     */
    public eFilm(java.lang.String id) {
        this.filmPK = new FilmPK(id);
    }
  
    /**
     * Constructor
     * build an empty Film entity with initialized Primarykey parameter
     * @param filmPK: Film Primarykey
     */
    public eFilm(FilmPK filmPK) {
        this.filmPK = filmPK;
    }

    /**
     * @return is Film Empty ?
     */
    public boolean isEmpty() {
        return this.filmPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
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
	
    /**
     * @return FilmPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return FilmPK
     */
    @Override
    public FilmPK getPrimaryKey() {
        return this.filmPK;
    }

    /**
     * 
     * @return iso value
     */
    public java.lang.String getIso() {
        return this.iso;
    }

    /**
     * set iso value
     * @param iso: new value
     */
    public void initIso(java.lang.String iso) {
        this.iso = iso;
    }

    /**
     * set iso value
     * @param iso: new value
     */
    public void setIso(java.lang.String iso) {
	if(iso==null && iso!=this.iso || iso!=null && !iso.equals(this.iso)) {
            updates.put(IFilm.ISO, iso);
        }
        this.iso = iso;
    }

    /**
     * 
     * @return startdate value
     */
    public java.sql.Date getStartdate() {
        return this.startdate;
    }

    /**
     * set startdate value
     * @param startdate: new value
     */
    public void initStartdate(java.sql.Date startdate) {
        this.startdate = startdate;
    }

    /**
     * set startdate value
     * @param startdate: new value
     */
    public void setStartdate(java.sql.Date startdate) {
	if(startdate==null && startdate!=this.startdate || startdate!=null && !startdate.equals(this.startdate)) {
            updates.put(IFilm.STARTDATE, startdate);
        }
        this.startdate = startdate;
    }

    /**
     * 
     * @return enddate value
     */
    public java.sql.Date getEnddate() {
        return this.enddate;
    }

    /**
     * set enddate value
     * @param enddate: new value
     */
    public void initEnddate(java.sql.Date enddate) {
        this.enddate = enddate;
    }

    /**
     * set enddate value
     * @param enddate: new value
     */
    public void setEnddate(java.sql.Date enddate) {
	if(enddate==null && enddate!=this.enddate || enddate!=null && !enddate.equals(this.enddate)) {
            updates.put(IFilm.ENDDATE, enddate);
        }
        this.enddate = enddate;
    }

    /**
     * 
     * @return owner value
     */
    public java.lang.String getOwner() {
        return this.owner;
    }

    /**
     * set owner value
     * @param owner: new value
     */
    public void initOwner(java.lang.String owner) {
        this.owner = owner;
    }

    /**
     * set owner value
     * @param owner: new value
     */
    public void setOwner(java.lang.String owner) {
	if(owner==null && owner!=this.owner || owner!=null && !owner.equals(this.owner)) {
            updates.put(IFilm.OWNER, owner);
        }
        this.owner = owner;
    }

    /**
     * 
     * @return cd value
     */
    public java.lang.String getCd() {
        return this.cd;
    }

    /**
     * set cd value
     * @param cd: new value
     */
    public void initCd(java.lang.String cd) {
        this.cd = cd;
    }

    /**
     * set cd value
     * @param cd: new value
     */
    public void setCd(java.lang.String cd) {
	if(cd==null && cd!=this.cd || cd!=null && !cd.equals(this.cd)) {
            updates.put(IFilm.CD, cd);
        }
        this.cd = cd;
    }

    /**
     * 
     * @return publicf_ value
     */
    public boolean getPublic() {
        return this.publicf_;
    }

    /**
     * set public value
     * @param publicf_: new value
     */
    public void initPublic(boolean publicf_) {
        this.publicf_ = publicf_;
    }

    /**
     * set public value
     * @param publicf_: new value
     */
    public void setPublic(boolean publicf_) {
        updates.put(IFilm.PUBLIC, publicf_);
        this.publicf_ = publicf_;
    }

    /**
     * 
     * @return backup value
     */
    public boolean getBackup() {
        return this.backup;
    }

    /**
     * set backup value
     * @param backup: new value
     */
    public void initBackup(boolean backup) {
        this.backup = backup;
    }

    /**
     * set backup value
     * @param backup: new value
     */
    public void setBackup(boolean backup) {
        updates.put(IFilm.BACKUP, backup);
        this.backup = backup;
    }

    /**
     * 
     * @return foreign key filmtypePK, instance of FilmtypePK
     */
    public FilmtypePK getFilmtypePK() {
        return this.filmtypePK;
    }

    /**
     * set foreign key filmtype
     * @param filmtypePK: instance of FilmtypePK
     */
    public void initFilmtypePK(IFilmtypePK filmtypePK) {
        this.filmtypePK = (FilmtypePK)filmtypePK;
    }

    /**
     * set foreign key filmtype
     * @param filmtypePK: instance of FilmtypePK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
