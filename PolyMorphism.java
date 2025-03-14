
class Calc{
	public void cal(double bmi){
	System.out.println("Your BMI is " + bmi);
    }
    }
class Under extends Calc{
  public void dis() {
    System.out.println("You are Under Weight");
  }
}

class Normal extends Calc{
  public void dis() {
    System.out.println("You are normal Weight");
  }
}

class Over extends Calc{
  public void dis() {
    System.out.println("You are over Weight");
  }
}

class Obese extends Calc{
  public void dis() {
    System.out.println("You are Obese Weight");
  }
}
class Main {
  public static void main(String[] args) {
    
	double bmi;
    double weight = 50;
    double height = 1.5;
    bmi = weight / ( height * height);
    Calc obj = new Calc();
    obj.cal(bmi);
    if( bmi < 18.5 ) {
    Under obj_w = new Under();
    obj_w.dis();
    }
    else if ( bmi > 18.5 && bmi < 24.9 ){
    Normal obj_n = new Normal();
    obj_n.dis();
    }
    else if ( bmi > 25 && bmi < 29.9 ) {
    Over obj_o = new Over();
    obj_o.dis();
    }
    else{
    Obese obj_ob = new Obese();
    obj_ob.dis();
    }
    
  }
}
