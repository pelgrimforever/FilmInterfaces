/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ITree7subjectPK extends EntityPK, Serializable {

    public long getSubjectid();

    public void setSubjectid(long subjectid);


    public boolean equals(ITree7subjectPK tree7subjectPK2);

}
