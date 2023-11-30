package L16Hw1;

public class User {

        private String name;
        private int age;
        private String email;


        public User(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public void setAge(String name) {
            this.age = age;
        }
        public int getAge() {
            return this.age;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return this.email;
        }
    }
