package Week8_OOPS;

public class batch {
    String batch_name;
//    Calender start_date;
    int cost;
    String topic;

    //constructor
    public batch(){//default constructor
        this.batch_name="Default Batch";
     //   this.start_date=""
        this.cost=69000;
        this.topic="JAVA";
    }
//custom constructor
    public batch(String name,int cost,String topic){
        this.batch_name=name;
        this.cost=cost;
        this.topic=topic;
    }


}
