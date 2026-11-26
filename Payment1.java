interface Payment1 {
    void pay();   
}
class UPI1 implements Payment1 {
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
class Main3 {
    public static void main(String[] args) {
        UPI1 upi = new UPI1();
        upi.pay();
    }
}
