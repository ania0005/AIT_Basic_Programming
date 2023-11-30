package Forum;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post {

    private int postId;
    private String title;
    private String author;
    private String content;
    private LocalDateTime date;
    private int likes;

        public Post(int postId, String author, String title, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;  // вернем false, когда сравниваем с null или с объектом другого класса
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getPostId() {
        return postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int compareTo(Post other) {
       int forumCompare = Integer.compare(this.getPostId(), other.postId);
        return forumCompare;
    }
}
