package org.structural;

import org.structural.proxyHelper.ThirdPartyYouTubeClass;
import org.structural.proxyHelper.YouTubeCacheProxy;
import org.structural.proxyHelper.YouTubeDownloader;

public class Proxy {
    /*
    Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

     Pros:
     You can control the service object without clients knowing about it.
     You can manage the lifecycle of the service object when clients don’t care about it.
     The proxy works even if the service object isn’t ready or is not available.
     Open/Closed Principle. You can introduce new proxies without changing the service or clients.

    Cons:
    The code may become more complicated since you need to introduce a lot of new classes.
    The response from the service might get delayed.

 Impl:
 ThirdPartyYouTubeLib : an interface
 ThirdPartyYouTubeClass : implements ThirdPartyYouTubeLib, Actual YouTube Lib with multiple methods
 Video: a object
 YouTubeCacheProxy: implements ThirdPartyYouTubeLib, has an cache that maintains popular video, if video not present in cache then get it from actual class
 YouTubeDownloader: downloads videos



Usage examples: While the Proxy pattern isn’t a frequent guest in most Java applications, it’s still very handy in some special cases.
It’s irreplaceable when you want to add some additional behaviors to an object of some existing class without changing the client code.
Some examples of proxies in standard Java libraries:
java.lang.reflect.Proxy
java.rmi.*
javax.ejb.EJB (see comments)
javax.inject.Inject (see comments)
javax.persistence.PersistenceContext

Identification: Proxies delegate all of the real work to some other object. Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.

     */

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
