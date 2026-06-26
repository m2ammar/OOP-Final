package HospitalManagementSystem;

public class CriticalPatient extends  InPatient{

    private int icuNumber;
    private boolean isOnVentilator;

    public CriticalPatient(String name, int age, String disease, int wardNumber, String admissionDate, int icuNumber,
                           boolean isOnVentilator){
        super(name, age, disease, wardNumber, admissionDate);
        this.icuNumber=icuNumber;
        this.isOnVentilator=isOnVentilator;
    }

    public int getIcuNumber(){
        return this.icuNumber;
    }

    public boolean getIsOnVentilator(){
        return this.isOnVentilator;
    }
    public void getStatus(){

      if(isOnVentilator == true){
          System.out.println("ICU Number: "+getIcuNumber()+". On Ventilator");
      }else{
          System.out.println("ICU Number: "+getIcuNumber()+". Not on Ventilator");
      }
    }
}
