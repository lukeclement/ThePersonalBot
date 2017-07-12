import java.util.*;
import java.text.*;
import twitter4j.*;
import java.io.*;

public class bot{

  public static void delay(long d){
    long start=System.currentTimeMillis();
    long end=start+d;
    while(start<end){
      start=System.currentTimeMillis();
    }
    return;
  }

  public static void main(String[] args) throws TwitterException{

    //access the twitter API using twitter4j.properties file
    Twitter twitter = TwitterFactory.getSingleton();

    //Get metadata
    List<String> adjective=new ArrayList<>();
    adjective.add("brilliant");
    adjective.add("radiant");
    adjective.add("splendid");
    adjective.add("magnificent");

    adjective.add("excellent");
    adjective.add("outstanding");
    adjective.add("exceptional");
    adjective.add("glorious");

    adjective.add("grand");
    adjective.add("resplendent");
    adjective.add("delightful");
    adjective.add("marvellous");

    adjective.add("enjoyable");
    adjective.add("pleasant");
    adjective.add("merry");
    adjective.add("jolly");

    adjective.add("joyful");
    adjective.add("joyous");
    adjective.add("cheerful");
    adjective.add("lively");

    adjective.add("thrilling");
    adjective.add("great");
    adjective.add("luxurious");
    adjective.add("wonderful");

    adjective.add("perfect");
    adjective.add("terrific");
    adjective.add("fantastic");
    adjective.add("awesome");

    adjective.add("tremendous");
    adjective.add("lovely");
    adjective.add("enchanting");
    adjective.add("exquisite");

    adjective.add("superb");
    adjective.add("beatific");
    adjective.add("amazing");
    adjective.add("incredible");

    adjective.add("spectcular");
    adjective.add("spiffing");
    adjective.add("bright");
    adjective.add("stellar");

    adjective.add("astounding");

    List<String> people=new ArrayList<>();
    people.add("beth_goodhew");
    people.add("libertymay_")
    people.add("itshanfran");
    people.add("cclari_");
    people.add("The_3d_Man");
    people.add("0llie_C");
    people.add("sarah_nesfield");
    people.add("Josh4468");
    people.add("cgc6th");
    people.add("ShonaLthomson");
    people.add("faye_batchelor");
    people.add("tracyjclement");
    people.add("iamharrisonlee");
    people.add("aogiri_tree");
    people.add("defaintfart");
    people.add("pugsandpizzas");
    people.add("tobtob129");
    people.add("philipclement");
    people.add("BeccaAnnTaylor");
    people.add("masterJ_clement");
    people.add("tdclement");

    //send a tweet
    int person=0;
    int comp=0;
    try{
      FileReader fileReader = new FileReader("boop.txt");
      BufferedReader br=new BufferedReader(fileReader);
      person=Integer.parseInt(br.readLine());
      comp=Integer.parseInt(br.readLine());

      br.close();
    }
    catch(Exception ex){}


    SimpleDateFormat sdfa = new SimpleDateFormat("HH:mm:ss");
    String stuff=sdfa.format(new Date());
    System.out.println("Initiated at "+stuff);
    while(true){
      SimpleDateFormat sss = new SimpleDateFormat("mm");
      String check=sss.format(new Date());
      if(check.equals("00")){
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        stuff=sdfa.format(new Date());
        String str = sdf.format(new Date());
        int hour=Integer.parseInt(str);
        try{
          int num=0;
          if(hour==8){
            num=(int)Math.floor(Math.random()*4);
            switch(num){
              case 0:
                Status status = twitter.updateStatus("Good morning @"+people.get(person)+"! I hope you have a "+adjective.get(comp)+" day today! Make sure it's "+adjective.get(comp+1)+"!");
              break;
              case 1:
                Status statusa=twitter.updateStatus("Good morning @"+people.get(person)+"! I have a feeling today will be "+adjective.get(comp)+"! I hope you enjoy a "+adjective.get(comp+1)+" day today!");
              break;
              case 2:
                Status statusb=twitter.updateStatus("Hey @"+people.get(person)+", just wanted to wish you have a "+adjective.get(comp)+" day today! I'm sure it will be "+adjective.get(comp+1)+"!");
              break;
              case 3:
                Status statusc=twitter.updateStatus("Another "+adjective.get(comp)+" day has dawned on us! Here's hoping @"+people.get(person)+" has a "+adjective.get(comp+1)+" day today!");
              break;
              default:
                Status statusd=twitter.updateStatus("Good morning @"+people.get(person)+"! I hope you have a "+adjective.get(comp)+" day today! Make sure it's "+adjective.get(comp+1)+"!");
              break;
            }
          }
          else if(hour==12){
            num=(int)Math.floor(Math.random()*4);
            switch(num){
              case 0:
                Status status= twitter.updateStatus("I hope everyone has had a "+adjective.get((int)(Math.random()*adjective.size()))+" morning! Keep it going throught the afternoon!");
              break;
              case 1:
                Status statusa=twitter.updateStatus("Keep on powering through the day! Only half way there now, I'm sure you can make it "+adjective.get((int)(Math.random()*adjective.size()))+"!");
              break;
              case 2:
                Status statusb=twitter.updateStatus("Morning is over, time to make the afternoon "+adjective.get((int)(Math.random()*adjective.size()))+"!");
              break;
              case 3:
                Status statusc=twitter.updateStatus("Hey @"+people.get((int)(Math.random()*people.size()))+", make sure to make your afternoon "+adjective.get((int)(Math.random()*adjective.size()))+"!");
              break;
              default:
                Status statusd=twitter.updateStatus("I hope everyone has had a "+adjective.get((int)(Math.random()*adjective.size()))+" morning! Keep it going throught the afternoon!");
              break;
            }

          }
          else if(hour==21){
            num=(int)Math.floor(Math.random()*4);
            switch(num){
              case 0:
                Status status = twitter.updateStatus("Good evening @"+people.get(person)+"! I hope you had a "+adjective.get(comp+2)+" day today! Make sure tomorrow is "+adjective.get(comp+3)+"!");
              break;
              case 1:
                Status statusa=twitter.updateStatus("Good evening @"+people.get(person)+", did you have a "+adjective.get(comp+2)+" day today? I hope tomorrow is "+adjective.get(comp+3)+" for you!");
              break;
              case 2:
                Status statusb=twitter.updateStatus("What a "+adjective.get(comp+2)+" evening! I hope @"+people.get(person)+" had a "+adjective.get(comp+3)+" day today!");
              break;
              case 3:
                Status statusc=twitter.updateStatus("Hoping @"+people.get(person)+" had a "+adjective.get(comp+2)+" day today! I'm sure they'll have a "+adjective.get(comp+3)+" day tomorrow!");
              break;
              default:
                Status statusd=twitter.updateStatus("Good evening @"+people.get(person)+"! I hope you had a "+adjective.get(comp+2)+" day today! Make sure tomorrow is "+adjective.get(comp+3)+"!");
              break;
            }

            person++;
            if(person==people.size()){
              person=0;
            }
            if((comp+4)>=adjective.size()){
              comp=0;
            }else{
              comp=+4;
            }

            try{
              FileWriter write = new FileWriter("boop.txt", false);
              PrintWriter print_line = new PrintWriter(write);
              print_line.printf( "%s" + "%n" , person);
              print_line.printf( "%s" + "%n" , comp);
              print_line.close();
            }catch(Exception ex){}

            }
          }catch(TwitterException e){
            System.out.println(e);
          }
        }




        delay((60*1000));
        System.out.println("Going again!");
      }
    }
  }
