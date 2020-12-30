public class Quarter {
    private String houseNumber;    // Số nhà
    private int population;     // Số Người
    private Person person;         // Thông tim Của Mỗi công dân

    public Quarter() {
    }

    public Quarter(String houseNumber, int population, Person person) {
        this.houseNumber = houseNumber;
        this.population = population;
        this.person = person;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getPopulation() {
        return population;
    }

    public Person getPerson() {
        return person;
    }
}
