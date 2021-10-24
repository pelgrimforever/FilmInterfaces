/*
 * IPhoto.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IPhoto
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IPhoto extends LogicEntity {

	public IPhotoPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short ID = 2;
    public static short FORMAT = 3;
    public static short DESCRIPTION = 4;
    public static short PHOTODATE = 5;
    public static short PHOTOTIME = 6;
    public static short PUBLIC = 7;
    public static short COMPOSITION = 8;
    public static short ROTATION = 9;
    public static short BACKUP = 10;
    public static short IMAGEBACKUP = 11;
    public static short LOCATION = 12;
    public static short EXACTLOCATION = 13;
    public static short LOCATIONRADIUS = 14;
    public static short REVERSEGEOCODE = 15;
    public static short COUNTRYCODE = 16;
    public static short POSTALCODE = 17;
    public static short LOCALITY = 18;
    public static short SUBLOCALITY = 19;
    public static short ROUTECODE = 20;
    public static short STREETNUMBER = 21;
    public static short FORMATTEDADDRESS = 22;
    public static short CREATOR = 23;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_ID = 5;
    public static final int SIZE_FORMAT = 1;
    public static final int SIZE_DESCRIPTION = 50;
    public static final int SIZE_PHOTODATE = 13;
    public static final int SIZE_PHOTOTIME = 15;
    public static final int SIZE_PUBLIC = 1;
    public static final int SIZE_COMPOSITION = 1;
    public static final int SIZE_ROTATION = 5;
    public static final int SIZE_BACKUP = 1;
    public static final int SIZE_IMAGEBACKUP = 1;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_EXACTLOCATION = 1;
    public static final int SIZE_LOCATIONRADIUS = 17;
    public static final int SIZE_REVERSEGEOCODE = 2147483647;
    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_SUBLOCALITY = 2147483647;
    public static final int SIZE_ROUTECODE = 2147483647;
    public static final int SIZE_STREETNUMBER = 10;
    public static final int SIZE_FORMATTEDADDRESS = 2147483647;
    public static final int SIZE_CREATOR = 20;
    public static final String[] fieldnames = { "film", "id", "format", "description", "photodate", "phototime", "public", "composition", "rotation", "backup", "imagebackup", "location", "exactlocation", "locationradius", "reversegeocode", "countrycode", "postalcode", "locality", "sublocality", "routecode", "streetnumber", "formattedaddress", "creator" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_String, Datatypes.type_String, Datatypes.type_Date, Datatypes.type_Time, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_float, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_piShape, Datatypes.type_boolean, Datatypes.type_double, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };

    public static final String[] routePKfields = { "route.countrycode", "route.postalcode", "route.locality", "route.sublocality", "route.routecode" };
    public static final String[] routeFKfields = { "photo.countrycode", "photo.postalcode", "photo.locality", "photo.sublocality", "photo.routecode" };
    public static final String[] creatorPKfields = { "creator.creatorid" };
    public static final String[] creatorFKfields = { "photo.creator" };
    public static final String[] filmPKfields = { "film.id" };
    public static final String[] filmFKfields = { "photo.film" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return format value
     */
    public java.lang.String getFormat();

    /**
     * set format value
     * @param format: new value
     */
    public void setFormat(java.lang.String format);

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    /**
     * 
     * @return photodate value
     */
    public java.sql.Date getPhotodate();

    /**
     * set photodate value
     * @param photodate: new value
     */
    public void setPhotodate(java.sql.Date photodate);

    /**
     * 
     * @return phototime value
     */
    public java.sql.Time getPhototime();

    /**
     * set phototime value
     * @param phototime: new value
     */
    public void setPhototime(java.sql.Time phototime);

    /**
     * 
     * @return publicf_ value
     */
    public boolean getPublic();

    /**
     * set public value
     * @param publicf_: new value
     */
    public void setPublic(boolean publicf_);

    /**
     * 
     * @return composition value
     */
    public boolean getComposition();

    /**
     * set composition value
     * @param composition: new value
     */
    public void setComposition(boolean composition);

    /**
     * 
     * @return rotation value
     */
    public float getRotation();

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void setRotation(float rotation);

    /**
     * 
     * @return backup value
     */
    public boolean getBackup();

    /**
     * set backup value
     * @param backup: new value
     */
    public void setBackup(boolean backup);

    /**
     * 
     * @return imagebackup value
     */
    public boolean getImagebackup();

    /**
     * set imagebackup value
     * @param imagebackup: new value
     */
    public void setImagebackup(boolean imagebackup);

    /**
     * 
     * @return location value
     */
    public piShape getLocation();

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(piShape location);

    /**
     * 
     * @return exactlocation value
     */
    public boolean getExactlocation();

    /**
     * set exactlocation value
     * @param exactlocation: new value
     */
    public void setExactlocation(boolean exactlocation);

    /**
     * 
     * @return locationradius value
     */
    public double getLocationradius();

    /**
     * set locationradius value
     * @param locationradius: new value
     */
    public void setLocationradius(double locationradius);

    /**
     * 
     * @return reversegeocode value
     */
    public java.lang.String getReversegeocode();

    /**
     * set reversegeocode value
     * @param reversegeocode: new value
     */
    public void setReversegeocode(java.lang.String reversegeocode);

    /**
     * 
     * @return streetnumber value
     */
    public java.lang.String getStreetnumber();

    /**
     * set streetnumber value
     * @param streetnumber: new value
     */
    public void setStreetnumber(java.lang.String streetnumber);

    /**
     * 
     * @return formattedaddress value
     */
    public java.lang.String getFormattedaddress();

    /**
     * set formattedaddress value
     * @param formattedaddress: new value
     */
    public void setFormattedaddress(java.lang.String formattedaddress);

    /**
     * 
     * @return foreign key routePK, instance of RoutePK
     */
    public IRoutePK getRoutePK();

    /**
     * set foreign key route
     * @param routePK: instance of RoutePK
     */
    public void setRoutePK(IRoutePK routePK);

    /**
     * 
     * @return foreign key creatorPK, instance of CreatorPK
     */
    public ICreatorPK getCreatorPK();

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void setCreatorPK(ICreatorPK creatorPK);

    
//Custom code, do not change this line
//Put custom functions here
    public void setThumbnailimage(Filedata thumbnailimage);

    public void setImagebase64(String imagebase64);
    
    public String getImagebase64();
    
    public Filedata getThumbnail();

    public void setSmallimage(Filedata smallimage);

    public Filedata getSmall();

    public void setCroppedimage(Filedata croppedimage);

    public Filedata getCropped();

    public void setRootimage(Filedata rootimage);

    public Filedata getRoot();

    public BufferedImage getThumbnailimage() throws IOException;
    
    public boolean isLocationUpdated();
    
    public boolean isReversegeocodeUpdated();
    
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
