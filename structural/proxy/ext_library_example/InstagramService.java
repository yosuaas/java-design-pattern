package structural.proxy.ext_library_example;

import java.util.Map;

public interface InstagramService {
  Map<String, UserPost> getPopularPost();

  UserPost getUserPost(String id);
}
