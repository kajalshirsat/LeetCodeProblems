package org.structural;

import org.structural.facadeHelper.VideoConversionFacade;

import java.io.File;

public class Facade {
    /*
    Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

    Pros:
    You can isolate your code from the complexity of a subsystem.
    Cons:
    A facade can become a god object coupled to all classes of an app.

 Implementation :
 VideoConversionFacade - hides complexity of all other classes we are using


 Usage examples: The Facade pattern is commonly used in apps written in Java. It’s especially handy when working with complex libraries and APIs.
    Here are some Facade examples in core Java libs:
    javax.faces.context.FacesContext uses LifeCycle, ViewHandler, NavigationHandler classes under the hood, but most clients aren’t aware of that.
    javax.faces.context.ExternalContext uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse and others inside.

Identification: Facade can be recognized in a class that has a simple interface, but delegates most of the work to other classes. Usually, facades manage the full life cycle of objects they use.

     */

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }

}
