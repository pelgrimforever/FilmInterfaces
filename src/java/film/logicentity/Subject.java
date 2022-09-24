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
import film.interfaces.entity.pk.ISubjectPK;
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

public class Subject extends film.entity.eSubject implements ISubject {

//Custom code, do not change this line
//Custom code, do not change this line

    public Subject() {
    }
    
    public Subject(java.lang.String cat1, java.lang.String cat2, int id) {
        super(cat1, cat2, id);
    }

    public Subject(SubjectPK subjectPK) {
        super(subjectPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return this.subjectPK.getCat1() + " " + this.subjectPK.getCat2() + " " + this.getSubject();
    }
//Custom code, do not change this line
}
