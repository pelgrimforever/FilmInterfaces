/*
 * Photosearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IPhotosearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Photo table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Photosearch extends Tablesearch implements IPhotosearch {

    Numbersearch id = new Numbersearch("photo.id");
    Stringsearch format = new Stringsearch("photo.format");
    Stringsearch description = new Stringsearch("photo.description");
    Datesearch photodate = new Datesearch("photo.photodate");
    Timesearch phototime = new Timesearch("photo.phototime");
    Booleansearch publicf_ = new Booleansearch("photo.public");
    Booleansearch composition = new Booleansearch("photo.composition");
    Numbersearch rotation = new Numbersearch("photo.rotation");
    Booleansearch backup = new Booleansearch("photo.backup");
    Booleansearch imagebackup = new Booleansearch("photo.imagebackup");
    Stringsearch location = new Stringsearch("photo.location");
    Booleansearch exactlocation = new Booleansearch("photo.exactlocation");
    Numbersearch locationradius = new Numbersearch("photo.locationradius");
    Stringsearch reversegeocode = new Stringsearch("photo.reversegeocode");
    Stringsearch streetnumber = new Stringsearch("photo.streetnumber");
    Stringsearch formattedaddress = new Stringsearch("photo.formattedaddress");
    Foreignkeysearch routesearcher = new Foreignkeysearch("route", IPhoto.routePKfields, IPhoto.routeFKfields);
    Foreignkeysearch creatorsearcher = new Foreignkeysearch("creator", IPhoto.creatorPKfields, IPhoto.creatorFKfields);
    Foreignkeysearch filmsearcher = new Foreignkeysearch("film", IPhoto.filmPKfields, IPhoto.filmFKfields);
    Primarykeysearch phototree7subjectsearcher = new Primarykeysearch("phototree7subject", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);
    Relationalkeysearch tree7subjectsearcher = new Relationalkeysearch("phototree7subject", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields, "tree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    Primarykeysearch art_photosearcher = new Primarykeysearch("art_photo", IArt_photo.photoPKfields, IArt_photo.photoFKfields);
    Primarykeysearch photosubjectssearcher = new Primarykeysearch("photosubjects", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);
    Relationalkeysearch subjectsearcher = new Relationalkeysearch("photosubjects", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields, "subject", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
    Primarykeysearch phototagssearcher = new Primarykeysearch("phototags", IPhototags.photoPKfields, IPhototags.photoFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Photo.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Photosearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Photosearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(format);
        addFieldsearcher(description);
        addFieldsearcher(photodate);
        addFieldsearcher(phototime);
        addFieldsearcher(publicf_);
        addFieldsearcher(composition);
        addFieldsearcher(rotation);
        addFieldsearcher(backup);
        addFieldsearcher(imagebackup);
        addFieldsearcher(location);
        addFieldsearcher(exactlocation);
        addFieldsearcher(locationradius);
        addFieldsearcher(reversegeocode);
        addFieldsearcher(streetnumber);
        addFieldsearcher(formattedaddress);
        addKeysearcher(routesearcher);
        addKeysearcher(creatorsearcher);
        addKeysearcher(filmsearcher);
        addKeysearcher(phototree7subjectsearcher);
        addKeysearcher(tree7subjectsearcher);
        addKeysearcher(art_photosearcher);
        addKeysearcher(photosubjectssearcher);
        addKeysearcher(subjectsearcher);
        addKeysearcher(phototagssearcher);
    }

    /**
     * add a primary key instance to search for
     * @param photoPK: Photo primery key
     */
    public void addPrimarykey(IPhotoPK photoPK) {
        super.addPrimarykey(photoPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field format, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void format(String[] values) {
        addStringvalues(format, values);
    }
    
    /**
     * add String search values for field format
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void format(String[] values, byte compare, byte andor) {
        addStringvalues(format, values);
        format.setCompareoperator(compare);
        format.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    /**
     * add Date search values for field photodate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void photodate(Date[] values, byte[] operators) {
        addDatevalues(photodate, values, operators);
    }
    
    /**
     * add Date search values for field photodate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void photodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(photodate, values, operators);
        photodate.setAndoroperator(andor);
    }
    
    /**
     * add Time search values for field phototime, default OR operator is used
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void phototime(Time[] values, byte[] operators) {
        addTimevalues(phototime, values, operators);
    }
    
    /**
     * add Time search values for field phototime
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void phototime(Time[] values, byte[] operators, byte andor) {
        addTimevalues(phototime, values, operators);
        phototime.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field public
     * @param value: true or false
     */
    public void publicf_(Boolean value) {
        addBooleanvalue(publicf_, value);
    }
    
    /**
     * add Boolean search values for field composition
     * @param value: true or false
     */
    public void composition(Boolean value) {
        addBooleanvalue(composition, value);
    }
    
    /**
     * add Numeric search values for field rotation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void rotation(Double[] values, byte[] operators) {
        addNumbervalues(rotation, values, operators);
    }
    
    /**
     * add Numeric search values for field rotation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void rotation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(rotation, values, operators);
        rotation.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field backup
     * @param value: true or false
     */
    public void backup(Boolean value) {
        addBooleanvalue(backup, value);
    }
    
    /**
     * add Boolean search values for field imagebackup
     * @param value: true or false
     */
    public void imagebackup(Boolean value) {
        addBooleanvalue(imagebackup, value);
    }
    
    /**
     * add String search values for field location, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    /**
     * add String search values for field location
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field exactlocation
     * @param value: true or false
     */
    public void exactlocation(Boolean value) {
        addBooleanvalue(exactlocation, value);
    }
    
    /**
     * add Numeric search values for field locationradius, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void locationradius(Double[] values, byte[] operators) {
        addNumbervalues(locationradius, values, operators);
    }
    
    /**
     * add Numeric search values for field locationradius
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void locationradius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationradius, values, operators);
        locationradius.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field reversegeocode, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void reversegeocode(String[] values) {
        addStringvalues(reversegeocode, values);
    }
    
    /**
     * add String search values for field reversegeocode
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void reversegeocode(String[] values, byte compare, byte andor) {
        addStringvalues(reversegeocode, values);
        reversegeocode.setCompareoperator(compare);
        reversegeocode.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field streetnumber, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void streetnumber(String[] values) {
        addStringvalues(streetnumber, values);
    }
    
    /**
     * add String search values for field streetnumber
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void streetnumber(String[] values, byte compare, byte andor) {
        addStringvalues(streetnumber, values);
        streetnumber.setCompareoperator(compare);
        streetnumber.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field formattedaddress, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void formattedaddress(String[] values) {
        addStringvalues(formattedaddress, values);
    }
    
    /**
     * add String search values for field formattedaddress
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void formattedaddress(String[] values, byte compare, byte andor) {
        addStringvalues(formattedaddress, values);
        formattedaddress.setCompareoperator(compare);
        formattedaddress.setAndoroperator(andor);
    }
    
    /**
     * set subsearch route tablesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if routesearcher is not used
     * @return inner join statement
     */
    public String getRouteInnerjoin() {
        return routesearcher.getInnerjoin();
    }

    /**
     * set subsearch creator tablesearch
     * @param creatorsearch: ICreatorsearch
     */
    public void creator(ICreatorsearch creatorsearch) {
        creatorsearcher.setTablesearch(creatorsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public ICreatorsearch getCreatorsearch() {
        if(creatorsearcher.used()) {
            return (ICreatorsearch)creatorsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if creatorsearcher is not used
     * @return inner join statement
     */
    public String getCreatorInnerjoin() {
        return creatorsearcher.getInnerjoin();
    }

    /**
     * set subsearch film tablesearch
     * @param filmsearch: IFilmsearch
     */
    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IFilmsearch getFilmsearch() {
        if(filmsearcher.used()) {
            return (IFilmsearch)filmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if filmsearcher is not used
     * @return inner join statement
     */
    public String getFilmInnerjoin() {
        return filmsearcher.getInnerjoin();
    }

    /**
     * set subsearch phototree7subject tablesearch
     * @param phototree7subjectsearch: IPhototree7subjectsearch
     */
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch) {
        phototree7subjectsearcher.setTablesearch(phototree7subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IPhototree7subjectsearch getPhototree7subjectsearch() {
        if(phototree7subjectsearcher.used()) {
            return (IPhototree7subjectsearch)phototree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch tree7subject tablesearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void tree7subject(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public ITree7subjectsearch getTree7subjectsearch() {
        if(tree7subjectsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch art_photo tablesearch
     * @param art_photosearch: IArt_photosearch
     */
    public void art_photo(IArt_photosearch art_photosearch) {
        art_photosearcher.setTablesearch(art_photosearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IArt_photosearch getArt_photosearch() {
        if(art_photosearcher.used()) {
            return (IArt_photosearch)art_photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch photosubjects tablesearch
     * @param photosubjectssearch: IPhotosubjectssearch
     */
    public void photosubjects(IPhotosubjectssearch photosubjectssearch) {
        photosubjectssearcher.setTablesearch(photosubjectssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IPhotosubjectssearch getPhotosubjectssearch() {
        if(photosubjectssearcher.used()) {
            return (IPhotosubjectssearch)photosubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subject(ISubjectsearch subjectsearch) {
        subjectsearcher.setTablesearch(subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public ISubjectsearch getSubjectsearch() {
        if(subjectsearcher.used()) {
            return (ISubjectsearch)subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch phototags tablesearch
     * @param phototagssearch: IPhototagssearch
     */
    public void phototags(IPhototagssearch phototagssearch) {
        phototagssearcher.setTablesearch(phototagssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Photo
     */
    public IPhototagssearch getPhototagssearch() {
        if(phototagssearcher.used()) {
            return (IPhototagssearch)phototagssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
