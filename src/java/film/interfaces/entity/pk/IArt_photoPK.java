/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IArt_photoPK extends EntityPK, Serializable {

    public IPhotoPK getPhotoPK();
    public void setPhotoPK(IPhotoPK photoPK);

    public java.lang.String getFilm();

    public void setFilm(java.lang.String film);

    public int getPhoto();

    public void setPhoto(int photo);


    public boolean equals(IArt_photoPK art_photoPK2);

}
