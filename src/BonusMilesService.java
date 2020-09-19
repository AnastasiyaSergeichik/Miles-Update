public class BonusMilesService {
    public int calculate(int cost) {
        int spent = 20;
        int bonus = 1;
        int miles = cost / spent * bonus;
        return miles;
    }
}
