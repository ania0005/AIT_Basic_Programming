package Forum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ForumImpl implements Forum {

    private Post[] posts;
    private int size;

    public ForumImpl(int capacity) {
        this.posts = new Post[capacity];
    }

    @Override
    public boolean addPost(Post post) {
        if (post == null || getPostById(post.getPostId()) == null) {
            return false;
        }
        if(size == posts.length){
            int newSize = posts.length + (posts.length / 2);
            posts = Arrays.copyOf(posts, newSize);
        }
        ;
        for (int i = 0; i < size; i++) {
            if (posts[i].compareTo(post) > 0) {
                System.arraycopy(posts, i, posts, i + 1, size - i);
                posts[i] = post;
                size++;
                return true;
            }
        }
        posts[size++] = post;
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                System.arraycopy(posts, i + 1, posts, i, size - i - 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String newContent) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                posts[i].setContent(newContent);
                return true;
            }
        }
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return posts[i];
            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        Post[] arrayPostsByAuthor = new Post[0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (posts[i].getAuthor() == author) {
                    arrayPostsByAuthor = Arrays.copyOf(arrayPostsByAuthor, arrayPostsByAuthor.length + 1);
                    arrayPostsByAuthor[j] = posts[i];
                }
            }
        }
        return arrayPostsByAuthor;
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        Post[] arrayPostsBetweenDate = new Post[0];
        LocalDateTime dateFromPlusTime = dateFrom.atStartOfDay();
        LocalDateTime dateToPlusTime = dateTo.atStartOfDay();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (posts[i].getAuthor() == author) {
                    if (posts[i].getDate().isAfter(dateFromPlusTime) && posts[i].getDate().isBefore(dateToPlusTime)) {
                        arrayPostsBetweenDate = Arrays.copyOf(arrayPostsBetweenDate, arrayPostsBetweenDate.length + 1);
                        arrayPostsBetweenDate[j] = posts[i];
                    }
                }
            }
        }
        return arrayPostsBetweenDate;
    }

    @Override
    public int size() {
        return size;
    }
}


