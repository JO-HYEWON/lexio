package hw.lexio.action;

public abstract class Action {
    public static final Action PASS = new PassAction();
    public static final Action SINGLE = new SingleAction();
    public static final Action PAIR = new PairAction();
    public static final Action TRIPLE = new TripleAction();
    public static final Action STRAIGHT = new StraightAction();
    public static final Action FLUSH = new FlushAction();
    public static final Action FULL_HOUSE = new FullHouseAction();
    public static final Action FOUR_CARD = new FourCardAction();
    public static final Action STRAIGHT_FLUSH = new StraightFlushAction();


}
