# Java
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int T = sc.nextInt();
		String teams[] = new String[4];
		int points[] = {0,0,0,0};
		int GD[] = {0,0,0,0};
		String team = " ";
		int max = 0,sec_max = 0;
		String HomeTeamName = " ";
		int HomeTeamGoals = 0;
		int AwayTeamGoals = 0;
		String AwayTeamName = " ";
		System.out.println("Enter the teams: ");
		for(int i=0;i<4;i++)
		{
		    teams[i] = sc.nextLine();
		}
		System.out.println("Enter the home team name, home team goals, away team goals and away team name ");
		for(int i=0;i<12;i++)         //taking input of the home team name, home team goal, away team name,away team goal
		{
		    HomeTeamName = sc.nextLine();
		    HomeTeamGoals = sc.nextInt();
		    AwayTeamGoals = sc.nextInt();
		    AwayTeamName = sc.nextLine();
		    if(HomeTeamGoals > AwayTeamGoals)   //checking the winninh team
		    {
		        if(teams[i].equals(HomeTeamName))   //inceasing the poitnts table
		        {
		            points[i] = points[i]+3;
		            GD[i] = HomeTeamGoals - AwayTeamGoals;
		        }
		        if(teams[i].equals(AwayTeamName))   //decreasing the goal difference
		        {
		            GD[i] = -(HomeTeamGoals - AwayTeamGoals);
		        }
		    }
		    else if(HomeTeamGoals < AwayTeamGoals)   //checking for the other way round i.e. the loss of home team
		    {
		        if(teams[i].equals(AwayTeamName))
		        {
		            points[i] = points[i]+3;
		            GD[i] = AwayTeamGoals - HomeTeamGoals;
		        }
		        if(teams[i].equals(HomeTeamName))
		        {
		            GD[i] = -(AwayTeamGoals - HomeTeamGoals);
		        }
		    }
		    else
		    {
		        if(teams[i].equals(AwayTeamName))
		        {
		            points[i] = points[i]+1;
		        }
		        if(teams[i].equals(HomeTeamName))
		        {
		            points[i] = points[i]+1;
		        }
		    }
		}
		for(int i=0;i<4;i++)   //checking the first team in the table wth highest point
		{
		    if(points[i] > points[i+1])
		    {
		        max = points[i];
		        team = teams[i];
		    }
		    if(points[i] == points[i+1])   //checking on the basis of goal difference if the points are same 
		    {
		        if(GD[i] > GD[i+1])
		        {
		            max = GD[i];
		            team = teams[i];
		        }
		    }
		}
		for(int i=0;i<4;i++)
		{
		    if(points[i] < max && points[i] > points[i+1])   //checking the first team in the table wth second highest point
		    {
		        sec_max = points[i];
		        team = teams[i];
		    }
		    if(points[i] < max && points[i] == points[i+1])     //checking on the basis of goal difference if the points are same 
		    {
		        if(GD[i] < max && GD[i] > GD[i+1])      
		        {
		            sec_max = GD[i];
		            team = teams[i];
		        }
		    }
		}
		System.out.println("First team is: "+max);    // printing the first team name wiht the highest point
		System.out.println("Second team is: "+sec_max);   //printing the second team name with second highest point
	}
}
