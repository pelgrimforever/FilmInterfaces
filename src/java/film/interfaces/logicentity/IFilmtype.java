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

public interface IFilmtype extends LogicEntity {

    public IFilmtypePK getPrimaryKey();
	
    public static short TYPE = 1;
    public static short DESCRIPTION = 2;

    public static final int SIZE_TYPE = 3;
    public static final int SIZE_DESCRIPTION = 20;
    public static final String[] fieldnames = { "type", "description" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
