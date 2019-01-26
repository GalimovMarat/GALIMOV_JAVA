import java.util.Random;

public class TV {
    private Channels [] chanel;
    public boolean On;
    public String channelsNameArray [] = {"Childrens channel", "News channel","Adult only"};

    public TV() {
        Random random = new Random();
        this.chanel = new Channels[channelsNameArray.length];
        for ( int i = 0; i < channelsNameArray.length; i++ ){
           chanel[i] = new Channels(channelsNameArray [random.nextInt(channelsNameArray.length)]);
        }
    }

    public void onOff(int a){
        if ( a%2==0){
            System.out.println("TV on");
            this.On = true;
        }
        if ( a%2!=0){
            System.out.println("TV off");
            this.On = false;
        }
    }

    public void watchChannel (int a){
        if (this.On==true){
            chanel[a].showChannel();
        }
        if (this.On==false){
            System.out.println(" Need on TV!");
        }
    }

}
