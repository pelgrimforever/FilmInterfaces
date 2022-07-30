/*
 * IRoute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * Entity Interface IRoute
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRoute extends LogicEntity {

    public IRoutePK getPrimaryKey();
	
    public static short COUNTRYCODE = 1;
    public static short POSTALCODE = 2;
    public static short LOCALITY = 3;
    public static short SUBLOCALITY = 4;
    public static short ROUTECODE = 5;
    public static short NAME = 6;
    public static short LOCATION = 7;
    public static short BOUNDS = 8;
    public static short VIEWPORT = 9;
    public static short APPROXIMATE = 10;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_SUBLOCALITY = 2147483647;
    public static final int SIZE_ROUTECODE = 2147483647;
    public static final int SIZE_NAME = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_BOUNDS = 2147483647;
    public static final int SIZE_VIEWPORT = 2147483647;
    public static final int SIZE_APPROXIMATE = 1;
    public static final String[] fieldnames = { "countrycode", "postalcode", "locality", "sublocality", "routecode", "name", "location", "bounds", "viewport", "approximate" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_boolean };

    public static final String[] sublocalityPKfields = { "sublocality.countrycode", "sublocality.postalcode", "sublocality.locality", "sublocality.sublocality" };
    public static final String[] sublocalityFKfields = { "route.countrycode", "route.postalcode", "route.locality", "route.sublocality" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);

    /**
     * 
     * @return location value
     */
    public piShape getLocation();

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(piShape location);

    /**
     * 
     * @return bounds value
     */
    public piShape getBounds();

    /**
     * set bounds value
     * @param bounds: new value
     */
    public void setBounds(piShape bounds);

    /**
     * 
     * @return viewport value
     */
    public piShape getViewport();

    /**
     * set viewport value
     * @param viewport: new value
     */
    public void setViewport(piShape viewport);

    /**
     * 
     * @return approximate value
     */
    public boolean getApproximate();

    /**
     * set approximate value
     * @param approximate: new value
     */
    public void setApproximate(boolean approximate);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
