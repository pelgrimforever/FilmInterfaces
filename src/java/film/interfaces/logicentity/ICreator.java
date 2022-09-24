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

public interface ICreator extends LogicEntity {

    public ICreatorPK getPrimaryKey();
	
    public static short CREATORID = 1;
    public static short NAME = 2;
    public static short SURNAME = 3;

    public static final int SIZE_CREATORID = 20;
    public static final int SIZE_NAME = 25;
    public static final int SIZE_SURNAME = 30;
    public static final String[] fieldnames = { "creatorid", "name", "surname" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getSurname();

    public void setSurname(java.lang.String surname);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
