package structural.proxy;

import java.util.HashMap;
import java.util.Map;
import structural.proxy.ext_library_example.InstagramService;
import structural.proxy.ext_library_example.InstagramServiceImpl;
import structural.proxy.ext_library_example.UserPost;

public class InstagramCacheProxy implements InstagramService {
  private InstagramService instagramService;
  private Map<String, UserPost> cachePopularPosts = new HashMap<>();
  private Map<String, UserPost> cacheUserPost = new HashMap<>();

  public InstagramCacheProxy() {
    this.instagramService = new InstagramServiceImpl();
  }

  @Override
  public Map<String, UserPost> getPopularPost() {
    if (cachePopularPosts.isEmpty()) {
      cachePopularPosts = instagramService.getPopularPost();
    } else {
      System.out.println("Get popular posts from cache.");
    }
    return cachePopularPosts;
  }

  @Override
  public UserPost getUserPost(String id) {
    UserPost userPost = cacheUserPost.get(id);
    if (userPost == null) {
      userPost = instagramService.getUserPost(id);
      cacheUserPost.put(id, userPost);
    } else {
      System.out.println("Get user post from cache.");
    }
    return userPost;
  }

  public void clearCache() {
    cachePopularPosts.clear();
    cacheUserPost.clear();
  }
}
