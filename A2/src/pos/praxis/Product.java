package pos.praxis;

public class Product implements Addable{
    public String desc;
    public int preis;
    public int amount;
    public String kategorie;

    public Product(String desc, int preis, int amount, String Kategorie) {
        this.desc = desc;
        this.preis = preis;
        this.amount = amount;
        this.kategorie = Kategorie;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    @Override
    public String toString() {
        return "Beschreibung='" + desc + '\'' +
                ", Preis=" + preis +
                ", Menge=" + amount +
                ", Kategorie='" + kategorie;
    }
}

