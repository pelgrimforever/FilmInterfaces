/*
 * IView_locality_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
 * View Interface IView_locality_photolocations
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_locality_photolocations extends View {

    public static byte COUNTRYCODE = 1;
    public static byte LOCALITY = 2;
    public static byte LOCATION = 3;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final String[] fieldnames = { "countrycode", "locality", "location" };

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
     * @return locality value
     */
    public java.lang.String getLocality();

    /**
     * 
     * @return location value
     */
    public piShape getLocation();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
