/*
 * IView_photodates.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IView_photodates
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_photodates extends View {

    public static byte PHOTODATE = 1;
    public static byte PHOTOS = 2;

    public static final int SIZE_PHOTODATE = 13;
    public static final int SIZE_PHOTOS = 19;
    public static final String[] fieldnames = { "photodate", "photos" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return photodate value
     */
    public java.sql.Date getPhotodate();

    /**
     * 
     * @return photos value
     */
    public long getPhotos();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
