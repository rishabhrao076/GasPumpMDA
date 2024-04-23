package edu.iit.project;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.mda.MDAEFSM;

public class GasPump2 {
    MDAEFSM m;
    DataStore d;

    public GasPump2(MDAEFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }

    public void Activate(float a, float b, float c) {
        if ((a > 0) && (b > 0) && (c > 0)) {
            ((DS2) d).temp_a = a;
            ((DS2) d).temp_b = b;
            ((DS2) d).temp_c = c;
            m.Activate();
        }
    }
    public void Start() {
        m.Start();
    }

    public void Cancel() {
        m.Cancel();
    }

    public void PayCash(int c) {
        if(c > 0){
            ((DS2) d).temp_c = c;
            m.PayType(0);
        }
    }

    public void Regular() {
        m.SelectGas(1);
        m.Continue();
    }

    public void Premium() {
        m.SelectGas(3);
        m.Continue();
    }

    public void Diesel() {
        m.SelectGas(2);
        m.Continue();
    }

    public void StartPump() {
        m.StartPump();
    }

    public void PumpGallon() {
        DS2 d = (DS2) this.d;
        if(d.cash < d.price*(d.G+1)){
            m.StopPump();
        } else {
            m.Pump();
        }
    }
    public void Stop() {
        m.StopPump();
    }
    public void Receipt() {
        m.Receipt();
    }

    public void NoReceipt() {
        m.NoReceipt();
    }
}
