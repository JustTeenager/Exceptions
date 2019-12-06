package com.company;

public class Figure {
    protected Point[] pnts;
    public Figure (int pointsCount){
        pnts=new Point[pointsCount];
        for (int i=0;i<pnts.length;i++){
            pnts[i]=new Point();
        }
    }
    public void SetCoord(int n,double x,double y) throws PointIndexException{
        if ((n>=0) & (n<pnts.length)){
            pnts[n].SetCoord(x,y);
        }
        else{
            throw new PointIndexException(n);
        }
    }
}
