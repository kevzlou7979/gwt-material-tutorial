package gwt.material.design.addins.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.MaterialDesignBase;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialAnchorButton;

/**
 * Created by Mark Kevin on 6/14/2016.
 */
public class MaterialJQPrint extends MaterialAnchorButton{

    static {
        MaterialDesignBase.injectJs(MaterialJQPrintClientBundle.INSTANCE.jQPrintJs());
    }

    public void print(Element element) {
        String uid = DOM.createUniqueId();
        element.setId(uid);
        getElement().setAttribute("onclick", "return xepOnline.Formatter.Format('"+ uid +"');");
    }

}
