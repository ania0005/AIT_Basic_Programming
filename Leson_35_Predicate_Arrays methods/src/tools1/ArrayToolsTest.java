package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tools.ArrayTools;
import tools.Id;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
class ArrayToolsTest {


    class Car implements Id {
        private int id;

        public Car(int id) {
            this.id = id;
        }

        @Override
        public long getId() {
            return this.id;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Car car = (Car) object;

            return id == car.id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    '}';
        }
    }

    class Dog implements Id {
        private long id;

        public Dog(long id) {
            this.id = id;
        }

        @Override
        public long getId() {
            return this.id;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Dog dog = (Dog) object;

            return id == dog.id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "id=" + id +
                    '}';
        }
    }

    @Nested
    @DisplayName("Tests search entity by id")
    class TestSearchById {
        @Test
        public void test_searchById_findEntityCar_entityFound() {
            Car entity1 = new Car(1);
            Car entity2 = new Car(2);
            Car[] cars = {entity1, entity2};

            Car resultFindCarById1 = ArrayTools.searchById(cars, 1);

            assertEquals(entity1, resultFindCarById1);
        }

        @Test
        public void test_searchById_findEntityDog_entityFound () {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            Dog resultFindCarById1 = ArrayTools.searchById(dogs, 1);

            assertEquals(entity1, resultFindCarById1);
        }

        @Test
        public void test_searchById_findEntityDog_entityNotFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            Dog resultFindCarById1 = ArrayTools.searchById(dogs, 10);

            assertNull(resultFindCarById1);
        }

        @Test
        public void test_searchById_findEntityDogWhenArrayEmpty_entityNotFound() {
            Dog[] dogs = new Dog[0];

            Dog resultFindCarById1 = ArrayTools.searchById(dogs, 10);

            assertNull(resultFindCarById1);
        }
    }

    @Nested
    @DisplayName("Tests search entity by entity")
    class TestSearchByEntity {
        @Test
        public void test_search_findEntityCar_entityFound() {
            Car entity1 = new Car(1);
            Car entity2 = new Car(2);
            Car[] cars = {entity1, entity2};

            Car resultFindCarById1 = ArrayTools.search(cars, entity1);

            assertEquals(entity1, resultFindCarById1);
        }

        @Test
        public void test_search_findEntityDog_entityFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            Dog resultFindCarById1 = ArrayTools.search(dogs, entity1);

            assertEquals(entity1, resultFindCarById1);
        }

        @Test
        public void test_search_findEntityDog_entityNotFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);
            Dog entity3 = new Dog(3);

            Dog[] dogs = {entity1, entity2};

            Dog resultFindCarById1 = ArrayTools.search(dogs, entity3);

            assertNull(resultFindCarById1);
        }

        @Test
        public void test_search_findEntityDogWhenArrayEmpty_entityNotFound() {
            Dog entity1 = new Dog(1);

            Dog[] dogs = new Dog[0];

            Dog resultFindCarById1 = ArrayTools.search(dogs, entity1);

            assertNull(resultFindCarById1);
        }
    }

    @Nested
    @DisplayName("Tests remove entity by id")
    class TestRemoveById {
        @Test
        public void test_removeById_removeCar_entityFound() {
            Car entity1 = new Car(1);
            Car entity2 = new Car(2);
            Car[] cars = {entity1, entity2};

            boolean resultRemovedCarById1 = ArrayTools.removeById(cars, 1);

            assertTrue(resultRemovedCarById1);
        }

        @Test
        public void test_removeById_removeDog_entityFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            boolean resultRemovedDogById1 = ArrayTools.removeById(dogs, 1);

            assertTrue(resultRemovedDogById1);

        }

        @Test
        public void test_removeById_removeDog_entityNotFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            boolean resultRemoveDogById1 = ArrayTools.removeById(dogs, 10);

            assertFalse(resultRemoveDogById1);
        }

        @Test
        public void test_removeById_removeDogWhenArrayEmpty_entityNotFound() {
            Dog entity1 = new Dog(1);

            Dog[] dogs = new Dog[0];

            boolean resultRemoveDogById1 = ArrayTools.removeById(dogs, 1);

            assertFalse(resultRemoveDogById1);

        }
    }

    @Nested
    @DisplayName("Tests remove entity by entity")
    class TestRemove {
        @Test
        public void test_remove_removeCar_entityFound() {
            Car entity1 = new Car(1);
            Car entity2 = new Car(2);
            Car[] cars = {entity1, entity2};

            boolean resultRemovedCarById1 = ArrayTools.remove(cars, entity1);

            assertTrue(resultRemovedCarById1);
        }

        @Test
        public void test_remove_removeDog_entityFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);

            Dog[] dogs = {entity1, entity2};

            boolean resultRemovedDogById1 = ArrayTools.remove(dogs, entity1);

            assertTrue(resultRemovedDogById1);

        }

        @Test
        public void test_remove_removeDog_entityNotFound() {
            Dog entity1 = new Dog(1);
            Dog entity2 = new Dog(2);
            Dog entity3 = new Dog(3);

            Dog[] dogs = {entity1, entity2};

            boolean resultRemoveDogById1 = ArrayTools.remove(dogs, entity3);

            assertFalse(resultRemoveDogById1);
        }

        @Test
        public void test_remove_removeDogWhenArrayEmpty_entityNotFound() {
            Dog entity1 = new Dog(1);

            Dog[] dogs = new Dog[0];

            boolean resultRemoveDogById1 = ArrayTools.remove(dogs, entity1);

            assertFalse(resultRemoveDogById1);

        }
    }
}
