package producttypes;

/**
 *Κίτσιος Δημοσθένης 21328
 *Καλεσιάκης Γιώργος 21319
 *Μπασούκου Στεφανία 21343
 */
public class Product {
    protected String name;
    protected String codeProduct;
    protected String availability;
    protected String guarantee;
    protected String transportation;
    protected String imageProduct;
    protected String price;
    protected String info;
    //protected String imageOffers;
    //protected String extraInfo;
    //protected String eikona2h;
    //protected boolean magazia;
    
    
    //eidikh anazhtsh//
    protected String brandSearch;
    protected float startInchesSearch;
    protected float endInchesSearch;
    protected int startPriceRangeSearch;
    protected int endPriceRangeSearch;

    public Product(String name, String codeProduct, String availability, String guarantee, String transportation, String imageProduct, String price, String info) {
        this.name = name;
        this.codeProduct = codeProduct;
        this.availability = availability;
        this.guarantee = guarantee;
        this.transportation = transportation;
        this.imageProduct = imageProduct;
        this.price = price;
        this.info = info;

    }

    public String getName() {
        return name;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getAvailability() {
        return availability;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public String getTransportation() {
        return transportation;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public String getPrice() {
        return price;
    }

    

    

    



}
