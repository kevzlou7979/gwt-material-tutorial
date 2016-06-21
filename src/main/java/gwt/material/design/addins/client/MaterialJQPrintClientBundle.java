package gwt.material.design.addins.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Created by Mark Kevin on 6/14/2016.
 */
public interface MaterialJQPrintClientBundle extends ClientBundle {

    MaterialJQPrintClientBundle INSTANCE = GWT.create(MaterialJQPrintClientBundle.class);

    @ClientBundle.Source("resources/js/jqprint.js")
    TextResource jQPrintJs();

}
