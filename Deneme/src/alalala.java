import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class alalala {

    
	public static void main(String[] args) throws IOException {
	Timer student=new Timer();// Timer was called
		File file = new File("odev.txt");//Created file 
		if(!file.exists())
			file.createNewFile();
		ArrayList<String> ogrencilistesi = new ArrayList<String>();
		
				int a=0;
					        
						while(a==0) 
							{	Scanner yagmur = new Scanner(file);
							while (yagmur.hasNextLine())
							{ 
								String akin = yagmur.nextLine();
								ogrencilistesi.add(akin);
								
							}
							   System.out.println("1-kayýt");
							   System.out.println("2-kiþiye sýralama");
							   System.out.println("3-sýrala");
							   System.out.println("4-Silme");
							   System.out.println("5-Güncelle");
							   System.out.println("6-Gpa ögrenci");
							   System.out.println("7-Gpa hepsi");
							   System.out.println("8-Sort");
							   System.out.println("9-Search");
							   System.out.println("0-Kapat");
							   Scanner input = new Scanner(System.in);
							   int b=input.nextInt();
					
							
						   switch(b) 
						   {
						      
						   case 1:
							   System.out.println("ID:");  // Took all information from user
							   FileWriter dosya= new FileWriter(file,true);
							   Scanner kayit = new Scanner(System.in);
							   String id = kayit.nextLine();
						       dosya.write(id+"\n");
						       System.out.println("isim:") ;
						       String isim = kayit.nextLine();
						       dosya.write(isim+"\n");
						       System.out.println("soyisim");
						       String soyisim = kayit.nextLine();
						       System.out.println("1");
						       dosya.write(soyisim+"\n");
						       int ders1 = kayit.nextInt();
						       System.out.println("2");
						       dosya.write(ders1+"\n");
						       int ders2 = kayit.nextInt();
						       System.out.println("3");
						       dosya.write(ders2+"\n");
						       int ders3 = kayit.nextInt();
						       System.out.println("4");
						       dosya.write(ders3+"\n");
						       int ders4 = kayit.nextInt();
						       System.out.println("5");
						       dosya.write(ders4+"\n");
						       int ders5 = kayit.nextInt();
						       dosya.write(ders5+"\n");
						       
						       dosya.close();
						   break;
						   
						   case 2:
							  System.out.println("ID:");   // listed only one person's informations
							  Scanner yaðmur2=new Scanner(System.in);
							  String ID1=yaðmur2.nextLine();
							  for  (int i=0;i<ogrencilistesi.size();i+=8)
							  {
								  if(ogrencilistesi.get(i).equals(ID1)) 
								  {
								  for(int k=0;k<8;k++) 
									  {
										String  sira=ogrencilistesi.get(i+k);
										System.out.println(sira);
									  }
								  break;
								  }
							  }
							  break;
							  
						   
							  
						   case 3:
							   
							   for  (int i=0;i<ogrencilistesi.size();i++)  // Listed all informations
								  {
								   System.out.println(ogrencilistesi.get(i));
								  }
							   break;
						   case 5: 
							   
							    System.out.println("Güncellemek istedigin numara");  // Updated any information here
							   Scanner input1= new Scanner(System.in);
							   String ID2=input1.nextLine();
							   System.out.println("numara icin1");
							   System.out.println("isim icin2");
							   System.out.println("soyisim icin3");
							   System.out.println("not1 icin4");
							   System.out.println("not2 icin5");
							   System.out.println("not3 icin6");
							   System.out.println("not4 icin7");
							   System.out.println("not5 icin8");
							   
							   Scanner input2 =new Scanner(System.in);
							   int k =input2.nextInt();
							   System.out.println("yeni bilgi");
							   
							   String yeni =input1.nextLine();
							   for(int x=0;x<ogrencilistesi.size();x++) {
								   if(ogrencilistesi.get(x).equals(ID2))
								   {
									   ogrencilistesi.set(x+k-1,yeni);
								   }
							   }
							   System.out.println(ogrencilistesi);
							   FileWriter h =new FileWriter(file);
							   for(int g=0;g<ogrencilistesi.size();g++)
							   {
								   h.write(ogrencilistesi.get(g)+"\n");
							   }
							 h.close();
						break;
						   case 0 :a++;
							  break;
						   
						   case 6: 
							   System.out.println("ID:"); // Calculated only one person's average
								  Scanner yaðmur21=new Scanner(System.in);
								  String ID11=yaðmur21.nextLine();
								  for  (int i=0;i<ogrencilistesi.size();i+=8)
								  {
									  if(ogrencilistesi.get(i).equals(ID11)) 
									  {
										  int ders11=Integer.valueOf(ogrencilistesi.get(i+3));
										  int ders12=Integer.valueOf(ogrencilistesi.get(i+4));
										  int ders13=Integer.valueOf(ogrencilistesi.get(i+5));
										  int ders14=Integer.valueOf(ogrencilistesi.get(i+6));
										  int ders15=Integer.valueOf(ogrencilistesi.get(i+7));
										  double ort=(ders11+ders12+ders13+ders14+ders15)/5;
										  System.out.println(ogrencilistesi.get(i+1)+" "+ogrencilistesi.get(i+2)+" Ortalama="+ort);
										 
									  }
								  }
					
								  break;
						   case 7:                               // Calculated general average for all students
							     double ort=0;                 
								  for  (int i=0;i<ogrencilistesi.size();i+=8)
								  {
									  
										  int ders11=Integer.valueOf(ogrencilistesi.get(i+3));
										  int ders12=Integer.valueOf(ogrencilistesi.get(i+4));
										  int ders13=Integer.valueOf(ogrencilistesi.get(i+5));
										  int ders14=Integer.valueOf(ogrencilistesi.get(i+6));
										  int ders15=Integer.valueOf(ogrencilistesi.get(i+7));
										  ort+=(ders11+ders12+ders13+ders14+ders15)/5;
										  
										 
									  
								  }System.out.println("Genel Ortalama="+ort);
					
								  break; 
								  case 4: // deleted any information from here
					
									  FileWriter dosya1= new FileWriter(file);
									  System.out.println(ogrencilistesi);
									   System.out.println("ID:");
										  Scanner yaðmur211=new Scanner(System.in);
										  String ID111=yaðmur211.nextLine();
										  for  (int i=0;i<ogrencilistesi.size();i+=8)
										  {
											  if(ogrencilistesi.get(i).equals(ID111)) 
											  {
												  ogrencilistesi.remove(i+7);
												  ogrencilistesi.remove(i+6);
												  ogrencilistesi.remove(i+5);
												  ogrencilistesi.remove(i+4);
												  ogrencilistesi.remove(i+3);
												  ogrencilistesi.remove(i+2);
												  ogrencilistesi.remove(i+1);
												  ogrencilistesi.remove(i);
											  }
										  }System.out.println(ogrencilistesi);
										  for  (int i=0;i<ogrencilistesi.size();i++) 
										  {
											  dosya1.write(ogrencilistesi.get(i));
											  dosya1.write("\n");
										  }
										  dosya1.close();
										  break;
										  
								  case 8:  // I used buble sort
									  ArrayList<String> buble=new ArrayList<String>();
									  buble.clear();
									  for(int q=3;q<ogrencilistesi.size();q+=8)
									  {
										  int ders111=Integer.valueOf(ogrencilistesi.get(q));
										  int ders121=Integer.valueOf(ogrencilistesi.get(q+1));
										  int ders131=Integer.valueOf(ogrencilistesi.get(q+2));
										  int ders141=Integer.valueOf(ogrencilistesi.get(q+3));
										  int ders151=Integer.valueOf(ogrencilistesi.get(q+4));
										  int ort1=(ders111+ders121+ders131+ders141+ders151)/5;
										  buble.add(String.valueOf(ort1));
									  }
									 

								      System.out.println(buble);
								     student.start();
									  for (int i = 0; i < buble.size() - 1; i++)  
								        {  
								            int index = i;  
								            for (int j = i + 1; j < buble.size(); j++){  
								                if (Integer.valueOf(buble.get(j)) < Integer.valueOf(buble.get(index))){  
								                    index = j;//searching for lowest index  
								                }  
								            }  
								            int smallerNumber = Integer.valueOf(buble.get(index));   
								           buble.set(index, String.valueOf(buble.get(i))); 
								           buble.set(i, String.valueOf(smallerNumber));
								        }  student.stop();
										  double timer=student.getElapsedMilliseconds();
									  buble.clear();
									  for(int q=3;q<ogrencilistesi.size();q+=8)
									  {
										  int ders111=Integer.valueOf(ogrencilistesi.get(q));
										  int ders121=Integer.valueOf(ogrencilistesi.get(q+1));
										  int ders131=Integer.valueOf(ogrencilistesi.get(q+2));
										  int ders141=Integer.valueOf(ogrencilistesi.get(q+3));
										  int ders151=Integer.valueOf(ogrencilistesi.get(q+4));
										  int ort1=(ders111+ders121+ders131+ders141+ders151)/5;
										  buble.add(String.valueOf(ort1));
									  } 
								        
								        int n = buble.size();  
								        int temp = 0;  
								        student.start();
								         for(int i=0; i < n; i++){  
								                 for(int j=1; j < (n-i); j++){  
								                          if(Integer.valueOf(buble.get(j-1)) > Integer.valueOf(buble.get(j))){  
								                                  
								                                 temp = Integer.valueOf(buble.get(j-1));  
								                                 buble.set(j-1, String.valueOf(buble.get(j)));  
								                                 buble.set(j,String.valueOf(temp));
								                         }  
								                          
								                 }  
								         }  

								         student.stop();
										  double timer1=student.getElapsedMilliseconds();
									      System.out.println(buble);
									      System.out.println("selection:"+timer+"\nbuble:"+timer1);

									  break;
								  case 9: //  Used Binary search compare to normal search
									  ArrayList<String> buble1=new ArrayList<String>();
									  for(int q=3;q<ogrencilistesi.size();q+=8)
									  {
										  int ders111=Integer.valueOf(ogrencilistesi.get(q));
										  int ders121=Integer.valueOf(ogrencilistesi.get(q+1));
										  int ders131=Integer.valueOf(ogrencilistesi.get(q+2));
										  int ders141=Integer.valueOf(ogrencilistesi.get(q+3));
										  int ders151=Integer.valueOf(ogrencilistesi.get(q+4));
										  int ort1=(ders111+ders121+ders131+ders141+ders151)/5;
										  buble1.add(String.valueOf(ort1));
									  }
									 
									  
									  
									  for (int i = 0; i < buble1.size() - 1; i++)  
								        {  
								            int index = i;  
								            for (int j = i + 1; j < buble1.size(); j++){  
								                if (Integer.valueOf(buble1.get(j)) < Integer.valueOf(buble1.get(index))){  
								                    index = j; 
								                }  
								            }  
								            int smallerNumber = Integer.valueOf(buble1.get(index));   
								           buble1.set(index, String.valueOf(buble1.get(i))); 
								           buble1.set(i, String.valueOf(smallerNumber));
								        }  
									
									  

								      System.out.println(buble1);
								      System.out.println("Arcagýnýzý giriniz");
									  Scanner w=new Scanner(System.in);
									  int key =w.nextInt();
									  int last=buble1.size();
									  int first=0;
									  int mid = (first + last)/2;  
									  student.start();
									   while( first <= last ){  
									      if ( Integer.valueOf(buble1.get(mid)) < key ){  
									        first = mid + 1;     
									      }else if ( Integer.valueOf(buble1.get(mid)) == key ){  
									        System.out.println("Bulundu");  
									        break;  
									      }else{  
									         last = mid - 1;  
									      }  
									      mid = (first + last)/2;  
									   }  
									   if ( first > last ){  
									      System.out.println("Bulunamadý");  
									   }  
									   student.stop();
										  double timer3=student.getElapsedMilliseconds();
										  student.start();
									   for(int e=0;e<buble1.size();e++)
									   {
										   if(key==Integer.valueOf(buble1.get(e)))
										   {

										        System.out.println("Bulundu");  
										        break;
										   }
									   }
									   student.stop();
										  double timer2=student.getElapsedMilliseconds();

									      System.out.println("Binary:"+timer3+"\nNormal:"+timer2);
									   
									  break;
						   }
						   
							    
					}
	 
		   
		  
	  
	   
		  
	
		   }	   
	
	
	   }


	
	

