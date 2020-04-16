class Triangles{
    public int mSideOne;
    public int mSideTwo;
    public int mSideThree;
    public String mShape;

    public Triangles(int one, int two,int three){
        mSideOne=one;
        mSideTwo=two;
        mSideThree=three;
    }

    public String typeOfTriangle(int lOne,int lTwo,int lThree){
        if (lOne==lTwo && lOne==lThree){
            mShape="Equilateral";
            return "Equilateral";
        }
        else if(lOne==lTwo || lOne==lThree || lTwo==lThree){
            mShape="Isosceles";
            return "Isosceles";
        }
        else {
            mShape="Scalene";
            return "Scalene";
        }

    }
}