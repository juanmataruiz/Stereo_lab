

public class RecordDeck extends Component{

    private double playSpeed;

    public RecordDeck() {
        this.playSpeed = 1;
    }

    public double getPlaySpeed() {
        return playSpeed;
    }

    public void changePlaySpeed(double speed) {
        playSpeed = speed;

    }


}
