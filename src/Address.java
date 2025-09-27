class Address{
    private String Line1;
    private String Line2;
    private String City;
    private String State;
    private String Zip;
    private String Country;

    public Address(Line1, Line2, City, State, Zip, Country){
        this.Line1 = Line1;
        this.Line2 = Line2;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
        this.Country = Country;
    }

    public String getLine1(){
        return this.Line1;
    }

    public String getLine2(){
        return this.Line2;
    }

    public String getCity(){
        return this.City;
    }

    public String getState(){
        return this.State;
    }

    public String getZip(){
        return this.Zip;
    }

    public String getCountry(){
        return this.Country;
    }
    

}