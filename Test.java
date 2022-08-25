
import java.util.Random;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int radius=rand.nextInt(10);
		int SquareZ=rand.nextInt(10);
		int RecX =rand.nextInt(10);
		int RecY =rand.nextInt(10);
		int cevapc,cevaps,cevapr;
		
		Circle c = new Circle(radius);
		Square s = new Square(SquareZ);
		Rectangle r = new Rectangle(RecX,RecY);

		
		
		    System.out.println("Islem Seciniz:");
	        String islemler ="1.Daire\n"
		                +"2.Kare\n"
                       + "3.Dikdortgen\n" ;
	        System.out.println(islemler);
            String islem = in.nextLine();

             if (islem.equals("1")) {
   			     System.out.println("Yaricap: " + radius);
                 String cal = "1.Alan" 
   			                + "\n"
                		    + "2.Cevre";
                 System.out.println(cal);
                 System.out.println("Seciniz:");
                 String i = in.nextLine();
                 
                 if(i.equals("1")) {
                	 System.out.println("Cevabiniz:");
       			     cevapc = in.nextInt();
       			     if(cevapc == c.area()) {
       			    	 System.out.println("Tebrikler");
       			     }
       			     if(cevapc != c.area()) {
       			    	 for(int sf=0;sf<3;sf++) {
       			    		System.out.println("Tekrar deneyiniz");
       			    		System.out.println("Cevabiniz:");
              			    cevapc = in.nextInt(); 
              			     if(cevapc == c.area()) {
         			    	 System.out.println("Tebrikler");
         			          }
              			      if(sf==2) {
              			    	System.out.println("Sonuc= "+c.area());
              			      }
       			    		}
              			 }
                 }
                 
                 if(i.equals("2")) {
                	 System.out.println("Cevabiniz:");
       			     cevapc = in.nextInt();
       			     if(cevapc == c.circum()) {
       			    	 System.out.println("Tebrikler");
       			     }
       			     if(cevapc != c.circum()) {
       			    	 for(int sf=0;sf<3;sf++) {
       			    		System.out.println("Tekrar deneyiniz");
       			    		System.out.println("Cevabiniz:");
              			    cevapc = in.nextInt(); 
              			     if(cevapc == c.circum()) {
         			    	 System.out.println("Tebrikler");
         			          }
              			      if(sf==2) {
              			    	System.out.println("Sonuc= "+c.circum());
              			      }
       			    		}
              			 }
                 }
                 }
  
                	
                 if (islem.equals("2")) {
       			     System.out.println("Kenar: " +SquareZ+ " cm");
                     String cal1 = "1.Alan"
                    		       +"\n" 
                    		    + "2.Cevre";
                     System.out.println(cal1);
                     System.out.println("Seciniz:");
                     String y = in.nextLine();
                     
                     if(y.equals("1")) {
                    	 System.out.println("Cevabiniz:");
           			     cevaps = in.nextInt();
           			     if(cevaps == s.area()) {
           			    	 System.out.println("Tebrikler");
           			     }
           			     if(cevaps != s.area()) {
           			    	 for(int sf=0;sf<3;sf++) {
           			    		System.out.println("Tekrar deneyiniz");
           			    		System.out.println("Cevabiniz:");
                  			    cevaps = in.nextInt(); 
                  			     if(cevaps == s.area()) {
             			    	 System.out.println("Tebrikler");
             			          }
                  			      if(sf==2) {
                  			    	System.out.println("Sonuc= "+s.area());
                  			      }
           			    		}
                  			 }
                     }
                     if(y.equals("2")) {
                    	 System.out.println("Cevabiniz:");
           			     cevaps = in.nextInt();
           			     if(cevaps == s.circum()) {
           			    	 System.out.println("Tebrikler");
           			     }
           			     if(cevaps != s.circum()) {
           			    	 for(int sf=0;sf<3;sf++) {
           			    		System.out.println("Tekrar deneyiniz");
           			    		System.out.println("Cevabiniz:");
                  			    cevaps = in.nextInt(); 
                  			     if(cevaps == s.circum()) {
             			    	 System.out.println("Tebrikler");
             			          }
                  			      if(sf==2) {
                  			    	System.out.println("Sonuc= "+s.circum());
                  			      }
           			    		}
                  			 }
           			     }

           			    	 
                     }

                     if (islem.equals("3")) {
           			     System.out.println("Kisa Kenar: " + RecX);
           			     System.out.println("Uzun Kenar: " + RecY);
                         String cal2 = "1.Alan" 
           			                  +"\n" 
                        		    + "2.Cevre";
                         System.out.println(cal2);
                         System.out.println("Seciniz:");
                         String x = in.nextLine();
                         
                         if(x.equals("1")) {
                        	 System.out.println("Cevabiniz:");
               			     cevapr = in.nextInt();
               			     if(cevapr == r.area()) {
               			    	 System.out.println("Tebrikler");
               			     }
               			     if(cevapr != r.area()) {
               			    	 for(int sf=0;sf<3;sf++) {
               			    		System.out.println("Tekrar deneyiniz");
               			    		System.out.println("Cevabiniz:");
                      			    cevapr = in.nextInt(); 
                      			     if(cevapr == r.area()) {
                 			    	 System.out.println("Tebrikler");
                 			          }
                      			      if(sf==2) {
                      			    	System.out.println("Sonuc= "+r.area());
                      			      }
               			    		}
                      			 }
                         }
             
                         if(x.equals("2")) {
                        	 System.out.println("Cevabiniz:");
               			     cevapr = in.nextInt();
               			     if(cevapr == r.circum()) {
               			    	 System.out.println("Tebrikler");
               			     }
               			     if(cevapr != r.circum()) {
               			    	 for(int sf=0;sf<3;sf++) {
               			    		System.out.println("Tekrar deneyiniz");
               			    		System.out.println("Cevabiniz:");
                      			    cevapr = in.nextInt(); 
                      			     if(cevapr == r.circum()) {
                 			    	 System.out.println("Tebrikler");
                 			          }
                      			      if(sf==2) {
                      			    	System.out.println("Sonuc= "+r.circum());
                      			      }
               			    		}
                      			 }
                         }
                     }
		
                 }
	}


		



