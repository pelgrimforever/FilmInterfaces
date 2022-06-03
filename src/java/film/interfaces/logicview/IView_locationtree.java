/*
 * IView_locationtree.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
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
 * View Interface IView_locationtree
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_locationtree extends View {

    public static byte COUNTRYCODE = 1;
    public static byte COUNTRYNAME = 2;
    public static byte POSTALCODE = 3;
    public static byte AL1CODE = 4;
    public static byte AL1NAME = 5;
    public static byte AL2CODE = 6;
    public static byte AL2NAME = 7;
    public static byte AL3CODE = 8;
    public static byte AL3NAME = 9;
    public static byte LOCALITY = 10;
    public static byte HASSUBLOCALITY = 11;
    public static byte SUBLOCALITY = 12;
    public static byte ROUTECODE = 13;
    public static byte ROUTENAME = 14;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_COUNTRYNAME = 2147483647;
    public static final int SIZE_POSTALCODE = 10;
    public static final int SIZE_AL1CODE = 2147483647;
    public static final int SIZE_AL1NAME = 2147483647;
    public static final int SIZE_AL2CODE = 2147483647;
    public static final int SIZE_AL2NAME = 2147483647;
    public static final int SIZE_AL3CODE = 2147483647;
    public static final int SIZE_AL3NAME = 2147483647;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_HASSUBLOCALITY = 1;
    public static final int SIZE_SUBLOCALITY = 2147483647;
    public static final int SIZE_ROUTECODE = 2147483647;
    public static final int SIZE_ROUTENAME = 2147483647;
    public static final String[] fieldnames = { "countrycode", "countryname", "postalcode", "al1code", "al1name", "al2code", "al2name", "al3code", "al3name", "locality", "hassublocality", "sublocality", "routecode", "routename" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode();

    /**
     * 
     * @return countryname value
     */
    public java.lang.String getCountryname();

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode();

    /**
     * 
     * @return al1code value
     */
    public java.lang.String getAl1code();

    /**
     * 
     * @return al1name value
     */
    public java.lang.String getAl1name();

    /**
     * 
     * @return al2code value
     */
    public java.lang.String getAl2code();

    /**
     * 
     * @return al2name value
     */
    public java.lang.String getAl2name();

    /**
     * 
     * @return al3code value
     */
    public java.lang.String getAl3code();

    /**
     * 
     * @return al3name value
     */
    public java.lang.String getAl3name();

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality();

    /**
     * 
     * @return hassublocality value
     */
    public boolean getHassublocality();

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
     * @return routename value
     */
    public java.lang.String getRoutename();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
