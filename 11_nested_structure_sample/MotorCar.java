/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class MotorCar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MotorCar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MotorCar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        exampleJNI.delete_MotorCar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class DesignOpinion {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected DesignOpinion(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(DesignOpinion obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          exampleJNI.delete_MotorCar_DesignOpinion(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setItrocks(boolean value) {
      exampleJNI.MotorCar_DesignOpinion_itrocks_set(swigCPtr, this, value);
    }
  
    public boolean getItrocks() {
      return exampleJNI.MotorCar_DesignOpinion_itrocks_get(swigCPtr, this);
    }
  
    public void setReason(String value) {
      exampleJNI.MotorCar_DesignOpinion_reason_set(swigCPtr, this, value);
    }
  
    public String getReason() {
      return exampleJNI.MotorCar_DesignOpinion_reason_get(swigCPtr, this);
    }
  
    public static void setAceDesignCount(int value) {
      exampleJNI.MotorCar_DesignOpinion_AceDesignCount_set(value);
    }
  
    public static int getAceDesignCount() {
      return exampleJNI.MotorCar_DesignOpinion_AceDesignCount_get();
    }
  
    public static void setTotalDesignCount(int value) {
      exampleJNI.MotorCar_DesignOpinion_TotalDesignCount_set(value);
    }
  
    public static int getTotalDesignCount() {
      return exampleJNI.MotorCar_DesignOpinion_TotalDesignCount_get();
    }
  
    public static int PercentScore() {
      return exampleJNI.MotorCar_DesignOpinion_PercentScore();
    }
  
    public DesignOpinion() {
      this(exampleJNI.new_MotorCar_DesignOpinion(), true);
    }
  
  }

  static public class Wheels {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Wheels(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Wheels obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          exampleJNI.delete_MotorCar_Wheels(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Wheels(MotorCar.Wheels.Shape shape, long count) {
      this(exampleJNI.new_MotorCar_Wheels(shape.swigValue(), count), true);
    }
  
    public MotorCar.DesignOpinion Opinion() {
      return new MotorCar.DesignOpinion(exampleJNI.MotorCar_Wheels_Opinion(swigCPtr, this), true);
    }
  
    public final static class Shape {
      public final static MotorCar.Wheels.Shape Round = new MotorCar.Wheels.Shape("Round");
      public final static MotorCar.Wheels.Shape Square = new MotorCar.Wheels.Shape("Square");
  
      public final int swigValue() {
        return swigValue;
      }
  
      public String toString() {
        return swigName;
      }
  
      public static Shape swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
          return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
          if (swigValues[i].swigValue == swigValue)
            return swigValues[i];
        throw new IllegalArgumentException("No enum " + Shape.class + " with value " + swigValue);
      }
  
      private Shape(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
      }
  
      private Shape(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue+1;
      }
  
      private Shape(String swigName, Shape swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue+1;
      }
  
      private static Shape[] swigValues = { Round, Square };
      private static int swigNext = 0;
      private final int swigValue;
      private final String swigName;
    }
  
  }

  static public class WindScreen {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected WindScreen(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(WindScreen obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          exampleJNI.delete_MotorCar_WindScreen(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public WindScreen(boolean opaque) {
      this(exampleJNI.new_MotorCar_WindScreen(opaque), true);
    }
  
    public MotorCar.DesignOpinion Opinion() {
      return new MotorCar.DesignOpinion(exampleJNI.MotorCar_WindScreen_Opinion(swigCPtr, this), true);
    }
  
  }

  public static MotorCar DesignFromComponents(String name, MotorCar.Wheels wheels, MotorCar.WindScreen windscreen) {
    return new MotorCar(exampleJNI.MotorCar_DesignFromComponents(name, MotorCar.Wheels.getCPtr(wheels), wheels, MotorCar.WindScreen.getCPtr(windscreen), windscreen), true);
  }

  public String Name() {
    return exampleJNI.MotorCar_Name(swigCPtr, this);
  }

  public String WillItWork() {
    return exampleJNI.MotorCar_WillItWork(swigCPtr, this);
  }

}
