public class Kubus extends Dasar{
    private double sisi;
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    public double hitungVolume(){
        return sisi * sisi * sisi;
    }
    public double hitungLuasPermukaan(){
        return 6 * (sisi * sisi);
    }
    
}
