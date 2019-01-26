import java.util.Random;

public class Pult {
    public int  onOffCounter = 0;
    public int numOfChannel;
    static final int MAX_NUM_OF_BUTTON = 3;
    private TV tv;

    public Pult() {
        this.numOfChannel = numOfChannel;
        TV tv = new TV();
        this.tv =tv;
    }

    public void clickOnOffButton(){
        tv.onOff(onOffCounter);
        onOffCounter++;
    }

    public void randomChannel (){
        Random random = new Random();
        numOfChannel = random.nextInt(MAX_NUM_OF_BUTTON);
        tv.watchChannel(numOfChannel);
    }


}

