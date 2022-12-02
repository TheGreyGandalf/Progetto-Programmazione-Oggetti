public class Conto {
    public String Data;                 //sarebbe meglio usare una classe a parte
    public String Descrizione;
    public int Ammontare;

    /**
     *
     * @param Da= Parametro che definisce un campo data
     * @param De= Parametro che definisce un campo Descrizione
     * @param Am= Parametro che definisce un campo ammontare
     */
    Conto(String Da, String De, int Am){
        this.Data=Da;
        this.Descrizione=De;
        this.Ammontare=Am;
    }

    Conto()
    {
        this.Data="";
        this.Descrizione="De";
        this.Ammontare=0;
    }

    public int getAmmontare() {
        return Ammontare;
    }

    public String getData() {
        return Data;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setAmmontare(int ammontare) {
        Ammontare = ammontare;
    }

    public void setData(String data) {
        Data = data;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }
}
