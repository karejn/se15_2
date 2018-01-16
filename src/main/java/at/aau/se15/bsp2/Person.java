package at.aau.se15.bsp2;

public class Person {
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public void setBeruf(BERUF beruf) {
        this.beruf = beruf;
    }

    public void setBevorzugteProgrammierSprache(String bevorzugteProgrammierSprache) {
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public void setDatenbanken(boolean datenbanken) {
        this.datenbanken = datenbanken;
    }

    public void setFeld(String feld) {
        this.feld = feld;
    }

    public void setBevorzugtesTestFramework(String bevorzugtesTestFramework) {
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getVorname() {

        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public BERUF getBeruf() {
        return beruf;
    }

    public String getBevorzugteProgrammierSprache() {
        return bevorzugteProgrammierSprache;
    }

    public IDE getIde() {
        return ide;
    }

    public boolean isDatenbanken() {
        return datenbanken;
    }

    public String getFeld() {
        return feld;
    }

    public String getBevorzugtesTestFramework() {
        return bevorzugtesTestFramework;
    }

    private String vorname;
    private String nachname;
    private Integer alter;
    private BERUF beruf;
    private String bevorzugteProgrammierSprache;
    private IDE ide;
    private boolean datenbanken;
    private String feld;
    private String bevorzugtesTestFramework;

    public enum BERUF {
        ENTWICKLER,
        ARCHITEKT,
        TESTER
    }

    public enum IDE {
        ECLIPSE,
        INTELLIJ,
        NANO
    }

    public String getJobBeschreibung() {
        switch(beruf) {
            case ENTWICKLER: return "Entwickelt Code.";
            case ARCHITEKT: return "Designed die Architektur des Projekts.";
            case TESTER: return "Testet Code.";
            default: return "";
        }
    }
}
