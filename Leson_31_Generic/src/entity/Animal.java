package entity;

public class Animal {
   // тут не нужно extends BaseService
   // Animal это ваша сущность
   // BaseService это уже сервис который работает с сущностью
   // Это Animal и BaseService два разных класса которые работают друг с другом.
   // Animal это шаблон
   // BaseService это набор инструметнов для работы с сущностями
   public Long id;
   public String color;

   public Animal(Long id, String color) {
      this.id = id;
      this.color = color;
   }

   private final Animal[] arreyAnimal = new Animal[10];




}
