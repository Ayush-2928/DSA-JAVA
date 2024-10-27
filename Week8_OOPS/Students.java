package Week8_OOPS;

public class Students {
    int roll;
    String name;
    batch enrolled_batch;

    public Students(){//default constructor
     
        this.roll=3311;
        this.name="ABC";
        this.enrolled_batch=new batch();
    }

    public Students(int roll,String name,String batch_name, int batch_fee,String batch_topic){
        this.roll=roll;
        this.name=name;
       enrolled_batch=new batch(batch_name, batch_fee, batch_topic);
}

}
