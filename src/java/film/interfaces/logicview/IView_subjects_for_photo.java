/*
 * IView_subjects_for_photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * View Interface IView_subjects_for_photo
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_subjects_for_photo extends View {

    public static byte FILM = 1;
    public static byte PHOTOID = 2;
    public static byte CAT1 = 3;
    public static byte CAT2 = 4;
    public static byte ID = 5;
    public static byte SUBJECT = 6;
    public static byte DESCRIPTION = 7;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_PHOTOID = 10;
    public static final int SIZE_CAT1 = 30;
    public static final int SIZE_CAT2 = 30;
    public static final int SIZE_ID = 10;
    public static final int SIZE_SUBJECT = 30;
    public static final int SIZE_DESCRIPTION = 100;
    public static final String[] fieldnames = { "film", "photoid", "cat1", "cat2", "id", "subject", "description" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return film value
     */
    public java.lang.String getFilm();

    /**
     * 
     * @return photoid value
     */
    public int getPhotoid();

    /**
     * 
     * @return cat1 value
     */
    public java.lang.String getCat1();

    /**
     * 
     * @return cat2 value
     */
    public java.lang.String getCat2();

    /**
     * 
     * @return id value
     */
    public int getId();

    /**
     * 
     * @return subject value
     */
    public java.lang.String getSubject();

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    
//Custom code, do not change this line
//Put custom functions here
//Custom code, do not change this line
}
