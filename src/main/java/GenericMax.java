//Refactor-2 Refactor to create Generic Class to take in 3 variables of Generic Type
public class GenericMax<E extends Comparable> {

    E firstPosition;
    E secondPosition;
    E thirdPosition;

    public GenericMax(E firstPosition, E secondPosition, E thirdPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
    }

    public E maximumGeneric(){
        return genericMaximum(firstPosition,secondPosition,thirdPosition);
    }
    public <E extends Comparable> E genericMaximum(E firstPosition, E secondPosition, E thirdPosition){
        E maxPosition=firstPosition;
        if(secondPosition.compareTo(maxPosition) > 0)
            maxPosition=secondPosition;
        if(thirdPosition.compareTo(maxPosition) > 0)
            maxPosition=thirdPosition;
        return maxPosition;
    }
}