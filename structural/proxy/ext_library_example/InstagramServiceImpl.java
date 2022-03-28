package structural.proxy.ext_library_example;

import java.util.HashMap;
import java.util.Map;

public class InstagramServiceImpl implements InstagramService {
  private final String INSTAGRAM_SERVER = "https://instagram.com";

  @Override
  public Map<String, UserPost> getPopularPost() {
    this.connectToInstagramServer(INSTAGRAM_SERVER);

    System.out.print("Get popular user posts... ");
    this.experienceNetworkLatency();
    Map<String, UserPost> userPostMap = new HashMap<>();
    userPostMap.put("post1User1", new UserPost("1", "1", "Post 1 from user1"));
    userPostMap.put("post2User1", new UserPost("2", "1", "Post 2 from user1"));
    userPostMap.put("post3User2", new UserPost("3", "2", "Post from user2"));
    userPostMap.put("post4User3", new UserPost("4", "3", "Post from user3"));
    System.out.println("Done.");

    return userPostMap;
  }

  @Override
  public UserPost getUserPost(String id) {
    this.connectToInstagramServer(INSTAGRAM_SERVER + "/" + id);

    System.out.print("Get user post... ");
    this.experienceNetworkLatency();
    UserPost userPost = new UserPost(id, "1", "Post " + id + " from user1");
    System.out.println("Done.");

    return userPost;
  }

  private void connectToInstagramServer(String instagramServer) {
    System.out.print("Connecting to " + instagramServer + "... ");
    this.experienceNetworkLatency();
    System.out.print("Connected!" + "\n");
  }

  // Simulate network latency (slow process)
  private int random(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }

  private void experienceNetworkLatency() {
    int randomLatency = this.random(5, 10);
    for (int i = 0; i < randomLatency; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
  // End of simulate network latency
}
