/*
 * Filmsubjects.java
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
import film.interfaces.entity.pk.IFilmsubjectsPK;
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
 * Entity class Filmsubjects
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Filmsubjects extends film.entity.eFilmsubjects implements IFilmsubjects {

    public static final String SQLSelect = "select filmsubjects.* from filmsubjects";
    public static final String SQLWheresubject = "cat1 = :subject.cat1: and cat2 = :subject.cat2: and subject = :subject.id:";
    public static final String SQLWherefilm = "film = :film.id:";

//Custom code, do not change this line
    public static final String OrderBy = "";
//Custom code, do not change this line

    public static final String SQLSelect4subject = "select * from filmsubjects where " + SQLWheresubject + OrderBy;
    public static final String SQLDelete4subject = "delete from filmsubjects where " + SQLWheresubject + OrderBy;
    public static final String SQLSelect4film = "select * from filmsubjects where " + SQLWherefilm + OrderBy;
    public static final String SQLDelete4film = "delete from filmsubjects where " + SQLWherefilm + OrderBy;

    /**
     * Constructor
     * Creates an empty Filmsubjects entity
     */
    public Filmsubjects() {
    }
    
    /**
     * Constructor
     * build an empty Filmsubjects entity with initialized field values
     */
    public Filmsubjects(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject) {
        super(film, cat1, cat2, subject);
    }

    /**
     * Constructor
     * build an empty Filmsubjects entity with initialized Primarykey parameter
     * @param filmsubjectsPK: Filmsubjects Primarykey
     */
    public Filmsubjects(FilmsubjectsPK filmsubjectsPK) {
        super(filmsubjectsPK);
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
