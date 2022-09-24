/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public interface IView_localityphotocount extends View {

    public static byte COUNTRYCODE = 1;
    public static byte LOCALITY = 2;
    public static byte LOCATION = 3;
    public static byte PHOTOCOUNT = 4;

    public static final int SIZE_COUNTRYCODE = 2;
    public static final int SIZE_LOCALITY = 2147483647;
    public static final int SIZE_LOCATION = 2147483647;
    public static final int SIZE_PHOTOCOUNT = 19;
    public static final String[] fieldnames = { "countrycode", "locality", "location", "photocount" };

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

    /**
     * 
     * @return photocount value
     */
    public long getPhotocount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
