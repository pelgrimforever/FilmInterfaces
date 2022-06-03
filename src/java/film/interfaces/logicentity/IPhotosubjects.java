/*
 * IPhotosubjects.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
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
 * Entity Interface IPhotosubjects
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IPhotosubjects extends LogicEntity {

    public IPhotosubjectsPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short ID = 2;
    public static short CAT1 = 3;
    public static short CAT2 = 4;
    public static short SUBJECT = 5;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_ID = 10;
    public static final int SIZE_CAT1 = 30;
    public static final int SIZE_CAT2 = 30;
    public static final int SIZE_SUBJECT = 10;
    public static final String[] fieldnames = { "film", "id", "cat1", "cat2", "subject" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_String, Datatypes.type_String, Datatypes.type_int };

    public static final String[] photoPKfields = { "photo.film", "photo.id" };
    public static final String[] photoFKfields = { "photosubjects.film", "photosubjects.id" };
    public static final String[] subjectPKfields = { "subject.cat1", "subject.cat2", "subject.id" };
    public static final String[] subjectFKfields = { "photosubjects.cat1", "photosubjects.cat2", "photosubjects.subject" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
