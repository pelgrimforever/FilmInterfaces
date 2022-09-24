/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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
//foreign keys
    Foreignkeysearch routesearcher = new Foreignkeysearch("route", IPhoto.routePKfields, IPhoto.routeFKfields);
    Foreignkeysearch creatorsearcher = new Foreignkeysearch("creator", IPhoto.creatorPKfields, IPhoto.creatorFKfields);
    Foreignkeysearch filmsearcher = new Foreignkeysearch("film", IPhoto.filmPKfields, IPhoto.filmFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch phototree7subjectsearcher = new Primarykeysearch("phototree7subject", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);
    //relational key
    Relationalkeysearch reltree7subjectsearcher = new Relationalkeysearch("phototree7subject", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields, "tree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    //foreign key
    Primarykeysearch art_photosearcher = new Primarykeysearch("art_photo", IArt_photo.photoPKfields, IArt_photo.photoFKfields);
    //foreign key
    Primarykeysearch photosubjectssearcher = new Primarykeysearch("photosubjects", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);
    //relational key
    Relationalkeysearch relsubjectsearcher = new Relationalkeysearch("photosubjects", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields, "subject", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
    //foreign key
    Primarykeysearch phototagssearcher = new Primarykeysearch("phototags", IPhototags.photoPKfields, IPhototags.photoFKfields);

    public String getTable() {
        return Photo.table;
    }

    public Photosearch() {
        setFieldsearchers();
    }

    public Photosearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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
        addKeysearcher(reltree7subjectsearcher);
        addKeysearcher(art_photosearcher);
        addKeysearcher(photosubjectssearcher);
        addKeysearcher(relsubjectsearcher);
        addKeysearcher(phototagssearcher);
    }

    public void addPrimarykey(IPhotoPK photoPK) {
        super.addPrimarykey(photoPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void format(String[] values) {
        addStringvalues(format, values);
    }
    
    public void format(String[] values, byte compare, byte andor) {
        addStringvalues(format, values);
        format.setCompareoperator(compare);
        format.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void photodate(Date[] values, byte[] operators) {
        addDatevalues(photodate, values, operators);
    }
    
    public void photodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(photodate, values, operators);
        photodate.setAndoroperator(andor);
    }
    
    public void phototime(Time[] values, byte[] operators) {
        addTimevalues(phototime, values, operators);
    }
    
    public void phototime(Time[] values, byte[] operators, byte andor) {
        addTimevalues(phototime, values, operators);
        phototime.setAndoroperator(andor);
    }
    
    public void publicf_(Boolean value) {
        addBooleanvalue(publicf_, value);
    }
    
    public void composition(Boolean value) {
        addBooleanvalue(composition, value);
    }
    
    public void rotation(Double[] values, byte[] operators) {
        addNumbervalues(rotation, values, operators);
    }
    
    public void rotation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(rotation, values, operators);
        rotation.setAndoroperator(andor);
    }
    
    public void backup(Boolean value) {
        addBooleanvalue(backup, value);
    }
    
    public void imagebackup(Boolean value) {
        addBooleanvalue(imagebackup, value);
    }
    
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    public void exactlocation(Boolean value) {
        addBooleanvalue(exactlocation, value);
    }
    
    public void locationradius(Double[] values, byte[] operators) {
        addNumbervalues(locationradius, values, operators);
    }
    
    public void locationradius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationradius, values, operators);
        locationradius.setAndoroperator(andor);
    }
    
    public void reversegeocode(String[] values) {
        addStringvalues(reversegeocode, values);
    }
    
    public void reversegeocode(String[] values, byte compare, byte andor) {
        addStringvalues(reversegeocode, values);
        reversegeocode.setCompareoperator(compare);
        reversegeocode.setAndoroperator(andor);
    }
    
    public void streetnumber(String[] values) {
        addStringvalues(streetnumber, values);
    }
    
    public void streetnumber(String[] values, byte compare, byte andor) {
        addStringvalues(streetnumber, values);
        streetnumber.setCompareoperator(compare);
        streetnumber.setAndoroperator(andor);
    }
    
    public void formattedaddress(String[] values) {
        addStringvalues(formattedaddress, values);
    }
    
    public void formattedaddress(String[] values, byte compare, byte andor) {
        addStringvalues(formattedaddress, values);
        formattedaddress.setCompareoperator(compare);
        formattedaddress.setAndoroperator(andor);
    }
    
    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRouteInnerjoin() {
        return routesearcher.getInnerjoin();
    }

    public void creator(ICreatorsearch creatorsearch) {
        creatorsearcher.setTablesearch(creatorsearch);
    }
    
    public ICreatorsearch getCreatorsearch() {
        if(creatorsearcher.used()) {
            return (ICreatorsearch)creatorsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCreatorInnerjoin() {
        return creatorsearcher.getInnerjoin();
    }

    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    public IFilmsearch getFilmsearch() {
        if(filmsearcher.used()) {
            return (IFilmsearch)filmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getFilmInnerjoin() {
        return filmsearcher.getInnerjoin();
    }

    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch) {
        phototree7subjectsearcher.setTablesearch(phototree7subjectsearch);
    }
    
    public IPhototree7subjectsearch getPhototree7subjectsearch() {
        if(phototree7subjectsearcher.used()) {
            return (IPhototree7subjectsearch)phototree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void reltree7subject(ITree7subjectsearch tree7subjectsearch) {
        reltree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    public ITree7subjectsearch getRelTree7subjectsearch() {
        if(reltree7subjectsearcher.used()) {
            return (ITree7subjectsearch)reltree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void art_photo(IArt_photosearch art_photosearch) {
        art_photosearcher.setTablesearch(art_photosearch);
    }
    
    public IArt_photosearch getArt_photosearch() {
        if(art_photosearcher.used()) {
            return (IArt_photosearch)art_photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void photosubjects(IPhotosubjectssearch photosubjectssearch) {
        photosubjectssearcher.setTablesearch(photosubjectssearch);
    }
    
    public IPhotosubjectssearch getPhotosubjectssearch() {
        if(photosubjectssearcher.used()) {
            return (IPhotosubjectssearch)photosubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relsubject(ISubjectsearch subjectsearch) {
        relsubjectsearcher.setTablesearch(subjectsearch);
    }
    
    public ISubjectsearch getRelSubjectsearch() {
        if(relsubjectsearcher.used()) {
            return (ISubjectsearch)relsubjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void phototags(IPhototagssearch phototagssearch) {
        phototagssearcher.setTablesearch(phototagssearch);
    }
    
    public IPhototagssearch getPhototagssearch() {
        if(phototagssearcher.used()) {
            return (IPhototagssearch)phototagssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
