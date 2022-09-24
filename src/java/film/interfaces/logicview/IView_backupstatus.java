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

public interface IView_backupstatus extends View {

    public static byte ID = 1;
    public static byte PHOTOCOUNT = 2;
    public static byte BACKUPCOUNT = 3;
    public static byte IMAGEBACKUPCOUNT = 4;

    public static final int SIZE_ID = 6;
    public static final int SIZE_PHOTOCOUNT = 19;
    public static final int SIZE_BACKUPCOUNT = 19;
    public static final int SIZE_IMAGEBACKUPCOUNT = 19;
    public static final String[] fieldnames = { "id", "photocount", "backupcount", "imagebackupcount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return id value
     */
    public java.lang.String getId();

    /**
     * 
     * @return photocount value
     */
    public long getPhotocount();

    /**
     * 
     * @return backupcount value
     */
    public long getBackupcount();

    /**
     * 
     * @return imagebackupcount value
     */
    public long getImagebackupcount();

    
//Custom code, do not change this line
//Put custom functions here
    public long getPhotoTobackup();

    public long getPhotoImageTobackup();
//Custom code, do not change this line
}
