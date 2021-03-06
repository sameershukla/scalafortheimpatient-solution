package chapter8

object Problem6 extends App {

  abstract class Shape {
    def centerPoint: (Double, Double)
  }

  class Rectangle(val x: Double, val y: Double, val width: Double, val height: Double) extends Shape{
    def centerPoint =  (x + width / 2, y + height / 2)
  }
  
  class Circle(override val centerPoint: (Double, Double), val radius: Double) extends Shape{
    
  }
  
}