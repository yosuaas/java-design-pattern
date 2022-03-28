package structural.proxy.ext_library_example;

public class UserPost {
  private String id;
  private String userId;
  private String caption;
  private String data;

  public UserPost(String id, String userId, String caption) {
    this.id = id;
    this.userId = userId;
    this.caption = caption;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
