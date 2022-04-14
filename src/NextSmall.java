public class NextSmall {

    private int enteredNumber;
    
    public NextSmall(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public boolean validEnteredNumber(){
    boolean number=false;
    if (enteredNumber>0){
        number=true;
    }
        return number;
    }

public int nextSmall(){
    char[] digits = String.valueOf(enteredNumber).toCharArray();

    //  creates and initializes i to the before last index

    int i = digits.length - 2;
    //  search for the element that breaks the descending order
    while(i >= 0 && digits[i] <= digits[i+1]) i--;
    // if  -1, then there isn't a smaller number with the same digits
    if(i == -1) return enteredNumber;

    // creates and initializes j to the last index
    int j = digits.length - 1;
    // search for the first digit that is smaller than digits[i]
    while(digits[j] >= digits[i]) j--;

    //swap digits[j] with digits[i]
    char temp = digits[j];
    digits[j] = digits[i];
    digits[i] = temp;

    // reverse the rest
    int left = i+1, right = digits.length - 1;
    while(left > right){
        temp = digits[left];
        digits[left] = digits[right];
        digits[right] = temp;
        left++;
        right--;
    }

    //return digits as an integer
    return Integer.parseInt(String.valueOf(digits));
}
}
