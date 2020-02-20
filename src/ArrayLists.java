import java.util.ArrayList;

public class ArrayLists {

    public void removeZeros(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public int countLetters(ArrayList list)
    int count = 0;
    for(String s : list){
        count+=s.length();
    }
    return count;
}
