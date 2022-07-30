/*
 * IView_subjects_for_film.java
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
 * View Interface IView_subjects_for_film
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_subjects_for_film extends View {

    public static byte FILM = 1;
    public static byte CAT1 = 2;
    public static byte CAT2 = 3;
    public static byte ID = 4;
    public static byte SUBJECT = 5;
    public static byte DESCRIPTION = 6;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_CAT1 = 30;
    public static final int SIZE_CAT2 = 30;
    public static final int SIZE_ID = 10;
    public static final int SIZE_SUBJECT = 30;
    public static final int SIZE_DESCRIPTION = 100;
    public static final String[] fieldnames = { "film", "cat1", "cat2", "id", "subject", "description" };

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
