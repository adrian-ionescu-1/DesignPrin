package SolidPrinciples;

import java.util.ArrayList;
import java.util.List;

public class OpenClose {
//    List<Year> yearList = new ArrayList<>();
    private List<Year> yearList = List.of(Year.IANUARIE); //...
    public static void addElementToYearList(List yearList) {
        yearList.add(Year.IANUARIE);
        yearList.add(Year.FEBRUARIE);
        yearList.add(Year.MARTIE);
    }
}

enum Year {
    IANUARIE,
    FEBRUARIE,
    MARTIE
}
