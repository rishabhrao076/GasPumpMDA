package edu.iit.project;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.mda.MDAEFSM;

public class GasPump1 {
    MDAEFSM m;
    DataStore d;

    public GasPump1(MDAEFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }

    public void Activate(int a) {
        if(a > 0) {
            ((DS1) d).temp_a = a;
            m.Activate();
        }else {
//            System.out.println("Enter value for a > 0");
        }

    }

    public void Start() {
        m.Start();
    }

    public void PayCredit() {
        m.PayType(1);
    }

    public void Reject() {
        m.Reject();
    }

    public void cancel() {
        m.Cancel();
    }

    public void Approved() {
        m.Approved();
    }

    public void PayCash(int c) {
        if(c > 0){
            ((DS1) d).temp_c = c;
            m.PayType(0);
        }
    }

    public void StartPump() {
        m.SelectGas(1);
        m.Continue();
        m.StartPump();
    }

    public void Pump() {
        DS1 d = (DS1) this.d;
        if( d.w == 1)
            m.Pump();
        else if(d.w == 0 && d.cash < d.price){
          this.StopPump();
        } else {
            m.Pump();
        }

    }

    public void StopPump() {
        m.StopPump();
        m.Receipt();
    }
}
