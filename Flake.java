/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ekozi
 */
public class Flake {
    public static Turtle turtle;
    public static void flake(double S,int N,Turtle t)
    {
        for(int i=0;i<=3;i++)
        {
            flakeSide(S,N,t);
            t.left(120);
           
        }
     
    }  
    public static void flakeSide(double S,int N,Turtle t)
    {
           
          if (N == 1)
          {
              t.forward(S);
              return;
          }
          
          
          flakeSide(S,N-1,t);
          t.right(60);
          flakeSide(S,N-1,t);
          t.left(120);
          flakeSide(S,N-1,t);
          t.right(60);
          flakeSide(S,N-1,t);
          
                    
           
      
       
       
    }
    public static Turtle init(int S)
    {
      turtle = new Turtle(0,0,0);
      turtle.screensize(1980, 1080);
      turtle.setworldcoordinates(-10000, -10000, 10000, 10000);
     
      return turtle;
    }
    public static void main(String []args)
    {
        init(100);
        flake(100,1,turtle);
        
    }
}
