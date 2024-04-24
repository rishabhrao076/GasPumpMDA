package edu.iit.project.factories;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.cancel.CancelMessage;
import edu.iit.project.strategies.cancel.CancelMessage2;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.displaymenu.DisplayMenu2;
import edu.iit.project.strategies.ejectcard.EjectCard;
import edu.iit.project.strategies.ejectcard.EjectCard2;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage2;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.initialvalues.InitialValues2;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage2;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.paytype.PayType2;
import edu.iit.project.strategies.pumpgas.PumpGasUnit;
import edu.iit.project.strategies.pumpgas.PumpGasUnit2;
import edu.iit.project.strategies.receipt.PrintReceipt;
import edu.iit.project.strategies.receipt.PrintReceipt2;
import edu.iit.project.strategies.rejectmessage.RejectMessage;
import edu.iit.project.strategies.rejectmessage.RejectMessage2;
import edu.iit.project.strategies.returncash.ReturnCash;
import edu.iit.project.strategies.returncash.ReturnCash2;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.setprice.SetPrice2;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storecash.StoreCash2;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice2;

public class GP2Factory extends AbstractFactory {
    @Override
    public StorePrice StorePrices() {
        if (this.sp == null) {
            this.sp = new StorePrice2();
            this.sp.setDataStore(this.GetDataStore());
        }
        return this.sp;
    }

    @Override
    public DataStore GetDataStore() {
        return this.d == null ? new DS2() : d;
    }

    @Override
    public PayMessage PayMsg() {
        return this.pm == null ? new PayMessage2() : pm;
    }

    @Override
    public StoreCash StoreCash() {
        if (this.sc == null) {
            this.sc = new StoreCash2();
            this.sc.setDataStore(this.GetDataStore());
        }
        return this.sc;
    }

    @Override
    public DisplayMenu DisplayMenu() {
        return this.dm == null ? new DisplayMenu2() : dm;
    }

    @Override
    public RejectMessage RejectMsg() {
        return this.rej == null ? new RejectMessage2() : rej;
    }

    @Override
    public SetPrice SetPrice() {
        if (this.setP == null) {
            this.setP = new SetPrice2();
            this.setP.setDataStore(this.GetDataStore());
        }
        return this.setP;
    }

    @Override
    public InitialValues SetInitialValues() {
        if (this.init == null) {
            this.init = new InitialValues2();
            this.init.setDataStore(this.GetDataStore());
        }
        return this.init;
    }

    @Override
    public PumpGasUnit PumpGasUnit() {
        if (this.pum == null) {
            this.pum = new PumpGasUnit2();
            this.pum.setDataStore(this.GetDataStore());
        }
        return this.pum;
    }

    @Override
    public GasPumpedMessage GasPumpedMsg() {
        if (this.gpm == null) {
            this.gpm = new GasPumpedMessage2();
            this.gpm.setDataStore(this.GetDataStore());
        }
        return this.gpm;
    }

    @Override
    public PrintReceipt PrintReceipt() {
        if (this.rec == null) {
            this.rec = new PrintReceipt2();
            this.rec.setDataStore(this.GetDataStore());
        }
        return this.rec;    }

    @Override
    public CancelMessage CancelMsg() {
        return this.can == null ? new CancelMessage2() : can;
    }

    @Override
    public ReturnCash ReturnCash() {
        if (this.ret == null) {
            this.ret = new ReturnCash2();
            this.ret.setDataStore(this.GetDataStore());
        }
        return this.ret;
    }

    @Override
    public PayType SetPayType() {
        return this.pt == null ? new PayType2() : pt;
    }

    @Override
    public EjectCard EjectCard() {
        return this.ej == null ? new EjectCard2() : ej;
    }
}
