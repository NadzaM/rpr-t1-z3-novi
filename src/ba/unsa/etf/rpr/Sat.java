package ba.unsa.etf.rpr;


public class Sat {

    private int sati;
    private int minute;
    private int sekunde;

    public Sat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }


    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    public void postavi(int sati, int minute, int sekunde) {
        this.setSati(sati);
        this.setMinute(minute);
        this.setSekunde(sekunde);
    }

    public void sljedeci() {
        sekunde++;
        if (sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            sati++;
        }
        if (sati == 24) sati = 0;
    }

    public void prethodni() {
        sekunde--;
        if (sekunde == -1) {
            sekunde = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            sati--;
        }
        if (sati == -1) sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) this.sljedeci();
        else for (int i = 0; i < -pomak; i++) this.prethodni();
    }

    public int dajSate() {
        return this.getSati();
    }

    public int dajMinute() {
        return this.getMinute();
    }

    public int dajSekunde() {
        return this.getSekunde();
    }

    public void ispisi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return sati +
                ":" + minute +
                ":" + sekunde
                ;
    }


}
