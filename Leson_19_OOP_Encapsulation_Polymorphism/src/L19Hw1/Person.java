package L19Hw1;


public class Person {
    private int id;
    private String name;
    private int pizzaslais;
    private int winningPlace;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(int id, String name,int pizzaslais ) {
        this.id = id;
        this.name = name;
        this.pizzaslais  = pizzaslais;
    }
    public Person(int id, String name,int pizzaslais,int winningPlace) {
        this.id = id;
        this.name = name;
        this.pizzaslais  = pizzaslais;
    }

    public void displayParticipants(){
        System.out.println(this.name);
    }
    public void display(){
        System.out.println(this.name+ "  съел "+this.pizzaslais);
    }

    public int getWinningPlace() {
        return winningPlace;
    }

    public void setWinningPlace(int winningPlace) {
        this.winningPlace = winningPlace;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //  public void eatslais() {
//      this.pizzaslais++;
//  }

    public void setPizzaslais(int pizzaslais) {
        this.pizzaslais = pizzaslais;
    }

    public int getPizzaslais() {
        return pizzaslais;
    }
}

