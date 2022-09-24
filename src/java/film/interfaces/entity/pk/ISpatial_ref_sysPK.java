/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISpatial_ref_sysPK extends EntityPK, Serializable {

    public int getSrid();

    public void setSrid(int srid);


    public boolean equals(ISpatial_ref_sysPK spatial_ref_sysPK2);

}
