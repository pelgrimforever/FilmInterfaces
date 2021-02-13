/*
 * View_backupstatus.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import film.interfaces.logicview.IView_backupstatus;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * View class View_backupstatus
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_backupstatus extends film.view.eView_backupstatus implements IView_backupstatus {

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String WhereImagebackup = " imagebackupcount > 0 ";
    public static final String WhereBackup = " backupcount > 0 ";
    public static final String WhereAllBackup = WhereImagebackup + "or" + WhereBackup;

    public static final String SQLSelectAll = "select * from view_backupstatus " + OrderBy;
    public static final String SQLSelect4Imagebackup = "select * from view_backupstatus where " + WhereImagebackup + OrderBy;
    public static final String SQLSelect4Backup = "select * from view_backupstatus where " + WhereBackup + OrderBy;
    public static final String SQLSelect4AllBackup = "select * from view_backupstatus where " + WhereAllBackup + OrderBy;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_backupstatus entity
     */
    public View_backupstatus() {
    }
    
//Custom code, do not change this line
    public long getPhotoTobackup() {
        return this.getPhotocount() - this.getBackupcount();
    }

    public long getPhotoImageTobackup() {
        return this.getPhotocount() - this.getImagebackupcount();
    }
//Custom code, do not change this line
}
