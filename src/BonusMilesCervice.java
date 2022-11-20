public class BonusMilesCervice {

    public int calculate(int cost) {
        int result;
        if (cost > 19) {
            result = cost / 20;
        } else {
            result = 0;
        }
        return result;
    }
}
