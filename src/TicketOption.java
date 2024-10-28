public enum TicketOption {
    INTEIRA(32),
    MEIA(16);

    private double price;

    TicketOption(int price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
