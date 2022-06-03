import java.util.ArrayList;
import java.util.List;
//173173
public class SILab2 {

    public List<String> function(List<String> list) { // 1
        if (list.size() <= 0) { // 2
            throw new IllegalArgumentException("List length should be greater than 0");  // 3
        }
        List<String> numMines = new ArrayList<>(); // 4
        for (int i = 0; i < list.size(); i++) { // 5
            if (!list.get(i).equals("#")) { // 6
                int num = 0; // 7
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) { // 8
                    num++; // 9
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) { // 10
                    num++; // 11
                }
                numMines.add(String.valueOf(num)); // 12
            } else { // 13
                numMines.add(list.get(i)); // 14
            }
        } // 15
        return numMines; // 16
    } // 17
}