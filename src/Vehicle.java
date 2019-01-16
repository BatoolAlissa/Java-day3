public class Vehicle {
    String name="batool";
    public int getSeats() {
        return seats;
    }

    public void price(int price){
        System.out.println("my price"+price+10);
    };


    public void setSeats(int seats) {
        this.seats = seats;
    }

    private int seats;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;



}
