package entity;

import java.util.Arrays;

public class  BaseService<I> implements ICrudService{

    private I id;

    public BaseService(I id) {
        this.id = id;
    }

    // вот тут нужно было использовать generic для ICrudService
// для разных реализаций разные типы
// к примеру для BankService было бы так: BankService implements ICrudService<BankCard, Long>, если у
// BankCard тип id является Long
// или к примеру для BankService было бы так, если у BankCard тип id является Integer: BankService implements
// ICrudService<BankCard, Integer>
    // сервис для Animal выглядел бы тогда так: AnimalService implements ICrudService<Animal, Long>, если у Animal тип
    // id является Long
// или к примеру для Animal было бы так, если у Animal тип id является Integer: BankService implements
// ICrudService<Animal, Integer>
        BaseService [] baseService = new BaseService[10];






    @Override
    public BaseService add(BaseService T) {
        for (int i = 0; i < baseService.length; i++) {
            if (baseService[i] == null) {
                baseService[i] = T;
                System.out.println("Сервис добавлен " + baseService[i].toString());
                return baseService[i];
            }
        }
        return null;
    }

    @Override
    public Object[] add(Object[] T) {
        return new Object[0];
    }

    @Override
    public Object get(Object id) {
        return null;
    }

    public BaseService[] getAll() {
        int counter = 0;
        for (int i = 0; i < baseService.length; i++) {
            if (baseService[i] != null) {
                counter++;
            }
        }
        BaseService[] currentbaseService = new BaseService[counter];
        if(counter == 0){return new BaseService[0];}
        for (int i = 0; i < baseService.length; i++) {
            if (baseService[i] != null) {
                currentbaseService[i] = baseService[i];
            }
        }
        return currentbaseService;
  }

    @Override
    public Object[] edit(Object id) {
        return new Object[0];
    }

    @Override
    public boolean remove(Object id) {
        return false;
    }

//    @Override
//    public int hashCode() {
//        I result = id;
//        result = 31 * result + Arrays.hashCode(baseService);
//        return result;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public BaseService[] getBaseService() {
        return baseService;
    }

    public void setBaseService(BaseService[] baseService) {
        this.baseService = baseService;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
//    @Override
//    public T[] add(T[] T) {
//        return null;
//    }
//
//    @Override
//    public T get(I id) {
//        return null;
//    }
//
//    @Override
//    public BaseService[] getAll() {
//        int counter = 0;
//        for (int i = 0; i < baseService.length; i++) {
//            if (baseService[i] != null) {
//                counter++;
//            }
//        }
//        BaseService[] currentbaseService = new BaseService[counter];
//        if(counter == 0){return new BaseService[0];}
//        for (int i = 0; i < baseService.length; i++) {
//            if (baseService[i] != null) {
//                baseService[i] = baseService[i];
//            }
//        }
//        return currentbaseService;
//    }
//
//    @Override
//    public T[] edit(I id) {
//        return null;
//    }
//
//
//    public BaseService edit(Object id) {                //не совсем понимаю что должен делать метод.
//        for (int i = 0; i < baseService.length; i++) {   // найти по  id и редактировать...но как именно?
//            if (baseService[i].getId() == id) {            // Я решила просто в конце id дописывать String "K" ))
//                baseService[i].setId(baseService[i].getId() + "k");
//                return baseService[i];
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean remove(Object id) {
//        for (int i = 0; i < baseService.length; i++) {
//            if (baseService[i].getId() == id) {
//                baseService[i] = null;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public T getId() {
//        return id;
//    }
//
//    public void setId(T id) {
//        this.id = id;
//    }
}
