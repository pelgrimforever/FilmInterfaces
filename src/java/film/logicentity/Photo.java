/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
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

public class Photo extends film.entity.ePhoto implements IPhoto {

//Custom code, do not change this line
    public static final String FILMTYPE_APS = "APS";
    public static final String FILMTYPE_CON = "CON";
    public static final String FILMTYPE_SCA = "SCA";
    public static final String FILMTYPE_DIG = "DIG";
    public static final String FILMTYPE_INT = "INT";
    public static final String FILMTYPE_DIA = "DIA";

    private Filedata thumbnailimage;
    private Filedata smallimage;
    private Filedata croppedimage;
    private Filedata rootimage;

    private String imagebase64 = "";
//Custom code, do not change this line

    public Photo() {
    }
    
    public Photo(java.lang.String film, int id) {
        super(film, id);
    }

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

    public void setImagebase64(String imagebase64) {
        this.imagebase64 = imagebase64;
    }
    
    public String getImagebase64() {
        return this.imagebase64;
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

    public String toString() {
        return this.photoPK.getFilm() + " " + this.photoPK.getId();
    }
//Custom code, do not change this line
}
