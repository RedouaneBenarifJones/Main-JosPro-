class Soldier {

    private int position;
    private String firstName;
    private String lastName;
    private String fullName;
    private boolean isDead;

    public Soldier(int position, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.lastName + " " + this.firstName;
        this.position = position;
        this.isDead = false;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() { return this.fullName; }

    public int getPosition() {
        return this.position;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public int killSoldier() {
        this.isDead = true;
        return this.position;
    }
}