/*
 * IFilmsubjects.java
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
 * Entity Interface IFilmsubjects
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IFilmsubjects extends LogicEntity {

    public IFilmsubjectsPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short CAT1 = 2;
    public static short CAT2 = 3;
    public static short SUBJECT = 4;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_CAT1 = 30;
    public static final int SIZE_CAT2 = 30;
    public static final int SIZE_SUBJECT = 10;
    public static final String[] fieldnames = { "film", "cat1", "cat2", "subject" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_int };

    public static final String[] subjectPKfields = { "subject.cat1", "subject.cat2", "subject.id" };
    public static final String[] subjectFKfields = { "filmsubjects.cat1", "filmsubjects.cat2", "filmsubjects.subject" };
    public static final String[] filmPKfields = { "film.id" };
    public static final String[] filmFKfields = { "filmsubjects.film" };

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
