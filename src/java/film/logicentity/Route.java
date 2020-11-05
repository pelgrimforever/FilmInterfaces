/*
 * Route.java
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
import film.interfaces.entity.pk.IRoutePK;
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
 * Entity class Route
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Route extends film.entity.eRoute implements IRoute {

    public static final String SQLSelect = "select route.* from route";
    public static final String SQLWheresublocality = "countrycode = :sublocality.countrycode: and postalcode = :sublocality.postalcode: and locality = :sublocality.locality: and sublocality = :sublocality.sublocality:";

//Custom code, do not change this line
public static final String OrderBy = " order by route.countrycode, route.postalcode, route.locality, route.sublocality, route.routecode";
public static final String SQLWherelocalityPK = "countrycode = :locality.countrycode: and postalcode = :locality.postalcode: and locality = :locality.locality:";
public static final String SQLSelect4localityPK = "select * from route where " + SQLWherelocalityPK + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4sublocality = "select * from route where " + SQLWheresublocality + OrderBy;
    public static final String SQLDelete4sublocality = "delete from route where " + SQLWheresublocality + OrderBy;

    /**
     * Constructor
     * Creates an empty Route entity
     */
    public Route() {
    }
    
    /**
     * Constructor
     * build an empty Route entity with initialized field values
     */
    public Route(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality, java.lang.String routecode) {
        super(countrycode, postalcode, locality, sublocality, routecode);
    }

    /**
     * Constructor
     * build an empty Route entity with initialized Primarykey parameter
     * @param routePK: Route Primarykey
     */
    public Route(RoutePK routePK) {
        super(routePK);
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
