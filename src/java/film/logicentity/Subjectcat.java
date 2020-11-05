/*
 * Subjectcat.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.ISubjectcatPK;
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

/**
 * Entity class Subjectcat
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Subjectcat extends film.entity.eSubjectcat implements ISubjectcat {

    public static final String SQLSelect = "select subjectcat.* from subjectcat";

//Custom code, do not change this line
    public static final String OrderBy = " order by cat";
    public static final String SQLWhereCatno = "catno = :catno:";
    public static final String SQLSelectCatno = "select * from subjectcat where " + SQLWhereCatno + OrderBy;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Subjectcat entity
     */
    public Subjectcat() {
    }
    
    /**
     * Constructor
     * build an empty Subjectcat entity with initialized field values
     */
    public Subjectcat(java.lang.String cat) {
        super(cat);
    }

    /**
     * Constructor
     * build an empty Subjectcat entity with initialized Primarykey parameter
     * @param subjectcatPK: Subjectcat Primarykey
     */
    public Subjectcat(SubjectcatPK subjectcatPK) {
        super(subjectcatPK);
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