package LambdaWithComparable;

import java.util.Comparator;

public class Roboter implements Comparator<Roboter>, Comparable{
    private String name;
    private int energie;

    public Roboter(String name, int energie) {
        this.name = name;
        this.energie = energie;
    }

    /**
     * Comparator
     *
     * @param r1 the first object to be compared.
     * @param r2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Roboter r1, Roboter r2){

        return r1.getEnergie() - r2.getEnergie();
    }

    /**
     * Comparable
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Roboter roboter = (Roboter) o;
        //return Integer.compare(this.getEnergie(), roboter.getEnergie());
        return toString().compareTo(o.toString());
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }
    @Override
    public String toString() {
        return "Roboter{" +
                "name='" + name + '\'' +
                ", energie=" + energie +
                '}';
    }

}
