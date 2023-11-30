package entity;

public interface ICrudService <T, I>{
    // этот интефейс должен быть обобщенным (используйте тут generics). Т.е. тут нужно указать generics. Иначе вам
    // придется для каждой сущности создавать отдельный интерфейс

        // если бы вы использовали generic в этом интерфейсе, вы бы не были привязаны к типу
        // методы должны работать с сущностями. В задаче указаны две сущности Animal и BankCard
        // BaseService это конкретно сервис, который должен выполнить указанные операции в этом интерфесе над сущностями

    //T[] add(T[]T);

    // подсказка, тут должно add T[] add(T).

    BaseService add(BaseService T);

    T[] add(T[] T);



    T get(I id);

    // подсказка, тут должно быть T get(I id). где ICrudService <T,I> T - это сущность (BankCard или Animal), а I это тип id данной сущности (Long или Integer)
    T[] getAll();
    // подсказка, тут должно быть T[] getAll().

    T[] edit(I id);
    // подсказка, тут должно быть T[] edit(I id).

    boolean remove(I id);


    // подсказка, тут должно быть boolean remove(I id).

}


