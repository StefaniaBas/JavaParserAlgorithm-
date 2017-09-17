/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producttypes;

/**
 *
 * @author Skipper
 */
public class Sxolia {
    //Element productIcon = products.select("img[src]").get(i);
    /*System.out.println(i);
                System.out.println(productName.text());
                //System.out.println(productIcon.attr("abs:src"));
                System.out.println(productImage.attr("abs:src"));
                try {
                    productIcon2 = products.select("img[src]").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg], img[src$=buy-it-small.png], img[src*=ProductImages]").get(i);
                    System.out.println(productIcon2.attr("abs:src"));
                } catch(Exception eeeee) {
                    System.out.println("PPPPPPPPPPPPPPPPPPPPPP");
                }
                System.out.println(productCode.text());
                System.out.println(productAmesa.text());
                System.out.println(xroniaeguhshs.text());
                try {
                    metaforika = doc.select("span.priceOverrider").get(i).text();
                    System.out.println(metaforika);
                } catch(Exception e) {
                    System.out.println("MMMMMMMMMMMMMMMMMMMMM");
                }*/
                
                /*Elements dd = null;
                Elements dt = null;
                
                Elements rr = doc.select("div.productBlockContainer");
                Elements uu = rr.select("div.grid_11 small omega pdgt mrgt prdDescr");
                Elements yy = uu.select("div.grid_22 block smchrs");
                Elements ii = yy.select("dl.grid_22f");
                
                for(int t=0; t<5; t++) {
                    
                    try {
                        dd = ii.select("fixer");
                        dt = ii.select("fixer").not("dd[class=grid_21 bold pdgb grey pdg mrgt]");
                        for ( Element ooo : rr) {
                        
                        System.out.println( i + dd.text() + "\t"+"\t"  + dt.text());
                        }
                    } catch (Exception aaa) {
                        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    }*/
                
                //int y=0;
                /*Elements content = doc.select("div.productBlockContainer");
                
                    for (Element spec : content) {
                        Elements rr = spec.select("div.grid_11 small omega pdgt mrgt prdDescr").select("span.grid_22 block smchrs").select("div.grid_22f ");
                        //System.out.println(rr.text());
                        
                        Elements dl = spec.select("dl.grid_22f ");
                        Elements dts = dl.select("dt");
                        Elements dds = dl.select("dd").not("dd[class=grid_21 bold pdgb grey pdg mrgt]");

                        Iterator<Element> dtsIterator = dts.iterator();
                        Iterator<Element> ddsIterator = dds.iterator();
                        
                        System.out.println(i);
                        System.out.println(productName.text());
                        System.out.println(productIcon.attr("abs:src"));
                        System.out.println(productCode.text());
                        System.out.println(productAmesa.text());
                        System.out.println(xroniaeguhshs.text());
                        
                        
                        
                                //System.out.println(i);
                        
                       //System.out.println(y);
                       while (dtsIterator.hasNext() && ddsIterator.hasNext()) {
                           //y++;
                           //i++;
                            Element dt = (Element) dtsIterator.next();
                            Element dd = (Element) ddsIterator.next();
                            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                            String tt=("\t\t" + dt.text() +"\t\t" + dd.text());
                            
                            System.out.println(tt);    */
    
    
    //System.out.println(i);
                //for (Element el : dis) {
                    //System.out.println(el.text());
                    //INFO.add(dis.text());
                    //info1=el.text();
                    //info2=el.text();
                    //info3=el.text();
                    //info4=el.text();
                    //info5=el.text();
                    //info7=el.text();
                    //info8=el.text();
                    //info9=el.text();
               // }       
                //for(Object o : INFO){
                 //   System.out.println(o);
                //}
    
    
     //try {
                       // stok = doc.select("div.ProductListWrap").select("span.small").get(i);
                        //System.out.println(i);
                        //System.out.println(stok.nextSibling().toString());
                        
                   // }catch(Exception e) {
                    //    System.out.println("ssssssssssssssssssssssss");
                   // }
                    
                
                
                /*try {
                    katasthmata = products.select("div.Pickituplistbutton").select("img[src$=storeavailable.png]").get(i);
                    System.out.println(katasthmata.attr("abs:src"));
                } catch(Exception e) {
                    System.out.println("KKKKKKKKKKKKKKKKKKKKKKK");
                }*/
               
               /* try {
                    System.out.println(productIcon2.attr("abs:src"));
                } catch(Exception x) {
                    System.out.println("---------------------");
                }
                try {
                    System.out.println(katasthmata.attr("abs:src"));
                } catch(Exception x) {
                    System.out.println("++++++++++++++++++++++++++++");
                }*/
    
        /*public void connect() throws IOException {
        int counterLaptop = 1;
        int counterMonitors = 1;
        int counterSmartphones = 1;
        int counterMobiles = 1;
            if(LowerKeyword.equals("laptops")) {
                while(counterLaptop<=4) {
                    Document doc= Jsoup.connect("http://www.plaisio.gr/laptop-tablet/laptop-notebook/laptop.htm?page=" + counterLaptop).userAgent("Mozilla").timeout(3000).get();
                    Elements laptopName = doc.select("div.ProductListWrap").select("h2,b,img[src],dd,span.priceOverrider,div.PricesWrap,a.priceOverrider").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg]");
                    counterLaptop++;
                    for(Element link : laptopName){
                        System.out.print(link.text());
                        System.out.println(link.attr("abs:src"));
                    }
                }
            }else if (LowerKeyword.equals("monitors")) {
                while(counterMonitors<=11) {
                    Document doc= Jsoup.connect("http://www.plaisio.gr/thleoraseis/tv/tileoraseis.htm?page=" + counterMonitors).userAgent("Mozilla").get();
                    Elements laptopName = doc.select("div.ProductListWrap").select("h2,b,img[src],dd,span.priceOverrider,div.PricesWrap,a.priceOverrider").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg]");
                    counterMonitors++;
                    for(Element link : laptopName){
                        System.out.print(link.text());
                        System.out.println(link.attr("abs:src"));
                    }
                }
            }else if (LowerKeyword.equals("smartphones")) {
                while(counterMonitors<=12) {
                    Document doc= Jsoup.connect("http://www.plaisio.gr/kinita-smartphones/smartphones/smartphone.htm?page=" + counterSmartphones).userAgent("Mozilla").get();
                    Elements laptopName = doc.select("div.ProductListWrap").select("h2,b,img[src],dd,span.priceOverrider,div.PricesWrap,a.priceOverrider").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg]");
                    counterSmartphones++;
                    for(Element link : laptopName){
                        System.out.print(link.text());
                        System.out.println(link.attr("abs:src"));
                    }
                }
            }else {
                while(counterMobiles<=11) {
                    Document doc= Jsoup.connect("http://www.plaisio.gr/kinita-smartphones/kinita/tilefwna.htm?page=" + counterMobiles).userAgent("Mozilla").get();
                    Elements laptopName = doc.select("div.ProductListWrap").select("h2,b,img[src],dd,span.priceOverrider,div.PricesWrap,a.priceOverrider").not("img[src$=storeavailable.png], img[src$=fako.jpg], img[src$=sign_stores_list.jpg]");
                    counterMobiles++;
                    for(Element link : laptopName){
                        System.out.print(link.text());
                        System.out.println(link.attr("abs:src"));
                    }
                }
            }
        
        }
    */
    /*ssss
        //Elements moreInfoSize = docMore.select("dl.grid_22f ").select("div");
    //try {
             //   Element head = moreInfo.select("h2").get(i);
              //  System.out.println(head.text());
           // }catch(Exception o) {  
            //}//Elements dts = moreInfo.select("dt");
        //Elements dds = moreInfo.select("dd").not("dd[class=grid_21 bold pdgb grey pdg mrgt]");*/
}
