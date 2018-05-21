import java.util.ArrayList;

public class CDPlayer extends Component{
    ArrayList<CD> cdList;

    public CDPlayer(){
        this.cdList = new ArrayList<>();
    }

    public ArrayList<CD> getCDlist() {
        return new ArrayList<CD>(this.cdList);
    }

    public void addCD(CD cd) {
        this.cdList.add(cd);
    }

    public void removeCD(CD cd) {
        this.cdList.remove(cd);
    }

    public CD findCDByName(String title){
        CD cdFound = null;
        for(CD cd : this.cdList){
            if(cd.getTitle() == title){
                cdFound = cd;
            }
        }
        return cdFound;
    }

    public String play(String title) {
        return "Now playing " + findCDByName(title).getTitle();
    }

}
