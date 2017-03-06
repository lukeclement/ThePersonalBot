import java.util.*;
import java.text.*;
import twitter4j.*;

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
        
        //send a tweet
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
                    
                    
                    String user=tweetResult.getUser().getScreenName();
                    List<Status> statuses= twitter.getUserTimeline(user);
                    
                    Status status = twitter.updateStatus("Good morning "+cities.get(hour)+"! Have a wonderful day today @"+user+" !");
                    List<String> sum=new ArrayList<>();
                    List<Integer> sums=new ArrayList<>();
                    for(Status s:statuses){
                        //System.out.println("@" + s.getUser().getScreenName() + " - " + s.getText());
                        String[] words=s.getText().split(" ");
                        for(String a:words){
                            if(!sum.contains(a)){
                                sum.add(a);
                                sums.add(1);
                            }else{
                                int b=sums.get(sum.indexOf(a));
                                b++;
                                sums.set(sum.indexOf(a),b);
                            }
                        }
                    }
                    int rec=0;int loops=0;int recLoop=0;
                    for(int i:sums){
                        loops++;
                        if(i>rec){
                            rec=i;
                            recLoop=loops;
                        }
                    }
                    System.out.println("@"+user+" has tweeted the word "+sum.get(recLoop)+" the most!");
                    System.out.println("Successful tweet at "+stuff);
                }catch(TwitterException e){
                    System.out.println(e);
                    
                }
            }
            
            
            
            
            delay((60*1000));
            System.out.println("Going again!");
        }
    }
}
