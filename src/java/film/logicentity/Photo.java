/*
 * Photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.IPhotoPK;
import film.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * Entity class Photo
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Photo extends film.entity.ePhoto implements IPhoto {

    public static final String SQLSelect = "select photo.* from photo";
    public static final String SQLWhereroute = "countrycode = :route.countrycode: and postalcode = :route.postalcode: and locality = :route.locality: and sublocality = :route.sublocality: and routecode = :route.routecode:";
    public static final String SQLWherecreator = "creator = :creator.creatorid:";
    public static final String SQLWherefilm = "film = :film.id:";

//Custom code, do not change this line
    public static final String FILMTYPE_APS = "APS";
    public static final String FILMTYPE_CON = "CON";
    public static final String FILMTYPE_SCA = "SCA";
    public static final String FILMTYPE_DIG = "DIG";
    public static final String FILMTYPE_INT = "INT";
    public static final String FILMTYPE_DIA = "DIA";

    public static final String OrderBy = " order by id";
    public static final String OrderByDateTime = " order by photodate, phototime, film, id";
    public static final String OrderByDescription = " order by description";
    public static final String SQLWherePublic = " public = :public: ";
    public static final String SQLSelectAll4Public = "select * from photo where " + SQLWherePublic + OrderBy;

    public static final String SQLSelect4photo_film_sorted = "select * from photo where film = :film.id:" + OrderBy;
    public static final String SQLSelect4photo_filmpublic_sorted = "select * from photo where " + SQLWherefilm + " and " + SQLWherePublic + OrderBy;

    public static final String SQLjoinfilmtype = " inner join film on photo.film = film.id and film.type = :type: ";
    public static final String SQLWhereLastPhotoinGroup = "film like :groupid:";
    public static final String SQLSelectLastPhotoinGroup = "select * from photo where " + SQLWhereLastPhotoinGroup + " order by film desc, id desc";
    public static final String SQLSelectLastPhotoinGroupAndFilmtype =
        "select * from photo " + SQLjoinfilmtype + " where " + SQLWhereLastPhotoinGroup + " order by photo.film desc, photo.id desc";

    public static final String SQLWherebackup = "backup";
    public static final String SQLSelect4photo_film_backup = "select * from photo where " + SQLWherefilm + " and " + SQLWherebackup;
    public static final String SQLWhereimagebackup = "imagebackup";
    public static final String SQLSelect4photo_film_imagebackup = "select * from photo where " + SQLWherefilm + " and " + SQLWhereimagebackup;

    public static final String SQLSelect4publiclocation = "select * from photo where location = :location: and " + SQLWherePublic + OrderByDateTime;
    public static final String SQLSelect4location = "select * from photo where location = :location:" + OrderByDateTime;
    
    public static final String SQLSelect4publicdate = "select * from photo where photodate = :photodate: and " + SQLWherePublic + OrderByDateTime;
    public static final String SQLSelect4date = "select * from photo where photodate = :photodate:" + OrderByDateTime;
    
    public static final String SQLSelectDescriptions = "select distinct description from photo where description like :description:";
    
    public static final String SQLSelectDataError = "select * from photo where public and (location is null or photodate is null) order by film, id";
    
    public static final String SQLUpdateBackup4Film = "update photo set backup = :backup: where " + SQLWherefilm;

    private Filedata thumbnailimage;
    private Filedata smallimage;
    private Filedata croppedimage;
    private Filedata rootimage;
    
    private String smallfilepath;
//Custom code, do not change this line

    public static final String SQLSelect4route = "select * from photo where " + SQLWhereroute + OrderBy;
    public static final String SQLDelete4route = "delete from photo where " + SQLWhereroute + OrderBy;
    public static final String SQLSelect4creator = "select * from photo where " + SQLWherecreator + OrderBy;
    public static final String SQLDelete4creator = "delete from photo where " + SQLWherecreator + OrderBy;
    public static final String SQLSelect4film = "select * from photo where " + SQLWherefilm + OrderBy;
    public static final String SQLDelete4film = "delete from photo where " + SQLWherefilm + OrderBy;

    /**
     * Constructor
     * Creates an empty Photo entity
     */
    public Photo() {
    }
    
    /**
     * Constructor
     * build an empty Photo entity with initialized field values
     */
    public Photo(java.lang.String film, int id) {
        super(film, id);
    }

    /**
     * Constructor
     * build an empty Photo entity with initialized Primarykey parameter
     * @param photoPK: Photo Primarykey
     */
    public Photo(PhotoPK photoPK) {
        super(photoPK);
    }

//Custom code, do not change this line
    public static String getFileName(IPhotoPK photoPK) {
        String photoid;
        if(photoPK.getId()<10) photoid = "0" + photoPK.getId();
        else photoid = String.valueOf(photoPK.getId());
        return new StringBuffer(Film.getDirectoryName(photoPK.getFilmPK())).append("_").append(photoid).toString();
    }

    public void setThumbnailimage(Filedata thumbnailimage) {
        this.thumbnailimage = thumbnailimage;
    }

    public Filedata getThumbnail() {
        return thumbnailimage;
    }

    public void setSmallimage(Filedata smallimage) {
        this.smallimage = smallimage;
    }

    public Filedata getSmall() {
        return smallimage;
    }

    public void setCroppedimage(Filedata croppedimage) {
        this.croppedimage = croppedimage;
    }

    public Filedata getCropped() {
        return croppedimage;
    }

    public void setRootimage(Filedata rootimage) {
        this.rootimage = rootimage;
    }

    public Filedata getRoot() {
        return rootimage;
    }

    public static BufferedImage getImage(Filedata filedata) throws IOException {
        ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(filedata.getBinarydata()));
        Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);
        ImageReader reader = readers.next();
        reader.setInput(iis,true);
        return reader.read(0);
    }

    public BufferedImage getThumbnailimage() throws IOException {
        if(thumbnailimage==null) {
            return null;
        } else {
            return getImage(thumbnailimage);
        }
    }

    public boolean isLocationUpdated() {
        return updates.containsKey(IPhoto.LOCATION);
    }

    public boolean isReversegeocodeUpdated() {
        return updates.containsKey(IPhoto.REVERSEGEOCODE);
    }

    public String getSmallfilepath() {
        return smallfilepath;
    }

    public void setSmallfilepath(String smallfilepath) {
        this.smallfilepath = smallfilepath;
    }
    
    public String toString() {
        return this.photoPK.getFilm() + " " + this.photoPK.getId();
    }
//Custom code, do not change this line
}
