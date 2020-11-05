/*
 * Film.java
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
import film.interfaces.entity.pk.IFilmPK;
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
 * Entity class Film
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Film extends film.entity.eFilm implements IFilm {

    public static final String SQLSelect = "select film.* from film";
    public static final String SQLWherefilmtype = "type = :filmtype.type:";

//Custom code, do not change this line
        private static final String OrderBy = " order by id";
        private static final String SQLWherePublic = " public = :public: ";
	public static final String SQLSelectAll = film.entity.eFilm.SQLSelectAll + OrderBy;
	public static final String SQLSelectAll4Public = "select * from film where " + SQLWherefilmtype + OrderBy;
        public static final String SQLSelect4film_filmtype_orderby = "select * from film where " + SQLWherefilmtype + OrderBy;
        public static final String SQLSelectGroups = "select * from film where "
                + "id not like '0%' and "
                + "id not like '1%' and "
                + "id not like '2%' and "
                + "id not like '3%' and "
                + "id not like '4%' and "
                + "id not like '5%' and "
                + "id not like '6%' and "
                + "id not like '7%' and "
                + "id not like '8%' and "
                + "id not like '9%' " + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4filmtype = "select * from film where " + SQLWherefilmtype + OrderBy;
    public static final String SQLDelete4filmtype = "delete from film where " + SQLWherefilmtype + OrderBy;

    /**
     * Constructor
     * Creates an empty Film entity
     */
    public Film() {
    }
    
    /**
     * Constructor
     * build an empty Film entity with initialized field values
     */
    public Film(java.lang.String id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Film entity with initialized Primarykey parameter
     * @param filmPK: Film Primarykey
     */
    public Film(FilmPK filmPK) {
        super(filmPK);
    }

//Custom code, do not change this line
    public static String getDirectoryName(IFilmPK filmPK) {
        return new StringBuffer(filmPK.getId().substring(0, 3)).append("-").append(filmPK.getId().substring(3, 6)).toString();
    }

    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
