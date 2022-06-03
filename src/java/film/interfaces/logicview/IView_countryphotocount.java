/*
 * IView_countryphotocount.java
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
 * View Interface IView_countryphotocount
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_countryphotocount extends View {

    public static byte CODE = 1;
    public static byte NAME = 2;
    public static byte PHOTOCOUNT = 3;

    public static final int SIZE_CODE = 2;
    public static final int SIZE_NAME = 2147483647;
    public static final int SIZE_PHOTOCOUNT = 19;
    public static final String[] fieldnames = { "code", "name", "photocount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return code value
     */
    public java.lang.String getCode();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return photocount value
     */
    public long getPhotocount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
