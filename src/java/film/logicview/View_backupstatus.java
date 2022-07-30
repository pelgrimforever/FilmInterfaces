/*
 * View_backupstatus.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
