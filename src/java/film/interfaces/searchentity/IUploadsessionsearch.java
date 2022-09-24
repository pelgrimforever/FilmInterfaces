/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

public interface IUploadsessionsearch extends Tablesearcher {

    public void addPrimarykey(IUploadsessionPK uploadsessionPK);

	public void filename(String[] values);
	
	public void filename(String[] values, byte compare, byte andor);
	
	public void upload(Boolean value);
	
	public void rotation(Double[] values, byte[] operators);
	
	public void rotation(Double[] values, byte[] operators, byte andor);
	
	public void filmgroupid(String[] values);
	
	public void filmgroupid(String[] values, byte compare, byte andor);
	
	public void photosubjects(String[] values);
	
	public void photosubjects(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void creator(ICreatorsearch creatorsearch);
	
}
