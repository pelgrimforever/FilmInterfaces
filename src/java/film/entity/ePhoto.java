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
import film.interfaces.logicentity.IPhoto;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class ePhoto extends AbstractEntity implements filmDatabaseproperties, Entity {

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
	  
    public String getFieldname(short fieldconstant) {
        return IPhoto.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhoto.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return ePhoto.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return ePhoto.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public ePhoto() {
    }

    public ePhoto(java.lang.String film, int id) {
        this.photoPK = new PhotoPK(film, id);
    }
  
    public ePhoto(PhotoPK photoPK) {
        this.photoPK = photoPK;
    }

    public boolean isEmpty() {
        return this.photoPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.photoPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.photoPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public PhotoPK getPrimaryKey() {
        return this.photoPK;
    }

    public java.lang.String getFormat() {
        return this.format;
    }

    public void initFormat(java.lang.String format) {
        this.format = format;
    }

    public void setFormat(java.lang.String format) {
	if(format==null && format!=this.format || format!=null && !format.equals(this.format)) {
            updates.put(IPhoto.FORMAT, format);
        }
        this.format = format;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IPhoto.DESCRIPTION, description);
        }
        this.description = description;
    }

    public java.sql.Date getPhotodate() {
        return this.photodate;
    }

    public void initPhotodate(java.sql.Date photodate) {
        this.photodate = photodate;
    }

    public void setPhotodate(java.sql.Date photodate) {
	if(photodate==null && photodate!=this.photodate || photodate!=null && !photodate.equals(this.photodate)) {
            updates.put(IPhoto.PHOTODATE, photodate);
        }
        this.photodate = photodate;
    }

    public java.sql.Time getPhototime() {
        return this.phototime;
    }

    public void initPhototime(java.sql.Time phototime) {
        this.phototime = phototime;
    }

    public void setPhototime(java.sql.Time phototime) {
	if(phototime==null && phototime!=this.phototime || phototime!=null && !phototime.equals(this.phototime)) {
            updates.put(IPhoto.PHOTOTIME, phototime);
        }
        this.phototime = phototime;
    }

    public boolean getPublic() {
        return this.publicf_;
    }

    public void initPublic(boolean publicf_) {
        this.publicf_ = publicf_;
    }

    public void setPublic(boolean publicf_) {
        updates.put(IPhoto.PUBLIC, publicf_);
        this.publicf_ = publicf_;
    }

    public boolean getComposition() {
        return this.composition;
    }

    public void initComposition(boolean composition) {
        this.composition = composition;
    }

    public void setComposition(boolean composition) {
        updates.put(IPhoto.COMPOSITION, composition);
        this.composition = composition;
    }

    public float getRotation() {
        return this.rotation;
    }

    public void initRotation(float rotation) {
        this.rotation = rotation;
    }

    public void setRotation(float rotation) {
        updates.put(IPhoto.ROTATION, rotation);
        this.rotation = rotation;
    }

    public boolean getBackup() {
        return this.backup;
    }

    public void initBackup(boolean backup) {
        this.backup = backup;
    }

    public void setBackup(boolean backup) {
        updates.put(IPhoto.BACKUP, backup);
        this.backup = backup;
    }

    public boolean getImagebackup() {
        return this.imagebackup;
    }

    public void initImagebackup(boolean imagebackup) {
        this.imagebackup = imagebackup;
    }

    public void setImagebackup(boolean imagebackup) {
        updates.put(IPhoto.IMAGEBACKUP, imagebackup);
        this.imagebackup = imagebackup;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void initLocation(piShape location) {
        this.location = location;
    }

    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(IPhoto.LOCATION, location);
        }
        this.location = location;
    }

    public boolean getExactlocation() {
        return this.exactlocation;
    }

    public void initExactlocation(boolean exactlocation) {
        this.exactlocation = exactlocation;
    }

    public void setExactlocation(boolean exactlocation) {
        updates.put(IPhoto.EXACTLOCATION, exactlocation);
        this.exactlocation = exactlocation;
    }

    public double getLocationradius() {
        return this.locationradius;
    }

    public void initLocationradius(double locationradius) {
        this.locationradius = locationradius;
    }

    public void setLocationradius(double locationradius) {
        updates.put(IPhoto.LOCATIONRADIUS, locationradius);
        this.locationradius = locationradius;
    }

    public java.lang.String getReversegeocode() {
        return this.reversegeocode;
    }

    public void initReversegeocode(java.lang.String reversegeocode) {
        this.reversegeocode = reversegeocode;
    }

    public void setReversegeocode(java.lang.String reversegeocode) {
	if(reversegeocode==null && reversegeocode!=this.reversegeocode || reversegeocode!=null && !reversegeocode.equals(this.reversegeocode)) {
            updates.put(IPhoto.REVERSEGEOCODE, reversegeocode);
        }
        this.reversegeocode = reversegeocode;
    }

    public java.lang.String getStreetnumber() {
        return this.streetnumber;
    }

    public void initStreetnumber(java.lang.String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public void setStreetnumber(java.lang.String streetnumber) {
	if(streetnumber==null && streetnumber!=this.streetnumber || streetnumber!=null && !streetnumber.equals(this.streetnumber)) {
            updates.put(IPhoto.STREETNUMBER, streetnumber);
        }
        this.streetnumber = streetnumber;
    }

    public java.lang.String getFormattedaddress() {
        return this.formattedaddress;
    }

    public void initFormattedaddress(java.lang.String formattedaddress) {
        this.formattedaddress = formattedaddress;
    }

    public void setFormattedaddress(java.lang.String formattedaddress) {
	if(formattedaddress==null && formattedaddress!=this.formattedaddress || formattedaddress!=null && !formattedaddress.equals(this.formattedaddress)) {
            updates.put(IPhoto.FORMATTEDADDRESS, formattedaddress);
        }
        this.formattedaddress = formattedaddress;
    }

    public RoutePK getRoutePK() {
        return this.routePK;
    }

    public void initRoutePK(IRoutePK routePK) {
        this.routePK = (RoutePK)routePK;
    }

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

    public CreatorPK getCreatorPK() {
        return this.creatorPK;
    }

    public void initCreatorPK(ICreatorPK creatorPK) {
        this.creatorPK = (CreatorPK)creatorPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
