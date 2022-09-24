/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

    public java.lang.String getFormat();

    public void setFormat(java.lang.String format);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public java.sql.Date getPhotodate();

    public void setPhotodate(java.sql.Date photodate);

    public java.sql.Time getPhototime();

    public void setPhototime(java.sql.Time phototime);

    public boolean getPublic();

    public void setPublic(boolean publicf_);

    public boolean getComposition();

    public void setComposition(boolean composition);

    public float getRotation();

    public void setRotation(float rotation);

    public boolean getBackup();

    public void setBackup(boolean backup);

    public boolean getImagebackup();

    public void setImagebackup(boolean imagebackup);

    public piShape getLocation();

    public void setLocation(piShape location);

    public boolean getExactlocation();

    public void setExactlocation(boolean exactlocation);

    public double getLocationradius();

    public void setLocationradius(double locationradius);

    public java.lang.String getReversegeocode();

    public void setReversegeocode(java.lang.String reversegeocode);

    public java.lang.String getStreetnumber();

    public void setStreetnumber(java.lang.String streetnumber);

    public java.lang.String getFormattedaddress();

    public void setFormattedaddress(java.lang.String formattedaddress);

    public IRoutePK getRoutePK();

    public void setRoutePK(IRoutePK routePK);

    public ICreatorPK getCreatorPK();

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
