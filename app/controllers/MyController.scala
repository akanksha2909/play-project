package controllers

import play.api._
import play.api.mvc._
import main.SumOfDigit

class MyController extends Controller {
  
  def sum(num1 : Int, num2 :  Int)= Action {
    var s= new SumOfDigit();
    var value=s.addInt(num1, num2);
    println(value.toString());
    Ok("value is abc  "+ value.toString());
  }
    
  
}