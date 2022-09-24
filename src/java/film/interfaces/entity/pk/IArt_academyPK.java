/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IArt_academyPK extends EntityPK, Serializable {

    public long getAcademyid();

    public void setAcademyid(long academyid);


    public boolean equals(IArt_academyPK art_academyPK2);

}
