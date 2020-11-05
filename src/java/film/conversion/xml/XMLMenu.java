package film.conversion.xml;

import XML.XMLElement;
import java.io.IOException;
import object.Objectoperation;
import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import film.entity.pk.MenuPK;
import film.interfaces.entity.pk.IMenuPK;
import film.logicentity.Menu;
import film.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Iterator;
import org.jdom2.Element;

/**
 *
 * @author Franky Laseure
 */
public class XMLMenu {
    
    /**
     * 
     * @return all keys and fields as XML
     */
    public static void addXML(Element PK, IMenuPK menuPK) {
        PK.addContent(XMLElement.newContent("mainmenu", menuPK.getMainmenu()));
        PK.addContent(XMLElement.newContent("menu", menuPK.getMenu()));
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static void addXML(Element MenuXML, Menu menu) {
        Element PK = XMLElement.newContent("PK", "");
        addXML(PK, menu.getPrimaryKey());
        MenuXML.addContent(PK);
    }
}

