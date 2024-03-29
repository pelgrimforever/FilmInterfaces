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
import film.interfaces.entity.pk.IUploadsessionsettingsPK;
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

public class Uploadsessionsettings extends film.entity.eUploadsessionsettings implements IUploadsessionsettings {

//Custom code, do not change this line
//Custom code, do not change this line

    public Uploadsessionsettings() {
    }
    
    public Uploadsessionsettings(java.lang.String directory) {
        super(directory);
    }

    public Uploadsessionsettings(UploadsessionsettingsPK uploadsessionsettingsPK) {
        super(uploadsessionsettingsPK);
    }

//Custom code, do not change this line
    public ArrayList<String> getGroupidlist() {
        ArrayList<String> groupidlist = new ArrayList<String>();
        String[] groupids = getGroupids();
        for(int i=0; i<groupids.length; i++) {
            groupidlist.add(groupids[i]);
        }
        return groupidlist;
    }
    
    public String[] getGroupids() {
        if(this.getFilmgroups()==null || this.getFilmgroups().length()==0) {
            return new String[0];
        } else {
            return this.getFilmgroups().split(",");
        }
    }

    public void setGroupids(String[] groupids) {
        StringBuffer filmgroupsbuffer = new StringBuffer("");
        for(int i=0; i<groupids.length; i++) {
            filmgroupsbuffer.append(groupids[i]).append(",");
        }
        String filmgroups = "";
        if(filmgroupsbuffer.length()>0) filmgroups = filmgroupsbuffer.substring(0, filmgroupsbuffer.length()-1);
        this.setFilmgroups(filmgroups);
    }

    public void setGroupids(ArrayList<String> groupids) {
        StringBuffer filmgroupsbuffer = new StringBuffer("");
        Iterator<String> groupidsI = groupids.iterator();
        while(groupidsI.hasNext()) {
            filmgroupsbuffer.append(groupidsI.next()).append(",");
        }
        String filmgroups = "";
        if(filmgroupsbuffer.length()>0) filmgroups = filmgroupsbuffer.substring(0, filmgroupsbuffer.length()-1);
        this.setFilmgroups(filmgroups);
    }
    
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
