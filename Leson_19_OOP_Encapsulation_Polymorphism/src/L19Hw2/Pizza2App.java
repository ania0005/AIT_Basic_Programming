package L19Hw2;

//Дано 6 участников конкурса по съеданию пиццы. Всего имеется 25 кусков пиццы. Участникам предлагается пицца по очереди,
// и каждый участник съедает 1 кусок пиццы за круг.
//Задача состоит в том, чтобы определить:
//Кто из участников победил в конкурсе, то есть кто съел последний кусок пиццы.
//Сколько кругов потребовалось для завершения конкурса, при условии, что все участники поедают по одному куску пиццы за круг.
//Какой из участников съел предпоследний кусок пиццы.
public class Pizza2App {
    public static void main(String[] args) {
        Participant[] participants = new Participant[6];
        participants[0] = new Participant(1, "Ivanov");
        participants[1] = new Participant(2, "Smirnov");
        participants[2] = new Participant(3, "Petrov");
        participants[3] = new Participant(4, "Zuev");
        participants[4] = new Participant(5, "Li");
        participants[5] = new Participant(6, "Chan");


        int circle = 0;
        int slaices = 25;
        int indexBeforEnd = 0;
        Participant currentParticipants = participants[0];
        while (slaices > 0) {
            for (int i = 0; i < participants.length && slaices > 0; i++) {
                currentParticipants = participants[i];
                indexBeforEnd = i - 1;
                slaices--;
            }
            circle++;
        }
        if(indexBeforEnd == -1){
            indexBeforEnd = participants.length - 1;}
        System.out.println("Winner participant is " + currentParticipants.getName());
        System.out.println(participants[indexBeforEnd].getName() + " Ate the penultimate pizza");
        System.out.println("Required to complete the competition " + (circle - 1) + " circles");
    }
}
