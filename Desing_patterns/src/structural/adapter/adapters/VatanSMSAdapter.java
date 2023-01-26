package structural.adapter.adapters;

import structural.adapter.VatanSMS;
import structural.adapter.logging.ILogger;

public class VatanSMSAdapter implements ILogger{

	@Override
	public void log() {
		// dýþ kaynak kodu kullanabilirsin.
		VatanSMS vatanSMS = new VatanSMS();
		vatanSMS.sendSMS();
	}
	
}
