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

public interface IView_photo_firstlastdate extends View {

    public static byte MINPHOTODATE = 1;
    public static byte MAXPHOTODATE = 2;

    public static final int SIZE_MINPHOTODATE = 13;
    public static final int SIZE_MAXPHOTODATE = 13;
    public static final String[] fieldnames = { "minphotodate", "maxphotodate" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return minphotodate value
     */
    public java.sql.Date getMinphotodate();

    /**
     * 
     * @return maxphotodate value
     */
    public java.sql.Date getMaxphotodate();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
