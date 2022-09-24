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
import film.interfaces.entity.pk.ISublocalityPK;
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

public class Sublocality extends film.entity.eSublocality implements ISublocality {

//Custom code, do not change this line
//Custom code, do not change this line

    public Sublocality() {
    }
    
    public Sublocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        super(countrycode, postalcode, locality, sublocality);
    }

    public Sublocality(SublocalityPK sublocalityPK) {
        super(sublocalityPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
