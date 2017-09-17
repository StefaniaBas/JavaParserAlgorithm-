package Crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import producttypes.Laptops;
import producttypes.Mobiles;
import producttypes.Monitors;
import producttypes.Smartphones;
/**
 *
 * @author Skipper
 */
public class Wrapper {
    private String keyword;
    private String LowerKeyword;
    private String URL;
    ArrayList List = new ArrayList();
    ArrayList MoreInfo = new ArrayList();
   // List<String> INFO = new ArrayList<String>();
    private String pp;
    private String keyword2;
    
    public void readChoice() throws IOException {
        do{
            System.out.println("Please give a keyword: ");
            Scanner scannerGame = new Scanner(System.in);
            keyword = scannerGame.nextLine();
            LowerKeyword = keyword.toLowerCase();
        }while(!"monitors".equals(LowerKeyword) && !"smartphones".equals(LowerKeyword) && !"laptops".equals(LowerKeyword) && !"mobiles".equals(LowerKeyword));
            if (null != LowerKeyword)switch (LowerKeyword) {
            case "monitors":
                URL="thleoraseis/tv/tileoraseis.htm?page=";
                break;
            case "smartphones":
                URL="kinita-smartphones/smartphones/smartphone.htm?page=";
                break;
            case "laptops":
                URL="laptop-tablet/laptop-notebook/laptop.htm?page=";
                break;
            default:
                URL="kinita-smartphones/kinita/tilefwna.htm?page=";
                break;
        }
        connect(URL,LowerKeyword);
        int p=0;
        moreConnect(MoreInfo);
       
  }  
    
    public void connect(String URL,String name) throws IOException {
        
        int counter = 1;
        int numberOfPages=1;
        while(counter<=numberOfPages) {
            Document doc= Jsoup.connect("http://www.plaisio.gr/" + URL + counter).userAgent("Chrome").timeout(30000).get();
            Elements productsSize = doc.select("div.ProductListWrap").select("h2");
            Elements products = doc.select("div.ProductListWrap");
            doc.select("br").remove();
            doc.removeClass("vrlarge");
            
            String numbers = doc.select("div.paginationNumbers").select("a[href]").last().text();
            System.out.println(numbers);
            if(numbers.matches(".*\\d.*")){
                System.out.println("y");
            } else{
                System.out.println("n");
            }
            numberOfPages=Integer.parseInt(numbers);
            
            int i;
            for (i=0;i<productsSize.size();i++) {
                
                String metaforika = null ;
                Element productIcon2;
                Element katasthmata = null;
                Element timh = null;
                Element stok;
                
                
                
                Element moreInfo = products.select("div.productBlockTitle").select("a[href]").get(i);
                
                String nextURL = moreInfo.attr("href");
                MoreInfo.add(nextURL);
                
                Element productName = products.select("h2").get(i);
                Element productImage = products.select("img[src]").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg], img[src$=buy-it-small.png], img[src$=LstMn.png], img[src$=LstFr.png], img[src$=LstWo.png]").get(i);
                Element productCode = products.select("div.productIDWrap").get(i);
                Element productAmesa = products.select("div.litAvailabilityWrap").get(i);
                Element xroniaeguhshs = products.select("div.warrantyHolderWrap").get(i);
                Elements info = products.select("dl.grid_22f ").not("dd[class=grid_21 bold pdgb grey pdg mrgt]").get(i).getElementsByClass("fixer");
                try {
                    timh = doc.select("div.grid_5.omega.center.green.mrgt.prdPrices").get(i);
                    String print = timh.nextSibling().toString() + timh.text();
                }catch(Exception e) {      
                }
                try {
                    metaforika = doc.select("span.priceOverrider").get(i).text();  
                }catch(Exception e) {       
                }
                
                 if ( "laptops".equals(name)) {
                    Laptops la = new Laptops( productName.text(),productCode.text(),productAmesa.text(),xroniaeguhshs.text(),metaforika,productImage.attr("abs:src"), timh.text(), info.text());
                    List.add(la.getName()+la.getCodeProduct()+la.getAvailability()+la.getGuarantee()+la.getTransportation()+la.getImageProduct()+la.getPrice()+info.text());
                } else if ("monitors".equals(name)) {
                    Monitors mo = new Monitors( productName.text(),productCode.text(),productAmesa.text(),xroniaeguhshs.text(),metaforika,productImage.attr("abs:src"), timh.text(), info.text());
                    List.add(mo.getName()+mo.getCodeProduct()+mo.getAvailability()+mo.getGuarantee()+mo.getTransportation()+mo.getImageProduct()+mo.getPrice()+info.text());
                } else if ("smartphones".equals(name)) {
                    Smartphones la = new Smartphones( productName.text(),productCode.text(),productAmesa.text(),xroniaeguhshs.text(),metaforika,productImage.attr("abs:src"), timh.text(), info.text());
                    List.add(la.getName()+la.getCodeProduct()+la.getAvailability()+la.getGuarantee()+la.getTransportation()+la.getImageProduct()+la.getPrice()+info.text());
                } else {
                    Mobiles la1 = new Mobiles( productName.text(),productCode.text(),productAmesa.text(),xroniaeguhshs.text(),metaforika,productImage.attr("abs:src"), timh.text(), info.text());
                    List.add(la1.getName()+la1.getCodeProduct()+la1.getAvailability()+la1.getGuarantee()+la1.getTransportation()+la1.getImageProduct()+la1.getPrice()+info.text());
                }
            }
            counter++;
        }
        for(Object o : List){
                System.out.println(o);
        }
        
    }



    public void moreConnect(ArrayList url) throws IOException {
        int p = 0;
        while ( p < url.size()) {
            Document docMore= Jsoup.connect((String)url.get(p)).userAgent("Chrome").timeout(30000).get();
            docMore.removeClass("grid_21 bold pdgb grey pdg mrgt");
            System.out.println("connected");
            Elements moreInfo = docMore.select("div.tab_container").select("dl.grid_22f ").select("div.fixer");  
            for (int i=0;i<moreInfo.size();i++) {
                Element dt = moreInfo.select("dt").get(i);
                Element dd = moreInfo.select("dd").get(i);
                System.out.println(dt.text() + ":" +"\t\t"+ dd.text());
            }
            p++;
        }
    }
    
}

    
    

