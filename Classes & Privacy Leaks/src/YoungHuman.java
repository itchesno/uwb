public class YoungHuman {

    //instance variables

    private Weight currentWeight;
    private Date birthDate;
    private Date lastCheckUpDate;
    private String lastName;
    private String firstName;

    //Methods

    //constructors

    /** constructor with
     *
     * @param weight
     * @param birthDate
     * @param firstName
     * @param lastName
     */
    public YoungHuman(Weight weight, Date birthDate, String firstName, String lastName){
        this.currentWeight = (new Weight(weight));
        this.birthDate = (new Date (birthDate));
        this.setName(firstName, lastName);
    }

    /** copy constructor
     *
     * @param toCopy
     */
    public YoungHuman(YoungHuman toCopy){
        this.currentWeight = (new Weight (toCopy.getWeight()));
        this.birthDate = (new Date (toCopy.getBirthDate()));
        this.setName(toCopy.firstName, toCopy.lastName);
    }

    //methods

    /** returns birth date
     *
     * @return
     */
    public Date getBirthDate(){
        return new Date (birthDate);
    }

    /** returns date of last checkup
     *
     * @return
     */
    public Date getLastCheckUpDate(){
        return this.lastCheckUpDate;
    }

    /** returns name
     *
     * @return
     */
    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    /**checks if child had a prior check up
     *
     * @return
     */
    public boolean hasHadCheckUp(){
        if(this.lastCheckUpDate != null){
            return true;
        }
        return false;
    }

    /**sets last checkup date
     *
     * @param dateOfCheckUp
     */
    public void setCheckUp(Date dateOfCheckUp){
        if(dateOfCheckUp.getYear() >= this.birthDate.getYear() && 2023 >= dateOfCheckUp.getYear()){
            if(dateOfCheckUp.getMonth() >= this.birthDate.getMonth() && 4 >= dateOfCheckUp.getMonth()){
                if(dateOfCheckUp.getDay() >= this.birthDate.getDay() && 25 >= dateOfCheckUp.getDay()){
                    this.lastCheckUpDate = dateOfCheckUp;
                }
            }
        }
        else{
            System.out.println("Cannot be before the birth date or current date");
        }
    }

    /** sets checkup date to null
     *
     */
    public void unsetCheckUpDate(){
        this.lastCheckUpDate = null;
    }

    /** sets birthdate
     *
     * @param birthDate
     */
    public void setBirthDate(Date birthDate){
        if(2023 >= birthDate.getYear()){
            if(4 >= birthDate.getMonth()){
                if(25 >= birthDate.getDay()){
                    this.birthDate = birthDate;
                }
            }
        }
        else{
            System.out.print("Birth date cannot be past current date");
        }
    }

    /** sets weight
     *
     * @param amount
     */
    public void setWeight(Weight amount){
        this.currentWeight = amount;
    }

    /** returns weight of the child
     *
     * @return
     */
    public Weight getWeight(){
        return this.currentWeight;
    }

    /** Changes the child's name
     *
     * @param first
     * @param last
     */
    public void setName(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    /** returns a String that reports the kid's name, date of birth, weight, and date of last check up
     *
     * @return
     */
    public String toString(){
        if( lastCheckUpDate != null){
            return this.firstName + " " + this.lastName + ", " + this.currentWeight.toString() + ", birth date: " + this.birthDate.toString() + ", last check-up: " + this.lastCheckUpDate.toString();
        }
        return this.firstName + " " + this.lastName + ", " + this.currentWeight.toString() + ", birth date: " + this.birthDate.toString() + ", no checkup date recorded";
    }

    /** checks if two YoungHumans
     *
     * @param other
     * @return
     */
    public boolean equals(YoungHuman other){
        if (this.currentWeight.equals(other.currentWeight) && this.birthDate.equals(other.getBirthDate()) && this.lastCheckUpDate.equals(other.getLastCheckUpDate()) && this.getName() == other.getName()){
            return true;
        }
        return false;
    }
}
