/*
 * ePhoto.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
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
import film.interfaces.logicentity.IPhoto;
import film.interfaces.entity.pk.*;

/**
 * Entity class Photo
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Photo Entity
 * 
 * @author Franky Laseure
 */
public class ePhoto extends AbstractEntity implements EntityInterface {

    protected PhotoPK photoPK;
    private RoutePK routePK;
    private CreatorPK creatorPK;
    private java.lang.String format;
    private java.lang.String description;
    private java.sql.Date photodate;
    private java.sql.Time phototime;
    private boolean publicf_;
    private boolean composition;
    private float rotation;
    private boolean backup;
    private boolean imagebackup;
    private piShape location;
    private boolean exactlocation;
    private double locationradius;
    private java.lang.String reversegeocode;
    private java.lang.String streetnumber;
    private java.lang.String formattedaddress;
	  
    public static final String table = "photo";
    public static final String SQLWhere1 = "film = :photo.film: and id = :photo.id:";
    public static final String SQLSelect1 = "select photo.* from photo where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from photo where " + SQLWhere1;
    public static final String SQLSelectAll = "select photo.* from photo";
	  
    public String getFieldname(short fieldconstant) {
        return IPhoto.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhoto.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Photo
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Photo (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Photo (=Primarykey)
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
     * @return SQL select statement for all Photos
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Photo class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Photo entity
     */
    public ePhoto() {
    }

    /**
     * Constructor
     * build an empty Photo entity with initialized field values
     */
    public ePhoto(java.lang.String film, int id) {
        this.photoPK = new PhotoPK(film, id);
    }
  
    /**
     * Constructor
     * build an empty Photo entity with initialized Primarykey parameter
     * @param photoPK: Photo Primarykey
     */
    public ePhoto(PhotoPK photoPK) {
        this.photoPK = photoPK;
    }

    /**
     * @return is Photo Empty ?
     */
    public boolean isEmpty() {
        return this.photoPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.photoPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.photoPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IPhoto.COUNTRYCODE, this.routePK.getCountrycode());
        updates.put(IPhoto.POSTALCODE, this.routePK.getPostalcode());
        updates.put(IPhoto.LOCALITY, this.routePK.getLocality());
        updates.put(IPhoto.SUBLOCALITY, this.routePK.getSublocality());
        updates.put(IPhoto.ROUTECODE, this.routePK.getRoutecode());

        updates.put(IPhoto.CREATOR, this.creatorPK.getCreatorid());

        updates.put(IPhoto.FORMAT, format);
        updates.put(IPhoto.DESCRIPTION, description);
        updates.put(IPhoto.PHOTODATE, photodate);
        updates.put(IPhoto.PHOTOTIME, phototime);
        updates.put(IPhoto.PUBLIC, publicf_);
        updates.put(IPhoto.COMPOSITION, composition);
        updates.put(IPhoto.ROTATION, rotation);
        updates.put(IPhoto.BACKUP, backup);
        updates.put(IPhoto.IMAGEBACKUP, imagebackup);
        updates.put(IPhoto.LOCATION, location);
        updates.put(IPhoto.EXACTLOCATION, exactlocation);
        updates.put(IPhoto.LOCATIONRADIUS, locationradius);
        updates.put(IPhoto.REVERSEGEOCODE, reversegeocode);
        updates.put(IPhoto.STREETNUMBER, streetnumber);
        updates.put(IPhoto.FORMATTEDADDRESS, formattedaddress);
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
    public PhotoPK getPrimaryKey() {
        return this.photoPK;
    }

    /**
     * 
     * @return format value
     */
    public java.lang.String getFormat() {
        return this.format;
    }

    /**
     * set format value
     * @param format: new value
     */
    public void initFormat(java.lang.String format) {
        this.format = format;
    }

    /**
     * set format value
     * @param format: new value
     */
    public void setFormat(java.lang.String format) {
	if(format==null && format!=this.format || format!=null && !format.equals(this.format)) {
            updates.put(IPhoto.FORMAT, format);
        }
        this.format = format;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IPhoto.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return photodate value
     */
    public java.sql.Date getPhotodate() {
        return this.photodate;
    }

    /**
     * set photodate value
     * @param photodate: new value
     */
    public void initPhotodate(java.sql.Date photodate) {
        this.photodate = photodate;
    }

    /**
     * set photodate value
     * @param photodate: new value
     */
    public void setPhotodate(java.sql.Date photodate) {
	if(photodate==null && photodate!=this.photodate || photodate!=null && !photodate.equals(this.photodate)) {
            updates.put(IPhoto.PHOTODATE, photodate);
        }
        this.photodate = photodate;
    }

    /**
     * 
     * @return phototime value
     */
    public java.sql.Time getPhototime() {
        return this.phototime;
    }

    /**
     * set phototime value
     * @param phototime: new value
     */
    public void initPhototime(java.sql.Time phototime) {
        this.phototime = phototime;
    }

    /**
     * set phototime value
     * @param phototime: new value
     */
    public void setPhototime(java.sql.Time phototime) {
	if(phototime==null && phototime!=this.phototime || phototime!=null && !phototime.equals(this.phototime)) {
            updates.put(IPhoto.PHOTOTIME, phototime);
        }
        this.phototime = phototime;
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
	if(publicf_!=this.publicf_) {
            updates.put(IPhoto.PUBLIC, publicf_);
        }
        this.publicf_ = publicf_;
    }

    /**
     * 
     * @return composition value
     */
    public boolean getComposition() {
        return this.composition;
    }

    /**
     * set composition value
     * @param composition: new value
     */
    public void initComposition(boolean composition) {
        this.composition = composition;
    }

    /**
     * set composition value
     * @param composition: new value
     */
    public void setComposition(boolean composition) {
	if(composition!=this.composition) {
            updates.put(IPhoto.COMPOSITION, composition);
        }
        this.composition = composition;
    }

    /**
     * 
     * @return rotation value
     */
    public float getRotation() {
        return this.rotation;
    }

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void initRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void setRotation(float rotation) {
	if(rotation!=this.rotation) {
            updates.put(IPhoto.ROTATION, rotation);
        }
        this.rotation = rotation;
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
	if(backup!=this.backup) {
            updates.put(IPhoto.BACKUP, backup);
        }
        this.backup = backup;
    }

    /**
     * 
     * @return imagebackup value
     */
    public boolean getImagebackup() {
        return this.imagebackup;
    }

    /**
     * set imagebackup value
     * @param imagebackup: new value
     */
    public void initImagebackup(boolean imagebackup) {
        this.imagebackup = imagebackup;
    }

    /**
     * set imagebackup value
     * @param imagebackup: new value
     */
    public void setImagebackup(boolean imagebackup) {
	if(imagebackup!=this.imagebackup) {
            updates.put(IPhoto.IMAGEBACKUP, imagebackup);
        }
        this.imagebackup = imagebackup;
    }

    /**
     * 
     * @return location value
     */
    public piShape getLocation() {
        return this.location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void initLocation(piShape location) {
        this.location = location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(IPhoto.LOCATION, location);
        }
        this.location = location;
    }

    /**
     * 
     * @return exactlocation value
     */
    public boolean getExactlocation() {
        return this.exactlocation;
    }

    /**
     * set exactlocation value
     * @param exactlocation: new value
     */
    public void initExactlocation(boolean exactlocation) {
        this.exactlocation = exactlocation;
    }

    /**
     * set exactlocation value
     * @param exactlocation: new value
     */
    public void setExactlocation(boolean exactlocation) {
	if(exactlocation!=this.exactlocation) {
            updates.put(IPhoto.EXACTLOCATION, exactlocation);
        }
        this.exactlocation = exactlocation;
    }

    /**
     * 
     * @return locationradius value
     */
    public double getLocationradius() {
        return this.locationradius;
    }

    /**
     * set locationradius value
     * @param locationradius: new value
     */
    public void initLocationradius(double locationradius) {
        this.locationradius = locationradius;
    }

    /**
     * set locationradius value
     * @param locationradius: new value
     */
    public void setLocationradius(double locationradius) {
	if(locationradius!=this.locationradius) {
            updates.put(IPhoto.LOCATIONRADIUS, locationradius);
        }
        this.locationradius = locationradius;
    }

    /**
     * 
     * @return reversegeocode value
     */
    public java.lang.String getReversegeocode() {
        return this.reversegeocode;
    }

    /**
     * set reversegeocode value
     * @param reversegeocode: new value
     */
    public void initReversegeocode(java.lang.String reversegeocode) {
        this.reversegeocode = reversegeocode;
    }

    /**
     * set reversegeocode value
     * @param reversegeocode: new value
     */
    public void setReversegeocode(java.lang.String reversegeocode) {
	if(reversegeocode==null && reversegeocode!=this.reversegeocode || reversegeocode!=null && !reversegeocode.equals(this.reversegeocode)) {
            updates.put(IPhoto.REVERSEGEOCODE, reversegeocode);
        }
        this.reversegeocode = reversegeocode;
    }

    /**
     * 
     * @return streetnumber value
     */
    public java.lang.String getStreetnumber() {
        return this.streetnumber;
    }

    /**
     * set streetnumber value
     * @param streetnumber: new value
     */
    public void initStreetnumber(java.lang.String streetnumber) {
        this.streetnumber = streetnumber;
    }

    /**
     * set streetnumber value
     * @param streetnumber: new value
     */
    public void setStreetnumber(java.lang.String streetnumber) {
	if(streetnumber==null && streetnumber!=this.streetnumber || streetnumber!=null && !streetnumber.equals(this.streetnumber)) {
            updates.put(IPhoto.STREETNUMBER, streetnumber);
        }
        this.streetnumber = streetnumber;
    }

    /**
     * 
     * @return formattedaddress value
     */
    public java.lang.String getFormattedaddress() {
        return this.formattedaddress;
    }

    /**
     * set formattedaddress value
     * @param formattedaddress: new value
     */
    public void initFormattedaddress(java.lang.String formattedaddress) {
        this.formattedaddress = formattedaddress;
    }

    /**
     * set formattedaddress value
     * @param formattedaddress: new value
     */
    public void setFormattedaddress(java.lang.String formattedaddress) {
	if(formattedaddress==null && formattedaddress!=this.formattedaddress || formattedaddress!=null && !formattedaddress.equals(this.formattedaddress)) {
            updates.put(IPhoto.FORMATTEDADDRESS, formattedaddress);
        }
        this.formattedaddress = formattedaddress;
    }

    /**
     * 
     * @return foreign key routePK, instance of RoutePK
     */
    public RoutePK getRoutePK() {
        return this.routePK;
    }

    /**
     * set foreign key route
     * @param routePK: instance of RoutePK
     */
    public void initRoutePK(IRoutePK routePK) {
        this.routePK = (RoutePK)routePK;
    }

    /**
     * set foreign key route
     * @param routePK: instance of RoutePK
     */
    public void setRoutePK(IRoutePK routePK) {
	if(routePK==null && routePK!=this.routePK || routePK!=null) {
            if(routePK==null) {
                updates.put(IPhoto.COUNTRYCODE, null);
                updates.put(IPhoto.POSTALCODE, null);
                updates.put(IPhoto.LOCALITY, null);
                updates.put(IPhoto.SUBLOCALITY, null);
                updates.put(IPhoto.ROUTECODE, null);
            } else {
                updates.put(IPhoto.COUNTRYCODE, routePK.getCountrycode());
                updates.put(IPhoto.POSTALCODE, routePK.getPostalcode());
                updates.put(IPhoto.LOCALITY, routePK.getLocality());
                updates.put(IPhoto.SUBLOCALITY, routePK.getSublocality());
                updates.put(IPhoto.ROUTECODE, routePK.getRoutecode());
            }
        }
        this.routePK = (RoutePK)routePK;
    }

    /**
     * 
     * @return foreign key creatorPK, instance of CreatorPK
     */
    public CreatorPK getCreatorPK() {
        return this.creatorPK;
    }

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void initCreatorPK(ICreatorPK creatorPK) {
        this.creatorPK = (CreatorPK)creatorPK;
    }

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void setCreatorPK(ICreatorPK creatorPK) {
	if(creatorPK==null && creatorPK!=this.creatorPK || creatorPK!=null) {
            if(creatorPK==null) {
                updates.put(IPhoto.CREATOR, null);
            } else {
                updates.put(IPhoto.CREATOR, creatorPK.getCreatorid());
            }
        }
        this.creatorPK = (CreatorPK)creatorPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
