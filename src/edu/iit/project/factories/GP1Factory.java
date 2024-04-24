package edu.iit.project.factories;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.cancel.CancelMessage;
import edu.iit.project.strategies.cancel.CancelMessage1;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.displaymenu.DisplayMenu1;
import edu.iit.project.strategies.ejectcard.EjectCard;
import edu.iit.project.strategies.ejectcard.EjectCard1;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage1;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.initialvalues.InitialValues1;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage1;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.paytype.PayType1;
import edu.iit.project.strategies.pumpgas.PumpGasUnit;
import edu.iit.project.strategies.pumpgas.PumpGasUnit1;
import edu.iit.project.strategies.receipt.PrintReceipt;
import edu.iit.project.strategies.receipt.PrintReceipt1;
import edu.iit.project.strategies.rejectmessage.RejectMessage;
import edu.iit.project.strategies.rejectmessage.RejectMessage1;
import edu.iit.project.strategies.returncash.ReturnCash;
import edu.iit.project.strategies.returncash.ReturnCash1;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.setprice.SetPrice1;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storecash.StoreCash1;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice1;

public class GP1Factory extends AbstractFactory {
    @Override
    public StorePrice StorePrices() {
        if (this.sp == null) {
            this.sp = new StorePrice1();
            this.sp.setDataStore(this.GetDataStore());
        }
        return this.sp;
    }

    @Override
    public DataStore GetDataStore() {
        return this.d == null ? new DS1() : d;
    }

    @Override
    public PayMessage PayMsg() {
        return this.pm == null ? new PayMessage1() : pm;
    }

    @Override
    public StoreCash StoreCash() {
        if (this.sc == null) {
            this.sc = new StoreCash1();
            this.sc.setDataStore(this.GetDataStore());
        }
        return this.sc;
    }

    @Override
    public DisplayMenu DisplayMenu() {
        return this.dm == null ? new DisplayMenu1() : dm;
    }

    @Override
    public RejectMessage RejectMsg() {
        return this.rej == null ? new RejectMessage1() : rej;
    }

    @Override
    public SetPrice SetPrice() {
        return this.setP == null ? new SetPrice1() : setP;
    }

    @Override
    public InitialValues SetInitialValues() {
        if (this.init == null) {
            this.init = new InitialValues1();
            this.init.setDataStore(this.GetDataStore());
        }
        return this.init;
    }

    @Override
    public PumpGasUnit PumpGasUnit() {
        if (this.pum == null) {
            this.pum = new PumpGasUnit1();
            this.pum.setDataStore(this.GetDataStore());
        }
        return this.pum;
    }

    @Override
    public GasPumpedMessage GasPumpedMsg() {
        if (this.gpm == null) {
            this.gpm = new GasPumpedMessage1();
            this.gpm.setDataStore(this.GetDataStore());
        }
        return this.gpm;
    }

    @Override
    public PrintReceipt PrintReceipt() {
        if (this.rec == null) {
            this.rec = new PrintReceipt1();
            this.rec.setDataStore(this.GetDataStore());
        }
        return this.rec;
    }

    @Override
    public CancelMessage CancelMsg() {
        return this.can == null ? new CancelMessage1() : can;
    }

    @Override
    public ReturnCash ReturnCash() {
        return this.ret == null ? new ReturnCash1() : ret;
    }

    @Override
    public PayType SetPayType() {
        if (this.pt == null) {
            this.pt = new PayType1();
            this.pt.setDataStore(this.GetDataStore());
        }
        return this.pt;
    }

    @Override
    public EjectCard EjectCard() {
        return this.ej == null ? new EjectCard1() : ej;
    }
}