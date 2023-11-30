package Hw1;

public interface iCRUDRepositories {
    boolean add(Box box);
    boolean removeBox(Box id);
    boolean find(Box id);
}
