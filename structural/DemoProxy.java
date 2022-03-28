package structural;

import structural.proxy.InstagramCacheProxy;
import structural.proxy.ext_library_example.InstagramService;
import structural.proxy.ext_library_example.InstagramServiceImpl;

public class DemoProxy {
  public static void main(String[] args) {

    // Without proxy
    System.out.println("================== Without Proxy ==================");
    long withoutProxyStartTime = System.currentTimeMillis();
    InstagramService instagramService = new InstagramServiceImpl();
    instagramService.getPopularPost(); // 1
    instagramService.getPopularPost(); // 2
    instagramService.getPopularPost(); // 3
    instagramService.getUserPost("1"); // 4
    instagramService.getUserPost("2"); // 5
    instagramService.getUserPost("1"); // 6
    instagramService.getUserPost("1"); // 7
    long withoutProxyEstimatedTime = System.currentTimeMillis() - withoutProxyStartTime;

    // With proxy
    System.out.println("================== With Proxy ==================");
    long withProxyStartTime = System.currentTimeMillis();
    InstagramCacheProxy instagramCacheProxy = new InstagramCacheProxy();
    instagramCacheProxy.getPopularPost(); // 1
    instagramCacheProxy.getPopularPost(); // 2
    instagramCacheProxy.getPopularPost(); // 3
    instagramCacheProxy.getUserPost("1"); // 4
    instagramCacheProxy.getUserPost("2"); // 5
    instagramCacheProxy.getUserPost("1"); // 6
    instagramCacheProxy.getUserPost("1"); // 7
    long withProxyEstimatedTime = System.currentTimeMillis() - withProxyStartTime;

    System.out.println("================== Result ==================");
    System.out.println("Time elapsed without proxy: " + withoutProxyEstimatedTime + " ms.");
    System.out.println("Time elapsed with proxy: " + withProxyEstimatedTime + "ms.");
    Double speedUpPercentage =
        ((double) (withoutProxyEstimatedTime - withProxyEstimatedTime) / withoutProxyEstimatedTime)
            * 100;
    System.out.println("Speed up " + String.format("%.2f", speedUpPercentage) + "%");
  }
}
