package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat (int h, int m, int s) {
        sati = h;
        minute = m;
        sekunde = s;
    }

    public int GetSati() { return sati; }
    public int GetMinute() { return minute; }
    public int GetSekunde() { return sekunde; }

    public void SetSati(int h) { sati = h; }
    public void SetMinute(int m) { minute = m; }
    public void SetSekunde(int s) { sekunde = s; }

    public void Postavi (int h, int m, int s) {
        SetSati(h);
        SetMinute(m);
        SetSekunde(s);
    }

    public void Sljedeci() {
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

    public void Prethodni() {
        sekunde--;
        if (sekunde == -1) {
            sekunde = 0;
            minute--;
        }
        if (minute == -1) {
            minute = 0;
            sati--;
        }
        if (sati == -1) sati = 23;
    }

    public void PomjeriZa (int k) {
        if (k > 0) for (int i = 0; i < k; i++) Sljedeci();
        else for (int i = 0; i < -k; i++) Prethodni();
    }

    public void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
}
