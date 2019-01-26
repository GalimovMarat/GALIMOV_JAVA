import java.util.Random;

public class Channels {
public String name;
private Show [] shows;
public String showsArray[] = {"Гуппи и пузырики", "С добрым утром малыши","Поезд динозавров","Ми-ми-мишки","Три кота",
        "Politics News", "Science news","sports news","culture News","Weather","Love Triangle", "Doctor Adventures",
        "Necklace","Sugar And Spice","Slice Of Heaven"};
final static int MAX_SHOWS_NUM = 5;

    public Channels(String name) {
        Random random = new Random();
        this.name = name;
        this.shows = new Show [MAX_SHOWS_NUM];
        for (int i = 0; i < MAX_SHOWS_NUM; i++){
            shows[i] = new Show(showsArray[random.nextInt(showsArray.length)]);

        }
    }
   public void showChannel (){
       Random random = new Random();
       System.out.print("You are watching ");
       shows[random.nextInt(MAX_SHOWS_NUM)].printName();
       System.out.println(" on " +  name);
   }
}
