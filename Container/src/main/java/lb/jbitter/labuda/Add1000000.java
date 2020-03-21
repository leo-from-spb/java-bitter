package lb.jbitter.labuda;

import java.util.ArrayList;

@SuppressWarnings("DuplicatedCode")
public class Add1000000 {

    public static ArrayList<Long> populateListWithPredictedSize() {
        final ArrayList<Long> list = new ArrayList<>(1_000_000);
        int k = 1;
        for (int i = 1; i <= 1_000_000; i++) {
            //noinspection UnnecessaryBoxing
            list.add(Long.valueOf(k));
            k++; if (k > 100) k = 0;
        }
        return list;
    }

    public static Long[] populateArrayByListWithPredictedSize() {
        ArrayList<Long> list = populateListWithPredictedSize();
        return list.toArray(new Long[0]);
    }

    public static ArrayList<Long> populateListWithDefaultSize() {
        final ArrayList<Long> list = new ArrayList<>(1_000_000);
        int k = 1;
        for (int i = 1; i <= 1_000_000; i++) {
            //noinspection UnnecessaryBoxing
            list.add(Long.valueOf(k));
            k++; if (k > 100) k = 0;
        }
        return list;
    }

    public static Long[] populateArrayByListWithDefaultSize() {
        ArrayList<Long> list = populateListWithDefaultSize();
        return list.toArray(new Long[0]);
    }


}
