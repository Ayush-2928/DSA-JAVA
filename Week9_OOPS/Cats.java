package Week9_OOPS;

public class Cats extends Animals {//inheritance
   private String name ="NA";//private name means it cannot be used by other classes
    String voice="NA";
    String color="NA";
    //default constructor
    public Cats(){}
    //parameterised constructor

    public Cats(
        String name,
        String voice,
        String color,
        int legs,
        boolean tail
    ){
        this.name=name;
        this.color=color;
        this.voice=voice;
        this.legs=legs;
        this.tail=tail;
    }

    }


