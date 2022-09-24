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
import film.interfaces.entity.pk.IArealevel1PK;
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

public class Arealevel1 extends film.entity.eArealevel1 implements IArealevel1 {

//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line

    public Arealevel1() {
    }
    
    public Arealevel1(java.lang.String countrycode, java.lang.String al1code) {
        super(countrycode, al1code);
    }

    public Arealevel1(Arealevel1PK arealevel1PK) {
        super(arealevel1PK);
    }

//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line
}
