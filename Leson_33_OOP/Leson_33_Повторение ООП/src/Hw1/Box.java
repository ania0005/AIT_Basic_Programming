package Hw1;

public class Box<T> implements iCRUDRepositories {

        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getContent() {
            return this.value;
        }


    @Override
    public boolean add(Box box) {
        return false;
    }

    @Override
    public boolean removeBox(Box id) {
        return false;
    }

    @Override
    public boolean find(Box id) {
        return false;
    }
}
