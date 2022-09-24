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

public interface IArealevel3 extends LogicEntity {

    public IArealevel3PK getPrimaryKey();
	
    public static short COUNTRYCODE = 1;
    public static short AL1CODE = 2;
    public static short AL2CODE = 3;
    public static short AL3CODE = 4;
    public static short NAME = 5;
    public static short LOCATION = 6;
    public static short BOUNDS = 7;
    public static short VIEWPORT = 8;
    public static short APPROXIMATE = 9;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_AL1CODE = 2147483647;
    public static final int SIZE_AL2CODE = 2147483647;
    public static final int SIZE_AL3CODE = 2147483647;
    public static final int SIZE_NAME = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_BOUNDS = 2147483647;
    public static final int SIZE_VIEWPORT = 2147483647;
    public static final int SIZE_APPROXIMATE = 1;
    public static final String[] fieldnames = { "countrycode", "al1code", "al2code", "al3code", "name", "location", "bounds", "viewport", "approximate" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_boolean };

    public static final String[] arealevel2PKfields = { "arealevel2.countrycode", "arealevel2.al1code", "arealevel2.al2code" };
    public static final String[] arealevel2FKfields = { "arealevel3.countrycode", "arealevel3.al1code", "arealevel3.al2code" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public piShape getLocation();

    public void setLocation(piShape location);

    public piShape getBounds();

    public void setBounds(piShape bounds);

    public piShape getViewport();

    public void setViewport(piShape viewport);

    public boolean getApproximate();

    public void setApproximate(boolean approximate);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
