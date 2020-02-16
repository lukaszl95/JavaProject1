package com.kodilla.testing.shape;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle  testCircle= new Circle("testCircle", 10);

        shapeCollector.addFigure(testCircle);

        Assert.assertEquals(1, shapeCollector.getFiguresListSize());
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square testSquare = new Square("testSquare", 10);

        shapeCollector.addFigure(testSquare);
        boolean result = shapeCollector.removeFigure(testSquare);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresListSize());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square testSquare = new Square("testSquare", 10);

        boolean result = shapeCollector.removeFigure(testSquare);

        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square testSquare = new Square("testSquare", 10);
        shapeCollector.addFigure(testSquare);

        Shape retrievedFigure = shapeCollector.getFigure(0);

        Assert.assertEquals(testSquare, retrievedFigure);
    }

    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square testSquare = new Square("testSquare", 10);
        Square testTriangle = new Square("testTriangle", 14);
        Square testCircle = new Square("testCircle", 3);
        shapeCollector.addFigure(testSquare);
        shapeCollector.addFigure(testCircle);
        shapeCollector.addFigure(testTriangle);

        List<Shape> temporaryList = new ArrayList<Shape>();
        temporaryList.add(testSquare);
        temporaryList.add(testCircle);
        temporaryList.add(testTriangle);

        Assert.assertEquals(temporaryList.toString(), shapeCollector.showFigure().toString());
    }

    @Test
    public void testGetSquareField() {
        ShapeCollector shapeCollector = new ShapeCollector();
        double squareField = shapeCollector.getShapeField(new Square("square", 3));

        double squareFieldExpected = 3*3;

        Assert.assertEquals(squareFieldExpected, squareField,0);
    }

    @Test
    public void testGetTriangleField() {
        ShapeCollector shapeCollector = new ShapeCollector();
        double triangleField = shapeCollector.getShapeField(new Triangle("triangle", 2, 4));

        double triangleFieldExpected = 0.5*2*4;

        Assert.assertEquals(triangleFieldExpected,triangleField,0);
    }

    @Test
    public void testGetCircleField() {
        ShapeCollector shapeCollector = new ShapeCollector();
        double circleField = shapeCollector.getShapeField(new Circle("circle", 5));

        double circleFieldExpected = 5*5*Math.PI;

        Assert.assertEquals(circleFieldExpected, circleField,0);
    }
}
