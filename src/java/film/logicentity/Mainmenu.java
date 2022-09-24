/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.entity.pk.*;
import film.interfaces.entity.pk.IMainmenuPK;
import film.interfaces.logicentity.*;
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

public class Mainmenu extends film.entity.eMainmenu implements IMainmenu {

//Custom code, do not change this line
    public static final String EMPTYICON = "buttons/empty.png";
    public static final String SUBJECTSICON = "buttons/menu.png";
//Custom code, do not change this line

    public Mainmenu() {
    }
    
    public Mainmenu(java.lang.String mainmenu) {
        super(mainmenu);
    }

    public Mainmenu(MainmenuPK mainmenuPK) {
        super(mainmenuPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
    
    public String getIconFile() {
        if(this.getIcon()==null) {
            return this.EMPTYICON;
        } else {
            return this.getIcon();
        }
    }
//Custom code, do not change this line
}
