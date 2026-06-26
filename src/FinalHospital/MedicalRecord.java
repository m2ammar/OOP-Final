package FinalHospital;

public class MedicalRecord<A> {

    protected A record;

    public MedicalRecord(A record){
        this.record=record;
    }

    public A getRecord(){
        return this.record;
    }

    public void setRecord(A record){
        this.record=record;
    }
}
