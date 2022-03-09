public class Pizza {
    private char mSize;
    private boolean mPepperoni;
    private boolean mSausage;
    private boolean mMushrooms;
    private boolean mVegan;

    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan) {
        mSize = size;
        mPepperoni = pepperoni;
        mSausage = sausage;
        mMushrooms = mushrooms;
        mVegan = vegan;
    }

    public char getSize() {
        return mSize;
    }

    public int getNumToppings() {
        int amtToppings = 0;
        if (mPepperoni) amtToppings++;
        if (mSausage) amtToppings++;
        if (mMushrooms) amtToppings++;
        return amtToppings;
    }

    @Override
    public String toString() {
        String strPepperoni = (mPepperoni ? ", Pepperoni" : "");
        String strSausage = (mSausage ? ", Sausage" : "");
        String strMushrooms = (mMushrooms ? ", Mushrooms" : "");
        String strVegan = (mVegan ? ", Vegan" : "");
        return "Pizza [" +
                "Size=" + mSize +
                strPepperoni + strSausage +
                strMushrooms + strVegan +
                ']';
    }
}
