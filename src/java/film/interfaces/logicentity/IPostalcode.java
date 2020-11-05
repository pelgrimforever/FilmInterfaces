/*
 * IPostalcode.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IPostalcode
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return foreign key arealevel3PK, instance of Arealevel3PK
     */
    public IArealevel3PK getArealevel3PK();

    /**
     * set foreign key arealevel3
     * @param arealevel3PK: instance of Arealevel3PK
     */
    public void setArealevel3PK(IArealevel3PK arealevel3PK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
