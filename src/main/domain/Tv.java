package main.domain;

public class Tv extends Display {
    private String wifi;
    private double smarttv = 1;
    
    public Tv() {
    }

    public Tv(String[] line) {
        super(line[1], line[2], line[3], line[4], line[5]);
        wifi = line[6];
        smarttv = Double.parseDouble(line[7]);
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public double getSmarttv() {
        return smarttv;
    }

    public void setSmarttv(int smarttv) {
        this.smarttv = smarttv;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Телевизор. ");
        builder.append(super.toString());
        builder.append(" | WiFi: ");
        builder.append(wifi);
        builder.append(" | Версия SmartTv: ");
        builder.append(smarttv);
        return builder.toString();
    }
}
