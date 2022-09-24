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

public interface ICountry extends LogicEntity {

    public ICountryPK getPrimaryKey();
	
    public static short CODE = 1;
    public static short NAME = 2;
    public static short LOCATION = 3;
    public static short BOUNDS = 4;
    public static short VIEWPORT = 5;
    public static short APPROXIMATE = 6;
    public static short HASAREALEVEL1 = 7;
    public static short HASAREALEVEL2 = 8;
    public static short HASAREALEVEL3 = 9;

    public static final int SIZE_CODE = 2;
    public static final int SIZE_NAME = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_BOUNDS = 2147483647;
    public static final int SIZE_VIEWPORT = 2147483647;
    public static final int SIZE_APPROXIMATE = 1;
    public static final int SIZE_HASAREALEVEL1 = 1;
    public static final int SIZE_HASAREALEVEL2 = 1;
    public static final int SIZE_HASAREALEVEL3 = 1;
    public static final String[] fieldnames = { "code", "name", "location", "bounds", "viewport", "approximate", "hasarealevel1", "hasarealevel2", "hasarealevel3" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_piShape, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_boolean };


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

    public boolean getHasarealevel1();

    public void setHasarealevel1(boolean hasarealevel1);

    public boolean getHasarealevel2();

    public void setHasarealevel2(boolean hasarealevel2);

    public boolean getHasarealevel3();

    public void setHasarealevel3(boolean hasarealevel3);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
