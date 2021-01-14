public class Father extends Personal {
    double rice;

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

    public void riceUp() {
        System.out.println("Muc luong: "+rice);
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.name = "Thao";
        father.age = 32;
        father.rice = 1000;

        father.setName("Thien Tai Nguoi Viet Nam");
        System.out.println(father.name);
        System.out.println(father.age);

        father.riceUp();
    }
}
