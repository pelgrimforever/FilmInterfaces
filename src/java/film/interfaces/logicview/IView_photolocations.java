/*
 * IView_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IView_photolocations
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_photolocations extends View {

    public static byte LOCATION = 1;
    public static byte EXACTLOCATION = 2;
    public static byte LOCATIONRADIUS = 3;
    public static byte COUNTRYCODE = 4;
    public static byte POSTALCODE = 5;
    public static byte LOCALITY = 6;
    public static byte SUBLOCALITY = 7;
    public static byte ROUTECODE = 8;
    public static byte STREETNUMBER = 9;
    public static byte LOCATIONCOUNT = 10;

    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_EXACTLOCATION = 1;
    public static final int SIZE_LOCATIONRADIUS = 17;
    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_SUBLOCALITY = 2147483647;
    public static final int SIZE_ROUTECODE = 2147483647;
    public static final int SIZE_STREETNUMBER = 10;
    public static final int SIZE_LOCATIONCOUNT = 19;
    public static final String[] fieldnames = { "location", "exactlocation", "locationradius", "countrycode", "postalcode", "locality", "sublocality", "routecode", "streetnumber", "locationcount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return location value
     */
    public piShape getLocation();

    /**
     * 
     * @return exactlocation value
     */
    public boolean getExactlocation();

    /**
     * 
     * @return locationradius value
     */
    public double getLocationradius();

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode();

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode();

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality();

    /**
     * 
     * @return sublocality value
     */
    public java.lang.String getSublocality();

    /**
     * 
     * @return routecode value
     */
    public java.lang.String getRoutecode();

    /**
     * 
     * @return streetnumber value
     */
    public java.lang.String getStreetnumber();

    /**
     * 
     * @return locationcount value
     */
    public long getLocationcount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
