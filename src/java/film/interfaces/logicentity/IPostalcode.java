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

public interface IPostalcode extends LogicEntity {

    public IPostalcodePK getPrimaryKey();
	
    public static short COUNTRYCODE = 1;
    public static short POSTALCODE = 2;
    public static short AL1CODE = 3;
    public static short AL2CODE = 4;
    public static short AL3CODE = 5;
    public static short LOCATION = 6;
    public static short BOUNDS = 7;
    public static short VIEWPORT = 8;
    public static short APPROXIMATE = 9;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_AL1CODE = 2147483647;
    public static final int SIZE_AL2CODE = 2147483647;
    public static final int SIZE_AL3CODE = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_BOUNDS = 2147483647;
    public static final int SIZE_VIEWPORT = 2147483647;
    public static final int SIZE_APPROXIMATE = 1;
    public static final String[] fieldnames = { "countrycode", "postalcode", "al1code", "al2code", "al3code", "location", "bounds", "viewport", "approximate" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_boolean };

    public static final String[] arealevel3PKfields = { "arealevel3.countrycode", "arealevel3.al1code", "arealevel3.al2code", "arealevel3.al3code" };
    public static final String[] arealevel3FKfields = { "postalcode.countrycode", "postalcode.al1code", "postalcode.al2code", "postalcode.al3code" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public piShape getLocation();

    public void setLocation(piShape location);

    public piShape getBounds();

    public void setBounds(piShape bounds);

    public piShape getViewport();

    public void setViewport(piShape viewport);

    public boolean getApproximate();

    public void setApproximate(boolean approximate);

    public IArealevel3PK getArealevel3PK();

    public void setArealevel3PK(IArealevel3PK arealevel3PK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
