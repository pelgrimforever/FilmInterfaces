/*
 * IPhototree7subject.java
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
 * Entity Interface IPhototree7subject
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IPhototree7subject extends LogicEntity {

	public IPhototree7subjectPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short ID = 2;
    public static short SUBJECTID = 3;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_ID = 5;
    public static final int SIZE_SUBJECTID = 19;
    public static final String[] fieldnames = { "film", "id", "subjectid" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_long };

    public static final String[] tree7subjectPKfields = { "tree7subject.subjectid" };
    public static final String[] tree7subjectFKfields = { "phototree7subject.subjectid" };
    public static final String[] photoPKfields = { "photo.film", "photo.id" };
    public static final String[] photoFKfields = { "phototree7subject.film", "phototree7subject.id" };

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
