package Week8;

public class Cat {
    String name;
    String color;
    String breed;

    public Cat(){//default
        this.name="Name";
        this.color="Black";
        this.breed="Billi";
    }

    public Cat(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }

    void CallCat(){
        System.out.println("Bhagoo" + " " + name);
    }
}


