package B;

import java.lang.System.*;
import java.util.*;
import A.Punkt;

public class Polylinje {
    private Punkt[] horn;
    private String farg = "svart";
    private int bredd = 1;

    public Polylinje() {
        this.horn = new Punkt[0];
    }

    public Polylinje(Punkt[] horn) {
        this.horn = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++)
            this.horn[i] = new Punkt(horn[i]);
    }

    public String toString() {
        return null;
    }

    public Punkt[] getHorn() {
        return horn;
    }

    public String getFarg() {
        return farg;
    }

    public int getBredd() {
        return bredd;
    }

    public void setFarg(String farg) {
        this.farg = farg;

    }

    public void setBredd(int bredd) {
        this.bredd = bredd;
    }

    public double langd() {
        return 0;
    }

    public void laggTill(Punkt horn) {
        Punkt[] h = new Punkt[this.horn.length + 1];

        int i = 0;
        for (i = 0; i < this.horn.length; i++) {
            h[i] = this.horn[i];
            h[i] = new Punkt(horn);
            this.horn = h;
        }
    }
        public void laggTillFramfor (Punkt horn, String hornNamn) {

        }

        public void taBort (String hornNamn) {

        }

}