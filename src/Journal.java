class Journal {
    private double price;
    private int pageCount;
    private int issueCount;
    private int stockLevel;
    private String editor;
    private String frequency;

    public Journal(double price, int pageCount, int issueCount, int stockLevel, String editor, String frequency) {
        this.price = price;
        this.pageCount = pageCount;
        this.issueCount = issueCount;
        this.stockLevel = stockLevel;
        this.editor = editor;
        this.frequency = frequency;
    }

    public void displayProductInformation() {
        System.out.println("Price: $" + price);
        System.out.println("Page count: " + pageCount);
        System.out.println("Issue count: " + issueCount);
        System.out.println("Stock level: " + stockLevel);
        System.out.println("Editor: " + editor);
        System.out.println("Frequency: " + frequency);
    }

    @Override
    public String toString() {
        return "Journal [price=" + price + ", pageCount=" + pageCount + ", issueCount=" + issueCount +
                ", stockLevel=" + stockLevel + ", editor=" + editor + ", frequency=" + frequency + "]";
    }
}