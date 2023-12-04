package repo.impl;

import model.*;
import repo.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    @Override
    public User addStudentToGroup(Student student, Group group) {
        boolean contains = users.contains(student);
        if (contains) {
            student.setGroup(group);
            group.getStudentList().add(student);
            return student;
        } else {
            throw new IllegalArgumentException("Student " + student + " not found");
        }
    }

    @Override
    public User findById(int userId) {
        return users.stream()
                .filter(x -> x.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return  users.stream()
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher) x)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> findAllUsers() {
        return users.stream()
                .filter(x -> x instanceof Student)
                .map(x -> (Student) x)
                .collect(Collectors.toList());
    }

    @Override
    public Teacher findTeacherByName(String name) {
        return users.stream()
                .filter(user -> user instanceof Teacher)            // фильтруем только учителей
                .map(user -> (Teacher) user)                        // приводим User к Teacher
                .filter(x -> x.getName().equalsIgnoreCase(name))    // фильтруем по условию
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student findStudentByName(String name) {
        return users.stream()
                .filter(user -> user instanceof Student)            // фильтруем только студентов
                .map(user -> (Student) user)                        // приводим User к Student
                .filter(x -> x.getName().equalsIgnoreCase(name))    // фильтруем по условию
                .findFirst()
                .orElse(null);
    }
}
