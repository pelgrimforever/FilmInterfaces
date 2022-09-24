/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IArt_subgroupPK extends EntityPK, Serializable {

    public int getSubgroupid();

    public void setSubgroupid(int subgroupid);


    public boolean equals(IArt_subgroupPK art_subgroupPK2);

}
