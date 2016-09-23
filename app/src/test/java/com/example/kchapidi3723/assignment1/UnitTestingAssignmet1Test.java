package com.example.kchapidi3723.assignment1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


/**
 * Created by kchapidi3723 on 9/23/2016.
 */
public class UnitTestingAssignmet1Test {

    UnitTestingAssignmet1 UnitTestAssignment;
    @Before
    public void setUp() throws Exception {
        UnitTestAssignment=new UnitTestingAssignmet1();
    }

    @Test
    //Test Identifier: 1.1
    //Test Description: Dividing 25.25 by 5
    //Method of execution: Automated
    //Input Data: 25.25,5
    //Expected Output: 5.05
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivisionFloatsWithInts() throws Exception {
        //1.Arrange
        double i=25.25;
        double j=5;
        //2.Act
        double result=UnitTestAssignment.Division(i,j);
        //3.Assert
        Assert.assertEquals(5.05,result,0.10);
    }

    @Test
    //Test Identifier: 1.1
    //Test Description: Dividing 25.25 by 5.5
    //Method of execution: Automated
    //Input Data: 25.25,5.5
    //Expected Output: 4.59
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivisionFloatsWithFloats() throws Exception {
        //1.Arrange
        double i=25.25;
        double j=5.5;
        //2.Act
        double result=UnitTestAssignment.Division(i,j);

        //3.Assert
        Assert.assertEquals(4.59,result,0.10);
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 0
    //Method of execution: Automated
    //Input Data: 25,0
    //Expected Output: error
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision4() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=UnitTestAssignment.Division(i,j);

        //3.Assert
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Divide by zero!");
    }

    @Test
    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 5
    //Method of execution: Automated
    //Input Data: 25,5
    //Expected Output: 5.0
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision5() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=UnitTestAssignment.Division(i,j);
        //3.Assert
        Assert.assertEquals(5,result,0.10);
    }

    @Test
    //Test Identifier: 1.1
    //Test Description: Adding 10 by 10
    //Method of execution: Automated
    //Input Data: 10,10
    //Expected Output: 20
    //Observed Output:Passed
    //Action : Report test are failed
    public void testAddition() throws Exception {
        //1.Arrange
        double i=10;
        double j=10;
        //2.Act
        double result=UnitTestAssignment.Add(i,j);

        //3.Assert
        Assert.assertEquals(20,result,0.10);
    }
}