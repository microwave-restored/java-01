package main.domain;

public class Monitor extends Display {
    private int freshrate = 0;
    private String synctype;

    public Monitor() {
    }

    public Monitor(String[] line) {
        super(line[1], line[2], line[3], line[4], line[5]);
        freshrate = Integer.parseInt(line[6]);
        synctype = line[7];
    }

    public String getSynctype() {
        return synctype;
    }

    public void setSynctype(String synctype) {
        this.synctype = synctype;
    }

    public int getFreshrate() {
        return freshrate;
    }

    public void setFreshrate(int freshrate) {
        this.freshrate = freshrate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Монитор. ");
        builder.append(super.toString());
        builder.append(" | Технология динамического обновления экрана: ");
        builder.append(synctype);
        builder.append(" | Частота обновления: ");
        builder.append(freshrate);
        return builder.toString();
    }
}
