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

public interface ISublocality extends LogicEntity {

    public ISublocalityPK getPrimaryKey();
	
    public static short COUNTRYCODE = 1;
    public static short POSTALCODE = 2;
    public static short LOCALITY = 3;
    public static short SUBLOCALITY = 4;
    public static short LOCATION = 5;
    public static short BOUNDS = 6;
    public static short VIEWPORT = 7;
    public static short APPROXIMATE = 8;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_SUBLOCALITY = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_BOUNDS = 2147483647;
    public static final int SIZE_VIEWPORT = 2147483647;
    public static final int SIZE_APPROXIMATE = 1;
    public static final String[] fieldnames = { "countrycode", "postalcode", "locality", "sublocality", "location", "bounds", "viewport", "approximate" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_boolean };

    public static final String[] localityPKfields = { "locality.countrycode", "locality.postalcode", "locality.locality" };
    public static final String[] localityFKfields = { "sublocality.countrycode", "sublocality.postalcode", "sublocality.locality" };

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

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
