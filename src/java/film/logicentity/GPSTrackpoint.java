/*
 * GPS XML extraction data class
 */
package film.logicentity;

import data.gis.shape.piPoint;
import java.io.Serializable;
import java.sql.Date;

/**
 * Trackpoint element from XML data extraction
 * @author pelgrim
 */
public class GPSTrackpoint implements Serializable {
    
    private piPoint point;
    private float altitude;
    private Date date;

    public piPoint getPoint() {
        return point;
    }

    public float getAltitude() {
        return altitude;
    }

    public Date getDate() {
        return date;
    }
    
    public GPSTrackpoint(int srid, double lat, double lng, float altitude, Date date) {
        this.point = new piPoint(srid);
        this.point.setX(lng);
        this.point.setY(lat);
        this.altitude = altitude;
        this.date = date;
    }
}
