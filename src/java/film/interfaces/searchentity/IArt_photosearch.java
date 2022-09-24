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

public interface IArt_photosearch extends Tablesearcher {

    public void addPrimarykey(IArt_photoPK art_photoPK);

	public void selection(Boolean value);
	
	public void width(Double[] values, byte[] operators);
	
	public void width(Double[] values, byte[] operators, byte andor);
	
	public void height(Double[] values, byte[] operators);
	
	public void height(Double[] values, byte[] operators, byte andor);
	
	public void comment(String[] values);
	
	public void comment(String[] values, byte compare, byte andor);
	
	public void seqno(Double[] values, byte[] operators);
	
	public void seqno(Double[] values, byte[] operators, byte andor);
	
	public void archive(Boolean value);
	
	public void surround(Boolean value);
	
	public void surrounddir(String[] values);
	
	public void surrounddir(String[] values, byte compare, byte andor);
	
	public void photo(IPhotosearch photosearch);
	
	public void art_subgroup(IArt_subgroupsearch art_subgroupsearch);
	
	public void art_academy(IArt_academysearch art_academysearch);
	
	public void art_group(IArt_groupsearch art_groupsearch);
	
}
